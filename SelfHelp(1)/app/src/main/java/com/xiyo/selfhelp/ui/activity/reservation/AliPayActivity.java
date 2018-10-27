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

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradePrecreateModel;
import com.alipay.api.domain.AlipayTradeQueryModel;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
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
import com.xiyo.selfhelp.ui.presenter.reservation.AliPayPresenter;
import com.xiyo.selfhelp.ui.presenter.reservation.WeiPayPresenter;
import com.xiyo.selfhelp.ui.view.reservation.AliPayMvpView;
import com.xiyo.selfhelp.ui.view.reservation.WeiPayMvpView;
import com.xiyo.selfhelp.utils.AESUtil;
import com.xiyo.selfhelp.utils.Base64BitmapUtil;
import com.xiyo.selfhelp.utils.BitmapUtil;
import com.xiyo.selfhelp.utils.DeviceUtil;
import com.xiyo.selfhelp.utils.TimeUtil;

import org.json.JSONException;
import org.json.JSONObject;

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

public class AliPayActivity extends BaseActivity implements AliPayMvpView {

    Handler rmHandler = new Handler();
    private String httpurl, state;
    // 商户PID
    public static final String PARTNER = "2088821316309304";
    // 商户收款账号
    public static final String SELLER = "alien.zhang@xiezhuwang.com";
    // 商户私钥，pkcs1格式
//    public static final String RSA_PRIVATE = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAM4JbCQwvWMb1crGoBwroxV2z1NvGJR25OKZX1SINVVYXrz9Ps/WoFqz/qhUGoOu2iMA89x6uJY/XLIeGv9vp7riAlzn5b1TMwZQZ6+Du2rv3KvzB1+nG4srg6IodFrehAJ8fwSrXEXOtsJrgkjx/j4e7bXUOJUWJcwnum8gObFbAgMBAAECgYEAij2ANXgOWiUe+QL0AnK05X3l9ZEg6NwtDmzhrZIGVtEIH727GzBiPvlt7/seHyR+b+X/uPsORqEUzN2uN5zu6Bs+bg0NiQYUJkTyrjYtJRdqwnNjDjD/2YpegKyizViI6+jMZVd+T4TfAnz0U8lsBp/G+102W1szMjHCgKJOb8ECQQD/J4WYISXlxq/+0BAfmfxhTUjNqkcxkZYKBMcOQOFP4lJRZOaKIfejL7SbHSTeJg5eNbF1zppcU1ONtKPQoXA5AkEAzrg6bSjDL94MWeCKc11I/aR/i1S/2YYTt78cnX/SuqHBZCGmgJef0iiUgml31SfOb2+ZCQ4bUcIvW1QYpOcGMwJBAMQc2G3pbHuDj1pHCV2AuZ8AC+kn67iJsczZhzXJYGRKDANLjna1TOU8kZB3ghLNJVX75v4pYjN8SEgug4qjyuECQFPlhSDkWENHFTAs50Pm6ka2ymTb4nj/52S9lXl+dSH1oC1pUtABuYVrnspGz7Gc1DV5z1xTc1b9PocMXGwgru0CQEytzcWjvt330DmmLeZYqDDa+GoZyGDfw0gOo1cm6sN5Uw+b++xTdm0DCxVS3zngJVUfmih44lyufaCnFUwKx2U=";
    // 支付宝公钥
    public static final String RSA_PUBLIC = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhyZ/sBH0BHN4Rwc3BdOoeVYQBKuyYaqLxUvX/aLkjgS3kWv8U9fcIHdierChjWXX4kvRZ0txnuDB0u3c3D5zm5xPtyWm6pPKLFbr+6XMDpq9tuidnyYJPi9OzUviQz1E1/5Pb+cUDwbhO9zmx37956ZvdTBDsShJlMAgAuOeDPNUAm91Gnw0H0+yzvCNVqQykmNwwN01u3cv2a4Hlin53W4vafwg8c7XnV8XgncBKKFReZEPcg+FmX0KtkzD+CojCmgsRpJI01GV9yDWxl7mjFbnoqcUsEQUWzgCnLANNGvc3lsEWkhiF9R+IC+FolsO+0hc9FUOj1pbxL+OaQerLQIDAQAB";
    private static final int SDK_PAY_FLAG = 1;
    // 商户私钥，pkcs8格式
    private String RSA_PRIVATE = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDa9eiLIKJrQ9Vzk1umZRNBHXG1r5YPQnVM1uIgRhp0aUMrxvQLUvDRLwXaD2L5vce/m+TubUjkFYXYIOFqgTqmcjpX73zoYYyXdpAhuKPuHaYMXz7YY8m3i95lnVOxVJNgpmVLBVA4z5p7VRfTX3Y+JWs8ZcUat7FDyW0AGnncbI8dirow3uhVsAEs5yN7gh1wKY1y8LJnfFL8vwE/+lGsMEzQBIJabm2g7O1UJKWwVUKU+GMGxVh+IFtOEdljzWRbg+KPVwr6WaphFsEtkpF0S3TQ0Q7lQSs+Y2B5z+7LLJxZCpUvyCOugJ5Oi+KJz29mbMOKtMdpPdHCm5r3rY4bAgMBAAECggEASL2g/3db/d6PLtIphGHXv64UdJNcer1NUrWgcbBYYYwGsKhrssdfEV9ZxlOOQgF2NoWHzF2p9Xvg9ygVOtirr1gLYeNBz8F4f2j4APviGdznqPyLWD/uZ3ej7oYRo7vBKj6dMAsX14fAfnCKdcIk+ghcU7hLftC/pxFnkL069qrMnzXZsk2VhdNxIdilR2zyM15+DctXkUnEJoC7vYSafuP5px7bnbmLBBTt7feIZAbl4zourggE/64SCqriIXfDtsF+RxIZqiIv/CH6uMMsGgx/gbBJxl4AIDZMlhzQEOam0hdqOx0yZVDK/PW/DHnJnweQY1MeeML96EGY902hIQKBgQDvd935Z1yUXRQBiorWdfyP7ocu6j3fZwZo3bzXvVr6WBFIU5JI8Gu8kNwTOscrFqma5a0HAIz07sbTP6MpruIVwK43+kI0EfyWSz0JOkysvZn+fF55UIA9iRmX8MsBSNQYxY1OpQCXP3/fTWIeZ4FITj79bOCCrytTkuj+4SHpLwKBgQDqE5vPgbLGIHteuDW+gtaSQMSLopjkobh/BiopJ5AOJsCdutpSqfYsFOkt+MERHFYUZlh1j4ZJacgJ28Re8naCsAhC9ldJzmc2cGmnFIzPEGzGouae6M3VUbDqxTRz0J+hhv/VxkhmovvZ4wGloWzjN2ULXKvAhNBVUtZLFjuW1QKBgDfor32cQUQuWw5lDzc1AsuD8DHm5J01C40OQBnKjuQmDZrqUBwRbcXvuEIRFhEcUGrmtrgMy9wfp3IIyIph100m2EYferd3f5aDaHOwFdi6x6pf1RrTza0QRlZwFKVvIH3MGcrDwViOrccv5PmeRtPf2NsIQX6hcScpBJcFbwpnAoGAEHC+Ic3vO4EuiRGRHMddwLnx1AjgijZdmfZZ4bgYoxXPs4RbLzEmzCPP2N2+2a/Oz/H8Ro2FFgTq+t5HpY+MCVPJ0MIykUmA8E7m7MhBt41kxnLMld6uDkyFi4e8TmIZxCOSNnaNwT+zRrNt+y8iUbcjTq/8lDH/2+5MhMuT9d0CgYEAr6iM3EICFfqZ224qOgOZfpRDwbCHNDWBPzoIGdoOxn/9exvmWSse0aohF8bSbZCXVfKo/hAODmVIQ8bo4UoBFEoKF/SuHCnxerYbExphi98NppQwIVY/Qn9UeixL/ighKx9HAJiuUm5LodPCeLZOvutpkBawG5GxCOyRp9czK0E=";
    //应用id
    private String aplyid = "2017101409306036";
    //回调地址
    private String notiurl = "http://pay.xiezhuqa.cn/alipay/PayNotifyUrl";

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

