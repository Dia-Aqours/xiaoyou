package com.xiyo.selfhelp.ui.activity.settings;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.VersionResult;
import com.xiyo.selfhelp.ui.activity.main.LaunchActivity;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.settings.BaseSettingsPresenter;
import com.xiyo.selfhelp.ui.view.settings.BaseSettingsMvpView;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BaseSettingsActivity extends BaseActivity implements BaseSettingsMvpView{

    @BindView(R.id.back)
    RelativeLayout back;

    @BindView(R.id.edit_update_start_time)
    EditText edit_update_start_time;

    @BindView(R.id.edit_update_end_time)
    EditText edit_update_end_time;

    @BindView(R.id.edit_order_allow_check_in_time)
    EditText edit_order_allow_check_in_time;

    @BindView(R.id.edit_environment)
    EditText edit_environment;

    @BindView(R.id.edit_doorbell_face_entry)
    EditText edit_doorbell_face_entry;

    @BindView(R.id.edit_face_contrast_times)
    EditText edit_face_contrast_times;

    @Inject
    BaseSettingsPresenter<BaseSettingsMvpView> mBaseSettingsPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_base_settings);
        ButterKnife.bind(this);
        mBaseSettingsPresenter.attachView(this);
        initData();
        addListener();
    }

    @OnClick({R.id.back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                backToLaunch();
//                startActivity(new Intent(this,SelectActivity.class));
                break;
            default:
                break;
        }
    }


    @Override
    public void loginSuccess(Token token) {

    }

    @Override
    public void loginFail(String error) {

    }

    @Override
    public void getVersionSuccess(VersionResult versionResult) {
    }

    @Override
    public void getVersionFail(String error) {

    }

    @Override
    public void updateSuccess() {

    }

    @Override
    public void updateFail(String error) {

    }

    private void initData(){
    }

    private void addListener(){

    }

    private void login(){
        Map<String, String > fields = new HashMap<>();
        fields.put("grant_type", "password");
        fields.put("username", "Xiezhu_Kiosk_Front");
        fields.put("password", "hD1sjddj1whdsde");
        mBaseSettingsPresenter.login(fields);
    }

    private void backToLaunch() {
        Intent intent = new Intent(this, LaunchActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
