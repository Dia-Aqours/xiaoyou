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
import com.xiezhuhotelkiosk.zxing.LogoConfig;
import com.xiezhuhotelkiosk.zxing.ZxingUtils;
import com.xiyo.selfhelp.Constant.Constants;
import com.xiyo.selfhelp.MyApplication;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.model.CheckInOrder;
import com.xiyo.selfhelp.data.model.GuestInfo;
import com.xiyo.selfhelp.data.model.IDCardEntity;
import com.xiyo.selfhelp.data.model.PayConfig;
import com.xiyo.selfhelp.data.model.PoliceComparison;
import com.xiyo.selfhelp.data.model.PoliceComparisonResult;
import com.xiyo.selfhelp.data.model.Replenish;
import com.xiyo.selfhelp.data.model.ReplenishResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.WeiPayConfig;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.stay.StayAliPayPresenter;
import com.xiyo.selfhelp.ui.view.stay.StayAliPayMvpView;
import com.xiyo.selfhelp.utils.AESUtil;
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

public class StayAliPayActivity extends BaseActivity implements StayAliPayMvpView {

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
    StayAliPayPresenter<StayAliPayMvpView> mStayAliPayPresenter;

    private int httpType = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_pay);
        ButterKnife.bind(this);
        mStayAliPayPresenter.attachView(this);
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
            sendGuestInfo();
        }else {
            sendGuestInfo();
        }
    }

    @Override
    public void replenishFail(String error) {
        sendGuestInfo();
//        Toast.makeText(this, "replenish failed", Toast.LENGTH_SHORT).show();
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
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        WeiPayConfig config = LoganSquare.parse(AESUtil.aesDecrypt(payConfig.getALPayConfig()), WeiPayConfig.class);

                        aplyid = config.getAppid();
                        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", aplyid, RSA_PRIVATE, "json", "utf-8", RSA_PUBLIC, "RSA2");
                        AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();
                        AlipayTradePrecreateModel alipayTradePrecreateModel = new AlipayTradePrecreateModel();
                        alipayTradePrecreateModel.setSellerId(config.getMchid());//卖家支付宝用户ID
                        alipayTradePrecreateModel.setBody(payConfig.getHotelName() + "入住" + model.getRoomNo() + "号房间");//	对交易或商品的描述
                        alipayTradePrecreateModel.setSubject(payConfig.getHotelName() + "入住");//订单标题
                        int result = mStayAliPayPresenter.getReplenishResult(model.getOrderNo());
                        alipayTradePrecreateModel.setOutTradeNo(orderno + "_" + result);//商户订单号,
//                        if(result != 0){
//                        }else {
//                            alipayTradePrecreateModel.setOutTradeNo(orderno + "_0");//商户订单号,
//                        }
                        alipayTradePrecreateModel.setTimeoutExpress("2m");//订单允许的最晚付款时间
                        alipayTradePrecreateModel.setTotalAmount(total_price + "");//订单总金额
                        request.setBizModel(alipayTradePrecreateModel);
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

        Bundle bundle = getIntent().getBundleExtra("data");
        entity = (IDCardEntity) bundle.getSerializable("idcard");
        model = (CheckInOrder)bundle.get("checkInOrder");
        orderno = bundle.getString("orderno");
        checkout = bundle.getString("checkout");
        count = bundle.getInt("count");
        total_price = bundle.getDouble("price");
        days = bundle.getInt("days");
//        httpType = 1;
//        if (MyApplication.getToken(AliPayActivity.this) != null) {
//            getHotelPayConfigInfo(MyApplication.getToken(AliPayActivity.this));
//        } else {
//            login();
//        }
    }

    private void initView() {
        pay_type.setText("请打开支付宝");
    }

    @Override
    protected void onResume() {
        super.onResume();
        httpType = 1;
        curSecond = 120;
        if (MyApplication.getToken(StayAliPayActivity.this) != null) {
            getHotelPayConfigInfo(MyApplication.getToken(StayAliPayActivity.this));
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

    @Override
    public void onBackPressed() {
        int replenishResult = mStayAliPayPresenter.getReplenishResult(model.getOrderNo()) + 1;
        mStayAliPayPresenter.setReplenishResult(model.getOrderNo(), replenishResult);
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
            }else if(msg.what == 101) {
                int replenishResult = mStayAliPayPresenter.getReplenishResult(model.getOrderNo()) + 1;
                mStayAliPayPresenter.setReplenishResult(model.getOrderNo(), replenishResult);
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
//                        stopTimer();
//                        startTimer();
                    } else if (state.equals("SUCCESS")) {//成功
                        stopTimer();
                        httpType = 2;
                        if(MyApplication.getToken(StayAliPayActivity.this) != null){
                            replenish(MyApplication.getToken(StayAliPayActivity.this));
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
     * 查询是否支付 根据商户订单号
     *
     * @throws AlipayApiException
     */
    public void getQuery(String orderno) throws AlipayApiException {
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
                                if (MyApplication.getToken(StayAliPayActivity.this) != null) {
                                    replenish(MyApplication.getToken(StayAliPayActivity.this));
                                } else {
                                    login();
                                }
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
     * 停止查询
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
                        int result = mStayAliPayPresenter.getReplenishResult(model.getOrderNo());
                        getQuery(orderno + "_" + result);
//                        if(result != 0){
//                        }else {
//                            getQuery(orderno + "_0");
//                        }
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
        mStayAliPayPresenter.login(fields);
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
        mStayAliPayPresenter.getHotelPayConfigInfo(map);
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
        replenish.setPayType("1");
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
            mStayAliPayPresenter.replenish(fields);
        }
    }


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
                    mStayAliPayPresenter.sendGuestInfo(fields);
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
            int replenishResult = mStayAliPayPresenter.getReplenishResult(model.getOrderNo()) + 1;
            mStayAliPayPresenter.setReplenishResult(model.getOrderNo(), replenishResult);
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
