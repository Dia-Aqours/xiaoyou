package com.xiezhupay;

import java.util.Random;


/**
 * 请求需要的参数
 * @author Administrator
 *
 */
public class Constans {
	//appid 
	public static String APPID = "wxf33510f5323d79d5";
	public static String auth_code = genNonceStr();
	public static String body = "sddfg";
	public static String device_info = "1000";
	public static String mch_id = "1332790701";
	public static String nonce_str = genNonceStr();
	public static String out_trade_no = genNonceStr();
	public static String spbill_create_ip = "127.0.0.1";
	public static String notify_url = "http://www.baidu.com";
	public static String total_fee = "1";
	public static String trade_type = "NATIVE";
	public static String private_key = "HW8bmu1U1b4qn0rUfto0rk6Vsf2VjAuf";
	public static String key = "L8LrMqqeGRxST5reouB0K66CaYAWpqhAVsq7ggKkxHCOastWksvuX1uvmvQclxaHoYd3ElNBrNO2DHnnzgfVG9Qs473M3DTOZug5er46FhuGofumV8H2FVR9qkjSlC5K";
			
	//请求地址
	public static String url="https://api.mch.weixin.qq.com/pay/unifiedorder";
	//生成随机字符串
	private static String genNonceStr() {
		Random random = new Random();
		return MD5.getMessageDigest(String.valueOf(random.nextInt(10000)).getBytes());
	}
	
	
}
