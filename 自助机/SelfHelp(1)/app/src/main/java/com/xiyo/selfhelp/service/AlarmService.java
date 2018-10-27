package com.xiyo.selfhelp.service;

import android.app.AlarmManager;
import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.xiyo.selfhelp.receiver.AlarmReceiver;
import com.xiyo.selfhelp.utils.AlarmManagerUtil;
import com.xiyo.selfhelp.utils.DateTimeUtil;

import java.util.Date;

public class AlarmService extends IntentService {

    // 从其他地方通过Intent传递过来的提醒时间
    private String alarmDateTime;

    public AlarmService() {
        super("AlarmService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

//        alarmDateTime = intent.getStringExtra("alarm_time");
        // taskId用于区分不同的任务
//        int taskId = intent.getIntExtra("task_id", 0);
//        Log.d("AlarmService", "executed at " + new Date().toString()
//                + " @Thread id：" + Thread.currentThread().getId());
//
//        long alarmDateTimeMillis = DateTimeUtil.stringToMillis(alarmDateTime);
//        AlarmManagerUtil.sendRepeatAlarmBroadcast(this, taskId,
//                AlarmManager.RTC_WAKEUP, alarmDateTimeMillis, 10 * 1000,
//                AlarmReceiver.class);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Destroy", "Alarm Service Destroy");
    }

}