package com.xiyo.selfhelp.Constant;

import android.os.Environment;

import java.io.File;

public class RawsConstants {
    private static final String BASE_PATH = Environment.getExternalStorageDirectory().getPath();
    //选择房型
    public static final String SELECT = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "please_select.wav";
    //比对成功
    public static final String COMPARISON_SUCCESS = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "comparison_success.wav";
    //比对失败
    public static final String COMPARISON_FAIL = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "comparison_fail.wav";
    //比对失败
    public static final String COMPARISONING = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "comparisoning.wav";
    //比对模块比对成功
    public static final String RECOMPARISON_SUCCESS = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "recomparison_success.wav";
    //比对模块比对失败
    public static final String RECOMPARISON_FAIL = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "recomparison_fail.wav";
    //入住成功
    public static final String CHECKIN_SUCCESS = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "checkin_success.wav";
    //退房成功
    public static final String CHECKOUT_SUCCESS = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "checkout_success.wav";
    //续住成功
    public static final String STAYIN_SUCCESS = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "stayin_success.wav";
    //确认退房
    public static final String COMFIRM_CHECKOUT = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "comfirm_checkout.wav";
    //房型已满，请重新选择
    public static final String ROOM_FULL_AND_RETRY = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "room_full_and_retry.wav";
    //离店时间
    public static final String LEAVE_TIME = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "leave_time.m4a";
    //请核对入住信息
    public static final String COMFIRM_CHECKIN_INFO = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "comfirm_checkin_info.wav";
    //请核对本次订单
    public static final String COMFIRM_THE_ORDER = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "comfirm_the_order.wav";
    //请选择离店时间
    public static final String SELECT_LEAVE_TIME = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "select_leave_time.wav";
    //请选择入住房间
    public static final String SELECT_CHECKIN_ROOM = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "select_checkin_room.wav";
    //请选择入住时间
    public static final String SELECT_CHECKIN_TIME = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "select_checkin_time.wav";
    //请选择需要办理退房的房间
    public static final String SELECT_CHECKOUT_ROOM = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "select_checkout_room.wav";
    //请选择续住时间
    public static final String SELECT_STAYIN_TIME = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "select_stayin_time.wav";
    //人证比对界面
    public static final String RECOMPARISON_SURFACE = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "recomparison_surface.wav";
    //验证身份界面
    public static final String IDCARD_SCAN_SURFACE = BASE_PATH  + File.separator+ "selfhelp" + File.separator + "raws" + File.separator + "idcard_scan.wav";
}
