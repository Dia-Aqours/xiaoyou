/*
 *    Copyright (C) 2018 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.xiyo.selfhelp;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;

import com.androidnetworking.AndroidNetworking;
import com.xiyo.selfhelp.data.listeners.DeleteListener;
import com.xiyo.selfhelp.data.manager.IMAudioManager;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.greendao.gen.DaoMaster;
import com.xiyo.selfhelp.greendao.gen.DaoSession;
import com.xiyo.selfhelp.injection.component.ApplicationComponent;
import com.xiyo.selfhelp.injection.component.DaggerApplicationComponent;
import com.xiyo.selfhelp.injection.module.ApplicationModule;
import com.xiyo.selfhelp.manager.ViewManager;
import com.xiyo.selfhelp.receiver.AlarmReceiver;
import com.xiyo.selfhelp.service.AutoUpdateService;
import com.xiyo.selfhelp.utils.AlarmManagerUtil;

import java.util.Calendar;

/**
 * Created by amitshekhar on 13/01/17.
 */

public class MyApplication extends Application {

    ApplicationComponent mApplicationComponent;
    private static MyApplication myApplication;

    private DaoMaster.DevOpenHelper mHelper;
    private SQLiteDatabase db;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;

    private static int mTaskId = 10086;
    private static String time = "04:00";

    private Token token = null;
    public static void setToken(Context context, Token token){
        get(context).token = token;
    }

    public static Token getToken(Context context){
        return get(context).token;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
        AndroidNetworking.initialize(getApplicationContext());
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        mApplicationComponent.inject(this);
        IMAudioManager.instance().init(this);
        setDatabase();
        String[] times = time.split(":");
        setAlarm(this, 1, Integer.parseInt(times[0]), Integer.parseInt
                (times[1]), 0, 0);
//        startUpdateService();
    }

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    public static MyApplication getApplication(){
        return myApplication;
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }

    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }

    private void setDatabase() {
        mHelper = new DaoMaster.DevOpenHelper(this, "notes-db", null);
        db = mHelper.getWritableDatabase();  mDaoMaster = new DaoMaster(db);
        mDaoSession = mDaoMaster.newSession();
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }

    public SQLiteDatabase getDb() {
        return db;
    }

    public void setAlarm(Context context, int flag, int hour, int minute, int id, int
            week) {
        AlarmManager am = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Calendar calendar = Calendar.getInstance();
        long intervalMillis = 0;
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get
                (Calendar.DAY_OF_MONTH), hour, minute, 10);
        if (flag == 0) {
            intervalMillis = 0;
        } else if (flag == 1) {
            intervalMillis = 24 * 3600 * 1000;
        } else if (flag == 2) {
            intervalMillis = 24 * 3600 * 1000 * 7;
        }
        Intent intent = new Intent(this, AutoUpdateService.class);
        intent.putExtra("alarm_time", "04:00");
        intent.putExtra("task_id", mTaskId);
        intent.putExtra("intervalMillis", intervalMillis);
        PendingIntent sender = PendingIntent.getBroadcast(context, id, intent, PendingIntent
                .FLAG_CANCEL_CURRENT);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            am.setWindow(AlarmManager.RTC_WAKEUP, calMethod(week, calendar.getTimeInMillis()),
                    intervalMillis, sender);
        } else {
            if (flag == 0) {
                am.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), sender);
            } else {
                am.setRepeating(AlarmManager.RTC_WAKEUP, calMethod(week, calendar.getTimeInMillis
                        ()), intervalMillis, sender);
            }
        }
    }

    /**
     * @param weekflag 传入的是周几
     * @param dateTime 传入的是时间戳（设置当天的年月日+从选择框拿来的时分秒）
     * @return 返回起始闹钟时间的时间戳
     */
    private long calMethod(int weekflag, long dateTime) {
        long time = 0;
        //weekflag == 0表示是按天为周期性的时间间隔或者是一次行的，weekfalg非0时表示每周几的闹钟并以周为时间间隔
        if (dateTime > System.currentTimeMillis()) {
            time = dateTime;
        } else {
            time = dateTime + 24 * 3600 * 1000;
        }
        return time;
    }

    private void cancelUpdateService(){
        AlarmManagerUtil.cancelAlarmBroadcast(this, mTaskId,
                AlarmReceiver.class);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        cancelUpdateService();
        ViewManager.getInstance(this).showOrHide();
        IMAudioManager.instance().delete(new DeleteListener() {
            @Override
            public void success() {

            }

            @Override
            public void failed(String error) {

            }
        });
    }
}