    @BindView(R.id.timer)
    TextView time_txt;

    @BindView(R.id.pay_type)
    TextView pay_type;
    @Inject
    AliPayPresenter<AliPayMvpView> mWeiPayPresenter;

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
        if (httpType == 1) {
            getHotelPayConfigInfo(token);
        } else if (httpType == 2) {
            checkIn(token);
        }
    }

    @Override
    public void loginFail(String error) {

    }

    @Override
    public void checkInSuccess(CheckInResult checkInResult) {
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
    }

    @Override
    public void sendGuestInfoSuccess(PoliceComparisonResult policeComparisonResult) {
        receiveFace();
    }

    @Override
    public void sendGuestInfoFail(String error) {
        receiveFace();
    }

    @Override
    public void getHotelPayConfigInfoSuccess(PayConfig payConfig) {
        if (payConfig != null) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        WeiPayConfig config = LoganSquare.parse(AESUtil.aesDecrypt(payConfig.getALPayConfig()), WeiPayConfig.class);

                        aplyid = config.getAppid();
                        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", aplyid, RSA_PRIVATE, "json", "utf-8", RSA_PUBLIC, "RSA2");
                        AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();
                        AlipayTradePrecreateModel model = new AlipayTradePrecreateModel();
                        model.setSellerId(config.getMchid());//卖家支付宝用户ID
                        model.setBody(payConfig.getHotelName() + " 自助订房：" + emptyRoom.getRoomNo());//	对交易或商品的描述
                        model.setSubject(payConfig.getHotelName());//订单标题
                        model.setOutTradeNo(orderno);//商户订单号,
                        model.setTimeoutExpress("2m");//订单允许的最晚付款时间
                        model.setTotalAmount(total_price + "");//订单总金额
                        request.setBizModel(model);
                        request.setNotifyUrl(config.getNotifyurl());//回调地址

                        AlipayTradePrecreateResponse response;
                        response = alipayClient.execute(request);
                        Log.v("------", "" + response.getBody());

                        if (response.isSuccess()) {
                            try {
                                JSONObject jsonArray = new JSONObject(response.getBody());
                                JSONObject jb = jsonArray.getJSONObject("alipay_trade_precreate_response");
                                httpurl = jb.getString("qr_code");
                                Log.v("------", "" + httpurl);
                                qmHandler.sendEmptyMessage(100);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else {
                            System.out.println("调用失败");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (AlipayApiException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
            time_txt.setText(curSecond + "s");
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
        model = (ReservationModel) bundle.get("reservationModel");
        checkin = bundle.getString("checkin");
        count = bundle.getInt("count");
        total_price = bundle.getDouble("price");
        days = bundle.getInt("days");
        orderno = bundle.getString("orderno");
        serialsNumber = bundle.getString("serialsNumber");
//        httpType = 1;
//        if (MyApplication.getToken(AliPayActivity.this) != null) {
//            getHotelPayConfigInfo(MyApplication.getToken(AliPayActivity.this));
//        } else {
//            login();
//        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        httpType = 1;
        curSecond = 120;
        if (MyApplication.getToken(AliPayActivity.this) != null) {
            getHotelPayConfigInfo(MyApplication.getToken(AliPayActivity.this));
        } else {
            login();
        }
    }

    private void initView() {
        pay_type.setText("请打开支付宝");
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
                try {
                    LogoConfig logoConfig = new LogoConfig();
                    Bitmap logoBitmap = logoConfig.modifyLogo(
                            BitmapFactory.decodeResource(getResources(),
                                    R.mipmap.white_bg), BitmapFactory
                                    .decodeResource(getResources(),
                                            R.mipmap.zhifubao));
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
     * 查询是否支付 根据商户订单号
     *
     * @throws AlipayApiException
     */
    public void getQuery() throws AlipayApiException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", aplyid, RSA_PRIVATE, "json", "utf-8", RSA_PUBLIC, "RSA2");
        AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
        AlipayTradeQueryModel model = new AlipayTradeQueryModel();
        model.setOutTradeNo(orderno);
        request.setBizModel(model);
        AlipayTradeQueryResponse response = alipayClient.execute(request);
        if (response.isSuccess()) {
            Log.v("---sss--", "" + response.getBody());
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    try {
                        JSONObject jb = new JSONObject(response.getBody());
                        JSONObject js = jb.getJSONObject("alipay_trade_query_response");
                        String msg = js.getString("msg");
                        String id = js.getString("out_trade_no");

                        System.out.println("---支付" + msg + "::" + id + "::" + orderno);
                        if (msg.equals("Success") && orderno.equals(id)) {
                            String status = js.getString("trade_status");
                            if (status.equals("TRADE_SUCCESS")) {
                                Log.v("----------vv", "---支付成功");
                                stopTimer();
                                httpType = 2;
                                requestCheckIn();
                            } else if (status.equals("WAIT_BUYER_PAY")) {
                                Log.v("----------vv", "未支付轮询");
                            } else {
                                stopTimer();
                                Log.v("----------vv", "支付失败");
                                showResult(1);
                            }
                        } else {
                            stopTimer();
                            Log.v("----------vv", "支付失败");
                            showResult(1);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });

        } else {
            Log.v("---FFFF---", "" + response.getBody());
            Log.v("----------vv", "调用失败");
        }
    }

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
                        getQuery();
                    } catch (AlipayApiException e) {
                        e.printStackTrace();
                    }
                }
            };
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
        if (scanTimerTask != null) {
            scanTimerTask.cancel();
            scanTimerTask = null;
        }
    }

    private void login() {
        Map<String, String> fields = new HashMap<>();
        fields.put("grant_type", "password");
        fields.put("username", "Xiezhu_Kiosk_Front");
        fields.put("password", "hD1sjddj1whdsde");
        mWeiPayPresenter.login(fields);
    }

    private void getHotelPayConfigInfo(Token token) {
        if (token.getExpires() != null && !token.getExpires().isEmpty() && !"null".equals(token.getExpires())) {
            if (TimeUtil.covertToLong(TimeUtil.FORMAT_TIME_EN, TimeUtil.stampToDate(token.getExpires())) < System.currentTimeMillis()) {
                login();
                return;
            }
        } else if (token.getExpires() == null || (token.getExpires().isEmpty() || "null".equals(token.getExpires()))) {

        } else {
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
        } else if (token.getExpires() == null || (token.getExpires().isEmpty() || "null".equals(token.getExpires()))) {

        } else {
            login();
            return;
        }
        Map<String, String> fields = new HashMap<>();
        fields.put("Bearer", token.getAccess_token());
        CheckIn in = new CheckIn();
        in.setDeviceNo(DeviceUtil.getUUID(this));
        in.setOrderID(orderno);
        List<Humans> humans = new ArrayList<>();
        if (map != null) {
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
        in.setPayType("1");
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
        if (!json.isEmpty()) {
            fields.put("info", json);
            Log.i(TAG, "checkIn: " + fields.toString());
            mWeiPayPresenter.checkIn(fields);
        }
    }

    private void receiveFace() {
        Map<String, String> fields = new HashMap<>();
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
        if (!json.isEmpty()) {
            fields.put("info", json);
            fields.put("Bearer", MyApplication.getToken(this).getAccess_token());
            mWeiPayPresenter.receiveFace(fields);
        }
    }

    private void sendGuestInfo() {
        PoliceComparison comparison = new PoliceComparison();
        comparison.setDeviceNo(DeviceUtil.getUUID(this));
        comparison.setDeviceOwner(Constants.CreatedBy);
        Map<String, String> fields = new HashMap<>();
        fields.put("Bearer", MyApplication.getToken(this).getAccess_token());
        List<GuestInfo> list = new ArrayList<>();
        for (String key : map.keySet()) {
            IDCardEntity idCard = map.get(key);
            if (idCard != null) {
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
