package com.xiyo.selfhelp.ui.activity.checkout;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xiyo.selfhelp.Constant.RawsConstants;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.manager.IMAudioManager;
import com.xiyo.selfhelp.ui.activity.main.LaunchActivity;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.checkout.OutPayResultPresenter;
import com.xiyo.selfhelp.ui.view.checkout.OutPayResultMvpView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OutPayResultActivity extends BaseActivity implements OutPayResultMvpView {

    @BindView(R.id.back)
    RelativeLayout back;

    @BindView(R.id.pay_success)
    LinearLayout pay_success;

    @Inject
    OutPayResultPresenter<OutPayResultMvpView> mOutPayResultPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_checkout_result);
        ButterKnife.bind(this);
        mOutPayResultPresenter.attachView(this);
        initData();
        initView();
    }


    @OnClick({R.id.back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                backToLaunch();
                break;

            default:
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        IMAudioManager.instance().playSound(RawsConstants.CHECKOUT_SUCCESS, new MediaPlayer.OnCompletionListener() {
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

    private void initData() {}

    private void initView() {}


    private void backToLaunch() {
        Intent intent = new Intent(this, LaunchActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
