package com.xiyo.selfhelp.ui.activity.comparsion;

import android.Manifest;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bluelinelabs.logansquare.LoganSquare;
import com.sensetime.senseid.sdk.liveness.silent.OnLivenessListener;
import com.sensetime.senseid.sdk.liveness.silent.SilentLivenessApi;
import com.sensetime.senseid.sdk.liveness.silent.common.type.ResultCode;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceDistance;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceState;
import com.xiyo.selfhelp.Constant.Constants;
import com.xiyo.selfhelp.Constant.RawsConstants;
import com.xiyo.selfhelp.MyApplication;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.adapter.IDCardAdapter;
import com.xiyo.selfhelp.data.callback.CameraOpenedCallback;
import com.xiyo.selfhelp.data.callback.CameraTakePictureCallback;
import com.xiyo.selfhelp.data.manager.IMAudioManager;
import com.xiyo.selfhelp.data.model.CompareData;
import com.xiyo.selfhelp.data.model.IDCardShowModel;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.TokenResult;
import com.xiyo.selfhelp.data.model.VerifyIdentityResult;
import com.xiyo.selfhelp.ui.activity.reservation.ComparisonCameraActivity;
import com.xiyo.selfhelp.ui.presenter.comparsion.ComparisonPresenter;
import com.xiyo.selfhelp.ui.view.comparsion.ComparisonMvpView;
import com.xiyo.selfhelp.utils.Base64BitmapUtil;
import com.xiyo.selfhelp.utils.DoubleClickUtil;
import com.xiyo.selfhelp.utils.IDcardUtil;
import com.xiyo.selfhelp.utils.TimeUtil;
import com.xiyo.selfhelp.utils.camera.CameraHelper;
import com.xiyo.selfhelp.utils.camera.FileUtil;
import com.xiyo.selfhelp.widget.CameraSurfaceView;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.com.aratek.idcard.IDCard;
import cn.com.aratek.idcard.IDCardReader;
import cn.com.aratek.util.Result;

public class ComparisonActivity extends ComparisonCameraActivity implements ComparisonMvpView, CameraOpenedCallback, CameraTakePictureCallback {

//    private static final String FILES_PATH = Environment.getExternalStorageDirectory().getPath() + "/sensetime/";
//    private static final String LICENSE_FILE_NAME = "SenseID_Liveness.lic";
//    private static final String MODEL_FILE_NAME = "SenseID_Silent_Liveness.model";

//    private static final long TIMEOUT = 10 * 4000L;

//    private boolean mIsStopped = true;

//    private ExecutorService mLivenessExecutor = null;

    private Handler mHandler = new Handler();
    private static final String picPath = Environment.getExternalStorageDirectory().getPath() + File.separator + "selfhelp" + File.separator + "pic";

//    private CameraPreviewView mCameraPreviewView = null;
//    private Size screenSize = null;

    @Inject
    ComparisonPresenter<ComparisonMvpView> reComparisonPresenter;

    @BindView(R.id.back)
    RelativeLayout back;
    @BindView(R.id.id_recyclerView)
    RecyclerView recyclerView;

    @BindView(R.id.num_alert)
    TextView num_alert;

    @BindView(R.id.must_alert)
    TextView must_alert;

    @BindView(R.id.num_1)
    TextView num_1;

    @BindView(R.id.num_2)
    TextView num_2;

    @BindView(R.id.num_3)
    TextView num_3;

    @BindView(R.id.num_4)
    TextView num_4;

    @BindView(R.id.num_5)
    TextView num_5;

    @BindView(R.id.camera_preview)
    CameraSurfaceView cameraSurfaceView;

//    private EmptyRoom emptyRoom;
//    private ReservationModel model;
//    private String checkin;
//    private double price;
//    private int days;

    private IDCardReader mReader;

    private int count = 1;
    private boolean hasRequested = false;

    private List<IDCard> cards = new ArrayList<>();
    private List<Bitmap> bitmaps = new ArrayList<>();
    private List<IDCardShowModel> idCardShowModels = new ArrayList<>();
    IDCardAdapter adapter;

