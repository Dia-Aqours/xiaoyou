package com.xiyo.selfhelp.ui.activity.checkout;

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
import com.xiyo.selfhelp.data.model.CheckInOrder;
import com.xiyo.selfhelp.data.model.IDCardEntity;
import com.xiyo.selfhelp.data.model.StatusResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.checkout.OutReservationPresenter;
import com.xiyo.selfhelp.ui.view.checkout.OutReservationMvpView;
import com.xiyo.selfhelp.utils.DeviceUtil;
import com.xiyo.selfhelp.utils.DoubleClickUtil;
import com.xiyo.selfhelp.utils.TimeUtil;
import com.xiyo.selfhelp.widget.GlideImageLoader;

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
import cn.com.aratek.idcard.IDCard;

public class OutReservationActivity extends BaseActivity implements OutReservationMvpView {

    @Inject
    OutReservationPresenter<OutReservationMvpView> mOutReservationPresenter;

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
    private IDCardEntity idCardEntity;

    GlideImageLoader imageLoader = new GlideImageLoader();

    private int total;
    private double total_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_order_check_in);
        ButterKnife.bind(this);
        mOutReservationPresenter.attachView(this);
        initData();
        initView();
    }

    @Override
    public void loginSuccess(Token token) {
        MyApplication.setToken(this, token);
        checkOut(token);
    }

    @Override
    public void loginFail(String error) {
        Toast.makeText(this, "LoginFail", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void checkoutSuccess(StatusResult statusResult) {
        Log.i(TAG, "checkoutSuccess: " + statusResult.toString());
        if("1".equals(statusResult.getStatus())){
            Intent intent = new Intent(this, OutPayResultActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }else {

        }
    }

    @Override
    public void checkoutFail(String error) {
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
//                dataPick();
                break;
            case R.id.reservation:
                if(DoubleClickUtil.isFastClick()){
                    if(MyApplication.get(this) != null){
                        if(total > 0 && model.getRoomFee() > 0){
                            if(MyApplication.getToken(this) != null){
                                checkOut(MyApplication.getToken(this));
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
        IMAudioManager.instance().playSound(RawsConstants.COMFIRM_CHECKOUT, new MediaPlayer.OnCompletionListener() {
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
        idCardEntity = (IDCardEntity) bundle.getSerializable("idcard");
    }

    private void initView(){
        reservation.setText(getString(R.string.confirm));
        name.setText(idCardEntity.getName());
        if(model.getTenants() != null && model.getTenants().size() > 0 && model.getTenants().get(0) != null  && "".equals(model.getTenants().get(0).getMobile())){
            number.setText("" + model.getTenants().get(0).getMobile());
        }else {
            number.setText("暂无");
        }
        List<String> imgs = model.getRoomTypeImgs();
        Log.i(TAG, "setText: imgs = " + imgs);
        String url = imgs != null && imgs.size() != 0 ? model.getRoomTypeImgs().get(0) : "";
        if(!url.isEmpty()){
            imageLoader.displayImage(this, url, img);
        }
        room_name.setText(model.getRoomTypeName());
        price_min.setText(model.getRoomFee() + "");
        setText(1);
    }

    private void login(){
        Map<String, String > fields = new HashMap<>();
        fields.put("grant_type", "password");
        fields.put("username", "Xiezhu_Kiosk_Front");
        fields.put("password", "hD1sjddj1whdsde");
        mOutReservationPresenter.login(fields);
    }

    private String startDate;

    private void checkOut(Token token){
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
        Log.i(TAG, "checkOut: startDate = " + startDate + "    endDate =" + endDate + "   RoomTypeID() = " + model.getRoomTypeID() + "    deviceno = " + deviceno);
        Map<String, String> fields = new HashMap<>();
        fields.put("DeviceNo", deviceno);
        fields.put("RoomNo", model.getRoomNo());
        fields.put("ActualCheckOutDT", TimeUtil.convertToTime(TimeUtil.FORMAT_TIME_EN_2, new Date()));
        fields.put("OrderID", model.getOrderNo() + "");
        fields.put("Bearer", token.getAccess_token());
        Log.i(TAG, "checkOut: " + fields.toString());
        mOutReservationPresenter.checkout(fields);
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
