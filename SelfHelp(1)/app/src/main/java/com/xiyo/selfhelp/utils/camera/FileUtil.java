package com.xiyo.selfhelp.utils.camera;

import android.graphics.Bitmap;
import android.os.Environment;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by  xiangdingquan  on 2018/3/7.
 * <p>
 * 图片文件操作
 */

public class FileUtil {


    private static final String TAG = "FileUtil";

    private static final File PARENT_PATH = Environment.getExternalStorageDirectory();

    private static String storagePath = "";

    private static final String DST_FOLDER_NAME = "SURFACEVIEW_CAMERA";

    /**
     * 初始化保存的路径
     *
     * @return 路径
     */
    private static String initPath() {
        if (storagePath.equals("")) {
            storagePath = PARENT_PATH.getAbsolutePath() + "/" + DST_FOLDER_NAME;
            File file = new File(storagePath);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return storagePath;
    }

    /**
     * 将指定的bitmap保存到sdcard
     *
     * @param bitmap 需要保存的bitmap
     * @return 保存的文件的路径
     */

    public static String savaBitmap(Bitmap bitmap) {
        String path = initPath();
        long token = System.currentTimeMillis();
        String filePath = path + "/" + token + ".jpg";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            fileOutputStream.close();
            return filePath;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }


}
