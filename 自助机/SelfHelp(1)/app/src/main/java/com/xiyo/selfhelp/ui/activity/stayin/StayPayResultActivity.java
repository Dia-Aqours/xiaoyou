package com.xiyo.selfhelp.ui.activity.stayin;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.xiezhuhotelkiosk.zxing.LogoConfig;
import com.xiezhuhotelkiosk.zxing.ZxingUtils;
import com.xiyo.selfhelp.Constant.RawsConstants;
import com.xiyo.selfhelp.MyApplication;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.manager.IMAudioManager;
import com.xiyo.selfhelp.data.model.HotelInfo;
import com.xiyo.selfhelp.data.model.HotelQrced;
import com.xiyo.selfhelp.data.model.IDCardEntity;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.activity.main.LaunchActivity;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.stay.StayPayResultPresenter;
import com.xiyo.selfhelp.ui.view.stay.StayPayResultMvpView;
import com.xiyo.selfhelp.utils.DeviceUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StayPayResultActivity extends BaseActivity implements StayPayResultMvpView {

    private String httpurl, state;
    //公众账号ID
    private String appid = "wxf33510f5323d79d5";
    //商户号
    private String mchid = "1332790701";
    //子商户公众账号ID
    private String subappid = "wxf33510f5323d79d5";
    //子商户号
    private String submchid = "1490634652";
    //通知地址
    private String notifyurl = "http://pay.xiezhuqa.cn/wxpay/PayNotifyUrl";

    private Timer mTimer = null;
    private TimerTask scanTimerTask = null;

    private static int delay = 3000;  //1s
    private static int period = 3000;  //1s
    private int curSecond = 60;
    private static int secondPeriod = 1000;
    private String orderno;

    private IDCardEntity entity;
    private ArrayList<String> nameList = new ArrayList<>();



    @BindView(R.id.back)
    RelativeLayout back;

    @BindView(R.id.timer)
    TextView time_txt;

    @BindView(R.id.pay_success)
    LinearLayout pay_success;

    @BindView(R.id.pay_fail)
    LinearLayout pay_fail;

    @BindView(R.id.repay_linearLayout)
    LinearLayout repay_linearLayout;

    private int result = 1;
    @Inject
    StayPayResultPresenter<StayPayResultMvpView> mStayPayResultPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_stay_pay_result);
        ButterKnife.bind(this);
        mStayPayResultPresenter.attachView(this);
        initData();
        initView();
    }

    @Override
    public void loginSuccess(Token token) {
        Log.i(TAG, "loginSuccess: token = " + token);
        MyApplication.setToken(this, token);
        getHotelInfo(token);
    }

    @Override
    public void loginFail(String error) {
        Toast.makeText(this, "loginFail", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void getHotelInfoSuccess(HotelInfo info) {
        getHotelQrced(info);
    }

    @Override
    public void getHotelInfoFail(String error) {
        Toast.makeText(this, "数据错误", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void getHotelQrcedSuccess(HotelQrced hotelQrced) {

    }

    @Override
    public void getHotelQrcedFail(String error) {

    }


    @OnClick({ R.id.back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                stopTimer();
                backToLaunch();
                break;
            case R.id.repay_linearLayout:
                stopTimer();
                finish();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(result == 0){
            IMAudioManager.instance().playSound(RawsConstants.STAYIN_SUCCESS, new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {

                }
            });
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        IMAudioManager.instance().pause();
    }

    @Override
    public void onBackPressed() {
        return;
    }

    private void initData() {
        curSecond = 60;
        Intent intent = getIntent();
        result = intent.getIntExtra("result", 1);
        entity = (IDCardEntity) intent.getSerializableExtra("entity");
        Log.i(TAG, "ini" +
                "tData: result = " + result);
    }

    private void initView() {
        time_txt.setText(curSecond + "s");
        if (result == 0) {
            time_txt.setVisibility(View.GONE);
            pay_fail.setVisibility(View.GONE);
            pay_success.setVisibility(View.VISIBLE);

//            if (MyApplication.getToken(this) != null) {
//                getHotelInfo(MyApplication.getToken(this));
//            } else {
//                login();
//            }
        } else {
            time_txt.setVisibility(View.VISIBLE);
            pay_fail.setVisibility(View.VISIBLE);
            pay_success.setVisibility(View.GONE);
            startTimer();
        }
    }

    private void login() {
        Map<String, String> fields = new HashMap<>();
        fields.put("grant_type", "password");
        fields.put("username", "Xiezhu_Kiosk_Front");
        fields.put("password", "hD1sjddj1whdsde");
        mStayPayResultPresenter.login(fields);
    }

    private void getHotelInfo(Token token) {
        if (token != null) {
            MyApplication.setToken(this, token);
            Map<String, String> fields = new HashMap<>();
            String deviceno = DeviceUtil.getUUID(this);
            fields.put("DeviceNo", deviceno);
            fields.put("Bearer", token.getAccess_token());
            mStayPayResultPresenter.getHotelInfo(fields);
        } else {
            Toast.makeText(this, "系统出错", Toast.LENGTH_SHORT).show();
        }
    }

    private void getHotelQrced(HotelInfo info) {
        Map<String, String> fields = new HashMap<>();
        fields.put("appid", info.getHotelAppID());
        fields.put("username", entity.getName());
        fields.put("certno", entity.getNumber());
        fields.put("Bearer", MyApplication.getToken(this).getAccess_token());
        mStayPayResultPresenter.getHotelInfo(fields);
    }

    /**
     * 开始查询
     */
    private void startTimer() {
        if (mTimer == null) {
            mTimer = new Timer();
        }

        if (scanTimerTask == null) {
            scanTimerTask = new TimerTask() {
                @Override
                public void run() {
                    curSecond--;
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if (curSecond >= 0) {
                                time_txt.setText(curSecond + "s");
                            } else {
                                stopTimer();
                                backToLaunch();
                            }
                        }
                    });

                }
            };
        }


        if (mTimer != null && scanTimerTask != null)
            mTimer.schedule(scanTimerTask, 0, secondPeriod);

    }

    private void stopTimer() {
        if (mTimer != null) {
            mTimer.cancel();
            mTimer = null;
        }
        if (scanTimerTask != null) {
            scanTimerTask.cancel();
            scanTimerTask = null;
        }
    }

    private void backToLaunch() {
        Intent intent = new Intent(this, LaunchActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
