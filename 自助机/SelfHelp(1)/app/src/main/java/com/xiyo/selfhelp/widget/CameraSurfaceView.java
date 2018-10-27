package com.xiyo.selfhelp.widget;

import android.content.Context;
import android.graphics.PixelFormat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.xiyo.selfhelp.utils.camera.CameraHelper;


/**
 * Created by  xiangdingquan  on 2018/3/7.
 * <p>
 * cameraSurfaceView
 */

public class CameraSurfaceView extends SurfaceView implements SurfaceHolder.Callback {


    private static final String TAG = "dc";
    private Context mContext;
    private SurfaceHolder mSurfaceHolder;

    public CameraSurfaceView(Context context) {
        this(context, null);
    }

    public CameraSurfaceView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CameraSurfaceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        init();
    }

    private void init() {
        mSurfaceHolder = getHolder();
        mSurfaceHolder.setFormat(PixelFormat.TRANSPARENT);//translucent半透明 transparent透明
        mSurfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
        mSurfaceHolder.addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        Log.i(TAG, "surfaceCreated: " + "执行");
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        Log.i(TAG, "surfaceChanged: " + "执行");
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        Log.i(TAG, "surfaceDestroyed: " + "销毁了");
        CameraHelper.getInstance().doStopCamera();
    }


    public SurfaceHolder getSurfaceHolder() {
        return mSurfaceHolder;
    }
}
