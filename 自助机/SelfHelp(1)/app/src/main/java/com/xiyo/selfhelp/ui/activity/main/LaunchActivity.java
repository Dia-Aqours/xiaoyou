package com.xiyo.selfhelp.ui.activity.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.xiyo.selfhelp.MyApplication;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.model.BannerResult;
import com.xiyo.selfhelp.data.model.HotelInfo;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.WeatherEntity;
import com.xiyo.selfhelp.manager.ViewManager;
import com.xiyo.selfhelp.service.FloatBallAccessibilityService;
import com.xiyo.selfhelp.ui.activity.MainActivity;
import com.xiyo.selfhelp.ui.activity.card.CardComparisonActivity;
import com.xiyo.selfhelp.ui.activity.checkout.OutComparisonActivity;
import com.xiyo.selfhelp.ui.activity.comparsion.ComparisonActivity;
import com.xiyo.selfhelp.ui.activity.order.OrderComparisonActivity;
import com.xiyo.selfhelp.ui.activity.reservation.SelectActivity;
import com.xiyo.selfhelp.ui.activity.settings.SettingsActivity;
import com.xiyo.selfhelp.ui.activity.stayin.StayComparisonActivity;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.main.LaunchPresenter;
import com.xiyo.selfhelp.ui.view.main.LaunchMvpView;
import com.xiyo.selfhelp.utils.DeviceUtil;
import com.xiyo.selfhelp.utils.FileUtils;
import com.xiyo.selfhelp.widget.GlideImageLoader;
import com.youth.banner.Banner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LaunchActivity  extends BaseActivity implements LaunchMvpView {

    @Inject
    LaunchPresenter<LaunchMvpView> mLaunchPresenter;

    private static final String TAG = "dc";

    @BindView(R.id.banner)
    Banner banner;

    @BindView(R.id.logo)
    ImageView logo;

    @BindView(R.id.getCard)
    ImageView getCard;

    @BindView(R.id.reservation)
    ImageView reservation;

    @BindView(R.id.stay_in)
    ImageView stay_in;

    @BindView(R.id.check_out)
    ImageView check_out;

    @BindView(R.id.check_in)
    ImageView check_in;

    @BindView(R.id.comparison)
    ImageView comparison;

    @BindView(R.id.weather_icon)
    ImageView weather_icon;

    @BindView(R.id.date)
    TextView date;

    @BindView(R.id.temperature)
    TextView temperature;

    List<String> images;

    Timer timer;
    TimerTask task;

    private String temperature_tmp;
    private String weather_txt;
    private GlideImageLoader imageLoader;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_launch);
        ButterKnife.bind(this);
        mLaunchPresenter.attachView(this);
        initData();
        copyVoice();
    }

    private void initData(){
        imageLoader = new GlideImageLoader();
        setButtonText();
        images = new ArrayList<>();
        Map<String, String > fields = new HashMap<>();
        fields.put("grant_type", "password");
        fields.put("username", "Xiezhu_Kiosk_Front");
        fields.put("password", "hD1sjddj1whdsde");
        mLaunchPresenter.login(fields);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLaunchPresenter.detachView();
    }

    @Override
    public void showData(String data) {

    }

    @Override
    public void showBanner(BannerResult bannerResult) {
        if(bannerResult != null && bannerResult.getData() != null){
            for(int i = 0; i < bannerResult.getData().size(); i ++ ){
                Log.i(TAG, "showBanner: " + bannerResult.getData().get(i));
                images.add(bannerResult.getData().get(i).getImgUrl());
            }
            banner(images);
        }
    }

    @Override
    public void showBannerError(String error) {
        Toast.makeText(this, "网络出错", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess(Token token) {
        Log.i(TAG, "loginSuccess: token = " + token);
        if(token != null){
            MyApplication.setToken(this, token);
            Map<String, String > fields = new HashMap<>();
            String deviceno = DeviceUtil.getUUID(this);
            fields.put("DeviceNo", deviceno);
            fields.put("Bearer", token.getAccess_token());
            fields.put("owner", "Xiezhu_Kiosk_Front");
            mLaunchPresenter.getBanner(fields);
            mLaunchPresenter.getWeather(fields);
            mLaunchPresenter.getHotelInfo(fields);
        }else {
            Toast.makeText(this, "系统出错", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void loginFail(String error) {

    }

    @Override
    public void getHotelInfoSuccess(HotelInfo info) {
        if(info != null && info.getHotelLogo() != null && !info.getHotelLogo().isEmpty()){
//            imageLoader.displayImage(this, info.getHotelLogo(), logo);
        }
    }

    @Override
    public void getHotelInfoFail(String error) {
        Toast.makeText(this, "酒店信息获取出错", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void getWeatherSuccess(WeatherEntity weatherEntity) {
        if(weatherEntity != null && weatherEntity.getWeatherData() != null && weatherEntity.getWeatherData().getData() != null
                && weatherEntity.getWeatherData().getData().getCondition() != null && weatherEntity.getWeatherData().getData().getCondition().getCondition() != null){
            temperature.setText(weatherEntity.getWeatherData().getData().getCondition().getTemp() + "℃");
            showWeatherIcon(weatherEntity.getWeatherData().getData().getCondition().getCondition());
            temperature_tmp = weatherEntity.getWeatherData().getData().getCondition().getTemp();
            weather_txt = weatherEntity.getWeatherData().getData().getCondition().getCondition();
        }
    }

    @Override
    public void getWeatherFail(String error) {
        Toast.makeText(this, "天气信息获取出错", Toast.LENGTH_SHORT).show();
    }

    @OnClick({R.id.getCard, R.id.reservation, R.id.stay_in, R.id.check_out, R.id.check_in, R.id.comparison, R.id.logo, R.id.temperature})
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.reservation:
                intent = new Intent(this, SelectActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("weather", weather_txt);
                intent.putExtra("temperature", temperature_tmp);
                startActivity(intent);
                break;
            case R.id.stay_in:
                intent = new Intent(this, StayComparisonActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.check_out:
                intent = new Intent(this, OutComparisonActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.check_in:
                intent = new Intent(this, OrderComparisonActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.comparison:
                intent = new Intent(this, ComparisonActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.getCard:
                intent = new Intent(this, CardComparisonActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.logo:
                onDisplaySettingButton();
                break;
            case R.id.temperature:
                onDisplayFloatButton();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onResume() {
        startTimer();
        super.onResume();
    }

    @Override
    protected void onPause() {
        closeTimer();
        super.onPause();
    }

    private void copyVoice(){
        FileUtils.getInstance(this).copyAssetsToSD("raws", "selfhelp/raws");
    }

    private void banner(List<String> images){
        banner.setImages(images)
                .setImageLoader(imageLoader)
//                .setOnBannerListener(this)
                .start();
    }

    private void setButtonText(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String time = sdf.format(new Date());
        date.setText(time);
    }

    private void showWeatherIcon(String weather){
        Log.i(TAG, "showWeatherIcon: " + weather);
        if(weather.equals("晴")){
            weather_icon.setImageResource(R.mipmap.sunny);
        }else if(weather.equals("多云")){
            weather_icon.setImageResource(R.mipmap.cloudy);
        }else if(weather.equals("阴天")){
            weather_icon.setImageResource(R.mipmap.overcast);
        }else if(weather.equals("小雨")){
            weather_icon.setImageResource(R.mipmap.sprinkle);
        }else if(weather.equals("中雨")){
            weather_icon.setImageResource(R.mipmap.moderate_rain);
        }else if(weather.equals("大雨")){
            weather_icon.setImageResource(R.mipmap.heavy_rain);
        }else if(weather.equals("雷阵雨")){
            weather_icon.setImageResource(R.mipmap.thunder_shower);
        }else if(weather.equals("雾")){
            weather_icon.setImageResource(R.mipmap.fog);
        }else if(weather.equals("冰雹")){
            weather_icon.setImageResource(R.mipmap.hail);
        }else if(weather.equals("雪")){
            weather_icon.setImageResource(R.mipmap.snow);
        }else if(weather.equals("风")){
            weather_icon.setImageResource(R.mipmap.wind);
        }
    }

    private void startTimer(){
        closeTimer();
        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> setButtonText());
            }
        };
        timer.schedule(task, 1000, 1000 * 60);
    }

    private void closeTimer(){
        if(task != null){
            task.cancel();
            task = null;
        }
        if(timer != null){
            timer.cancel();
            timer = null;
        }
    }

    // 需要点击几次 就设置几
    long [] mHits = new long[5];

    public void onDisplaySettingButton() {
        if (mHits == null) {
            mHits = new long[5];
        }
        System.arraycopy(mHits, 1, mHits, 0, mHits.length - 1);
        //实现左移，然后最后一个位置更新距离开机的时间，如果最后一个时间和最开始时间小于500，即双击
        mHits[mHits.length - 1] = SystemClock.uptimeMillis();
        if (mHits[0] >= (SystemClock.uptimeMillis() - 800)) {
            mHits = null;
            // 双击居中了。。。屏幕的一半和归属地的一半，更新窗口，保存lastX
            Intent intent = new Intent(this, SettingsActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    }

    public void onDisplayFloatButton() {
        if (mHits == null) {
            mHits = new long[3];
        }
        System.arraycopy(mHits, 1, mHits, 0, mHits.length - 1);
        //实现左移，然后最后一个位置更新距离开机的时间，如果最后一个时间和最开始时间小于500，即双击
        mHits[mHits.length - 1] = SystemClock.uptimeMillis();
        if (mHits[0] >= (SystemClock.uptimeMillis() - 800)) {
            mHits = null;
            if (!isAccessibilitySettingsOn(this)) {
                Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
                startActivity(intent);
            }else {
                // 双击居中了。。。屏幕的一半和归属地的一半，更新窗口，保存lastX
                ViewManager.getInstance(LaunchActivity.this).showOrHide();
//                Intent intent = new Intent(this, FloatService.class);
//                startService(intent);
            }
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            moveTaskToBack(false);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    /**
     * 检测辅助功能是否开启<br>
     * 方 法 名：isAccessibilitySettingsOn <br>
     * 创 建 人 <br>
     * 创建时间：2016-6-22 下午2:29:24 <br>
     * 修 改 人： <br>
     * 修改日期： <br>
     * @param mContext
     * @return boolean
     */
    private boolean isAccessibilitySettingsOn(Context mContext) {
        int accessibilityEnabled = 0;
        final String service = getPackageName() + "/" + FloatBallAccessibilityService.class.getCanonicalName();
        Log.i(TAG, "service:" + service);
        try {
            accessibilityEnabled = Settings.Secure.getInt(mContext.getApplicationContext().getContentResolver(),
                    android.provider.Settings.Secure.ACCESSIBILITY_ENABLED);
            Log.v(TAG, "accessibilityEnabled = " + accessibilityEnabled);
        } catch (Settings.SettingNotFoundException e) {
            Log.e(TAG, "Error finding setting, default accessibility to not found: " + e.getMessage());
        }
        TextUtils.SimpleStringSplitter mStringColonSplitter = new TextUtils.SimpleStringSplitter(':');

        if (accessibilityEnabled == 1) {
            Log.v(TAG, "***ACCESSIBILITY IS ENABLED*** -----------------");
            String settingValue = Settings.Secure.getString(mContext.getApplicationContext().getContentResolver(),
                    Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES);
            if (settingValue != null) {
                mStringColonSplitter.setString(settingValue);
                while (mStringColonSplitter.hasNext()) {
                    String accessibilityService = mStringColonSplitter.next();

                    Log.v(TAG, "-------------- > accessibilityService :: " + accessibilityService + " " + service);
                    if (accessibilityService.equalsIgnoreCase(service)) {
                        Log.v(TAG, "We've found the correct setting - accessibility is switched on!");
                        return true;
                    }
                }
            }
        } else {
            Log.v(TAG, "***ACCESSIBILITY IS DISABLED***");
        }
        return false;
    }

}
