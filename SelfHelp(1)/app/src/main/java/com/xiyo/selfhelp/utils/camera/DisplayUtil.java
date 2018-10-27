package com.xiyo.selfhelp.utils.camera;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.Log;

/**
 * Created by  xiangdingquan  on 2018/3/7.
 * <p>
 * display工具类
 */

public class DisplayUtil {

    private static final String TAG = "DisplayUtil";

    /**
     * 获取屏幕宽度和高度，单位为px
     *
     * @param context
     * @return
     */
    public static Point getScreenMetrics(Context context) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        int widthScreen = dm.widthPixels;
        int heightScreen = dm.heightPixels;
        Log.i(TAG, "Screen---Width = " + widthScreen + " Height = " + heightScreen + " densityDpi = " + dm.densityDpi);
        return new Point(widthScreen, heightScreen);

    }

    /**
     * 获取屏幕长宽比
     *
     * @param context
     * @return
     */
    public static float getScreenRate(Context context) {
        Point P = getScreenMetrics(context);
        float H = P.y;
        float W = P.x;
        return (H / W);
    }

    public static int dip2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
