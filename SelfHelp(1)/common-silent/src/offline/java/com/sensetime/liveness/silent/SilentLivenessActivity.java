package com.sensetime.liveness.silent;

import android.Manifest;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.sensetime.sample.common.R;
import com.sensetime.senseid.sdk.liveness.silent.LivenessActivity;
import com.sensetime.senseid.sdk.liveness.silent.OnLivenessListener;
import com.sensetime.senseid.sdk.liveness.silent.SilentLivenessApi;
import com.sensetime.senseid.sdk.liveness.silent.common.camera.CameraPreviewView;
import com.sensetime.senseid.sdk.liveness.silent.common.type.PixelFormat;
import com.sensetime.senseid.sdk.liveness.silent.common.type.ResultCode;
import com.sensetime.senseid.sdk.liveness.silent.common.type.Size;
import com.sensetime.senseid.sdk.liveness.silent.common.util.DeviceUtil;
import com.sensetime.senseid.sdk.liveness.silent.common.util.FileUtil;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceDistance;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceState;

import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SilentLivenessActivity extends LivenessActivity {

    private static final String FILES_PATH = Environment.getExternalStorageDirectory().getPath() + "/sensetime/";
    private static final String LICENSE_FILE_NAME = "SenseID_Liveness.lic";
    private static final String MODEL_FILE_NAME = "SenseID_Silent_Liveness.model";

    private static final long TIMEOUT = 4000L;

    private boolean mIsStopped = true;

    private ExecutorService mLivenessExecutor = null;

    private View mLoadingView = null;
    private TextView mNoteTextView = null;
    private Handler mHandler = new Handler();

    private CameraPreviewView mCameraPreviewView = null;
    private Size screenSize = null;

    private OnLivenessListener mLivenessListener = new OnLivenessListener() {
        @Override
        public void onStatusUpdate(final FaceState faceState, final FaceDistance faceDistance) {
            // Do nothing.
        }

        @Override
        public void onError(ResultCode resultCode) {
            setResult(convertResultCode(resultCode));
            finish();
        }

        @Override
        public void onDetectOver(ResultCode code, byte[] result, List imageData, Rect faceRect) {
            List<byte[]> imageResult = (List<byte[]>) imageData;
            switch (code) {
                case OK:
                    setResult(RESULT_OK);
                    if (imageResult != null && imageResult.size() > 0 && faceRect != null) {
                        if (imageResult.get(0) != null && imageResult.get(0).length > 0) {
                            Bitmap source = BitmapFactory.decodeByteArray(imageResult.get(0), 0, imageResult.get(0).length);
                            faceRect = new Rect(faceRect.left - 30, faceRect.top - 70, faceRect.right + 30, faceRect.bottom + 30);
                            int left = faceRect.left < 0 ? 0 : faceRect.left;
                            int top = faceRect.top < 0 ? 0 : faceRect.top;
                            int right = faceRect.right > source.getWidth() ? source.getWidth() : faceRect.right;
                            int bottom = faceRect.bottom > source.getHeight() ? source.getHeight() : faceRect.bottom;
                            Bitmap face = Bitmap.createBitmap(source, left, top, right - left, bottom - top);
                            SilentLivenessImageHolder.setImageData(face);
                        }
                    }
                    break;
                default:
                    setResult(convertResultCode(code));
                    break;
            }
            finish();
        }

        @Override
        public void onAligned() {
            // Do nothing.
        }

        @Override
        public void onMotionSet(int index, int motion) {
            // Do nothing.
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!checkPermission(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            setResult(RESULT_CODE_NO_PERMISSIONS);
            finish();
            return;
        }

        setContentView(R.layout.common_activity_liveness_silent);

        findViewById(R.id.linkface_txt_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                finish();
            }
        });

        mNoteTextView = (TextView) findViewById(R.id.linkface_txt_note);
        mLoadingView = findViewById(R.id.pb_loading);
        screenSize = new Size(DeviceUtil.getScreenSize(SilentLivenessActivity.this).getWidth(),DeviceUtil.getScreenSize(SilentLivenessActivity.this).getHeight());

        initCameraView(R.id.camera_preview, true, new Size(640, 480), DeviceUtil.getScreenSize(this));
        mCameraPreviewView = (CameraPreviewView) findViewById(R.id.camera_preview);

        File dir = new File(FILES_PATH);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        FileUtil.copyAssetsToFile(SilentLivenessActivity.this, LICENSE_FILE_NAME, FILES_PATH + LICENSE_FILE_NAME);
        FileUtil.copyAssetsToFile(SilentLivenessActivity.this, MODEL_FILE_NAME, FILES_PATH + MODEL_FILE_NAME);
        ResultCode result = SilentLivenessApi.init(SilentLivenessActivity.this, FILES_PATH + LICENSE_FILE_NAME, FILES_PATH + MODEL_FILE_NAME, mLivenessListener);
        if (result != ResultCode.OK) {
            setResult(convertResultCode(result));
            finish();
            return;
        }
        SilentLivenessApi.setDetectTimeout(TIMEOUT);
        mNoteTextView.setText(getString(R.string.common_count_down));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                CountDownTimer timer = new CountDownTimer(TIMEOUT - 100, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        mNoteTextView.setText(String.valueOf(millisUntilFinished / 1000));
                    }

                    @Override
                    public void onFinish() {

                    }
                };
                timer.start();
            }
        }, 1000);

        mIsStopped = false;
        startDetectThread();
    }

    @Override
    protected void onPause() {
        mIsStopped = true;

        SilentLivenessApi.cancel();

        destroyExecutor();

        mLoadingView.setVisibility(View.GONE);

        setResult(RESULT_CANCELED);
        if(!SilentLivenessActivity.this.isFinishing()) {
            finish();
        }
        super.onPause();
    }

    private void startDetectThread() {
        mLivenessExecutor = Executors.newSingleThreadExecutor();
        mLivenessExecutor.execute(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (mIsStopped) {
                        break;
                    }

                    byte[] imageData = getPreviewData();
                    if (imageData == null) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        continue;
                    }

                    if (imageData != null) {
                        SilentLivenessApi.inputData(imageData,
                                PixelFormat.NV21,
                                new Size(640, 480),// Default preivew size.
                                screenSize,
                                new Size(mCameraPreviewView.getWidth(), mCameraPreviewView.getHeight()),
                                true,
                                getCameraOrientation());
                    }

                    if (mIsStopped) {
                        break;
                    }

                }
            }
        });
    }

    private void destroyExecutor() {
        if (mLivenessExecutor == null) {
            return;
        }
        mLivenessExecutor.shutdown();
        try {
            mLivenessExecutor.awaitTermination(100, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mLivenessExecutor = null;
    }
}