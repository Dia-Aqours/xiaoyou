package com.xiyo.selfhelp.ui.activity.settings;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.xiyo.selfhelp.MyApplication;
import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.adapter.ManagerValidateAdapter;
import com.xiyo.selfhelp.data.model.ManagerData;
import com.xiyo.selfhelp.data.model.ManagerEntity;
import com.xiyo.selfhelp.data.model.StatusResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.VersionResult;
import com.xiyo.selfhelp.ui.activity.main.LaunchActivity;
import com.xiyo.selfhelp.ui.base.BaseActivity;
import com.xiyo.selfhelp.ui.presenter.settings.SettingsPresenter;
import com.xiyo.selfhelp.ui.view.settings.SettingsMvpView;
import com.xiyo.selfhelp.utils.ApkUtil;
import com.xiyo.selfhelp.utils.DeviceUtil;
import com.xiyo.selfhelp.utils.DoubleClickUtil;
import com.xiyo.selfhelp.utils.SQLiteUtils;
import com.xiyo.selfhelp.utils.TimeUtil;
import com.xiyo.selfhelp.widget.ManagerDialog;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SettingsActivity extends BaseActivity implements SettingsMvpView {

    @BindView(R.id.back)
    RelativeLayout back;

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    @BindView(R.id.btn_base)
    Button btn_base;

    @BindView(R.id.btn_system)
    Button btn_system;

    @BindView(R.id.btn_update)
    TextView btn_update;

    @BindView(R.id.version_number)
    TextView version_number;

    @BindView(R.id.version_alert)
    TextView version_alert;

    @BindView(R.id.serial_number)
    TextView serial_number;

    @Inject
    SettingsPresenter<SettingsMvpView> mSettingsPresenter;


    private ManagerValidateAdapter adapter;
    private List<ManagerEntity> mDatas;

    Timer timer;
    TimerTask task;

    private String url;
    private boolean needUpdate = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);
        mSettingsPresenter.attachView(this);
        initData();
        addListener();
    }

    @OnClick({R.id.back, R.id.btn_update, R.id.btn_base, R.id.btn_system})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                backToLaunch();
//                startActivity(new Intent(this,SelectActivity.class));
                break;
            case R.id.btn_update:
                update();
                break;
            case R.id.btn_base:
//                openBaseSettings();
                break;
            case R.id.btn_system:
                openSettings();
                break;
            default:
                break;
        }
    }

    @Override
    public void loginSuccess(Token token) {
        getVersionInfo(token);
    }

    @Override
    public void loginFail(String error) {

    }

    @Override
    public void getVersionSuccess(VersionResult versionResult) {
        if (versionResult != null && versionResult.getResult() && versionResult.getData() != null) {
            url = versionResult.getData().getUrl();
            if (needUpdate && url != null && !url.isEmpty()) {
                showDownloadProgressDialog(this, MyApplication.getToken(this), url);
            }
            version_number.setText(ApkUtil.getVerName(this));

            if (ApkUtil.compareVersion(ApkUtil.getVerName(this), versionResult.getData().getVersion()) >= 0) {
                version_alert.setText(R.string.is_newest_version);
            } else {
                version_alert.setText(versionResult.getData().getVersion() + "");
            }
        }
        needUpdate = false;
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

    @Override
    public void sendSMSSuccess(StatusResult statusResult) {
        if (statusResult != null && "1".equals(statusResult.getStatus())) {
            Toast.makeText(this, "发送成功", Toast.LENGTH_SHORT).show();
            dialog.setFocusToValidate();
        } else {
            Toast.makeText(this, "发送失败，请重试", Toast.LENGTH_SHORT).show();
            closeTimer();
            if (dialog != null && dialog.isShowing()) {
                dialog.setEnable(true, (60 - count) + "");
            }
        }
    }

    @Override
    public void sendSMSFail(String error) {
        Toast.makeText(this, "发送失败，请重试", Toast.LENGTH_SHORT).show();
        if (dialog != null && dialog.isShowing()) {
            dialog.setEnable(true, (60 - count) + "");
        }
    }

    private void initData() {
        serial_number.setText(getResources().getString(R.string.serial_number) + DeviceUtil.getSerialNumber());
//        mDatas = new ArrayList<>();
        mDatas = SQLiteUtils.getInstance().selectAllContacts();
        if (mDatas == null || mDatas.size() == 0) {
            mDatas = new ArrayList<>();
        }
        mDatas.add(new ManagerEntity());
        adapter = new ManagerValidateAdapter(this, mDatas);
        //绑定适配器
        mRecyclerView.setAdapter(adapter);
        // 给每个item添加分割线
//        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        // 设置item增加和移除的动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        LinearLayoutManager ms = new LinearLayoutManager(this);
        ms.setOrientation(LinearLayoutManager.HORIZONTAL);// 设置 recyclerview 布局方式为横向布局
        mRecyclerView.setLayoutManager(ms);
        needUpdate = false;
        getVersionInfo(MyApplication.getToken(this));
    }

    private void addListener() {
        adapter.setOnItemClickListener(new ManagerValidateAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int postion) {
                Log.i(TAG, "onItemClick: ");
                if (DoubleClickUtil.isFastClick()) {
                    if (postion == mDatas.size() - 1) {
                        addManager();
                    } else {
                        deleteManager(postion);
                    }
                }
            }
        });
    }

    private void login() {
        Map<String, String> fields = new HashMap<>();
        fields.put("grant_type", "password");
        fields.put("username", "Xiezhu_Kiosk_Front");
        fields.put("password", "hD1sjddj1whdsde");
        mSettingsPresenter.login(fields);
    }

    private void getVersionInfo(Token token) {
        if (token != null && token.getExpires() != null && !token.getExpires().isEmpty() && !"null".equals(token.getExpires())) {
            if (TimeUtil.covertToLong(TimeUtil.FORMAT_TIME_EN, TimeUtil.stampToDate(token.getExpires())) < System.currentTimeMillis()) {
                login();
                return;
            }
        } else if (token ==null || token.getExpires() == null || (token.getExpires().isEmpty() || "null".equals(token.getExpires()))) {

        } else {
            login();
            return;
        }
        Map<String, String> fields = new HashMap<>();
        fields.put("appName", getPackageName());
        fields.put("Bearer", token.getAccess_token());
        mSettingsPresenter.getVersion(fields);
    }

    private void update() {
        if (url != null && !url.isEmpty()) {
            showDownloadProgressDialog(this, MyApplication.getToken(this), url);
            needUpdate = false;
        } else {
            needUpdate = true;
            getVersionInfo(MyApplication.getToken(this));
        }
    }

    private String code;

    //获取验证码
    private void sendSMS(Token token, ManagerData data) {
        if(!isMobileNum(data.getPhone())){
            Toast.makeText(this, "请输入正确的手机号码", Toast.LENGTH_SHORT).show();
            return;
        }else {
            List managerList = SQLiteUtils.getInstance().selectAllContacts(data.getPhone());
            if(managerList != null && managerList.size() > 0){
                Toast.makeText(this, "该手机号码已认证", Toast.LENGTH_SHORT).show();
                return;
            }
        }
        startTimer();
        code = getCode();
        Map<String, String> fields = new HashMap<>();
        fields.put("Bearer", token.getAccess_token());
        fields.put("DeviceNo", DeviceUtil.getUUID(this));
        fields.put("Mobile", data.getPhone());
        fields.put("Code", code);
        mSettingsPresenter.sendSMS(fields);
    }

    //保存管理员信息
    private void save(ManagerData data) {
        if(data != null && data.getPhone() != null){
            if(!isMobileNum(data.getPhone())){
                Toast.makeText(this, "请输入正确的手机号码", Toast.LENGTH_SHORT).show();
                return;
            }
        }
        if (data != null && data.getCode() != null && !data.getCode().isEmpty()) {
            if (code != null && !code.isEmpty()) {
                if (code.equals(data.getCode())) {
                    SQLiteUtils.getInstance().addContacts(new ManagerEntity(data.getName(), data.getPhone()));
                    updateManager();
                    dialog.dismiss();
                    closeTimer();
                    code = "";
                } else {
                    Toast.makeText(this, "验证码错误", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "请获取验证码", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "请填写验证码", Toast.LENGTH_SHORT).show();
        }
    }

    //获取6位随机验证码
    private String getCode() {
        String result = "";
        for (int i = 0; i < 6; i++) {
            int intVal = (int) (Math.random() * 10);
            result = result + intVal;
        }
        return result;
    }

    ManagerDialog dialog;

    private void addManager() {
        if (dialog != null) {
            dialog.dismiss();
            dialog = null;
        }
        dialog = new ManagerDialog(this, R.style.MyDialog,
                new ManagerDialog.LeaveMyDialogListener() {
                    @Override
                    public void onClick(View view, ManagerData data) {
                        switch (view.getId()) {
                            case R.id.send_sms:
                                sendSMS(MyApplication.getToken(SettingsActivity.this), data);
                                break;
                            case R.id.save:
                                save(data);
                                break;
                            case R.id.delete:
                                dialog.dismiss();
                                dialog = null;
                                closeTimer();
                                break;
                            default:
                                break;
                        }
                    }
                },
                new ManagerDialog.PhoneInputListener() {
                    @Override
                    public void onError(String error) {
                        runOnUiThread(() -> dialog.setEnable(false, "获取验证码"));
                    }

                    @Override
                    public void onSuccess() {
                        runOnUiThread(() -> dialog.setEnable(true, (60 - count) + ""));
                    }
                });
        dialog.setCancelable(false);
        dialog.show();
        dialog.setName("管理员" + (mDatas.size()));
    }

    private void deleteManager(int postion) {
        ManagerEntity entity = mDatas.get(postion);
        if (entity != null && entity.getId() != null && entity.getId() != 0) {
            SQLiteUtils.getInstance().deleteContacts(mDatas.get(postion));
        }
        updateManager();
    }

    private void updateManager() {
        mDatas.clear();
        List<ManagerEntity> list = SQLiteUtils.getInstance().selectAllContacts();
        if (list == null || list.size() == 0) {
            list = new ArrayList<>();
        }
        list.add(new ManagerEntity());
        mDatas.addAll(list);
        adapter.notifyDataSetChanged();
    }

    private void backToLaunch() {
        Intent intent = new Intent(this, LaunchActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    private void openBaseSettings() {
        Intent intent = new Intent(this, BaseSettingsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    private void openSettings() {
        startActivity(new Intent(Settings.ACTION_SETTINGS));
    }

    public static boolean isMobileNum(String telNum){
        Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
        Matcher m = p.matcher(telNum);
        return m.matches();
    }


    private void showDownloadProgressDialog(Context context, Token token, String url) {
        if (token.getExpires() != null && !token.getExpires().isEmpty() && !"null".equals(token.getExpires())) {
            if (TimeUtil.covertToLong(TimeUtil.FORMAT_TIME_EN, TimeUtil.stampToDate(token.getExpires())) < System.currentTimeMillis()) {
                login();
                return;
            }
        } else if (token.getExpires() == null || (token.getExpires().isEmpty() || "null".equals(token.getExpires()))) {

        } else {
            login();
            return;
        }

        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle("提示");
        progressDialog.setMessage("正在下载...");
        progressDialog.setIndeterminate(false);
        progressDialog.setMax(100);
        progressDialog.setCancelable(false);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.show();
        new DownloadAPK(progressDialog).execute(url);
    }

    /**
     * 下载APK的异步任务
     */

    private class DownloadAPK extends AsyncTask<String, Integer, String> {
        ProgressDialog progressDialog;
        File file;

        public DownloadAPK(ProgressDialog progressDialog) {
            this.progressDialog = progressDialog;
        }

        @Override
        protected String doInBackground(String... params) {
            URL url;
            HttpURLConnection conn;
            BufferedInputStream bis = null;
            FileOutputStream fos = null;

            try {
                url = new URL(params[0]);
                conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setConnectTimeout(5000);

                int fileLength = conn.getContentLength();
                bis = new BufferedInputStream(conn.getInputStream());
                String fileName = Environment.getExternalStorageDirectory().getPath() + "/magkare/action.apk";
                file = new File(fileName);
                if (!file.exists()) {
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                }
                fos = new FileOutputStream(file);
                byte data[] = new byte[4 * 1024];
                long total = 0;
                int count;
                while ((count = bis.read(data)) != -1) {
                    total += count;
                    publishProgress((int) (total * 100 / fileLength));
                    fos.write(data, 0, count);
                    fos.flush();
                }
                fos.flush();

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fos != null) {
                        fos.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if (bis != null) {
                        bis.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... progress) {
            super.onProgressUpdate(progress);
            progressDialog.setProgress(progress[0]);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            openFile(file);
            progressDialog.dismiss();
        }

        private void openFile(File file) {
            if (file != null) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
                SettingsActivity.this.startActivity(intent);
            }

        }
    }

    private int count;

    private void startTimer() {
        count = 0;
        closeTimer();
        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                count++;
                if (count >= 60) {
                    if (dialog != null && dialog.isShowing()) {
                        runOnUiThread(() -> dialog.setEnable(true, (60 - count) + ""));
                    }
                    closeTimer();
                } else {
                    if (dialog != null && dialog.isShowing()) {
                        runOnUiThread(() -> dialog.setEnable(false, (60 - count) + ""));
                    }
                }
            }
        };
        timer.schedule(task, 0, 1000);
    }

    private void closeTimer() {
        if (task != null) {
            task.cancel();
            task = null;
        }
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }

    @Override
    protected void onPause() {
        closeTimer();
        super.onPause();
    }
}
