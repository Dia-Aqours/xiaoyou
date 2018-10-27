package com.xiyo.selfhelp.ui.activity.stayin;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bluelinelabs.logansquare.LoganSquare;
import com.tencent.mm.sdk.modelpay.PayReq;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.xiezhuhotelkiosk.DemoWxpayutil;
import com.xiezhuhotelkiosk.QueryWxpayutil;
import com.xiezhuhotelkiosk.zxing.LogoConfig;
import com.xiezhuhotelkiosk.zxing.ZxingUtils;
import com.xiyo.selfhelp.Constant.Constants;
import com.xiyo.selfhelp.MyApplication;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.model.CheckIn;
import com.xiyo.selfhelp.data.model.CheckInOrder;
import com.xiyo.selfhelp.data.model.CheckInResult;
import com.xiyo.selfhelp.data.model.EmptyRoom;
import com.xiyo.selfhelp.data.model.FaceInfos;
import com.xiyo.selfhelp.data.model.GuestInfo;
import com.xiyo.selfhelp.data.model.Humans;
import com.xiyo.selfhelp.data.model.IDCardEntity;
import com.xiyo.selfhelp.data.model.PayConfig;
import com.xiyo.selfhelp.data.model.PoliceComparison;
import com.xiyo.selfhelp.data.model.PoliceComparisonResult;
import com.xiyo.selfhelp.data.model.ReceiveFace;
import com.xiyo.selfhelp.data.model.ReceiveFaceResult;
import com.xiyo.selfhelp.data.model.Replenish;
import com.xiyo.selfhelp.data.model.ReplenishResult;
import com.xiyo.selfhelp.data.model.ReservationModel;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.WeiPayConfig;
import com.xiyo.selfhelp.ui.activity.reservation.PayResultActivity;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.stay.StayWeiPayPresenter;
import com.xiyo.selfhelp.ui.view.stay.StayWeiPayMvpView;
import com.xiyo.selfhelp.utils.AESUtil;
import com.xiyo.selfhelp.utils.Base64BitmapUtil;
import com.xiyo.selfhelp.utils.DeviceUtil;
import com.xiyo.selfhelp.utils.TimeUtil;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StayWeiPayActivity extends BaseActivity implements StayWeiPayMvpView {

    private IWXAPI msgApi;
    private PayReq req;
    private String httpurl, state;
    DemoWxpayutil nxPayUtile;
    QueryWxpayutil qrPayUtile;
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
    private TimerTask mTimerTask = null;
    private TimerTask scanTimerTask = null;

    private static int delay = 3000;  //1s
    private static int period = 3000;  //1s
    private int curSecond = 120;
    private static int secondPeriod = 1000;
    private String orderno;


    private IDCardEntity entity;
    private CheckInOrder model;
    private String checkout;
    private int count;
    private double total_price;
    private int days;


    @BindView(R.id.zxing)
    ImageView qrced;

    @BindView(R.id.timer)
    TextView time_txt;

    @BindView(R.id.pay_type)
    TextView pay_type;
    @Inject
    StayWeiPayPresenter<StayWeiPayMvpView> mStayWeiPayPresenter;

    private int httpType = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_pay);
        ButterKnife.bind(this);
        mStayWeiPayPresenter.attachView(this);
        initData();
        initView();
    }

    @Override
    public void loginSuccess(Token token) {
        if(httpType == 1){
            getHotelPayConfigInfo(token);
        }else if(httpType == 2) {
            replenish(token);
        }
    }

    @Override
    public void loginFail(String error) {

    }

    @Override
    public void replenishSuccess(ReplenishResult replenishResult) {
        if("1".equals(replenishResult.getStatus())){
//            sendGuestInfo();
        }else {
        }
        sendGuestInfo();
    }

    @Override
    public void replenishFail(String error) {
        sendGuestInfo();
    }

    @Override
    public void sendGuestInfoSuccess(PoliceComparisonResult policeComparisonResult) {
        showResult(0);
    }

    @Override
    public void sendGuestInfoFail(String error) {
        showResult(0);
    }

    @Override
    public void getHotelPayConfigInfoSuccess(PayConfig payConfig) {
        if(payConfig != null){

            try {
                WeiPayConfig config = LoganSquare.parse(AESUtil.aesDecrypt(payConfig.getWXPayConfig()), WeiPayConfig.class);
                req = new PayReq();
                orderno = model.getOrderNo() + "";
                curSecond = 120;
                String startTime = TimeUtil.getStringToday();
                String endTime = TimeUtil.getPreTime(startTime, "2");
                Log.i(TAG, "getHotelPayConfigInfoSuccess: startTime: " + startTime + "   endTime: " + endTime);
                int result = mStayWeiPayPresenter.getReplenishResult(model.getOrderNo());
                nxPayUtile = new DemoWxpayutil(this, config.getAppid(), config.getMchid(), config.getSubappid(), config.getSubmchid(), String.format("%.0f", (total_price * 100)),
                        config.getNotifyurl(), payConfig.getHotelName() + "入住酒店", "入住酒店" + model.getRoomNo() + "号房间", startTime, endTime, orderno + "_" + result, qmHandler);
//                if(result != 0){
//                }else {
//                    nxPayUtile = new DemoWxpayutil(this, config.getAppid(), config.getMchid(), config.getSubappid(), config.getSubmchid(), String.format("%.0f", (total_price * 100)),
//                            config.getNotifyurl(), payConfig.getHotelName() + "入住酒店", "入住酒店" + model.getRoomNo() + "号房间", startTime, endTime, orderno + "_0", qmHandler);
//                }
                nxPayUtile.doPay();
                time_txt.setText(curSecond + "s");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void getHotelPayConfigInfoFail(String error) {

    }

    private void initData() {
        Bundle bundle = getIntent().getBundleExtra("data");
        entity = (IDCardEntity) bundle.getSerializable("idcard");
        model = (CheckInOrder)bundle.get("checkInOrder");
        orderno = bundle.getString("orderno");
        checkout = bundle.getString("checkout");
        count = bundle.getInt("count");
        total_price = bundle.getDouble("price");
        days = bundle.getInt("days");
//        httpType = 1;
//        if (MyApplication.getToken(StayWeiPayActivity.this) != null) {
//            getHotelPayConfigInfo(MyApplication.getToken(StayWeiPayActivity.this));
//        } else {
//            login();
//        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        httpType = 1;
        curSecond = 120;
        if(MyApplication.getToken(StayWeiPayActivity.this) != null){
            getHotelPayConfigInfo(MyApplication.getToken(StayWeiPayActivity.this));
        }else {
            login();
        }
    }

    private void initView() {
        pay_type.setText("请打开微信");
    }

    /**
     * get the out_trade_no for an order. 生成商户订单号，该值在商户端应保持唯一（可自定义格式规范）
     */
    private String getOutTradeNo() {
        SimpleDateFormat format = new SimpleDateFormat("MMddHHmmss",
                Locale.getDefault());
        Date date = new Date();
        String key = format.format(date);

        Random r = new Random();
        key = key + r.nextInt();
        key = key.substring(0, 15);
        return key;
    }

    @Override
    protected void onPause() {
        super.onPause();
        stopTimer();
    }

    @Override
    public void onBackPressed() {
        int replenishResult = mStayWeiPayPresenter.getReplenishResult(model.getOrderNo()) + 1;
        mStayWeiPayPresenter.setReplenishResult(model.getOrderNo(), replenishResult);
        super.onBackPressed();
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
                    LogoConfig logoConfig = new LogoConfig();
                    Bitmap logoBitmap = logoConfig.modifyLogo(
                            BitmapFactory.decodeResource(getResources(),
                                    R.mipmap.white_bg), BitmapFactory
                                    .decodeResource(getResources(),
                                            R.mipmap.weixin));
                    Bitmap codeBitmap = ZxingUtils.createCode(httpurl, logoBitmap);
                    qrced.setWillNotDraw(false);
                    qrced.setImageBitmap(codeBitmap);
                    startTimer();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else if(msg.what == 101) {
                int replenishResult = mStayWeiPayPresenter.getReplenishResult(model.getOrderNo()) + 1;
                mStayWeiPayPresenter.setReplenishResult(model.getOrderNo(), replenishResult);
                finish();
            }
        }
    };

    /**
     * 判断支付结果
     */

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 200) {
                state = (String) msg.obj;
                try {

                    if (state.equals("NOTPAY") || state.equals("USERPAYING")) {//未支付
                        Log.v("----------vv", "未支付");
                    } else if (state.equals("SUCCESS")) {//成功
                        stopTimer();
                        httpType = 2;
                        if(MyApplication.getToken(StayWeiPayActivity.this) != null){
                            replenish(MyApplication.getToken(StayWeiPayActivity.this));
                        }else {
                            login();
                        }
//                        showResult(0);
                        Log.v("----------vv", "支付成功");
                    } else {
                        stopTimer();
                        Log.v("----------vv", "支付失败");
                        showResult(1);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    };


    /**
     * 开始查询
     */
    private void startTimer() {
        if (mTimer == null) {
            mTimer = new Timer();
        }

        if (mTimerTask == null) {
            mTimerTask = new TimerTask() {
                @Override
                public void run() {
                    try {
                        int result = mStayWeiPayPresenter.getReplenishResult(model.getOrderNo());
                        if(result != 0){
                            qrPayUtile = new QueryWxpayutil(StayWeiPayActivity.this, appid, mchid, subappid, submchid, orderno + "_0_" + result, mHandler);
                        }else {
                            qrPayUtile = new QueryWxpayutil(StayWeiPayActivity.this, appid, mchid, subappid, submchid, orderno + "_0", mHandler);
                        }
                        qrPayUtile.doPay();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
        }

        if(scanTimerTask == null){
            scanTimerTask = new TimerTask() {
                @Override
                public void run() {
                    curSecond --;
                    if(curSecond >= 0){
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                time_txt.setText(curSecond + "s");
                            }
                        });

                    }else {
                        if (state == null || "NOTPAY".equals(state) || "USERPAYING".equals(state)) {//未支付
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    stopTimer();
                                    finish();
//                                    showResult(1);
                                }
                            });
                        }
                    }
                }
            };
        }

        if (mTimer != null && mTimerTask != null)
            mTimer.schedule(mTimerTask, delay, period);

        if (mTimer != null && scanTimerTask != null)
            mTimer.schedule(scanTimerTask, 0, secondPeriod);
    }

    private void stopTimer() {
        if (mTimer != null) {
            mTimer.cancel();
            mTimer = null;
        }
        if (mTimerTask != null) {
            mTimerTask.cancel();
            mTimerTask = null;
        }
        if(scanTimerTask != null){
            scanTimerTask.cancel();
            scanTimerTask = null;
        }
    }

    private void login(){
        Map<String, String > fields = new HashMap<>();
        fields.put("grant_type", "password");
        fields.put("username", "Xiezhu_Kiosk_Front");
        fields.put("password", "hD1sjddj1whdsde");
        mStayWeiPayPresenter.login(fields);
    }

    private void getHotelPayConfigInfo(Token token){
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
        Map<String, String> map = new HashMap<>();
        map.put("RoomNo", model.getRoomNo());
        map.put("DeviceNo", DeviceUtil.getUUID(this));
        map.put("Bearer", token.getAccess_token());
        mStayWeiPayPresenter.getHotelPayConfigInfo(map);
    }

    private void replenish(Token token){
        Map<String, String> fields = new HashMap<>();
        fields.put("Bearer", token.getAccess_token());
        Replenish replenish = new Replenish();
        replenish.setDeviceNo(DeviceUtil.getUUID(this));
        replenish.setOrderID(orderno);
        replenish.setTradeID(getOutTradeNo());
        String checkOut = checkout + " 12:00";
        checkOut = TimeUtil.convertToTime(TimeUtil.FORMAT_TIME_EN_3, TimeUtil.strToDateLong(TimeUtil.FORMAT_TIME_EN_2, checkOut));
        replenish.setCheckOutDT(checkOut);
        replenish.setRoomFee(model.getRoomFee());
        replenish.setPayType("2");
        replenish.setPrepayment("0");
        replenish.setChannelType("2");
        String json = "";
        try {
            json = LoganSquare.serialize(replenish);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!json.isEmpty()){
            fields.put("info", json);
            Log.i(TAG, "replenish: map = " + fields.toString());
            mStayWeiPayPresenter.replenish(fields);
        }
    }

