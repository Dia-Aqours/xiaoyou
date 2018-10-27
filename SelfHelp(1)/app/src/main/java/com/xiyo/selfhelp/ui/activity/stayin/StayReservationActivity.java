package com.xiyo.selfhelp.ui.activity.stayin;

import android.app.AlertDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.Constant.RawsConstants;
import com.xiyo.selfhelp.MyApplication;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.manager.IMAudioManager;
import com.xiyo.selfhelp.data.model.CheckInOrder;
import com.xiyo.selfhelp.data.model.CheckInResult;
import com.xiyo.selfhelp.data.model.Replenish;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.stay.StayReservationPresenter;
import com.xiyo.selfhelp.ui.view.stay.StayReservationMvpView;
import com.xiyo.selfhelp.utils.DeviceUtil;
import com.xiyo.selfhelp.utils.DoubleClickUtil;
import com.xiyo.selfhelp.utils.OrderUtil;
import com.xiyo.selfhelp.utils.TimeUtil;
import com.xiyo.selfhelp.widget.GlideImageLoader;

import java.io.IOException;
import java.text.SimpleDateFormat;
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
import cn.aigestudio.datepicker.cons.DPMode;
import cn.aigestudio.datepicker.views.DatePicker;

public class StayReservationActivity extends BaseActivity implements StayReservationMvpView {

    @BindView(R.id.back)
    RelativeLayout back;

    @BindView(R.id.img)
    ImageView img;

    @BindView(R.id.name)
    TextView name;

    @BindView(R.id.price_min)
    TextView price_min;

    @BindView(R.id.total_time)
    TextView total_time;

    @BindView(R.id.in_time)
    TextView in_time;

    @BindView(R.id.out_time)
    TextView out_time;

    @BindView(R.id.price)
    TextView price;

    @BindView(R.id.reservation)
    TextView reservation;

    @Inject
    StayReservationPresenter<StayReservationMvpView> mStayReservationPresenter;

    private CheckInOrder model;

    GlideImageLoader imageLoader = new GlideImageLoader();

    private int total;
    private double total_price;
    private String checkout;

