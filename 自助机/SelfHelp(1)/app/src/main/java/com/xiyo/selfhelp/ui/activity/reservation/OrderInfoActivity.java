package com.xiyo.selfhelp.ui.activity.reservation;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.Constant.RawsConstants;
import com.xiyo.selfhelp.MyApplication;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.manager.IMAudioManager;
import com.xiyo.selfhelp.data.model.CheckIn;
import com.xiyo.selfhelp.data.model.CheckInResult;
import com.xiyo.selfhelp.data.model.EmptyRoom;
import com.xiyo.selfhelp.data.model.Humans;
import com.xiyo.selfhelp.data.model.IDCardEntity;
import com.xiyo.selfhelp.data.model.ReservationModel;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.reservation.OrderInfoPresenter;
import com.xiyo.selfhelp.ui.view.reservation.OrderInfoMvpView;
import com.xiyo.selfhelp.utils.DeviceUtil;
import com.xiyo.selfhelp.utils.DoubleClickUtil;
import com.xiyo.selfhelp.utils.OrderUtil;
import com.xiyo.selfhelp.utils.TimeUtil;
import com.xiyo.selfhelp.widget.GlideImageLoader;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OrderInfoActivity extends BaseActivity implements OrderInfoMvpView {

    @BindView(R.id.back)
    RelativeLayout back;

    @BindView(R.id.wei_pay)
    RelativeLayout wei_pay;

    @BindView(R.id.ali_pay)
    RelativeLayout ali_pay;

    @BindView(R.id.img)
    ImageView img;

    @BindView(R.id.name)
    TextView name;

    @BindView(R.id.total_time)
    TextView total_time;

    @BindView(R.id.in_time)
    TextView in_time;

    @BindView(R.id.lodger_num)
    TextView lodger_num;

    @BindView(R.id.price)
    TextView price;

    @BindView(R.id.confirm_payment)
    TextView confirm_payment;

    @BindView(R.id.wei_round)
    ImageView wei_round;

    @BindView(R.id.ali_round)
    ImageView ali_round;

    @Inject
    OrderInfoPresenter<OrderInfoMvpView> mOrderInfoPresenter;

    private ReservationModel model;
    private EmptyRoom emptyRoom;
    private String checkin;
    private int count;
    private int days;
    private HashMap<String, IDCardEntity> map;
    private HashMap<String, String> bitmapMap;

    GlideImageLoader imageLoader = new GlideImageLoader();

    private double total_price;

    private String orderno;
    private String serialsNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: OrderInfoActivity....");
        activityComponent().inject(this);
        setContentView(R.layout.activity_reservation_info);
        ButterKnife.bind(this);
        mOrderInfoPresenter.attachView(this);
        initData();
        initView();
    }

    @Override
    public void loginSuccess(Token token) {
        MyApplication.setToken(this, token);
        createOrder(token);
//        checkout(token);
    }

    @Override
    public void loginFail(String error) {
        Toast.makeText(this, "LoginFail", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        IMAudioManager.instance().playSound(RawsConstants.COMFIRM_CHECKIN_INFO, new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        IMAudioManager.instance().pause();
    }

    @Override
    public void createOrderSuccess(CheckInResult checkInResult) {
        if("200".equals(checkInResult.getMsg())){
            pay(type);
        }else {
            Toast.makeText(this, "createOrder failed msg = 2", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void createOrderFail(String error) {

        Log.i(TAG, "checkoutFail: " + error);
    }


    @OnClick({R.id.back, R.id.confirm_payment, R.id.ali_pay, R.id.wei_pay})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                if(DoubleClickUtil.isFastClick()) {
                    finish();
                }
                break;
            case R.id.ali_pay:
                    ali_round.setBackgroundResource(R.mipmap.round_selected);
                    wei_round.setBackgroundResource(R.mipmap.round_normal);
                    type = 1;

                break;

            case R.id.wei_pay:
                    ali_round.setBackgroundResource(R.mipmap.round_normal);
                    wei_round.setBackgroundResource(R.mipmap.round_selected);
                    type = 2;
                break;

            case R.id.confirm_payment:
                if(DoubleClickUtil.isFastClick()){
                    if(!model.getRoomState().getIsFull()){
                        if(days > 0 && model.getDailyFees().getFee() > 0){
                            if(MyApplication.getToken(this) != null){
                                createOrder(MyApplication.getToken(this));
//                                    checkout(MyApplication.getToken(this));
                            }else {
                                login();
                            }
                        }else {
                            Toast.makeText(this, "暂无房价该房型无法办理！！！", Toast.LENGTH_SHORT).show();
                        }
                    }else {
                        Toast.makeText(this, "房间已满！！", Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            default:
                break;
        }
    }

    private void initData(){
        type = 2;
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");

        emptyRoom = (EmptyRoom) bundle.get("roomData");
        model = (ReservationModel)bundle.get("reservationModel");
        checkin = bundle.getString("checkin");
        count = bundle.getInt("count");
        total_price = bundle.getDouble("price");
        days = bundle.getInt("days");
        map = (HashMap<String, IDCardEntity>) bundle.getSerializable("map");
        bitmapMap = (HashMap<String, String>) bundle.getSerializable("bitmapMap");
        List<String> imgs = model.getRoomTypeImgs();
        Log.i(TAG, "setText: imgs = " + imgs);
        String url = imgs != null && imgs.size() != 0 ? model.getRoomTypeImgs().get(0) : "";
        if(!url.isEmpty()){
            imageLoader.displayImage(this, url, img);
        }
    }

    private void initView(){
        name.setText(model.getRoomTypeName() + "  " + emptyRoom.getRoomNo());
        lodger_num.setText(count + "位");
        setText(days);
    }

    private void setText(int days){
        long now = System.currentTimeMillis();
        String timeStr = TimeUtil.convertTime(TimeUtil.FORMAT_DATE_EN, now);
        days = days == 0 ? 1 : days;
        String outTime = TimeUtil.addDays(TimeUtil.FORMAT_DATE_EN, timeStr, days);
        String interval = TimeUtil.intervalDayTime(now);
        in_time.setText(timeStr.substring(5) + "  (" + interval + ")  -  " +  outTime.substring(5));

        total_time.setText(days + "晚");
        total_price = days * model.getDailyFees().getFee();
        price.setText(total_price + "");
    }

    private void login(){
        Map<String, String > fields = new HashMap<>();
        fields.put("grant_type", "password");
        fields.put("username", "Xiezhu_Kiosk_Front");
        fields.put("password", "hD1sjddj1whdsde");
        mOrderInfoPresenter.login(fields);
    }

    private void createOrder(Token token){
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
        orderno = getOutTradeNo();
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
        serialsNumber = getSerialsNnumber();
        in.setTradeID(serialsNumber);

        String checkInDT = checkin;
        checkInDT = TimeUtil.convertToTime(TimeUtil.FORMAT_TIME_EN_3, TimeUtil.strToDateLong(TimeUtil.FORMAT_TIME_EN_2, checkInDT));
        in.setCheckInDT(checkInDT);

        String checkOut = TimeUtil.addDays(TimeUtil.FORMAT_TIME_EN_2, checkin, days);
        checkOut = TimeUtil.convertToTime(TimeUtil.FORMAT_TIME_EN_3, TimeUtil.strToDateLong(TimeUtil.FORMAT_TIME_EN_2, checkOut));
        in.setCheckOutDT(checkOut);
        in.setRoomFee(model.getDailyFees().getFee());
        in.setPayType("0");
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
            Log.i(TAG, "createOrder: " + fields.toString());
            mOrderInfoPresenter.createOrder(fields);
        }
    }

    private String getOutTradeNo() {
        String orderno = OrderUtil.getNewOrderId(DeviceUtil.getUUID(this));
//        SimpleDateFormat format = new SimpleDateFormat("MMddHHmmss",
//                Locale.getDefault());
//        Date date = new Date();
//        String key = format.format(date);
//
//        Random r = new Random();
//        key = key + r.nextInt();
//        key = key.substring(0, 15);
        return orderno;
    }

    private String getSerialsNnumber(){
        SimpleDateFormat format = new SimpleDateFormat("MMddHHmmss",
        Locale.getDefault());
        Date date = new Date();
        String key = format.format(date);

        Random r = new Random();
        key = key + r.nextInt();
        key = key.substring(0, 15);
        return key;
    }

    private int type = 2;

    private void pay(int type){
        Log.i(TAG, "pay: " + type);
        Intent intent = new Intent();
        switch (type){
            case 1:
                //支付宝
                intent.setClass(this, AliPayActivity.class);
                break;
            case 2:
                //微信支付
                intent.setClass(this, WeiPayActivity.class);
                break;
        }
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        Bundle bundle = new Bundle();
        bundle.putSerializable("emptyRoom", emptyRoom);
        bundle.putSerializable("reservationModel", model);
        bundle.putString("checkin", checkin);
        bundle.putInt("count", count);
        bundle.putInt("days", days);
        bundle.putString("orderno", orderno);
        bundle.putString("serialsNumber", serialsNumber);
        bundle.putDouble("price", total_price);
        intent.putExtra("data", bundle);
        intent.putExtra("map", map);
        intent.putExtra("bitmapMap", bitmapMap);

        startActivity(intent);
    }
}
