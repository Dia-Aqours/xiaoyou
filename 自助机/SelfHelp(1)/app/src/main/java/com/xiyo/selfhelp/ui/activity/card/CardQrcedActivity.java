package com.xiyo.selfhelp.ui.activity.card;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xiezhuhotelkiosk.zxing.ZxingUtils;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.model.AuthenticaTokenModel;
import com.xiyo.selfhelp.ui.activity.main.LaunchActivity;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.card.CardQrcedPresenter;
import com.xiyo.selfhelp.widget.Transparent;
import com.xiyo.selfhelp.ui.view.card.CardQrcedMvpView;
import com.xiyo.selfhelp.utils.DoubleClickUtil;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CardQrcedActivity extends BaseActivity implements CardQrcedMvpView {

    @BindView(R.id.back)
    RelativeLayout back;

    @BindView(R.id.left_img)
    ImageView left_img;

    @BindView(R.id.right_img)
    ImageView right_img;

    @BindView(R.id.get_qrced_text)
    TextView get_qrced_text;

    @BindView(R.id.zxing)
    ImageView qrced;

    @BindView(R.id.timer)
    TextView time_txt;

    @BindView(R.id.pay_success)
    LinearLayout pay_success;

    @BindView(R.id.pay_fail)
    LinearLayout pay_fail;

    @BindView(R.id.repay_linearLayout)
    LinearLayout repay_linearLayout;

    private String httpurl;
    private int result = 0;
    private int index = 0;

    private AuthenticaTokenModel authenticaTokenModel;

    @Inject
    CardQrcedPresenter<CardQrcedMvpView> mCardQrcedPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_pay_result);
        ButterKnife.bind(this);
        mCardQrcedPresenter.attachView(this);
        initData();
        initView();
    }

    @OnClick({R.id.back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                backToLaunch();
                break;

            case R.id.repay_linearLayout:
                finish();
                break;

            case R.id.left_img:
                if(DoubleClickUtil.isFastClick()) {
                    if (authenticaTokenModel != null && authenticaTokenModel.getData().size() > 0) {
                        index--;
                        if (index < 0) {
                            index = authenticaTokenModel.getData().size() - 1;
                        }
                        showQrced(index);
                    }
                }
                break;

            case R.id.right_img:
                if(DoubleClickUtil.isFastClick()){
                    if(authenticaTokenModel != null && authenticaTokenModel.getData().size() > 0){
                        index++;
                        if(index > authenticaTokenModel.getData().size() - 1){
                            index = 0;
                        }
                        showQrced(index);
                    }
                }
                break;
            default:
                break;
        }
    }

    private void initData() {
        result = 0;
        Intent intent = getIntent();
        authenticaTokenModel = (AuthenticaTokenModel) intent.getBundleExtra("data").getSerializable("data");
        Log.i(TAG, "initData: result = " + result);
        if(authenticaTokenModel != null && authenticaTokenModel.getData() != null && authenticaTokenModel.getData().size() > 0){
            showQrced(index);
        }
    }

    private void initView() {
        if (result == 0) {
            time_txt.setVisibility(View.GONE);
            pay_fail.setVisibility(View.GONE);
            pay_success.setVisibility(View.VISIBLE);
            left_img.setVisibility(View.GONE);
            right_img.setVisibility(View.GONE);
//            Message msg = new Message();
//            msg.what = 100;
//            msg.obj = "";
//            qmHandler.sendMessage(msg);
        } else {
            time_txt.setVisibility(View.VISIBLE);
            pay_fail.setVisibility(View.VISIBLE);
            pay_success.setVisibility(View.GONE);
        }
    }

    /**
     * 生成二维码
     */
    private Handler qmHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 100) {
                httpurl = (String) msg.obj;
                try {
//                    LogoConfig logoConfig = new LogoConfig();
//                    Bitmap logoBitmap = logoConfig.modifyLogo(
//                            BitmapFactory.decodeResource(getResources(),
//                                    R.mipmap.white_bg), BitmapFactory
//                                    .decodeResource(getResources(),
//                                            R.mipmap.weixin));
//
//                    Bitmap codeBitmap = ZxingUtils.createQRImage(httpurl, logoBitmap);
                    Bitmap codeBitmap = ZxingUtils.createQRImage(httpurl);
                    qrced.setImageBitmap(codeBitmap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    };

    public void bottomDialog(String name) {
        Transparent.showInfoMessage(this,name);
    }

    private void showQrced(int index){
        Message msg = new Message();
        msg.what = 100;
        msg.obj = authenticaTokenModel.getData().get(index).getUrl();
        qmHandler.sendMessage(msg);
        get_qrced_text.setText(" 获取 本人 电子房卡");
        bottomDialog(authenticaTokenModel.getData().get(index).getName());
    }

    private void backToLaunch() {
        Intent intent = new Intent(this, LaunchActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
