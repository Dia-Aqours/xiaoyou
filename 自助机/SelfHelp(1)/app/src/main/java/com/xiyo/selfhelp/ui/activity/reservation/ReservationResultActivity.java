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
import com.xiyo.selfhelp.ui.view.reservation.PayResultMvpView;
import com.xiyo.selfhelp.utils.DeviceUtil;
import com.xiyo.selfhelp.utils.DoubleClickUtil;
import com.xiyo.selfhelp.utils.TimeUtil;
import com.xiyo.selfhelp.widget.Transparent;

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

public class ReservationResultActivity extends BaseActivity{

    private Timer mTimer = null;
    private TimerTask scanTimerTask = null;

    private int curSecond = 60;
    private static int secondPeriod = 1000;

    private HashMap<String, IDCardEntity> map;
    private ArrayList<String> nameList = new ArrayList<>();

    @BindView(R.id.back)
    RelativeLayout back;

    @BindView(R.id.timer)
    TextView time_txt;

    @BindView(R.id.reconnect_linearLayout)
    LinearLayout reconnect_linearLayout;

    private int result = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_reservation_result);
        ButterKnife.bind(this);
        initData();
        initView();
    }

    @OnClick({R.id.back, R.id.reconnect_linearLayout})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                backToLaunch();
                break;

            case R.id.reconnect_linearLayout:
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
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    private void initData() {
        curSecond = 60;
    }

    private void initView() {
        time_txt.setText(curSecond + "s");
        time_txt.setVisibility(View.VISIBLE);
        startTimer();
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
                                finish();
//                                backToLaunch();
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
}