    private String orderno;
    private String serialsNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_reservation);
        ButterKnife.bind(this);
        mStayReservationPresenter.attachView(this);
        initData();
        initView();
    }

    @Override
    public void loginSuccess(Token token) {
        MyApplication.setToken(this, token);
        createReplensh(token);
    }

    @Override
    public void loginFail(String error) {
        Toast.makeText(this, "LoginFail", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void createReplenshOrderSuccess(CheckInResult checkInResult) {
        Log.i(TAG, "checkoutSuccess: " + checkInResult.toString());
        if("200".equals(checkInResult.getMsg())){
            Intent intent = new Intent(this, StayOrderInfoActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            Bundle bundle = new Bundle();
            bundle.putSerializable("checkInOrder", model);
            bundle.putString("orderno", checkInResult.getData());
            Log.i(TAG, "checkoutSuccess: startDate = " + startDate);
            bundle.putString("checkout", checkout);
            bundle.putDouble("price", total_price);
            bundle.putInt("days", total);
            bundle.putSerializable("idcard", getIntent().getBundleExtra("data").getSerializable("idcard"));
            Log.i(TAG, "comparisonSuccess:  price:" + total_price + "    days:" + total);
            intent.putExtra("data", bundle);
            startActivity(intent);
        }else {
            Toast.makeText(this, "操作失败，请重试！", Toast.LENGTH_SHORT).show();
            finish();
        }

    }

    @Override
    public void createReplenshOrderFail(String error) {
        Log.i(TAG, "checkoutFail: " + error);
    }


    @OnClick({R.id.back, R.id.out_time, R.id.reservation})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                if(DoubleClickUtil.isFastClick()) {
                    onBackPressed();
                }
                break;
            case R.id.out_time:
                dataPick();
                break;
            case R.id.reservation:
                if(DoubleClickUtil.isFastClick()){
                    if(MyApplication.get(this) != null){
                        if(total > 0 && model.getRoomFee() > 0){
                            if(MyApplication.getToken(this) != null){
                                createReplensh(MyApplication.getToken(this));
                            }else {
                                login();
                            }
                        }else {
                            Toast.makeText(this, "暂无房价该房型无法办理！！！", Toast.LENGTH_SHORT).show();
                        }
                    }else {
                        login();
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
        IMAudioManager.instance().playSound(RawsConstants.SELECT_STAYIN_TIME, new MediaPlayer.OnCompletionListener() {
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

    private void initData(){
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        model = (CheckInOrder)bundle.get("data");
    }

    private void initView(){
        List<String> imgs = model.getRoomTypeImgs();
        Log.i(TAG, "setText: imgs = " + imgs);
        String url = imgs != null && imgs.size() != 0 ? model.getRoomTypeImgs().get(0) : "";
        if(!url.isEmpty()){
            imageLoader.displayImage(this, url, img);
        }
        name.setText(model.getRoomTypeName());
        price_min.setText(model.getRoomFee() + "");
        setText(1);
    }

    private void login(){
        Map<String, String > fields = new HashMap<>();
        fields.put("grant_type", "password");
        fields.put("username", "Xiezhu_Kiosk_Front");
        fields.put("password", "hD1sjddj1whdsde");
        mStayReservationPresenter.login(fields);
    }

    private String startDate;

    private void reservation(Token token){
        String deviceno = DeviceUtil.getUUID(this);
        startDate = in_time.getText().toString().trim();
        String endDate = out_time.getText().toString().trim();
        Log.i(TAG, "checkout: startDate = " + startDate + "    endDate =" + endDate + "   RoomTypeID() = " + model.getRoomTypeID() + "    deviceno = " + deviceno);
        Map<String, String> fields = new HashMap<>();
        fields.put("StartDate", startDate);
        fields.put("RoomTypeID", model.getRoomTypeID());
        fields.put("DeviceNo", deviceno);
        fields.put("EndDate", endDate);
        fields.put("Bearer", token.getAccess_token());
        mStayReservationPresenter.createReplenshOrder(fields);
    }


    private void createReplensh(Token token){
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
        Replenish replenish = new Replenish();
        replenish.setDeviceNo(DeviceUtil.getUUID(this));
        replenish.setOrderID(model.getOrderNo());
        serialsNumber = getSerialsNnumber();
        replenish.setTradeID(serialsNumber);
        String checkOut = checkout + " 12:00";
        Log.i(TAG, "createReplensh: " + checkOut);
        checkOut = TimeUtil.convertToTime(TimeUtil.FORMAT_TIME_EN_3, TimeUtil.strToDateLong(TimeUtil.FORMAT_TIME_EN_2, checkOut));
        replenish.setCheckOutDT(checkOut);
        replenish.setRoomFee(model.getRoomFee());
        replenish.setPayType("0");
        replenish.setPrepayment("");
        replenish.setChannelType("2");
        String json = "";
        try {
            json = LoganSquare.serialize(replenish);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!json.isEmpty()){
            fields.put("info", json);
            Log.i(TAG, "createReplensh: map = " + fields.toString());
            mStayReservationPresenter.createReplenshOrder(fields);
        }
    }

    private void setText(int days){
        total = days;
        //入住时间
        long now = model.getCheckIn() != null ? TimeUtil.covertToLong(TimeUtil.FORMAT_TIME_EN_4, model.getCheckIn()) : System.currentTimeMillis();
        //离店时间
        long outTimeStample = model.getCheckOut() != null ? TimeUtil.covertToLong(TimeUtil.FORMAT_TIME_EN_4, model.getCheckOut()) : System.currentTimeMillis();
        //入住时间字符串
        String timeStr = TimeUtil.convertTime(TimeUtil.FORMAT_DATE_EN, now);
        //离店时间字符串
        String outTimeStr = TimeUtil.convertTime(TimeUtil.FORMAT_DATE_EN, outTimeStample);
        in_time.setText(timeStr + "");
        //续住后的离店时间
        String outTime = TimeUtil.addDays(TimeUtil.FORMAT_DATE_EN, outTimeStr, days);

        checkout = outTime;
        out_time.setText(outTime + "");

        total_time.setText("共" + total + "晚");
        total_price = total * model.getRoomFee();
        price.setText(total_price + "");
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

    private void dataPick(){
        final AlertDialog dialog = new AlertDialog.Builder(this).create();
        dialog.show();
        DatePicker picker = new DatePicker(this);

        long now = model.getCheckOut() != null ? TimeUtil.covertToLong(TimeUtil.FORMAT_TIME_EN_4, model.getCheckOut()) : System.currentTimeMillis();
        String nowStr = TimeUtil.convertTime(TimeUtil.FORMAT_DATE_EN, now);

//        Date date = TimeUtil.strToDateLong(TimeUtil.FORMAT_DATE_EN, timeStr);
        int year = TimeUtil.getYear(TimeUtil.FORMAT_DATE_EN, nowStr);
        int month = TimeUtil.getMonth(TimeUtil.FORMAT_DATE_EN, nowStr);

        Log.i(TAG, "dataPick: year = " + year + "    mouth = " + month);
        picker.setDate(year, month);
        picker.setMode(DPMode.SINGLE);
        picker.setOnDatePickedListener(new DatePicker.OnDatePickedListener() {
            @Override
            public void onDatePicked(String date) {
//                Toast.makeText(ReservationActivity.this, date, Toast.LENGTH_LONG).show();
                long now = model.getCheckOut() != null ? TimeUtil.covertToLong(TimeUtil.FORMAT_TIME_EN_4, model.getCheckOut()) : System.currentTimeMillis();
                String timeStr = TimeUtil.convertTime(TimeUtil.FORMAT_DATE_EN, now);
                int totalDay = TimeUtil.getGapCount(TimeUtil.FORMAT_DATE_EN, timeStr, date);
                if(totalDay >= 1){
                    setText(totalDay);
//                    in_time.setText(timeStr + "");
//                    out_time.setText(date);
//
//                    total_time.setText("共" + total + "晚");
//                    total_price = total * model.getDailyFees().getFee();
//                    price.setText("￥" + total_price + "");
                }
                dialog.dismiss();
            }
        });
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setContentView(picker, params);
        dialog.getWindow().setGravity(Gravity.CENTER);
    }
}