    private IDCard curCard;
    Timer timer;
    TimerTask task;

    private ExecutorService mExecutor;
    private float mPreviewRate = -1f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!checkPermission(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            Log.i(TAG, "onCreate: finish");
//            setResult(RESULT_CODE_NO_PERMISSIONS);
//            finish();
            return;
        }
        activityComponent().inject(this);
        setContentView(R.layout.activity_comparison);
        ButterKnife.bind(this);
        reComparisonPresenter.attachView(this);
        hasRequested = false;
        initData();
        initView();
        addListener();
        mExecutor = Executors.newSingleThreadExecutor();
    }

    @Override
    public void createTokenSuccess(TokenResult tokenResult) {
        hasRequested = false;
        if (tokenResult != null) {
            if ("0".equals(tokenResult.getCode())) {
                verifyIdentity(tokenResult, cards.get(cards.size() - 1), bitmaps.get(bitmaps.size() - 1));
            } else if (tokenResult.getMsg() != null) {
                cleanData();
                showPeopleInfo();
                IMAudioManager.instance().pause();
                sayComparisonFail();
                startTimer();
            }
        } else {
            cleanData();
            showPeopleInfo();
            IMAudioManager.instance().pause();
            sayComparisonFail();
            startTimer();
        }
    }

    @Override
    public void createTokenFail(String error) {
        hasRequested = false;
        idCardShowModels.get(idCardShowModels.size() - 1).setVerifyCode(2);
        cleanData();
        showPeopleInfo();
        IMAudioManager.instance().pause();
        sayComparisonFail();
        startTimer();
//        Toast.makeText(this, "数据异常，请稍后重试！", Toast.LENGTH_SHORT).show();
//        finish();
    }

    @Override
    public void verifyIdentitySuccess(VerifyIdentityResult verifyIdentityResult) {
        hasRequested = false;
        if (verifyIdentityResult != null) {
            if ("0".equals(verifyIdentityResult.getCode())) {
//                Toast.makeText(this, "比对成功", Toast.LENGTH_SHORT).show();
				idCardShowModels.get(idCardShowModels.size() - 1).setVerifyCode(1);
                showPeopleInfo();
                sayComparisonSuccess();
            } else if (verifyIdentityResult.getMsg() != null) {
                idCardShowModels.get(idCardShowModels.size() - 1).setVerifyCode(2);
                cleanData();
                showPeopleInfo();
                IMAudioManager.instance().pause();
                sayComparisonFail();
                startTimer();
            }
        } else {
            idCardShowModels.get(idCardShowModels.size() - 1).setVerifyCode(2);
            cleanData();
            showPeopleInfo();
            IMAudioManager.instance().pause();
            sayComparisonFail();
            startTimer();
        }
    }

    @Override
    public void verifyIdentityFail(String error) {
        hasRequested = false;
        cleanData();
        showPeopleInfo();
        IMAudioManager.instance().pause();
        sayComparisonFail();
//        Toast.makeText(this, "人证比对失败，请重新比对！", Toast.LENGTH_SHORT).show();
        startTimer();
    }

    @Override
    public void loginSuccess(Token token) {
        hasRequested = false;
        Log.i(TAG, "loginSuccess: token = " + token);
        MyApplication.setToken(this, token);
    }

    @Override
    public void loginFail(String error) {
        hasRequested = false;
        Toast.makeText(this, "loginFail", Toast.LENGTH_SHORT).show();
    }

    @OnClick({R.id.back, R.id.num_1, R.id.num_2, R.id.num_3, R.id.num_4, R.id.num_5})
    public void onClick(View view) {
        if(hasRequested){
            return;
        }
        switch (view.getId()) {
            case R.id.back:
//                startActivity(new Intent(this,SelectActivity.class));
                finish();
                break;
            case R.id.num_1:
                if (DoubleClickUtil.isFastClick()) {
                    count = 1;
                    changeTextColor(view);
                    cleanData();
//                    SilentLivenessApi.cancel();
                    closeTimer();
                    startTimer();
                }
                break;
            case R.id.num_2:
                if (DoubleClickUtil.isFastClick()) {
                    count = 2;
                    changeTextColor(view);
                    cleanData();
//                    SilentLivenessApi.cancel();
                    closeTimer();
                    startTimer();
                }
                break;
            case R.id.num_3:
                if (DoubleClickUtil.isFastClick()) {
                    count = 3;
                    changeTextColor(view);
                    cleanData();
//                    SilentLivenessApi.cancel();
                    closeTimer();
                    startTimer();
                }
                break;
            case R.id.num_4:
                if (DoubleClickUtil.isFastClick()) {
                    count = 4;
                    changeTextColor(view);
                    cleanData();
//                    SilentLivenessApi.cancel();
                    closeTimer();
                    startTimer();
                }
                break;
            case R.id.num_5:
                if (DoubleClickUtil.isFastClick()) {
                    count = 5;
                    changeTextColor(view);
                    cleanData();
//                    SilentLivenessApi.cancel();
                    closeTimer();
                    startTimer();
                }
                break;
            default:
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        mExecutor.submit(new Runnable() {
            @Override
            public void run() {
                Log.i(TAG, "run: open camera");
                CameraHelper.getInstance().doOpenCamera(ComparisonActivity.this);
            }
        });
        openDevice();
        IMAudioManager.instance().playSound(RawsConstants.RECOMPARISON_SURFACE, new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

            }
        });
    }

    @Override
    protected void onPause() {
        closeTimer();
        closeDevice();
//        SilentLivenessApi.cancel();

//        destroyExecutor();
        IMAudioManager.instance().pause();
        cleanData();
//        mLoadingView.setVisibility(View.GONE);

//        setResult(RESULT_CANCELED);
//        if (!isFinishing()) {
//            finish();
//        }
        super.onPause();
    }

    private void changeTextColor(View view) {
        Log.i(TAG, "changeTextColor: ");
        if (num_1.getId() == view.getId()) {
            num_1.setBackgroundResource(R.drawable.selected_text_bg);
            num_1.setTextColor(Color.WHITE);
        } else {
            num_1.setBackgroundResource(R.drawable.select_text_bg);
            num_1.setTextColor(Color.BLACK);
        }
        if (num_2.getId() == view.getId()) {
            num_2.setBackgroundResource(R.drawable.selected_text_bg);
            num_2.setTextColor(Color.WHITE);
        } else {
            num_2.setBackgroundResource(R.drawable.select_text_bg);
            num_2.setTextColor(Color.BLACK);
        }
        if (num_3.getId() == view.getId()) {
            num_3.setBackgroundResource(R.drawable.selected_text_bg);
            num_3.setTextColor(Color.WHITE);
        } else {
            num_3.setBackgroundResource(R.drawable.select_text_bg);
            num_3.setTextColor(Color.BLACK);
        }
        if (num_4.getId() == view.getId()) {
            num_4.setBackgroundResource(R.drawable.selected_text_bg);
            num_4.setTextColor(Color.WHITE);
        } else {
            num_4.setBackgroundResource(R.drawable.select_text_bg);
            num_4.setTextColor(Color.BLACK);
        }
        if (num_5.getId() == view.getId()) {
            num_5.setBackgroundResource(R.drawable.selected_text_bg);
            num_5.setTextColor(Color.WHITE);
        } else {
            num_5.setBackgroundResource(R.drawable.select_text_bg);
            num_5.setTextColor(Color.BLACK);
        }
    }

    private void initView(){
//                Toast.makeText(ComparisonActivity.this,"picturePath="+picturePath,Toast.LENGTH_LONG).show();
        adapter = new IDCardAdapter(this, idCardShowModels);
        //绑定适配器
        recyclerView.setAdapter(adapter);
        // 给每个item添加分割线
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        // 设置item增加和移除的动画
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        LinearLayoutManager ms= new LinearLayoutManager(this);
        ms.setOrientation(LinearLayoutManager.VERTICAL);// 设置 recyclerview 布局方式为横向布局
        recyclerView.setLayoutManager(ms);
    }

    private void initData() {
        showNum(0);
        if (MyApplication.getToken(this) == null) {
            login();
        }
        File file = new File(picPath);
        if(!file.exists()){
            file.mkdirs();
        }
//        Intent intent = getIntent();
//        Bundle bundle = intent.getBundleExtra("data");
//        emptyRoom = (EmptyRoom) bundle.get("roomData");
//        model = (ReservationModel) bundle.get("reservationModel");
//        checkin = bundle.getString("checkin");
//        price = bundle.getDouble("price");
//        days = bundle.getInt("days");
//        Log.i(TAG, "initData: checkin = " + checkin + "    price:" + price + "    days:" + days);
        mReader = IDCardReader.getInstance();
//        initCameraView(com.sensetime.sample.common.R.id.camera_preview, true, new Size(640, 480), com.sensetime.senseid.sdk.liveness.silent.common.util.DeviceUtil.getScreenSize(this));
//        mCameraPreviewView = findViewById(com.sensetime.sample.common.R.id.camera_preview);
    }

    private void addListener(){
        adapter.setOnItemClickListener(new IDCardAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if(cards.size() - 1 == position){
//                    SilentLivenessApi.cancel();
                    closeTimer();
                    startTimer();
                }
                if (cards.size() > position) {
                    cards.remove(position);
                }
                if(bitmaps.size() > position){
                    bitmaps.remove(position);
                }
                if(idCardShowModels.size() > position){
                    idCardShowModels.remove(position);
                }
                Log.i(TAG, "onItemClick: " + position);
                showPeopleInfo();
            }
        });
    }

    private void showNum(int length) {
        switch (length) {
            case 5:
                break;
            case 4:
                num_5.setVisibility(View.GONE);
                break;
            case 3:
                num_4.setVisibility(View.GONE);
                num_5.setVisibility(View.GONE);
                break;
            case 2:
                num_3.setVisibility(View.GONE);
                num_4.setVisibility(View.GONE);
                num_5.setVisibility(View.GONE);
                break;
            case 1:
                num_2.setVisibility(View.GONE);
                num_3.setVisibility(View.GONE);
                num_4.setVisibility(View.GONE);
                num_5.setVisibility(View.GONE);
                break;
            case 0:
                num_alert.setVisibility(View.GONE);
                must_alert.setVisibility(View.GONE);
                num_1.setVisibility(View.GONE);
                num_2.setVisibility(View.GONE);
                num_3.setVisibility(View.GONE);
                num_4.setVisibility(View.GONE);
                num_5.setVisibility(View.GONE);
                break;
        }
    }

    private void cleanData(){
        cards.clear();
        bitmaps.clear();
        idCardShowModels.clear();
        showPeopleInfo();
    }

    private void login() {
        hasRequested = true;
        Map<String, String> fields = new HashMap<>();
        fields.put("grant_type", "password");
        fields.put("username", "Xiezhu_Kiosk_Front");
        fields.put("password", "hD1sjddj1whdsde");
        reComparisonPresenter.login(fields);
    }

    private void createToken() {
        hasRequested = true;
        IMAudioManager.instance().pause();
        Map<String, String> fields = new HashMap<>();
        fields.put("key", Constants.PoliceKey);
        reComparisonPresenter.createToken(fields);
    }

    private void verifyIdentity(TokenResult tokenResult, IDCard idCard, Bitmap bitmap) {
        hasRequested = true;
        CompareData data = new CompareData();
        data.setName(IDcardUtil.encryptStr(idCard.getName()));
        data.setIdNum(IDcardUtil.encryptStr(idCard.getNumber()));
        data.setCardCtrlVer("1000");
        data.setPicCtrlVer("1300");
        data.setStartDate(TimeUtil.convertTime(TimeUtil.FORMAT_ID_EN_1, idCard.getValidFrom().getTime()));
        data.setEndDate(idCard.getValidTo() == null ? "长期" : TimeUtil.convertTime(TimeUtil.FORMAT_ID_EN_1, idCard.getValidTo().getTime()));
        data.setAuthMode("50");
        data.setpicIDcard(Base64BitmapUtil.bitmapToBase64(idCard.getPhoto()));
        data.setpicCamera(Base64BitmapUtil.bitmapToBase64(bitmap));
        try {
            String json = LoganSquare.serialize(data);
            Map<String, String> fields = new HashMap<>();
            fields.put("info", json);
            fields.put("key", Constants.PoliceKey);
            fields.put("token", tokenResult.getToken());
            reComparisonPresenter.verifyIdentity(fields);
        } catch (Exception e) {
            e.printStackTrace();
            hasRequested = false;
            finish();
            Toast.makeText(this, "数据异常，请稍后重试！", Toast.LENGTH_SHORT).show();
        }
    }

    private void removeLastData() {
        if (cards != null && cards.size() > 0) {
            cards.remove(cards.size() - 1);
            bitmaps.remove(bitmaps.size() - 1);
        }
    }

    private void openDevice() {
        int error;
        if ((error = mReader.powerOn()) != IDCardReader.RESULT_OK) {
//            Toast.makeText(this, getString(R.string.id_card_reader_power_on_failed) + error, Toast.LENGTH_SHORT).show();
        }
        if ((error = mReader.open()) != IDCardReader.RESULT_OK) {
//            mSN.setText(getString(R.string.idcard_sn, "null"));
//            Toast.makeText(this, getString(R.string.id_card_reader_open_failed) + error, Toast.LENGTH_SHORT).show();
        } else {

            Result res = mReader.getSN();
//            mSN.setText(getString(R.string.idcard_sn, (String) res.data));
//            mBtnReadIdCard.setEnabled(true);
//            mBtnReadIdCardID.setEnabled(true);
//            Toast.makeText(this, getString(R.string.id_card_reader_open_success), Toast.LENGTH_SHORT).show();
//            readCard();
            startTimer();
        }
    }

    private void closeDevice() {
//        mBtnReadIdCard.setEnabled(false);
//        mBtnReadIdCardID.setEnabled(false);
        int error;
        if ((error = mReader.close()) != IDCardReader.RESULT_OK) {
//            Toast.makeText(this, getString(R.string.id_card_reader_close_failed) + error, Toast.LENGTH_SHORT).show();
        } else {
//            Toast.makeText(this, getString(R.string.id_card_reader_close_success), Toast.LENGTH_SHORT).show();
        }
        if ((error = mReader.powerOff()) != IDCardReader.RESULT_OK) {
//            Toast.makeText(this, getString(R.string.id_card_reader_power_off_failed) + error, Toast.LENGTH_SHORT).show();
        }
    }

    private void readCard() {
//        mBtnReadIdCard.setEnabled(false);
        Result res = mReader.read();
        if (res.error == IDCardReader.RESULT_OK) {
//            Toast.makeText(this, getString(R.string.id_card_read_success), Toast.LENGTH_SHORT).show();
            IMAudioManager.instance().pause();
            closeTimer();

            curCard = (IDCard) res.data;
            boolean hasExists = false;
            if (cards == null) {
                cards = new ArrayList<>();
                cards.add(curCard);
                idCardShowModels.add(new IDCardShowModel(curCard.getName(), curCard.getNumber(), 0, curCard.getPhoto()));
                showPeopleInfo();
                CameraHelper.getInstance().doTakePicture(this);
//                startLiveness();
            } else if (cards.size() == 0) {
                cards.add(curCard);
                idCardShowModels.add(new IDCardShowModel(curCard.getName(), curCard.getNumber(), 0, curCard.getPhoto()));
                showPeopleInfo();
                CameraHelper.getInstance().doTakePicture(this);
//                startLiveness();
            } else {
                for (int i = 0; i < cards.size(); i++) {
                    if (cards.get(i) != null && curCard.getNumber().equals(cards.get(i).getNumber())) {
                        hasExists = true;
                    }
                }
                if (hasExists) {
                    startTimer();
                    //提示已存在身份证
                    Toast.makeText(this, "身份证重复，请换一个身份证！", Toast.LENGTH_SHORT).show();
                } else {
                    cards.add(curCard);
                    idCardShowModels.add(new IDCardShowModel(curCard.getName(), curCard.getNumber(), 0, curCard.getPhoto()));
                    showPeopleInfo();
                    CameraHelper.getInstance().doTakePicture(this);
//                    startLiveness();
                }
                return;
            }


        } else if (res.error == IDCardReader.NO_CARD) {
//            Toast.makeText(this, getString(R.string.id_card_not_exist_or_reread), Toast.LENGTH_SHORT).show();
        } else {
//            Toast.makeText(this, getString(R.string.id_card_read_failed) + res.error, Toast.LENGTH_SHORT).show();
        }
//        mBtnReadIdCard.setEnabled(true);
    }

