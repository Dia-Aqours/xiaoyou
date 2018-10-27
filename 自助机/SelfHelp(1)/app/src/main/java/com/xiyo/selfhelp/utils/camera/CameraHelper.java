package com.xiyo.selfhelp.utils.camera;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;

import com.xiyo.selfhelp.data.callback.CameraOpenedCallback;
import com.xiyo.selfhelp.data.callback.CameraTakePictureCallback;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by  xiangdingquan  on 2018/3/8.
 * <p>
 * 相机操作
 * <p>
 * 单例
 */

public class CameraHelper implements Camera.PreviewCallback {


    private static final String TAG = "dc";

    private volatile static CameraHelper mInstance;

    private Camera mCamera;

    private boolean isPreviewing = false;

    private float mPreviwRate = -1f;

    private CameraHelper() {

    }

    public static CameraHelper getInstance() {
        if (mInstance == null) {
            synchronized (CameraHelper.class) {
                if (mInstance == null) {
                    mInstance = new CameraHelper();
                }
            }
        }
        return mInstance;
    }


    /**
     * 打开相机
     *
     * @param callback 传入的回调接口
     */
    public void doOpenCamera(CameraOpenedCallback callback) {
        mCamera = Camera.open(0);
        Log.i(TAG, "doOpenCamera: " + (mCamera == null));
        callback.cameraOpened();
    }



    /**
     * 开启预览
     *
     * @param holder      你懂的
     * @param previewRate 旋转角度
     */
    public void doStartPreview(SurfaceHolder holder, float previewRate) {
        if (isPreviewing) {
            Log.i(TAG, "doStartPreview: return");
            mCamera.stopPreview();
            mCamera.setPreviewCallback(null);
            return;
        }
        Log.i(TAG, "doStartPreview: 000");
        if (mCamera != null) {
            Log.i(TAG, "doStartPreview: 111");
            Camera.Parameters parameters = mCamera.getParameters();
            parameters.setPictureFormat(PixelFormat.JPEG);
//            CameraParamUtil.getInstance().printSupportPreviewSize(parameters);
//            CameraParamUtil.getInstance().printSupportPictureSize(parameters);
            Camera.Size previewSize = CameraParamUtil.getInstance().getPreviewSize(parameters.getSupportedPreviewSizes(), previewRate, 640);
//            Camera.Size pictureSize = CameraParamUtil.getInstance().getPictureSize(parameters.getSupportedPictureSizes(), previewRate, 400);
            parameters.setPreviewSize(previewSize.width, previewSize.height);
            mCamera.setDisplayOrientation(90);
            CameraParamUtil.getInstance().printSupportFocusMode(parameters);
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (supportedFocusModes.contains("continuous-video")) {
                parameters.setFocusMode(Camera.Parameters.FOCUS_MODE_CONTINUOUS_VIDEO);
            }
            mCamera.setParameters(parameters);
            try {
                mCamera.setPreviewDisplay(holder);
                mCamera.startPreview();
                mCamera.setPreviewCallback(this);
            } catch (IOException e) {
                Log.i(TAG, "doStartPreview: 222");
                e.printStackTrace();
            }
            isPreviewing = true;
            mPreviwRate = previewRate;
            parameters = mCamera.getParameters(); //重新get一次
            Log.i(TAG, "最终设置:PreviewSize--With = " + parameters.getPreviewSize().width
                    + "Height = " + parameters.getPreviewSize().height);
            Log.i(TAG, "最终设置:PictureSize--With = " + parameters.getPictureSize().width
                    + "Height = " + parameters.getPictureSize().height);

        }
        Log.i(TAG, "doStartPreview: end");
    }

    private boolean needTakePicture = false;
    private CameraTakePictureCallback callback;

    /**
     * 拍照
     */
    public void doTakePicture(CameraTakePictureCallback callback) {
        Log.i(TAG, "doTakePicture: 1");
        if (isPreviewing && (mCamera != null)) {
            Log.i(TAG, "doTakePicture: 2");
            needTakePicture = true;
            this.callback = callback;
        }
    }


    /**
     * 停止预览，释放Camera
     */
    public void doStopCamera() {
        if (null != mCamera) {
            mCamera.setPreviewCallback(null);
            mCamera.stopPreview();
            isPreviewing = false;
            mPreviwRate = -1f;
            mCamera.release();
            mCamera = null;
        }
    }

    @Override
    public void onPreviewFrame(byte[] bytes, Camera camera) {
        Log.i(TAG, "onPreviewFrame: ");
        if (needTakePicture) {
            needTakePicture = false;
            runInPreviewFrame(bytes, camera);
        }
    }



    public void runInPreviewFrame(byte[] data, Camera camera) {
        ByteArrayOutputStream baos;
        byte[] rawImage;
        Bitmap bitmap;
//        camera.setOneShotPreviewCallback(null);
        //处理data
        Camera.Size previewSize = camera.getParameters().getPreviewSize();//获取尺寸,格式转换的时候要用到
        BitmapFactory.Options newOpts = new BitmapFactory.Options();
        newOpts.inJustDecodeBounds = true;
        YuvImage yuvimage = new YuvImage(
                data,
                ImageFormat.NV21,
                previewSize.width,
                previewSize.height,
                null);
        baos = new ByteArrayOutputStream();
        yuvimage.compressToJpeg(new Rect(0, 0, previewSize.width, previewSize.height), 100, baos);// 80--JPG图片的质量[0-100],100最高
        rawImage = baos.toByteArray();
        //将rawImage转换成bitmap
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        bitmap = BitmapFactory.decodeByteArray(rawImage, 0, rawImage.length, options);
        callback.takePicture(bitmap);

    }
}
