package com.xiyo.selfhelp.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.xiyo.selfhelp.manager.FloatBallManager;

public class FloatService extends Service {
    public FloatService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        FloatBallManager.getInstance(this).showOrHide();
        return super.onStartCommand(intent, flags, startId);
    }
}
