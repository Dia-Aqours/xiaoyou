package com.xiyo.selfhelp.ui.activity.card;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.Constant.RawsConstants;
import com.xiyo.selfhelp.MyApplication;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.manager.IMAudioManager;
import com.xiyo.selfhelp.data.model.AuthenticaTokenModel;
import com.xiyo.selfhelp.data.model.CheckInOrder;
import com.xiyo.selfhelp.data.model.GetAuthenticaTokenParam;
import com.xiyo.selfhelp.data.model.HotelInfo;
import com.xiyo.selfhelp.data.model.HotelQrced;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.activity.checkout.OutSelectActivity;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.card.CardComparisonPresenter;
import com.xiyo.selfhelp.ui.view.card.CardComparisonMvpView;
import com.xiyo.selfhelp.utils.DeviceUtil;
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
import cn.com.aratek.idcard.IDCard;
import cn.com.aratek.idcard.IDCardReader;
import cn.com.aratek.util.Result;

public class CardComparisonActivity extends BaseActivity implements CardComparisonMvpView {

    private IDCardReader mReader;

    private IDCard card;
    Timer timer;
    TimerTask task;

    @BindView(R.id.back)
    RelativeLayout back;

    @Inject
    CardComparisonPresenter<CardComparisonMvpView> mCardComparisonPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_stay_comparison);
        ButterKnife.bind(this);
        mCardComparisonPresenter.attachView(this);
        initData();
    }

    private void initData(){
        mReader = IDCardReader.getInstance();
    }

    @Override
    public void loginSuccess(Token token) {
        Log.i(TAG, "loginSuccess: token = " + token);
        MyApplication.setToken(this, token);
        getHotelInfo(token);
    }

    @Override
    public void loginFail(String error) {
        Toast.makeText(this, "token获取失败，请重试", Toast.LENGTH_SHORT).show();
        startTimer();
    }

    @Override
    public void getHotelInfoSuccess(HotelInfo info) {
        getAuthenticaToken(info);
    }

    @Override
    public void getHotelInfoFail(String error) {
        startTimer();
    }

    @Override
    public void getAuthenticaTokenListSuccess(AuthenticaTokenModel authenticaTokenModel) {
        Log.i(TAG, "getAuthenticaTokenListSuccess: ");
        if(authenticaTokenModel != null){
            Intent intent = new Intent(this, CardQrcedActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            Bundle bundle = new Bundle();
            bundle.putSerializable("data", authenticaTokenModel);
            intent.putExtra("data", bundle);
            startActivity(intent);
        }else {
            Intent intent = new Intent(this, CardNoRoomActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
//            Toast.makeText(this, "未知错误", Toast.LENGTH_SHORT).show();
//            startTimer();
        }
    }

    @Override
    public void getAuthenticaTokenListFail(String error) {
        Log.i(TAG, "getCheckInOrderFail: " + error);
        Toast.makeText(this, "操作失败，请重试", Toast.LENGTH_SHORT).show();
        startTimer();
    }

    @Override
    protected void onResume() {
        super.onResume();
        openDevice();
        IMAudioManager.instance().playSound(RawsConstants.IDCARD_SCAN_SURFACE, new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

            }
        });
//        startTimer();
    }

    @Override
    protected void onPause() {
        closeDevice();
        closeTimer();
        IMAudioManager.instance().pause();
        super.onPause();
    }

    @OnClick(R.id.back)
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                onBackPressed();
                break;
            default:
                break;
        }
    }

    private void startTimer(){
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

    private void closeTimer(){
        if(task != null){
            task.cancel();
            task = null;
        }
        if(timer != null){
            timer.cancel();
            timer = null;
        }
    }

    private void login(){
        Map<String, String > fields = new HashMap<>();
        fields.put("grant_type", "password");
        fields.put("username", "Xiezhu_Kiosk_Front");
        fields.put("password", "hD1sjddj1whdsde");
        mCardComparisonPresenter.login(fields);
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
            mCardComparisonPresenter.getHotelInfo(fields);
        } else {
            startTimer();
            Toast.makeText(this, "系统出错", Toast.LENGTH_SHORT).show();
        }
    }


    private void getAuthenticaToken(HotelInfo info){

        Map<String, String> fields = new HashMap<>();
//        fields.put("appid", info.getHotelAppID());
//        fields.put("username", card.getName());
//        fields.put("certno", card.getNumber());
        fields.put("Bearer", MyApplication.getToken(this).getAccess_token());
        ArrayList<GetAuthenticaTokenParam> list = new ArrayList<>();
        list.add(new GetAuthenticaTokenParam(card.getName(), info.getHotelAppID(), card.getNumber()));
        String json = "";
        try {
            json = LoganSquare.serialize(list, GetAuthenticaTokenParam.class);
        } catch (IOException e) {
            startTimer();
            e.printStackTrace();
        }
        if(!json.isEmpty()){
            fields.put("info", json);
            mCardComparisonPresenter.getAuthenticaTokenList(fields);
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
        Log.i(TAG, "readCard: ");
        Result res = mReader.read();
        if (res.error == IDCardReader.RESULT_OK) {
//            Toast.makeText(this, getString(R.string.id_card_read_success), Toast.LENGTH_SHORT).show();
            closeTimer();
            card = (IDCard) res.data;
            if(MyApplication.getToken(this) != null){
                getHotelInfo(MyApplication.getToken(this));
            }else {
                Log.i(TAG, "readCard:  token is null");
                login();
            }

        } else if (res.error == IDCardReader.NO_CARD) {
//            Toast.makeText(this, getString(R.string.id_card_not_exist_or_reread), Toast.LENGTH_SHORT).show();
        } else {
//            Toast.makeText(this, getString(R.string.id_card_read_failed) + res.error, Toast.LENGTH_SHORT).show();
        }
//        mBtnReadIdCard.setEnabled(true);
    }




}