//    private void readCardId() {
////        mBtnReadIdCardID.setEnabled(false);
//        Result res = mReader.readID();
//        if (res.error == IDCardReader.RESULT_OK) {
//            Toast.makeText(this, getString(R.string.id_card_read_id_success) + Long.toHexString((Long) res.data), Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(this, getString(R.string.id_card_read_id_failed) + res.error, Toast.LENGTH_SHORT).show();
//        }
////        mBtnReadIdCardID.setEnabled(true);
//    }

    private void showPeopleInfo() {
        Log.i(TAG, "showPeopleInfo: ");
        adapter.notifyDataSetChanged();
//        id_name.setText(card.getName());
//        id_num.setText(card.getNumber());
//        if (card.getPhoto() != null) {
//            idcard_face.setImageBitmap(card.getPhoto());
//        } else {
//            idcard_face.setImageResource(R.mipmap.nophoto);
//        }
    }

    private void sayComparisoning(){
        IMAudioManager.instance().playSound(RawsConstants.COMPARISONING, new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

            }
        });
    }

    private void sayComparisonSuccess(){
        IMAudioManager.instance().playSound(RawsConstants.RECOMPARISON_SUCCESS, new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                finish();
            }
        });
    }

    private void sayComparisonFail(){
        IMAudioManager.instance().playSound(RawsConstants.RECOMPARISON_FAIL, new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

            }
        });
    }

    private void startTimer() {
        closeTimer();
        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> readCard());
            }
        };
        timer.schedule(task, 1000, 1000);
    }

    private void closeTimer() {
        if (task != null) {
            task.cancel();
            task = null;
        }
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }

    private OnLivenessListener mLivenessListener = new OnLivenessListener() {
        @Override
        public void onStatusUpdate(final FaceState faceState, final FaceDistance faceDistance) {
            // Do nothing.
        }

        @Override
        public void onError(ResultCode resultCode) {
            Log.i(TAG, "onError: ");
//            finish();
            removeLastData();
            showPeopleInfo();
            sayComparisonFail();
        }

        @Override
        public void onDetectOver(ResultCode code, byte[] result, List imageData, Rect faceRect) {
            List<byte[]> imageResult = (List<byte[]>) imageData;
            switch (code) {
                case OK:
                    Log.i(TAG, "onDetectOver: ok");
//                    setResult(RESULT_OK);
                    if (imageResult != null && imageResult.size() > 0 && faceRect != null) {
                        if (imageResult.get(0) != null && imageResult.get(0).length > 0) {
                            Bitmap source = BitmapFactory.decodeByteArray(imageResult.get(0), 0, imageResult.get(0).length);
                            faceRect = new Rect(faceRect.left - 30, faceRect.top - 70, faceRect.right + 30, faceRect.bottom + 30);
                            int left = faceRect.left < 0 ? 0 : faceRect.left;
                            int top = faceRect.top < 0 ? 0 : faceRect.top;
                            int right = faceRect.right > source.getWidth() ? source.getWidth() : faceRect.right;
                            int bottom = faceRect.bottom > source.getHeight() ? source.getHeight() : faceRect.bottom;
                            Bitmap faceBitmap = Bitmap.createBitmap(source, left, top, right - left, bottom - top);
                            if (bitmaps == null) {
                                bitmaps = new ArrayList<>();
                            }
                            bitmaps.add(faceBitmap);
//                            runOnUiThread(new Runnable() {
//                                @Override
//                                public void run() {
//                                    face.setImageBitmap(bitmaps.get(0));
//                                    face.bringToFront();
//                                }
//                            });
                            runOnUiThread(() -> createToken());
//                            SilentLivenessImageHolder.setImageData(face);
                        }
                    }
                    break;
                default:
                    Log.i(TAG, "onDetectOver: ");
                    removeLastData();
                    showPeopleInfo();
                    sayComparisonFail();
//                    setResult(convertResultCode(code));
                    break;
            }
//            finish();
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

//    private void startDetectThread() {
//        mLivenessExecutor = Executors.newSingleThreadExecutor();
//        mLivenessExecutor.execute(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    if (mIsStopped) {
//                        break;
//                    }
//
//                    byte[] imageData = getPreviewData();
//                    if (imageData == null) {
//                        try {
//                            Thread.sleep(10);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        continue;
//                    }
//
//                    if (imageData != null) {
//                        SilentLivenessApi.inputData(imageData,
//                                PixelFormat.NV21,
//                                new Size(640, 480),// Default preivew size.
//                                screenSize,
//                                new Size(mCameraPreviewView.getWidth(), mCameraPreviewView.getHeight()),
//                                true,
//                                getCameraOrientation());
//
//                    }
//                    if (mIsStopped) {
//                        Log.i(TAG, "run:  break;");
//                        break;
//                    }
//
//                }
//            }
//        });
//    }
//
//    private void destroyExecutor() {
//        if (mLivenessExecutor == null) {
//            return;
//        }
//        mLivenessExecutor.shutdown();
//        try {
//            mLivenessExecutor.awaitTermination(100, TimeUnit.MILLISECONDS);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        mLivenessExecutor = null;
//    }
//
//    private void startLiveness() {
//        mCameraPreviewView.bringToFront();
//        mIsStopped = true;
//        File dir = new File(FILES_PATH);
//        if (!dir.exists()) {
//            dir.mkdirs();
//        }
//        FileUtil.copyAssetsToFile(this, LICENSE_FILE_NAME, FILES_PATH + LICENSE_FILE_NAME);
//        FileUtil.copyAssetsToFile(this, MODEL_FILE_NAME, FILES_PATH + MODEL_FILE_NAME);
//        ResultCode result = SilentLivenessApi.init(this, FILES_PATH + LICENSE_FILE_NAME, FILES_PATH + MODEL_FILE_NAME, mLivenessListener);
//        if (result != ResultCode.OK) {
//            Log.i(TAG, "startLiveness: != ok = " + result.name());
//            Toast.makeText(this, "系统错误", Toast.LENGTH_SHORT).show();
//            finish();
//            return;
//        }
//        SilentLivenessApi.setDetectTimeout(TIMEOUT);
//        mIsStopped = false;
//        startDetectThread();
//        IMAudioManager.instance().pause();
//        sayComparisoning();
//    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void cameraOpened() {
        mPreviewRate = ((float)cameraSurfaceView.getMeasuredWidth() / (float)cameraSurfaceView.getMeasuredHeight());
        CameraHelper.getInstance().doStartPreview(cameraSurfaceView.getHolder(), mPreviewRate);
    }

    @Override
    public void takePicture(Bitmap bitmap) {
//        FileUtil.savaBitmap(bitmap);
        Log.i(TAG, "takePicture: ");
        if (bitmaps == null) {
            bitmaps = new ArrayList<>();
        }
        bitmaps.add(bitmap);
        runOnUiThread(() -> createToken());
    }
}
