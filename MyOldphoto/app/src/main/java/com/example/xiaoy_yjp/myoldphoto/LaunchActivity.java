package com.example.xiaoy_yjp.myoldphoto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class LaunchActivity extends AppCompatActivity {
    int DELAY = 3*1000;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //加载启动图片
            setContentView(R.layout.activity_launch);
            //后台处理耗时任务
            final Intent intent=new Intent(this,MainActivity.class);
            Timer timer=new Timer();
            TimerTask task=new TimerTask()
            {
                @Override
                public void run(){
                    startActivity(intent);
                }
            };
            timer.schedule(task,DELAY);//此处的Delay可以是3*1000，代表三秒

        }
    }
