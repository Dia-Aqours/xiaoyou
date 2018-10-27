package com.xiyo.selfhelp.utils.camera;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/**
 * Created by  xiangdingquan  on 2018/3/7.
 * <p>
 * 图像工具类
 */

public class ImageUtil {

    /**
     * 将指定的bitmap按照一定的角度旋转
     *
     * @param bitmap 需要旋转的bitmap
     * @param degree 旋转的角度
     * @return 返回得到的bitmap
     */
    public static Bitmap getRotateBitmap(Bitmap bitmap, float degree) {
        Matrix matrix = new Matrix();
        matrix.postRotate(degree);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);

    }
}
