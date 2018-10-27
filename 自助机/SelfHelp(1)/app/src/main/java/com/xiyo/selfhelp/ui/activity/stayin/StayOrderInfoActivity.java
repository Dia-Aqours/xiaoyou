package com.xiyo.selfhelp.ui.activity.stayin;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.xiyo.selfhelp.Constant.RawsConstants;
import com.xiyo.selfhelp.MyApplication;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.manager.IMAudioManager;
import com.xiyo.selfhelp.data.model.CheckInOrder;
import com.xiyo.selfhelp.data.model.EmptyRoom;
import com.xiyo.selfhelp.data.model.IDCardEntity;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.activity.reservation.ReComparisonActivity;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.stay.StayOrderInfoPresenter;
import com.xiyo.selfhelp.ui.view.stay.StayOrderInfoMvpView;
import com.xiyo.selfhelp.utils.DeviceUtil;
import com.xiyo.selfhelp.utils.DoubleClickUtil;
import com.xiyo.selfhelp.utils.TimeUtil;
import com.xiyo.selfhelp.widget.GlideImageLoader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.aigestudio.datepicker.cons.DPMode;
import cn.aigestudio.datepicker.views.DatePicker;

public class StayOrderInfoActivity extends BaseActivity implements StayOrderInfoMvpView {

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

    @BindView(R.id.deposit)
    TextView deposit;

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
    StayOrderInfoPresenter<StayOrderInfoMvpView> mStayOrderInfoPresenter;

    private CheckInOrder model;
    private String checkout;
    private String orderno;
    private int count;
    private int days;
    private IDCardEntity idCardEntity;
//    private HashMap<String, Bitmap> bitmapMap;

    GlideImageLoader imageLoader = new GlideImageLoader();

    private double total_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_stay_info);
        ButterKnife.bind(this);
        mStayOrderInfoPresenter.attachView(this);
        initData();
        initView();
    }

    @Override
    public void loginSuccess(Token token) {
        MyApplication.setToken(this, token);
        pay(type);
//        checkout(token);
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
        bundle.putSerializable("data", roomData);
        intent.putExtra("data", bundle);
        startActivity(intent);
    }

    @Override
    public void reservationFail(String error) {
        Log.i(TAG, "checkoutFail: " + error);
    }


    @OnClick({R.id.back, R.id.confirm_payment, R.id.ali_pay, R.id.wei_pay})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                if(DoubleClickUtil.isFastClick()) {
                    onBackPressed();
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
                    if(days > 0 && model.getRoomFee() > 0){
                        if(MyApplication.getToken(this) != null){
                            pay(type);
//                                    checkout(MyApplication.getToken(this));
                        }else {
                            login();
                        }
                    }else {
                        Toast.makeText(this, "暂无房价该房型无法办理！！！", Toast.LENGTH_SHORT).show();
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
        orderno = bundle.getString("orderno");
        model = (CheckInOrder) bundle.get("checkInOrder");
        checkout = bundle.getString("checkout");
        count = model.getPeopleNum();
        total_price = bundle.getDouble("price");
        days = bundle.getInt("days");
        idCardEntity = (IDCardEntity) bundle.getSerializable("idcard");
//        bitmapMap = (HashMap<String, Bitmap>) bundle.getSerializable("bitmapMap");

    }

    private void initView(){
        List<String> imgs = model.getRoomTypeImgs();
        Log.i(TAG, "setText: imgs = " + imgs);
        String url = imgs != null && imgs.size() != 0 ? model.getRoomTypeImgs().get(0) : "";
        if(!url.isEmpty()){
            imageLoader.displayImage(this, url, img);
        }

        name.setText(model.getRoomTypeName() + "  " + model.getRoomNo());
        lodger_num.setText(count + "位");
        deposit.setText(model.getPrepayment() + "");
        lodger_num.setText(model.getPeopleNum() + "位");
        setText(days);
    }

    private void setText(int days){
        long nowTimeStample = model.getCheckIn() != null ? TimeUtil.covertToLong(TimeUtil.FORMAT_TIME_EN_4, model.getCheckIn()) : System.currentTimeMillis();

        long outTimeStample = model.getCheckOut() != null ? TimeUtil.covertToLong(TimeUtil.FORMAT_TIME_EN_4, model.getCheckOut()) : System.currentTimeMillis();

        String inTimeStr = TimeUtil.convertTime(TimeUtil.FORMAT_DATE_EN, nowTimeStample);
        String outTimeStr = TimeUtil.convertTime(TimeUtil.FORMAT_DATE_EN, outTimeStample);
        days = days <= 0 ? 1 : days;
        String outTime = TimeUtil.addDays(TimeUtil.FORMAT_DATE_EN, outTimeStr, days);
        in_time.setText(inTimeStr + "  -  " +  outTime);

        total_time.setText(days + "晚");
        total_price = days * model.getRoomFee();
        price.setText(total_price + "");
    }

    private void login(){
        Map<String, String > fields = new HashMap<>();
        fields.put("grant_type", "password");
        fields.put("username", "Xiezhu_Kiosk_Front");
        fields.put("password", "hD1sjddj1whdsde");
        mStayOrderInfoPresenter.login(fields);
    }

    private void reservation(Token token){
        String deviceno = DeviceUtil.getUUID(this);
        String startDate = in_time.getText().toString().trim();
        Map<String, String> fields = new HashMap<>();
        fields.put("StartDate", startDate);
        fields.put("RoomTypeID", model.getRoomTypeID());
        fields.put("DeviceNo", deviceno);
        fields.put("Bearer", token.getAccess_token());
        mStayOrderInfoPresenter.reservation(fields);
    }

    private int type = 2;

    private void pay(int type){
        Intent intent = new Intent();
        switch (type){
            case 1:
                //支付宝
                intent.setClass(this, StayAliPayActivity.class);
                break;
            case 2:
                //微信支付
                intent.setClass(this, StayWeiPayActivity.class);
                break;
        }
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        Bundle bundle = new Bundle();
//        bundle.putSerializable("emptyRoom", emptyRoom);
        bundle.putSerializable("checkInOrder", model);
        bundle.putString("orderno", orderno);
        bundle.putString("checkout", checkout);
        bundle.putInt("count", count);
        bundle.putInt("days", days);
        bundle.putDouble("price", total_price);
        bundle.putSerializable("idcard", idCardEntity);
        intent.putExtra("data", bundle);
        startActivity(intent);
    }
}
