package com.xiyo.selfhelp.utils.camera;

import android.hardware.Camera;
import android.hardware.Camera.Size;
import android.util.Log;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by  xiangdingquan  on 2018/3/7.
 * <p>
 * 相机参数工具类
 * <p>
 * 单例
 */

public class CameraParamUtil {

    private static final String TAG = "CameraParamUtil";

    private volatile static CameraParamUtil mInstance;

    private CameraSizeComparator mCameraSizeComparator = new CameraSizeComparator();

    private CameraParamUtil() {

    }

    /**
     * 获取单例的引用
     *
     * @return 单例的引用
     */
    public static CameraParamUtil getInstance() {
        if (mInstance == null) {
            synchronized (CameraParamUtil.class) {
                if (mInstance == null) {
                    mInstance = new CameraParamUtil();
                }
            }
        }
        return mInstance;
    }

    /**
     * 从集合中筛选出来符合条件且比例于屏幕的比例相近的 预览尺寸
     *
     * @param list     集合
     * @param rate     长宽比例
     * @param minWidth 最小宽度
     * @return 预览的一个size包括了尺寸信息
     */
    public Size getPreviewSize(List<Size> list, float rate, int minWidth) {
        Collections.sort(list, mCameraSizeComparator);
        int i = 0;
        for (Size size : list) {
            if (size.width >= minWidth && equalRate(size, rate)) {
                Log.i(TAG, "PreviewSize:w = " + size.width + "h = " + size.height);
                break;
            }
            i++;
        }
        if (i == list.size()) {
            i = 0;//如果没找到比例相近的，就选最小的size
        }
        return list.get(i);
    }

    /**
     * 得到符合条件的图片的尺寸信息
     *
     * @param list     集合
     * @param rate     比例
     * @param minWidth 最小宽度
     * @return 图片的尺寸信息
     */
    public Size getPictureSize(List<Size> list, float rate, int minWidth) {
        Collections.sort(list, mCameraSizeComparator);
        int i = 0;
        for (Size size : list) {
            if ((size.width >= minWidth) && equalRate(size, rate)) {
                Log.i(TAG, "PictureSize : w = " + size.width + "h = " + size.height);
                break;
            }
            i++;
        }
        if (i == list.size()) {
            i = 0;
        }
        return list.get(i);
    }


    /**
     * 判断比例是否相近
     */
    private boolean equalRate(Size size, float rate) {
        float r = (float) (size.width) / (float) (size.height);
        return Math.abs(r - rate) <= 0.03;
    }


    private class CameraSizeComparator implements Comparator<Size> {

        @Override
        public int compare(Size o1, Size o2) {
            if (o1.width == o2.width) {
                return 0;
            } else if (o1.width > o2.width) {
                return 1;
            } else {
                return -1;
            }
        }
    }


    /**
     * 打印支持的previewSizes
     */
    public void printSupportPreviewSize(Camera.Parameters params) {
        List<Size> previewSizes = params.getSupportedPreviewSizes();
        for (int i = 0; i < previewSizes.size(); i++) {
            Size size = previewSizes.get(i);
            Log.i(TAG, "previewSizes:width = " + size.width + " height = " + size.height);
        }

    }

    /**
     * 打印支持的pictureSizes
     */
    public void printSupportPictureSize(Camera.Parameters params) {
        List<Size> pictureSizes = params.getSupportedPictureSizes();
        for (int i = 0; i < pictureSizes.size(); i++) {
            Size size = pictureSizes.get(i);
            Log.i(TAG, "pictureSizes:width = " + size.width + " height = " + size.height);
        }
    }

    /**
     * 打印支持的聚焦模式
     */
    public void printSupportFocusMode(Camera.Parameters params) {
        List<String> focusModes = params.getSupportedFocusModes();
        for (String mode : focusModes) {
            Log.i(TAG, "focusModes--" + mode);
        }
    }

}
