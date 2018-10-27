package com.xiyo.selfhelp.ui.activity.order;

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
import com.xiyo.selfhelp.adapter.StaySelectAdapter;
import com.xiyo.selfhelp.data.manager.IMAudioManager;
import com.xiyo.selfhelp.data.model.CheckInOrder;
import com.xiyo.selfhelp.data.model.ReservationModel;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.order.OrderSelectPresenter;
import com.xiyo.selfhelp.ui.view.order.OrderSelectMvpView;
import com.xiyo.selfhelp.utils.DeviceUtil;
import com.xiyo.selfhelp.utils.DoubleClickUtil;
import com.xiyo.selfhelp.utils.TimeUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OrderSelectActivity extends BaseActivity implements OrderSelectMvpView {

    @Inject
    OrderSelectPresenter<OrderSelectMvpView> mOrderSelectPresenter;

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    @BindView(R.id.textView)
    TextView textView;

    @BindView(R.id.back)
    RelativeLayout back;

    List<CheckInOrder> checkInOrders = new ArrayList<>();
    StaySelectAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_other_select);
        ButterKnife.bind(this);
        mOrderSelectPresenter.attachView(this);
        initData();
        addListener();
    }

    @Override
    public void loginSuccess(Token token) {
        Log.i(TAG, "loginSuccess: token = " + token);
        MyApplication.setToken(this, token);
        checkDEFOrderRoom(token);
    }

    @Override
    public void loginFail(String error) {
        Toast.makeText(this, "loginFail", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showRoomType(List<ReservationModel> roomData) {
//        Log.i(TAG, "showRoomType: roomData.size = " + roomData);
//        checkInOrders = roomData;
        for (ReservationModel model : roomData) {
            if(checkInOrders != null && checkInOrders.size() > 0){
                for (int i = 0; i < checkInOrders.size(); i++) {
                    if(checkInOrders.get(i).getRoomTypeID().equals(model.getRoomTypeID())){
                        checkInOrders.get(i).setRoomTypeImgs(model.getRoomTypeImgs());
                    }
                }
            }
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    public void showRoomTypeError(String error) {

    }

    @OnClick(R.id.back)
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                onBackPressed();
//                startActivity(new Intent(this,SelectActivity.class));
                break;
            case R.id.reservation:

                break;
            default:
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        IMAudioManager.instance().playSound(RawsConstants.SELECT_CHECKIN_ROOM, new MediaPlayer.OnCompletionListener() {
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
        textView.setText(getString(R.string.check_in));
        checkInOrders = new ArrayList<>();
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        HashMap<String, CheckInOrder> map = (HashMap<String, CheckInOrder>)bundle.getSerializable("data");
        if(map != null){
            for (String key : map.keySet()) {
                checkInOrders.add(map.get(key));
            }
        }

        adapter = new StaySelectAdapter(this, checkInOrders);
        //绑定适配器
        mRecyclerView.setAdapter(adapter);
        // 给每个item添加分割线
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        // 设置item增加和移除的动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        LinearLayoutManager ms= new LinearLayoutManager(this);
        ms.setOrientation(LinearLayoutManager.HORIZONTAL);// 设置 recyclerview 布局方式为横向布局
        mRecyclerView.setLayoutManager(ms);

//        if(MyApplication.getToken(this) != null){
//            checkDEFOrderRoom(MyApplication.getToken(this));
//        }else {
//            login();
//        }
    }

    private void addListener(){
        adapter.setOnItemClickListener(new StaySelectAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int postion) {
                Log.i(TAG, "onItemClick: ");
                if(DoubleClickUtil.isFastClick()){
                    Intent intent = new Intent(OrderSelectActivity.this, OrderReservationActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("data", checkInOrders.get(postion));
                    bundle.putSerializable("idcard", getIntent().getSerializableExtra("idcard"));
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
        mOrderSelectPresenter.login(fields);
    }

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
        Map<String, String > fields = new HashMap<>();
        String deviceno = DeviceUtil.getUUID(this);
        fields.put("read", "1");
        fields.put("DeviceNo", deviceno);
        Log.i(TAG, "initData: " + deviceno);
//        fields.put("DeviceNo", "0224e2ef-09ba-4c0d-b44e-3797b7928c26");
        fields.put("Bearer", token.getAccess_token());
        mOrderSelectPresenter.getRoomType(fields);
    }
}
