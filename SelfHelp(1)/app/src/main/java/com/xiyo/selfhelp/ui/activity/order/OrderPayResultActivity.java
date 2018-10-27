package com.xiyo.selfhelp.ui.activity.order;

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

import com.xiezhuhotelkiosk.zxing.ZxingUtils;
import com.xiyo.selfhelp.Constant.RawsConstants;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.manager.IMAudioManager;
import com.xiyo.selfhelp.data.model.AuthenticaTokenModel;
import com.xiyo.selfhelp.data.model.qrced.Data;
import com.xiyo.selfhelp.ui.activity.main.LaunchActivity;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.order.OrderPayResultPresenter;
import com.xiyo.selfhelp.widget.Transparent;
import com.xiyo.selfhelp.ui.view.order.OrderPayResultMvpView;
import com.xiyo.selfhelp.utils.DoubleClickUtil;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OrderPayResultActivity extends BaseActivity implements OrderPayResultMvpView {

    private String httpurl;

    private Timer mTimer = null;
    private TimerTask scanTimerTask = null;

    private static int delay = 3000;  //1s
    private static int period = 3000;  //1s
    private int curSecond = 60;
    private static int secondPeriod = 1000;
    private String orderno;

//    private HashMap<String, IDCardEntity> map;
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
    OrderPayResultPresenter<OrderPayResultMvpView> mPayResultPresenter;

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

    @OnClick({ R.id.back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                backToLaunch();
                break;

            case R.id.repay_linearLayout:
                finish();
                break;

            case R.id.left_img:
                if(DoubleClickUtil.isFastClick()) {
                    index--;
                    if (index < 0) {
                        index = authenticaTokenModel.getData().size() - 1;
                    }
                    showQrced(index);
                }
                break;

            case R.id.right_img:
                if(DoubleClickUtil.isFastClick()){
                    index++;
                    if(index > authenticaTokenModel.getData().size() - 1){
                        index = 0;
                    }
                    showQrced(index);
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
//        map = (HashMap<String, IDCardEntity>) intent.getSerializableExtra("map");
        authenticaTokenModel = (AuthenticaTokenModel)intent.getSerializableExtra("data");
        for (Data d : authenticaTokenModel.getData()) {
            nameList.add(d.getName());
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
            showQrced(index);
        } else {
            time_txt.setVisibility(View.VISIBLE);
            pay_fail.setVisibility(View.VISIBLE);
            pay_success.setVisibility(View.GONE);
            startTimer();
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
        Intent intent = new Intent(this, LaunchActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
