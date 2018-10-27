package com.xiyo.selfhelp.ui.activity.checkout;

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
import com.xiyo.selfhelp.data.model.CheckInOrder;
import com.xiyo.selfhelp.data.model.IDCardEntity;
import com.xiyo.selfhelp.data.model.IDCardModel;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.activity.stayin.StayReservationActivity;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.checkout.OutComparisonPresenter;
import com.xiyo.selfhelp.ui.view.checkout.OutComparisonMvpView;
import com.xiyo.selfhelp.utils.AESUtil;
import com.xiyo.selfhelp.utils.DeviceUtil;
import com.xiyo.selfhelp.utils.TimeUtil;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
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

public class OutComparisonActivity extends BaseActivity implements OutComparisonMvpView {

    private IDCardReader mReader;

    private IDCard card;
    private IDCardEntity entity;
    Timer timer;
    TimerTask task;

    @BindView(R.id.back)
    RelativeLayout back;

    @Inject
    OutComparisonPresenter<OutComparisonMvpView> mOutComparisonPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_stay_comparison);
        ButterKnife.bind(this);
        mOutComparisonPresenter.attachView(this);
        initData();
    }

    private void initData(){
        mReader = IDCardReader.getInstance();
    }

    @Override
    public void loginSuccess(Token token) {
        Log.i(TAG, "loginSuccess: token = " + token);
        MyApplication.setToken(this, token);
        getCheckInOrder(token);
    }

    @Override
    public void loginFail(String error) {
        Toast.makeText(this, "token获取失败，请重试", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void getCheckInOrderSuccess(List<CheckInOrder> checkInOrders) {
        if(checkInOrders != null){
            if(checkInOrders.size() > 0){
                Intent intent = new Intent(this, OutSelectActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                HashMap<String, CheckInOrder> map = new HashMap<>();
                for (CheckInOrder checkInOrder : checkInOrders) {
                    map.put(checkInOrder.getOrderNo(), checkInOrder);
                }
                Bundle bundle = new Bundle();
                bundle.putSerializable("checkInOrderMap", map);
                bundle.putSerializable("idcard", entity);
                intent.putExtra("data", bundle);
                startActivity(intent);
            }else {
                Intent intent = new Intent(this, OutNoRoomActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
//                Toast.makeText(this, "未找到该身份证的订房记录", Toast.LENGTH_SHORT).show();
//                startTimer();
            }

        }else {
            Toast.makeText(this, "未知错误", Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    @Override
    public void getCheckInOrderFail(String error) {
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
        closeTimer();
        closeDevice();
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
        mOutComparisonPresenter.login(fields);
    }

    private void getCheckInOrder(Token token){
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
        Log.i(TAG, "getCheckInOrder: ");
        if(card != null){
            long curTime = System.currentTimeMillis();
            Log.i(TAG, "getCheckInOrder: curTime = " + curTime);
            IDCardModel model = new IDCardModel();
            model.setName(card.getName());
            model.setCardno(card.getNumber());
            model.setTimestamp(curTime);
            String json = "";
            try {
                json = LoganSquare.serialize(model);
            } catch (IOException e) {
                e.printStackTrace();
            }

            Log.i(TAG, "getCheckInOrder: json = " + json);
            Map<String, String > fields = new HashMap<>();
            fields.put("Bearer", token.getAccess_token());
            fields.put("DeviceNo", DeviceUtil.getUUID(this));

            String encryptvalue= AESUtil.aesEncrypt(json);
            Log.i(TAG, "getCheckInOrder: encryptvalue = " + encryptvalue);
            if(!json.isEmpty()){
                fields.put("EncryptValue", encryptvalue);
                fields.put("Timestamp", "" + curTime);
                mOutComparisonPresenter.getCheckInOrder(fields);
            }
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

            try {
                DateFormat dt = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
                dt.format(card.getBirthday());
                Log.i(TAG, "comparisonSuccess: sex: " + card.getSex().ordinal() + "    nationality: " + card.getNationality().ordinal());

                entity = new IDCardEntity(card.getName(), card.getSex().ordinal() + 1, card.getNationality().ordinal() + 1, dt.format(card.getBirthday()),
                        card.getAddress(), card.getNumber(), card.getAuthority(), dt.format(card.getValidFrom()), dt.format(card.getValidTo()),
                        card.getLatestAddress(), null, null);
            } catch (ParseException e) {
                Log.i(TAG, "comparisonSuccess: error" + e.toString());
                e.printStackTrace();
            }

            if(MyApplication.getToken(this) != null){
                getCheckInOrder(MyApplication.getToken(this));
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
