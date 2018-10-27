package com.xiyo.selfhelp.ui.activity.reservation;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.xiyo.selfhelp.Constant.RawsConstants;
import com.xiyo.selfhelp.MyApplication;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.adapter.SelectAdapter;
import com.xiyo.selfhelp.data.manager.IMAudioManager;
import com.xiyo.selfhelp.data.model.ReservationModel;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.WeatherEntity;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.reservation.SelectPresenter;
import com.xiyo.selfhelp.ui.view.reservation.SelectMvpView;
import com.xiyo.selfhelp.utils.DeviceUtil;
import com.xiyo.selfhelp.utils.DoubleClickUtil;
import com.xiyo.selfhelp.utils.TimeUtil;

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

public class SelectActivity extends BaseActivity implements SelectMvpView {

    @Inject
    SelectPresenter<SelectMvpView> mSelectPresenter;

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    @BindView(R.id.back)
    RelativeLayout back;

    List<ReservationModel> mDatas = new ArrayList<>();
    SelectAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_select);
        ButterKnife.bind(this);
        mSelectPresenter.attachView(this);
        initData();
        addListener();
    }

    @Override
    public void loginSuccess(Token token) {
        Log.i(TAG, "loginSuccess: token = " + token);
        MyApplication.setToken(this, token);
        if(token != null){
            getRoomType(token);
        }
    }

    @Override
    public void loginFail(String error) {
        Toast.makeText(this, "loginFail", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showRoomType(List<ReservationModel> roomData) {
        mDatas.clear();
        mDatas.addAll(roomData);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void showRoomTypeError(String error) {
        Toast.makeText(this, "房型数据获取失败", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.back)
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                onBackPressed();
//                startActivity(new Intent(this,SelectActivity.class));
                break;
            default:
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        IMAudioManager.instance().playSound(RawsConstants.SELECT, new MediaPlayer.OnCompletionListener() {
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
        if(MyApplication.getToken(this) != null){
            getRoomType(MyApplication.getToken(this));
        }else {
            login();
        }
        adapter = new SelectAdapter(this, mDatas);
        //绑定适配器
        mRecyclerView.setAdapter(adapter);
        // 给每个item添加分割线
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        // 设置item增加和移除的动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        LinearLayoutManager ms= new LinearLayoutManager(this);
        ms.setOrientation(LinearLayoutManager.HORIZONTAL);// 设置 recyclerview 布局方式为横向布局
        mRecyclerView.setLayoutManager(ms);
    }

    private void addListener(){
        adapter.setOnItemClickListener(new SelectAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int postion) {
                Log.i(TAG, "onItemClick: ");
                if(DoubleClickUtil.isFastClick()){
                    Intent intent = new Intent(SelectActivity.this, ReservationActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("data", mDatas.get(postion));
                    intent.putExtra("data", bundle);
                    startActivity(intent);
                }
            }
        });
    }

    private void login(){
        Map<String, String > fields = new HashMap<>();
        fields.put("grant_type", "password");
        fields.put("username", "Xiezhu_Kiosk_Front");
        fields.put("password", "hD1sjddj1whdsde");
        mSelectPresenter.login(fields);
    }

    private void getRoomType(Token token){
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
        Map<String, String > fields = new HashMap<>();
        String deviceno = DeviceUtil.getUUID(this);
        fields.put("DeviceNo", deviceno);
        Log.i(TAG, "initData: " + deviceno);
//        fields.put("DeviceNo", "0224e2ef-09ba-4c0d-b44e-3797b7928c26");
        fields.put("Bearer", token.getAccess_token());
        mSelectPresenter.getRoomType(fields);
    }
}
