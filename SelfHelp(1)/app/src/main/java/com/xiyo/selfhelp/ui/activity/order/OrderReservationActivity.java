package com.xiyo.selfhelp.ui.activity.order;

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
import com.xiyo.selfhelp.data.model.DEFOrder;
import com.xiyo.selfhelp.data.model.Humans;
import com.xiyo.selfhelp.data.model.StatusResult;
import com.xiyo.selfhelp.data.model.Tenants;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.order.OrderResult;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.order.OrderReservationPresenter;
import com.xiyo.selfhelp.ui.view.order.OrderReservationMvpView;
import com.xiyo.selfhelp.utils.DeviceUtil;
import com.xiyo.selfhelp.utils.DoubleClickUtil;
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
import cn.aigestudio.datepicker.cons.DPMode;
import cn.aigestudio.datepicker.views.DatePicker;

public class OrderReservationActivity extends BaseActivity implements OrderReservationMvpView {

    @Inject
    OrderReservationPresenter<OrderReservationMvpView> mOrderReservationPresenter;

    @BindView(R.id.back)
    RelativeLayout back;

    @BindView(R.id.img)
    ImageView img;

    @BindView(R.id.room_name)
    TextView room_name;

    @BindView(R.id.name)
    TextView name;

    @BindView(R.id.number)
    TextView number;

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


    private CheckInOrder model;

    GlideImageLoader imageLoader = new GlideImageLoader();

    private int total;
    private double total_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_order_check_in);
        ButterKnife.bind(this);
        mOrderReservationPresenter.attachView(this);
        initData();
        initView();
    }

    @Override
    public void loginSuccess(Token token) {
        MyApplication.setToken(this, token);
        checkDEFOrderRoom(token);
    }

    @Override
    public void loginFail(String error) {
        Toast.makeText(this, "LoginFail", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void checkDEFOrderRoomSuccess(OrderResult orderResult) {
        Log.i(TAG, "checkoutSuccess: " + orderResult.toString());
        if(orderResult != null){
            if("200".equals(orderResult.getStatus())){
                Intent intent = new Intent(this, OrderReComparisonActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                Bundle bundle = new Bundle();
                bundle.putSerializable("checkInOrder", model);
                intent.putExtra("data", bundle);
                startActivity(intent);
            }else {
                Toast.makeText(this, "" + orderResult.getMsg(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void checkDEFOrderRoomFail(String error) {
        Log.i(TAG, "checkoutFail: " + error);
        Toast.makeText(this, "数据异常，请稍后重试！", Toast.LENGTH_SHORT).show();
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
                                checkDEFOrderRoom(MyApplication.getToken(this));
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
        IMAudioManager.instance().playSound(RawsConstants.COMFIRM_THE_ORDER, new MediaPlayer.OnCompletionListener() {
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
        reservation.setText("" + getString(R.string.confirm));
        List<String> imgs = model.getRoomTypeImgs();
        Log.i(TAG, "setText: imgs = " + imgs);
        String url = imgs != null && imgs.size() != 0 ? model.getRoomTypeImgs().get(0) : "";
        if(!url.isEmpty()){
            imageLoader.displayImage(this, url, img);
        }
        name.setText(model.getRoomTypeName());
        price_min.setText(model.getRoomFee() + "");
        for (int i = 0; i < model.getTenants().size(); i++) {
            number.setText(model.getTenants().get(i).getMobile());
            name.setText(model.getTenants().get(i).getName());
        }

        setText(1);
    }

    private void login(){
        Map<String, String > fields = new HashMap<>();
        fields.put("grant_type", "password");
        fields.put("username", "Xiezhu_Kiosk_Front");
        fields.put("password", "hD1sjddj1whdsde");
        mOrderReservationPresenter.login(fields);
    }

    private String startDate;

    private void checkDEFOrderRoom(Token token){
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
        String deviceno = DeviceUtil.getUUID(this);
        startDate = in_time.getText().toString().trim();
        String endDate = out_time.getText().toString().trim();
        Log.i(TAG, "checkDEFOrderRoom: startDate = " + startDate + "    endDate =" + endDate + "   RoomTypeID() = " + model.getRoomTypeID() + "    deviceno = " + deviceno);
        Map<String, String> fields = new HashMap<>();

        DEFOrder order = new DEFOrder();
        order.setDeviceNo(deviceno);
        order.setOrderID(model.getOrderNo());

        List<Humans> humans = new ArrayList<>();
        if(model.getTenants() != null){
            for (Tenants t: model.getTenants()) {
                humans.add(new Humans(t.getCardNo(), t.getID(), t.getName(), model.getRoomNo(), t.getMobile()));
            }
        }
        order.setHumans(humans);
        order.setTradeID(getSerialsNnumber());
        order.setCheckInDT(TimeUtil.convertTime(TimeUtil.FORMAT_TIME_EN_3, TimeUtil.covertToLong(TimeUtil.FORMAT_TIME_EN_4, model.getCheckIn())));
        order.setCheckOutDT(TimeUtil.convertTime(TimeUtil.FORMAT_TIME_EN_3, TimeUtil.covertToLong(TimeUtil.FORMAT_TIME_EN_4, model.getCheckOut())));
        order.setRoomFee(model.getRoomFee() + "");
        order.setPayType("2");
        order.setPrepayment(model.getPrepayment() + "");
        order.setRoomTypeID(model.getRoomTypeID());
        order.setCheckInType("1");
        order.setChannelType("1");

        String json = "";
        try {
            json = LoganSquare.serialize(order);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!json.isEmpty()){
            fields.put("info", json);
            fields.put("Bearer", token.getAccess_token());
            mOrderReservationPresenter.checkDEFOrderRoom(fields);
        }


    }

    private void setText(int days){
        total = days;
        long now = model.getCheckIn() != null ? TimeUtil.covertToLong(TimeUtil.FORMAT_TIME_EN_4, model.getCheckIn()) : System.currentTimeMillis();

        String timeStr = TimeUtil.convertTime(TimeUtil.FORMAT_DATE_EN, now);
        in_time.setText(timeStr + "");
        String outTime = TimeUtil.addDays(TimeUtil.FORMAT_DATE_EN, timeStr, days);
        out_time.setText(outTime + "");

        total_time.setText("共" + total + "晚");
        total_price = total * model.getRoomFee();
        price.setText(total_price + "");
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

        long now = System.currentTimeMillis();
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
                String timeStr = TimeUtil.convertTime(TimeUtil.FORMAT_DATE_EN, System.currentTimeMillis());
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
