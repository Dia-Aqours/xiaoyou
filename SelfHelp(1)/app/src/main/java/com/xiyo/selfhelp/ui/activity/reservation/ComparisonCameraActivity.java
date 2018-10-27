package com.xiyo.selfhelp.ui.activity.reservation;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.WindowManager;

import com.sensetime.senseid.sdk.liveness.silent.common.app.CameraActivity;
import com.xiyo.selfhelp.MyApplication;
import com.xiyo.selfhelp.injection.component.ActivityComponent;
import com.xiyo.selfhelp.injection.component.DaggerActivityComponent;
import com.xiyo.selfhelp.injection.module.ActivityModule;
import com.xiyo.selfhelp.ui.base.MvpView;
import com.xiyo.selfhelp.utils.DialogUtils;

public abstract class ComparisonCameraActivity extends CameraActivity implements MvpView {

    public static final String TAG = "dc";

    private ActivityComponent mActivityComponent;
    private ProgressDialog progressDialog;

    public ActivityComponent activityComponent() {
        if (mActivityComponent == null) {
            mActivityComponent = DaggerActivityComponent.builder()
                    .activityModule(new ActivityModule(this))
                    .applicationComponent(MyApplication.get(this).getComponent())
                    .build();
        }
        return mActivityComponent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    protected int getCameraOrientation() {
        int var1 = super.getCameraOrientation();
        return !this.isUsingFrontCamera() ? var1 : 360 - var1;
    }

    @TargetApi(Build.VERSION_CODES.M)
    public void requestPermissionsSafely(String[] permissions, int requestCode) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(permissions, requestCode);
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    public boolean hasPermission(String permission) {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.M ||
                checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED;
    }

    @Override
    public void showLoading() {
        hideLoading();
        progressDialog = DialogUtils.showLoadingDialog(this);
    }

    @Override
    public void hideLoading() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.cancel();
        }
    }

}
