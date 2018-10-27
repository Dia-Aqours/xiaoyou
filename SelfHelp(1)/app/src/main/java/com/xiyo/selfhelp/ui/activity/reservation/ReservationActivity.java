package com.xiyo.selfhelp.ui.activity.reservation;

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

import com.xiyo.selfhelp.Constant.RawsConstants;
import com.xiyo.selfhelp.MyApplication;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.manager.IMAudioManager;
import com.xiyo.selfhelp.data.model.EmptyRoom;
import com.xiyo.selfhelp.data.model.ReservationModel;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.reservation.ReservationPresenter;
import com.xiyo.selfhelp.ui.view.reservation.ReservationMvpView;
import com.xiyo.selfhelp.utils.DeviceUtil;
import com.xiyo.selfhelp.utils.DoubleClickUtil;
import com.xiyo.selfhelp.utils.TimeUtil;
import com.xiyo.selfhelp.widget.GlideImageLoader;

import java.sql.Time;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.aigestudio.datepicker.cons.DPMode;
import cn.aigestudio.datepicker.views.DatePicker;

public class ReservationActivity extends BaseActivity implements ReservationMvpView {

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
    ReservationPresenter<ReservationMvpView> mReservationPresenter;

    private ReservationModel model;

    GlideImageLoader imageLoader = new GlideImageLoader();

    private int total;
    private double total_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_reservation);
        ButterKnife.bind(this);
        mReservationPresenter.attachView(this);
        initData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        IMAudioManager.instance().playSound(RawsConstants.SELECT_LEAVE_TIME, new MediaPlayer.OnCompletionListener() {
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
    public void loginSuccess(Token token) {
        MyApplication.setToken(this, token);
        reservation(token);
    }

    @Override
    public void loginFail(String error) {
        Toast.makeText(this, "LoginFail", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void reservationSuccess(EmptyRoom roomData) {
        Log.i(TAG, "checkoutSuccess: " + roomData.toString());
        Intent intent = new Intent(this, ReComparisonActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        Bundle bundle = new Bundle();
        bundle.putSerializable("roomData", roomData);
        bundle.putSerializable("reservationModel", model);
        bundle.putString("checkin", startDate + " 00:00:00");
        bundle.putDouble("price", total_price);
        bundle.putInt("days", total);
        Log.i(TAG, "comparisonSuccess:  price:" + total_price + "    days:" + total);
        intent.putExtra("data", bundle);
        startActivity(intent);
    }

    @Override
    public void reservationFail(String error) {
        Toast.makeText(this, "请求失败", Toast.LENGTH_SHORT).show();
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
                    if(!model.getRoomState().getIsFull()){
                        if(MyApplication.get(this) != null){
                            if(total > 0 && model.getDailyFees().getFee() > 0){
                                if(MyApplication.getToken(this) != null){
                                    reservation(MyApplication.getToken(this));
                                }else {
                                    login();
                                }
                            }else {
                                Toast.makeText(this, "暂无房价该房型无法办理！！！", Toast.LENGTH_SHORT).show();
                            }
                        }else {
                            login();
                        }
                    }else {
                        IMAudioManager.instance().playSound(RawsConstants.ROOM_FULL_AND_RETRY, new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {

                            }
                        });
                        Toast.makeText(this, "房间已满！！", Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            default:
                break;
        }
    }

    private void initData(){
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        model = (ReservationModel)bundle.get("data");
        initView();
    }

    private void initView(){
        List<String> imgs = model.getRoomTypeImgs();
        Log.i(TAG, "setText: imgs = " + imgs);
        String url = imgs != null && imgs.size() != 0 ? model.getRoomTypeImgs().get(0) : "";
        if(!url.isEmpty()){
            imageLoader.displayImage(this, url, img);
        }
        name.setText(model.getRoomTypeName());
        price_min.setText(model.getDailyFees().getFee() + "");
        setText(1);
    }

    private void login(){
        Map<String, String > fields = new HashMap<>();
        fields.put("grant_type", "password");
        fields.put("username", "Xiezhu_Kiosk_Front");
        fields.put("password", "hD1sjddj1whdsde");
        mReservationPresenter.login(fields);
    }

    private String startDate;
    private String endDate;

    private void reservation(Token token){
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
//        startDate = in_time.getText().toString().trim();
//        endDate = out_time.getText().toString().trim();
        Log.i(TAG, "checkout: startDate = " + startDate + "    endDate =" + endDate + "   RoomTypeID() = " + model.getRoomTypeID() + "    deviceno = " + deviceno);
        Map<String, String> fields = new HashMap<>();
        fields.put("StartDate", startDate);
        fields.put("RoomTypeID", model.getRoomTypeID());
        fields.put("DeviceNo", deviceno);
        fields.put("EndDate", endDate);
        fields.put("Bearer", token.getAccess_token());
        mReservationPresenter.reservation(fields);
    }

    private void setText(int days){
        total = days;
        long now = System.currentTimeMillis();
        String timeStr = TimeUtil.convertTime(TimeUtil.FORMAT_DATE_EN, now);
        startDate = timeStr;
        String interval = TimeUtil.intervalDayTime(now);
        in_time.setText(timeStr.substring(5) + "  (" + interval + ")");
        String outTime = TimeUtil.addDays(TimeUtil.FORMAT_DATE_EN, timeStr, days);
        endDate = outTime;
        out_time.setText(outTime.substring(5) + "");
        total_time.setText("共" + total + "晚");
        total_price = total * model.getDailyFees().getFee();
        price.setText(total_price + "");
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