//    private void receiveFace(){
//        Map<String, String > fields = new HashMap<>();
//        ReceiveFace receiveFace = new ReceiveFace();
//
//        receiveFace.setDeviceNo(DeviceUtil.getUUID(this));
//        receiveFace.setDeviceOwner("Xiezhu_Kiosk");
//
//        List<FaceInfos> faceInfoList = new ArrayList<>();
//        for (String key : entity.keySet()) {
//            FaceInfos faceInfos = new FaceInfos();
//            faceInfos.setName(key);
//            faceInfos.setCardNo(entity.get(key).getNumber());
//            faceInfos.setBase64Img(Base64BitmapUtil.bitmapToBase64(bitmapMap.get(key)));
//            faceInfoList.add(faceInfos);
//        }
//        receiveFace.setFaceInfos(faceInfoList);
//        receiveFace.setRoomNo(emptyRoom.getRoomNo());
//        receiveFace.setTimestamp(new Date().getTime());
//        String json = "";
//        try {
//            json = LoganSquare.serialize(receiveFace);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if(!json.isEmpty()){
//            fields.put("info", json);
//            fields.put("Bearer", MyApplication.getToken(this).getAccess_token());
//            mStayAliPayPresenter.receiveFace(fields);
//        }
//    }

    private void sendGuestInfo(){
        PoliceComparison comparison = new PoliceComparison();
        comparison.setDeviceNo(DeviceUtil.getUUID(this));
        comparison.setDeviceOwner(Constants.CreatedBy);
        Map<String, String > fields = new HashMap<>();
        fields.put("Bearer", MyApplication.getToken(this).getAccess_token());
        List<GuestInfo> list = new ArrayList<>();
        IDCardEntity idCard = entity;
        if(idCard != null){
            GuestInfo guestInfo = new GuestInfo();
            guestInfo.setName(idCard.getName());
            guestInfo.setSex(idCard.getSex().toString());
            guestInfo.setNationality(idCard.getNationality().toString());
            guestInfo.setAddress(idCard.getAddress());
            guestInfo.setNumber(idCard.getNumber());
            guestInfo.setAuthority(idCard.getAuthority());
            guestInfo.setValidFrom(TimeUtil.convertTime(TimeUtil.FORMAT_ID_EN, idCard.getValidFrom().getTime()));
            guestInfo.setValidTo(idCard.getValidTo() == null ? "长期" : TimeUtil.convertTime(TimeUtil.FORMAT_ID_EN, idCard.getValidTo().getTime()));
//            guestInfo.setCheckintime(checkout);
            guestInfo.setPapertypeid("11");
            guestInfo.setIs2ndcard(1);
            guestInfo.setGuesttype(0);
            guestInfo.setCheckinmodeid(1);
            guestInfo.setCheckintypeid(1);
            guestInfo.setRoomNo(model.getRoomNo());
//            guestInfo.setPhoto(Base64BitmapUtil.bitmapToBase64(bitmapMap.get(key)));
            list.add(guestInfo);
        }

        comparison.setGuestInfoList(list);
        try {
            String json = LoganSquare.serialize(comparison);
            fields.put("info", json);
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    mStayWeiPayPresenter.sendGuestInfo(fields);
                }
            });
        } catch (IOException e) {
            Toast.makeText(this, "系统错误，请重试", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
            finish();
        }
    }

    private void showResult(int result){
        if(result == 1){
            int replenishResult = mStayWeiPayPresenter.getReplenishResult(model.getOrderNo()) + 1;
            mStayWeiPayPresenter.setReplenishResult(model.getOrderNo(), replenishResult);
        }
        Log.i(TAG, "showResult: result = " + result);
        qrced.setWillNotDraw(true);
        stopTimer();
        Intent intent = new Intent(this, StayPayResultActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("result", result);
        intent.putExtra("entity", entity);
        startActivity(intent);
    }

}
