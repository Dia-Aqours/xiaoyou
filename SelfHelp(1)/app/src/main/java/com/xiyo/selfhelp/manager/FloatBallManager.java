package com.xiyo.selfhelp.manager;

import android.app.Instrumentation;
import android.content.Context;
import android.graphics.PixelFormat;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.xiyo.selfhelp.utils.ScreenUtil;
import com.xiyo.selfhelp.widget.FloatBallView;

/**
 * Created by xiongxunxiang on 2017/2/14.
 * 悬浮窗管理器，单例模式创建
 */

public class FloatBallManager {
    private static FloatBallManager sFloatBallManager;
    private Context mContext;
    private WindowManager mWinMgr;
    private FloatBallView mFloatBallView;
    private float mStartRawX;
    private float mStartRawY;
    private WindowManager.LayoutParams mParams;
    private boolean isShowing = false;
//    private BottomBallView mBottomBallView;
//    private BottomWindow mBottomWindow;

    private FloatBallManager(Context context) {
        mContext = context;
        mWinMgr = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        mFloatBallView = new FloatBallView(mContext);
        isShowing = false;
//        mBottomBallView = new BottomBallView(mContext);
//        mBottomWindow = new BottomWindow(mContext);

        mFloatBallView.setOnTouchListener(mOnTouchListener);
        mFloatBallView.setOnClickListener(mOnClickListener);
    }

    public static FloatBallManager getInstance(Context context) {
        if (sFloatBallManager == null) {
            sFloatBallManager = new FloatBallManager(context);
        }
        return sFloatBallManager;
    }

    private View.OnTouchListener mOnTouchListener = new View.OnTouchListener() {

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    mStartRawX = event.getRawX();
                    mStartRawY = event.getRawY();
                    break;

                case MotionEvent.ACTION_MOVE:
                    float rawX2 = event.getRawX();
                    float rawY2 = event.getRawY();

                    float dx = rawX2 - mStartRawX;
                    float dy = rawY2 - mStartRawY;

                    mParams.x += dx;
                    mParams.y += dy;

                    mWinMgr.updateViewLayout(mFloatBallView, mParams);

                    mFloatBallView.setDragState(true);

                    mStartRawX = rawX2;
                    mStartRawY = rawY2;
                    break;

                case MotionEvent.ACTION_UP:
                    float rawX3 = event.getRawX();
                    float rawY3 = event.getRawY();


                    if (rawX3 >= (ScreenUtil.getScreenWidth(mContext) / 2)) {
                        mParams.x = ScreenUtil.getScreenWidth(mContext) - mFloatBallView.getWidth() / 2;
                    } else {
                        mParams.x = 0;
                    }
                    mWinMgr.updateViewLayout(mFloatBallView, mParams);

                    mFloatBallView.setDragState(false);

                    if (Math.abs(rawX3 - mStartRawX) > 5 || Math.abs(rawY3 - mStartRawY) > 5) {
                        return true;
                    } else {
                        return false;
                    }

                default:
                    break;
            }
            return false;
        }
    };

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            new Thread () {
                public void run () {
                    try {
                        Instrumentation inst= new Instrumentation();
                        inst.sendKeyDownUpSync(KeyEvent. KEYCODE_BACK);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    };

    /**
     * 显示悬浮小球
     */
    public void showFloatWindow() {
        mParams = new WindowManager.LayoutParams();
        mParams.width = mFloatBallView.getWidth();
        mParams.height = mFloatBallView.getHeight();
        mParams.gravity = Gravity.TOP | Gravity.LEFT;
        mParams.x = 0;
        mParams.y = 0;
        // 如果使用TYPE_TOAST，可以不用使用悬浮窗权限，解决小米等手机无法显示的问题.https://gold.xitu.io/entry/5621a9cb60b27457e85c8c07
        mParams.type = WindowManager.LayoutParams.TYPE_PHONE;
        mParams.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE | WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL;
        mParams.format = PixelFormat.RGBA_8888;
        mWinMgr.addView(mFloatBallView, mParams);
    }

    public void showOrHide() {
        if (!isShowing) {
            isShowing = true;
            showFloatWindow();
        }else {
            isShowing = false;
            if (null != mWinMgr && null != mFloatBallView) {
                mWinMgr.removeView(mFloatBallView);//移除悬浮窗
            }
        }
    }

    /**
     * 显示底部窗口
     */
//    public void showBottomWindow() {
//        WindowManager.LayoutParams mParams = new WindowManager.LayoutParams();
//        mParams.width = ScreenUtil.getScreenWidth(mContext);
//        mParams.height = ScreenUtil.getScreenHeight(mContext) - ScreenUtil.getStatusBarHeight(mContext);
//        mParams.gravity = Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL;
//        mParams.x = 0;
//        mParams.y = 0;
//        // 如果使用TYPE_TOAST，可以不用使用悬浮窗权限，解决小米等手机无法显示的问题.https://gold.xitu.io/entry/5621a9cb60b27457e85c8c07
//        mParams.type = WindowManager.LayoutParams.TYPE_PHONE;
//        mParams.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE | WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL;
//        mParams.format = PixelFormat.RGBA_8888;
//        mWinMgr.addView(mBottomWindow, mParams);
//    }

//    public void hideBottomWindow() {
//        if (mBottomWindow != null) {
//            mWinMgr.removeView(mBottomWindow);
//        }
//        showFloatWindow();
//    }
}
