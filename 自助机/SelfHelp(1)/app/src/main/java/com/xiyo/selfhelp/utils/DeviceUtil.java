package com.xiyo.selfhelp.utils;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;

import java.lang.reflect.Method;
import java.util.UUID;

public class DeviceUtil {

    /**
     * 获取屏幕分辨率
     */
    public static int[] getScreenSize(Resources resources) {
        int width = resources.getDisplayMetrics().widthPixels;
        int height = resources.getDisplayMetrics().heightPixels;
        int[] result = new int[2];
        result[0] = width;
        result[1] = height;
        return result;
    }

    public static int getPixelFromDip(Context context, float dip) {
        return getPixelFromDip(context.getResources().getDisplayMetrics(), dip);
    }

    public static double calculateScreenSize(DisplayMetrics outMetrics) {
        double x = Math.pow(outMetrics.widthPixels / outMetrics.xdpi, 2);
        double y = Math.pow(outMetrics.heightPixels / outMetrics.ydpi, 2);
        double screenInches = Math.sqrt(x + y);
        return screenInches;
    }

    public static double calculateScreenSize(Context context) {
        DisplayMetrics outMetrics = context.getResources().getDisplayMetrics();
        return calculateScreenSize(outMetrics);
    }

    /**
     *
     */
    public static int getPixelFromDip(DisplayMetrics dm, float dip) {
        return (int) (TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dip, dm) + 0.5f);
    }

    /**
     * 获取手机型号
     */
    public static String getDeviceModel() {
        String model = Build.MODEL;

        if (model == null) {
            return "";
        } else {
            return model;
        }
    }

    /**
     */
    @SuppressWarnings("deprecation")
    public static String getSDKVersion() {
        return Build.VERSION.SDK;
    }

    /**
     */
    public static int getSDKVersionInt() {
        return Build.VERSION.SDK_INT;
    }

    /**
     * @return
     */
    public static boolean isSdCardExist() {
        return android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED);
    }

    /**
     * @return IMEI
     */
    public static String getIMEI(Context context) {
        TelephonyManager teleMgr = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return "1";
        } else {
            return teleMgr.getDeviceId();
        }
    }

    /**
     * @return IMSI
     */
    @SuppressLint("MissingPermission")
    public static String getIMSI(Context context) {
        TelephonyManager teleMgr = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        return teleMgr.getSubscriberId();
    }

    /**
     * wifi mac + imei + cpu serial
     *
     * @return
     */
    public static String getMobileUUID(Context context) {
        String uuid = "";
        WifiManager wifiMgr = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        if (wifiMgr != null) {
            WifiInfo info = wifiMgr.getConnectionInfo();
            if (info != null && info.getMacAddress() != null) {
                uuid = info.getMacAddress().replace(":", "");
            }
        }

        TelephonyManager teleMgr = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return "";
        }
        String imei = teleMgr.getDeviceId();
        uuid += imei;

        if (uuid != null && uuid.length() > 64) {
            uuid = uuid.substring(0, 64);
        }
        return uuid;
    }

    public static String getUUID(Context context) {
        final TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);

        final String tmDevice, tmSerial, tmPhone, androidId;
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return "";
        }else {
//            tmDevice = "" + tm.getDeviceId();
//            tmDevice = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
            tmSerial = "" + getSerialNumber();
            androidId = "" + android.provider.Settings.Secure.getString(context.getContentResolver(), android.provider.Settings.Secure.ANDROID_ID);
            UUID deviceUuid = new UUID(androidId.hashCode(), ((long) tmSerial.hashCode()));
            String uniqueId = deviceUuid.toString();
            return uniqueId;
        }

    }

    /**
     * 获取手机品牌 + 型号
     *
     * @return
     */
    public static String getBrandModel() {
        return android.os.Build.BRAND + "," + android.os.Build.MODEL;

    }

    public static String getMac(Context context) {
        String strMac = null;
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            strMac = getLocalMacAddressFromWifiInfo(context);
            return strMac;
        }
        return "02:00:00:00:00:00";
    }

    public static String getLocalMacAddressFromWifiInfo(Context context){
        WifiManager wifi = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        WifiInfo winfo = wifi.getConnectionInfo();
        String mac =  winfo.getMacAddress();
        return mac;
    }

    public static String getSerialNumber() {
        String serial = null;
        try {
            Class<?> c = Class.forName("android.os.SystemProperties");
            Method get = c.getMethod("get", String.class);
            serial = (String) get.invoke(c, "ro.serialno");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return serial;
    }


}