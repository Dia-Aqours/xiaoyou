package com.xiyo.selfhelp.ui.activity.reservation;

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
import com.xiyo.selfhelp.data.model.ReservationModel;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.WeiPayConfig;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.reservation.WeiPayPresenter;
import com.xiyo.selfhelp.ui.view.reservation.WeiPayMvpView;
import com.xiyo.selfhelp.utils.AESUtil;
import com.xiyo.selfhelp.utils.Base64BitmapUtil;
import com.xiyo.selfhelp.utils.BitmapUtil;
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
import cn.com.aratek.idcard.IDCard;

public class WeiPayActivity extends BaseActivity implements WeiPayMvpView {

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
    private String serialsNumber;


    private HashMap<String, IDCardEntity> map;
    private HashMap<String, String> bitmapMap;
    private EmptyRoom emptyRoom;
    private ReservationModel model;
    private String checkin;
    private int count;
    private double total_price;
    private int days;


    @BindView(R.id.zxing)
    ImageView qrced;

    @BindView(R.id.pay_type)
    TextView pay_type;

    @BindView(R.id.timer)
    TextView time_txt;
    @Inject
    WeiPayPresenter<WeiPayMvpView> mWeiPayPresenter;

    private int httpType = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_pay);
        ButterKnife.bind(this);
        mWeiPayPresenter.attachView(this);
        initData();
        initView();
    }

    @Override
    public void loginSuccess(Token token) {
        if(httpType == 1){
            getHotelPayConfigInfo(token);
        }else if(httpType == 2) {
            checkIn(token);
        }
    }

    @Override
    public void loginFail(String error) {

    }

    @Override
    public void checkInSuccess(CheckInResult checkInResult) {
//        if("1".equals(checkInResult.getMsg())){
//            sendGuestInfo();
//        }else {
//        }
        sendGuestInfo();
    }

    @Override
    public void checkInFail(String error) {
        sendGuestInfo();
    }

    @Override
    public void receiveFaceSuccess(ReceiveFaceResult receiveFaceResult) {
        showResult(0);
    }

    @Override
    public void receiveFaceFail(String error) {
        showResult(0);
//        Toast.makeText(this, "ReceiveFace  Failed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void sendGuestInfoSuccess(PoliceComparisonResult policeComparisonResult) {
        receiveFace();
//        if (policeComparisonResult != null) {
//            if (policeComparisonResult.getResult()) {
//                receiveFace();
//            }
//        }
    }

    @Override
    public void sendGuestInfoFail(String error) {
        receiveFace();
    }

    @Override
    public void getHotelPayConfigInfoSuccess(PayConfig payConfig) {
        if(payConfig != null){

            try {
                WeiPayConfig config = LoganSquare.parse(AESUtil.aesDecrypt(payConfig.getWXPayConfig()), WeiPayConfig.class);

                req = new PayReq();
                curSecond = 120;
                String startTime = TimeUtil.getStringToday();
                String endTime = TimeUtil.getPreTime(startTime, "2");
//                nxPayUtile = new DemoWxpayutil(this, appid, mchid, subappid, submchid, String.format("%.0f", (total_price * 100)),
//                        notifyurl, payConfig.getHotelName(), emptyRoom.getRoomNo(), orderno, qmHandler);
                nxPayUtile = new DemoWxpayutil(this, config.getAppid(), config.getMchid(), config.getSubappid(), config.getSubmchid(), String.format("%.0f", (total_price * 100)),
                        config.getNotifyurl(), payConfig.getHotelName(), emptyRoom.getRoomNo(), startTime, endTime, orderno, qmHandler);
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
        map = (HashMap<String, IDCardEntity>) getIntent().getSerializableExtra("map");
        bitmapMap = (HashMap<String, String>) getIntent().getSerializableExtra("bitmapMap");

        Bundle bundle = getIntent().getBundleExtra("data");
        emptyRoom = (EmptyRoom) bundle.getSerializable("emptyRoom");
        model = (ReservationModel)bundle.get("reservationModel");
        checkin = bundle.getString("checkin");
        count = bundle.getInt("count");
        total_price = bundle.getDouble("price");
        days = bundle.getInt("days");
        orderno = bundle.getString("orderno");
        serialsNumber = bundle.getString("serialsNumber");
//        httpType = 1;
//        if (MyApplication.getToken(WeiPayActivity.this) != null) {
//            getHotelPayConfigInfo(MyApplication.getToken(WeiPayActivity.this));
//        } else {
//            login();
//        }
    }

    private void initView(){
        pay_type.setText("请打开微信");
    }

    @Override
    protected void onResume() {
        super.onResume();
        httpType = 1;
        curSecond = 120;
        if (MyApplication.getToken(WeiPayActivity.this) != null) {
            getHotelPayConfigInfo(MyApplication.getToken(WeiPayActivity.this));
        } else {
            login();
        }
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
            }
        }
    };

    /**
     *
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
//                        stopTimer();
//                        startTimer();

                    } else if (state.equals("SUCCESS")) {//成功
                        stopTimer();
                        httpType = 2;
                        if(MyApplication.getToken(WeiPayActivity.this) != null){
                            checkIn(MyApplication.getToken(WeiPayActivity.this));
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
                        qrPayUtile = new QueryWxpayutil(WeiPayActivity.this, appid, mchid, subappid, submchid, orderno, mHandler);
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

                    } else {
                        if (state == null || (state != null && !state.equals("SUCCESS"))) {//未支付
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    stopTimer();
                                    showResult(1);
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
        mWeiPayPresenter.login(fields);
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
        map.put("RoomNo", emptyRoom.getRoomNo());
        map.put("DeviceNo", DeviceUtil.getUUID(this));
        map.put("Bearer", token.getAccess_token());
        mWeiPayPresenter.getHotelPayConfigInfo(map);
    }

    private void requestCheckIn(){
        if (MyApplication.getToken(this) != null) {
            checkIn(MyApplication.getToken(this));
        } else {
            login();
        }
    }

    private void checkIn(Token token) {
        if (token.getExpires() != null && !token.getExpires().isEmpty() && !"null".equals(token.getExpires())) {
            if (TimeUtil.covertToLong(TimeUtil.FORMAT_TIME_EN, TimeUtil.stampToDate(token.getExpires())) < System.currentTimeMillis()) {
                login();
                return;
            }
        } else if(token.getExpires() == null || (token.getExpires().isEmpty() || "null".equals(token.getExpires()))){

        } else{
            login();
            return;
        }
        Map<String, String> fields = new HashMap<>();
        fields.put("Bearer", token.getAccess_token());
        CheckIn in = new CheckIn();
        in.setDeviceNo(DeviceUtil.getUUID(this));
        in.setOrderID(orderno);
        List<Humans> humans = new ArrayList<>();
        if(map != null){
            for (String key : map.keySet()) {
                Humans human = new Humans();
                human.setHumName(key);
                human.setHumCardID(map.get(key).getNumber());
                human.setRoomNo(emptyRoom.getRoomNo());
                humans.add(human);
            }
        }
        in.setHumans(humans);
        in.setTradeID(serialsNumber);

        String checkInDT = checkin;
        checkInDT = TimeUtil.convertToTime(TimeUtil.FORMAT_TIME_EN_3, TimeUtil.strToDateLong(TimeUtil.FORMAT_TIME_EN_2, checkInDT));
        in.setCheckInDT(checkInDT);

        String checkOut = TimeUtil.addDays(TimeUtil.FORMAT_TIME_EN_2, checkin, days);
        checkOut = TimeUtil.convertToTime(TimeUtil.FORMAT_TIME_EN_3, TimeUtil.strToDateLong(TimeUtil.FORMAT_TIME_EN_2, checkOut));
        in.setCheckOutDT(checkOut);
        in.setRoomFee(model.getDailyFees().getFee());
        in.setPayType("2");
        in.setPrepayment("");
        in.setRoomTypeID(model.getRoomTypeID());
        in.setCheckInType("1");
        in.setChannelType("2");
        String json = "";
        try {
            json = LoganSquare.serialize(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!json.isEmpty()){
            fields.put("info", json);
            Log.i(TAG, "checkIn: " + fields.toString());
            mWeiPayPresenter.checkIn(fields);
        }
    }

    private void receiveFace(){
        Map<String, String > fields = new HashMap<>();
        ReceiveFace receiveFace = new ReceiveFace();


        receiveFace.setDeviceNo(DeviceUtil.getUUID(this));
        receiveFace.setDeviceOwner("Xiezhu_Kiosk");

        List<FaceInfos> faceInfoList = new ArrayList<>();
        for (String key : map.keySet()) {
            FaceInfos faceInfos = new FaceInfos();
            faceInfos.setName(key);
            faceInfos.setCardNo(map.get(key).getNumber());
            faceInfos.setBase64Img(Base64BitmapUtil.bitmapToBase64(BitmapUtil.decodeFile(bitmapMap.get(key))));
            faceInfoList.add(faceInfos);
        }
        receiveFace.setFaceInfos(faceInfoList);
        receiveFace.setRoomNo(emptyRoom.getRoomNo());
        receiveFace.setTimestamp(new Date().getTime());
        String json = "";
        try {
            json = LoganSquare.serialize(receiveFace);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!json.isEmpty()){
            fields.put("info", json);
            fields.put("Bearer", MyApplication.getToken(this).getAccess_token());
            mWeiPayPresenter.receiveFace(fields);
        }
    }

    private void sendGuestInfo(){
        PoliceComparison comparison = new PoliceComparison();
        comparison.setDeviceNo(DeviceUtil.getUUID(this));
        comparison.setDeviceOwner(Constants.CreatedBy);
        Map<String, String > fields = new HashMap<>();
        fields.put("Bearer", MyApplication.getToken(this).getAccess_token());
        List<GuestInfo> list = new ArrayList<>();
        for (String key : map.keySet()) {
            IDCardEntity idCard = map.get(key);
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
                guestInfo.setCheckintime(checkin);
                guestInfo.setPapertypeid("11");
                guestInfo.setIs2ndcard(1);
                guestInfo.setGuesttype(0);
                guestInfo.setCheckinmodeid(1);
                guestInfo.setCheckintypeid(1);
                guestInfo.setRoomNo(emptyRoom.getRoomNo());
                guestInfo.setPhoto(Base64BitmapUtil.bitmapToBase64(BitmapUtil.decodeFile(bitmapMap.get(key))));
                list.add(guestInfo);
            }
        }

        comparison.setGuestInfoList(list);
        try {
            String json = LoganSquare.serialize(comparison);
            fields.put("info", json);
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    mWeiPayPresenter.sendGuestInfo(fields);
                }
            });
        } catch (IOException e) {
            Toast.makeText(this, "系统错误，请重试", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
            finish();
        }
    }

    private void showResult(int result){
        Log.i(TAG, "showResult: result = " + result);
        qrced.setWillNotDraw(true);
        stopTimer();
        Intent intent = new Intent(this, PayResultActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("result", result);
        intent.putExtra("map", map);
        startActivity(intent);
    }

}
