package com.sensetime.liveness.silent;

import android.graphics.Bitmap;
import android.graphics.Rect;

import java.util.Arrays;

/**
 * Created on 2016/12/06 13:18.
 *
 * @author Han Xu
 */
public final class SilentLivenessImageHolder {

    private static Bitmap mImageData = null;

    public static Bitmap getImageData() {
        return mImageData;
    }

    public static void setImageData(Bitmap imageData) {
        mImageData = imageData;
    }

    private SilentLivenessImageHolder() {
        // Do nothing.
    }
}