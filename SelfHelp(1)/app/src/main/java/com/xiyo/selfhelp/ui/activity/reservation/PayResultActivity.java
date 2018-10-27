package com.xiyo.selfhelp.ui.activity.reservation;

import android.content.Intent;
import android.graphics.Bitmap;
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

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiezhuhotelkiosk.zxing.ZxingUtils;
import com.xiyo.selfhelp.Constant.RawsConstants;
import com.xiyo.selfhelp.MyApplication;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.manager.IMAudioManager;
import com.xiyo.selfhelp.data.model.AuthenticaTokenModel;
import com.xiyo.selfhelp.data.model.GetAuthenticaTokenParam;
import com.xiyo.selfhelp.data.model.HotelInfo;
import com.xiyo.selfhelp.data.model.IDCardEntity;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.activity.main.LaunchActivity;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.reservation.PayResultPresenter;
import com.xiyo.selfhelp.widget.Transparent;
import com.xiyo.selfhelp.ui.view.reservation.PayResultMvpView;
import com.xiyo.selfhelp.utils.DeviceUtil;
import com.xiyo.selfhelp.utils.DoubleClickUtil;
import com.xiyo.selfhelp.utils.TimeUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PayResultActivity extends BaseActivity implements PayResultMvpView {

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

    private HashMap<String, IDCardEntity> map;
    private ArrayList<String> nameList = new ArrayList<>();

    @BindView(R.id.back)
    RelativeLayout back;


    @BindView(R.id.left_img)
    ImageView left_img;

    @BindView(R.id.right_img)
    ImageView right_img;

    @BindView(R.id.get_qrced_text)
    TextView get_qrced_text;

    @BindView(R.id.zxing)
    ImageView qrced;

    @BindView(R.id.timer)
    TextView time_txt;

    @BindView(R.id.pay_success)
    LinearLayout pay_success;

    @BindView(R.id.pay_fail)
    LinearLayout pay_fail;

    @BindView(R.id.repay_linearLayout)
    LinearLayout repay_linearLayout;

    private int result = 1;

    private int index = 0;
    private AuthenticaTokenModel authenticaTokenModel;
    @Inject
    PayResultPresenter<PayResultMvpView> mPayResultPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_pay_result);
        ButterKnife.bind(this);
        mPayResultPresenter.attachView(this);
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
    public void getHotelQrcedSuccess(AuthenticaTokenModel authenticaTokenModel) {
        if(authenticaTokenModel != null && authenticaTokenModel.getData().size() > 0){
            this.authenticaTokenModel = authenticaTokenModel;
            showQrced(index);
        }
    }

    @Override
    public void getHotelQrcedFail(String error) {

    }


    @OnClick({R.id.back, R.id.repay_linearLayout, R.id.left_img, R.id.right_img})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                backToLaunch();
                break;

            case R.id.repay_linearLayout:
                Log.i(TAG, "onClick: ");
                stopTimer();
                finish();
                break;

            case R.id.left_img:
                if(DoubleClickUtil.isFastClick()) {
                    if (authenticaTokenModel != null && authenticaTokenModel.getData().size() > 0) {
                        index--;
                        if (index < 0) {
                            index = authenticaTokenModel.getData().size() - 1;
                        }
                        showQrced(index);
                    }
                }
                break;

            case R.id.right_img:
                if(DoubleClickUtil.isFastClick()){
                    if(authenticaTokenModel != null && authenticaTokenModel.getData().size() > 0){
                        index++;
                        if(index > authenticaTokenModel.getData().size() - 1){
                            index = 0;
                        }
                        showQrced(index);
                    }
                }
                break;
            default:
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(result == 0){
            IMAudioManager.instance().playSound(RawsConstants.CHECKIN_SUCCESS, new MediaPlayer.OnCompletionListener() {
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

    private void initData() {
        curSecond = 60;
        Intent intent = getIntent();
        result = intent.getIntExtra("result", 1);
        map = (HashMap<String, IDCardEntity>) intent.getSerializableExtra("map");
        if(map != null){
            for (String key : map.keySet()) {
                nameList.add(key);
            }
        }
        Log.i(TAG, "initData: result = " + result);
    }

    private void initView() {
        time_txt.setText(curSecond + "s");
        if (result == 0) {
            time_txt.setVisibility(View.GONE);
            pay_fail.setVisibility(View.GONE);
            pay_success.setVisibility(View.VISIBLE);
            if(nameList.size() <= 1){
                left_img.setVisibility(View.GONE);
                right_img.setVisibility(View.GONE);
            }
            if (MyApplication.getToken(this) != null) {
                getHotelInfo(MyApplication.getToken(this));
            } else {
                login();
            }
//            Message msg = new Message();
//            msg.what = 100;
//            msg.obj = "";
//            qmHandler.sendMessage(msg);
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
        mPayResultPresenter.login(fields);
    }

    private void getHotelInfo(Token token) {
        if (token != null) {
            if(token.getExpires() != null && !token.getExpires().isEmpty() && !"null".equals(token.getExpires())){
                if(TimeUtil.covertToLong(TimeUtil.FORMAT_TIME_EN, TimeUtil.stampToDate(token.getExpires())) < System.currentTimeMillis()){
                    login();
                    return;
                }
            } else if(token.getExpires() == null || (token.getExpires().isEmpty() || "null".equals(token.getExpires()))){

            } else{
                login();
                return;
            }
            MyApplication.setToken(this, token);
            Map<String, String> fields = new HashMap<>();
            String deviceno = DeviceUtil.getUUID(this);
            fields.put("DeviceNo", deviceno);
            fields.put("Bearer", token.getAccess_token());
            mPayResultPresenter.getHotelInfo(fields);
        } else {
            Toast.makeText(this, "系统出错", Toast.LENGTH_SHORT).show();
        }
    }

    private void getHotelQrced(HotelInfo info) {
        Map<String, String> fields = new HashMap<>();

//        fields.put("appid", info.getHotelAppID());
//        fields.put("username", nameList.get(0));
//        fields.put("certno", map.get(nameList.get(0)).getNumber());
        fields.put("Bearer", MyApplication.getToken(this).getAccess_token());
        ArrayList<GetAuthenticaTokenParam> list = new ArrayList<>();
        for (String key : map.keySet()) {
            list.add(new GetAuthenticaTokenParam(map.get(key).getName(), info.getHotelAppID(), map.get(key).getNumber()));
        }
        String json = "";
        try {
            json = LoganSquare.serialize(list, GetAuthenticaTokenParam.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!json.isEmpty()){
            fields.put("info", json);
            mPayResultPresenter.getHotelQrced(fields);
        }

    }

    /**
     * 生成二维码
     */
    private Handler qmHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 100) {
                httpurl = (String) msg.obj;
                try {
//                    LogoConfig logoConfig = new LogoConfig();
//                    Bitmap logoBitmap = logoConfig.modifyLogo(
//                            BitmapFactory.decodeResource(getResources(),
//                                    R.mipmap.white_bg), BitmapFactory
//                                    .decodeResource(getResources(),
//                                            R.mipmap.weixin));

                    Bitmap codeBitmap = ZxingUtils.createQRImage(httpurl);
                    qrced.setImageBitmap(codeBitmap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private void showQrced(int index){
        Message msg = new Message();
        msg.what = 100;
        msg.obj = authenticaTokenModel.getData().get(index).getUrl();
        qmHandler.sendMessage(msg);
        get_qrced_text.setText(" 获取 本人 电子房卡");
        bottomDialog(authenticaTokenModel.getData().get(index).getName());
    }

    public void bottomDialog(String name) {
        Transparent.showInfoMessage(this,name);
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
                    if (curSecond >= 0) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                time_txt.setText(curSecond + "s");
                            }
                        });
                    } else {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                stopTimer();
                                backToLaunch();
                            }
                        });

                    }
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
        stopTimer();
        Intent intent = new Intent(this, LaunchActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        return;
    }
}
