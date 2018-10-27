/*
 *    Copyright (C) 2018 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.xiyo.selfhelp.data.remote;

import android.util.Log;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.interfaces.StringRequestListener;
import com.xiyo.selfhelp.Constant.Constants;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by amitshekhar on 13/01/17.
 */
@Singleton
public class ApiHelper {

    @Inject
    public ApiHelper() {

    }

    public void getData(StringRequestListener listener) {
        AndroidNetworking.get(ApiEndPoint.GET_DATA)
                .addPathParameter("pageNumber", "0")
                .addQueryParameter("limit", "3")
                .build()
                .getAsString(listener);
    }

    /**
     * 获取token
     * @param listener
     * @param fields
     */
    public void login(StringRequestListener listener, Map<String, String> fields) {
        AndroidNetworking.post(ApiEndPoint.LOGIN)
                .addBodyParameter(fields)
                .build()
                .getAsString(listener);
//        AndroidNetworking.get(ApiEndPoint.GET_DATA)
//                .addPathParameter("pageNumber", "0")
//                .addQueryParameter("limit", "3")
//                .build()
//                .getAsString(listener);
    }

    /**
     * 获取轮播图
     * @param listener
     * @param fields
     */
    public void getBanner(StringRequestListener listener, Map<String, String> fields) {
        String token = fields.get("Bearer");
        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "getBanner: " + ApiEndPoint.GET_BANNER + "?" + paramters);
        AndroidNetworking.get(ApiEndPoint.GET_BANNER + "?" + paramters)
                .addHeaders("Authorization",  "bearer " + token)
//                .addBodyParameter(fields)
//                .addPathParameter(fields)
                .build()
                .getAsString(listener);
    }

    /**
     * 获取酒店信息
     * @param listener
     * @param fields
     */
    public void getHotelInfo(StringRequestListener listener, Map<String, String> fields) {
        String token = fields.get("Bearer");
        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "getHotelInfo: " + ApiEndPoint.GET_HOTEL_INFO + "?" + paramters);
        AndroidNetworking.get(ApiEndPoint.GET_HOTEL_INFO + "?" + paramters)
                .addHeaders("Authorization",  "bearer " + token)
//                .addBodyParameter(fields)
//                .addPathParameter(fields)
                .build()
                .getAsString(listener);
    }

    /**
     * 获取天气
     * @param listener
     * @param fields
     */
    public void getWeather(StringRequestListener listener, Map<String, String> fields) {
        String token = fields.get("Bearer");
        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "getHotelInfo: " + ApiEndPoint.GET_WEATHER + "?" + paramters);
        AndroidNetworking.get(ApiEndPoint.GET_WEATHER + "?" + paramters)
                .addHeaders("Authorization",  "bearer " + token)
//                .addBodyParameter(fields)
//                .addPathParameter(fields)
                .build()
                .getAsString(listener);
    }

    /***
     * 获取房型
     * @param listener
     * @param fields
     */
    public void getRoomType(StringRequestListener listener, Map<String, String> fields) {
        AndroidNetworking.get(ApiEndPoint.GET_ROOM_TYPE + "?DeviceNo=" + fields.get("DeviceNo"))
                .addHeaders("Authorization",  "bearer " + fields.get("Bearer"))
//                .addBodyParameter(fields)
                .build()
                .getAsString(listener);
    }

    /**
     * 获取空房间并锁房
     * @param listener
     * @param fields
     */
    public void getEmptyRoom(StringRequestListener listener, Map<String, String> fields) {
        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "getEmptyRoom: " + ApiEndPoint.GET_EMPTY_ROOM + "?" + paramters);
        AndroidNetworking.get(ApiEndPoint.GET_EMPTY_ROOM + "?" + paramters)
                .addHeaders("Authorization",  "bearer " + fields.get("Bearer"))
//                .addBodyParameter(fields)
//                .addPathParameter(fields)
                .build()
                .getAsString(listener);
    }

    /**
     * 解锁房间
     * @param listener
     * @param fields
     */
    public void unLockRoom(StringRequestListener listener, Map<String, String> fields) {
        String token = fields.get("Bearer");
        fields.remove("Bearer");
        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "getEmptyRoom: " + ApiEndPoint.UN_LOCK_ROOM + "?" + paramters);
        AndroidNetworking.get(ApiEndPoint.UN_LOCK_ROOM + "?" + paramters)
                .addHeaders("Authorization",  "bearer " + token)
//                .addBodyParameter(fields)
//                .addPathParameter(fields)
                .build()
                .getAsString(listener);
    }

    /**
     * 公安接口：用户数据上传
     * @param listener
     * @param fields
     */
    public void sendGuestInfo(StringRequestListener listener, Map<String, String> fields){
//        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "sendGuestInfo: " + ApiEndPoint.SEND_GUEST_INFO);
        String json = fields.get("info");
        ANRequest request = AndroidNetworking.post(ApiEndPoint.SEND_GUEST_INFO)
                .addHeaders("Authorization",  "bearer " + fields.get("Bearer"))
                .addHeaders("key", Constants.PoliceKey)
                .setContentType("application/json")
//                .addBodyParameter(fields)
                .addStringBody(json)
//                .addPathParameter(fields)
                .build();
        request.getAsString(listener);
    }

    /**
     * 人证比对
     * @param listener
     * @param fields
     */
    public void verifyIdentity(StringRequestListener listener, Map<String, String> fields){
//        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "verifyIdentity: " + ApiEndPoint.VERIFY_IDENTITY);
        ANRequest request = AndroidNetworking.post(ApiEndPoint.VERIFY_IDENTITY)
                .addHeaders("key", fields.get("key"))
                .addHeaders("token", fields.get("token"))
                .setContentType("application/json")
//                .addBodyParameter(fields)
                .addStringBody(fields.get("info"))
//                .addPathParameter(fields)
                .build();
        request.getAsString(listener);
    }

    /**
     * 获取人证比对的token
     * @param listener
     * @param fields
     */
    public void createToken(StringRequestListener listener, Map<String, String> fields){
//        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "createToken: " + ApiEndPoint.CREATE_TOEKN);
        ANRequest request = AndroidNetworking.post(ApiEndPoint.CREATE_TOEKN)
                .addHeaders("key", fields.get("key"))
                .build();
        request.getAsString(listener);
    }

    /**
     * 获取入住订单信息
     * @param listener
     * @param fields
     */
    public void getCheckInOrder(StringRequestListener listener, Map<String, String> fields){
        String token = fields.get("Bearer");
        fields.remove("Bearer");
        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "getCheckInOrder: " + ApiEndPoint.GET_CHECK_IN_ORDER + "?" + paramters);
        AndroidNetworking.get(ApiEndPoint.GET_CHECK_IN_ORDER + "?" + paramters)
                .addHeaders("Authorization",  "bearer " + token)
//                .addBodyParameter(fields)
//                .addPathParameter(fields)
                .build()
                .getAsString(listener);
    }

    /**
     * 获取入住预定订单
     * @param listener
     * @param fields
     */
    public void getOrderByCertNo(StringRequestListener listener, Map<String, String> fields){
        String token = fields.get("Bearer");
        fields.remove("Bearer");
        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "getCheckInOrder: " + ApiEndPoint.GET_ORDER_BY_CERNO + "?" + paramters);
        AndroidNetworking.get(ApiEndPoint.GET_ORDER_BY_CERNO + "?" + paramters)
                .addHeaders("Authorization",  "bearer " + token)
//                .addBodyParameter(fields)
//                .addPathParameter(fields)
                .build()
                .getAsString(listener);
    }

    /**
     * 根据身份证获取房卡
     * @param listener
     * @param fields
     */
    public void getAuthenticaToken(StringRequestListener listener, Map<String, String> fields){
        String token = fields.get("Bearer");
        fields.remove("Bearer");
        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "getCheckInOrder: " + ApiEndPoint.GET_AUTHENTICA_TOKEN + "?" + paramters);
        AndroidNetworking.get(ApiEndPoint.GET_AUTHENTICA_TOKEN + "?" + paramters)
                .addHeaders("Authorization",  "bearer " + token)
//                .addBodyParameter(fields)
//                .addPathParameter(fields)
                .build()
                .getAsString(listener);
    }

    /**
     * 获取房间的所有房卡
     * @param listener
     * @param fields
     */
    public void getAuthenticaTokenList(StringRequestListener listener, Map<String, String> fields){
        String token = fields.get("Bearer");
        fields.remove("Bearer");
        String json = fields.get("info");
//        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "getCheckInOrder: " + ApiEndPoint.GET_AUTHENTICA_TOKEN_LIST);
        AndroidNetworking.post(ApiEndPoint.GET_AUTHENTICA_TOKEN_LIST)
                .addHeaders("Authorization",  "bearer " + token)
                .setContentType("application/json")
                .addStringBody(json)
//                .addBodyParameter(fields)
//                .addPathParameter(fields)
                .build()
                .getAsString(listener);
    }

    /**
     * 获取支付参数
     * @param listener
     * @param fields
     */
    public void getHotelPayConfigInfo(StringRequestListener listener, Map<String, String> fields){
        String token = fields.get("Bearer");
        fields.remove("Bearer");
        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "getCheckInOrder: " + ApiEndPoint.GET_GOTEL_PAY_CONFIG_INFO + "?" + paramters);
        AndroidNetworking.get(ApiEndPoint.GET_GOTEL_PAY_CONFIG_INFO + "?" + paramters)
                .addHeaders("Authorization",  "bearer " + token)
//                .addBodyParameter(fields)
//                .addPathParameter(fields)
                .build()
                .getAsString(listener);
    }

    /**
     * 入住
     * @param listener
     * @param fields
     */
    public void CheckIn(StringRequestListener listener, Map<String, String> fields){
//        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "sendGuestInfo: " + ApiEndPoint.CHECK_IN);
        String json = fields.get("info");
        ANRequest request = AndroidNetworking.post(ApiEndPoint.CHECK_IN)
                .addHeaders("Authorization",  "bearer " + fields.get("Bearer"))
                .setContentType("application/json")
//                .addBodyParameter(fields)
                .addStringBody(json)
//                .addPathParameter(fields)
                .build();
        request.getAsString(listener);
    }

    /**
     * 自助入住的订单创建
     * @param listener
     * @param fields
     */
    public void CreateOrder(StringRequestListener listener, Map<String, String> fields){
//        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "sendGuestInfo: " + ApiEndPoint.CREATE_ORDER);
        String json = fields.get("info");
        ANRequest request = AndroidNetworking.post(ApiEndPoint.CREATE_ORDER)
                .addHeaders("Authorization",  "bearer " + fields.get("Bearer"))
                .setContentType("application/json")
//                .addBodyParameter(fields)
                .addStringBody(json)
//                .addPathParameter(fields)
                .build();
        request.getAsString(listener);
    }

    /**
     * 续住
     * @param listener
     * @param fields
     */
    public void replenish(StringRequestListener listener, Map<String, String> fields){
//        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "sendGuestInfo: " + ApiEndPoint.REPLENISH);
        String json = fields.get("info");
        ANRequest request = AndroidNetworking.post(ApiEndPoint.REPLENISH)
                .addHeaders("Authorization",  "bearer " + fields.get("Bearer"))
                .setContentType("application/json")
//                .addBodyParameter(fields)
                .addStringBody(json)
//                .addPathParameter(fields)
                .build();
        request.getAsString(listener);
    }

    /**
     * 续住入住
     * @param listener
     * @param fields
     */
    public void createReplenshOrder(StringRequestListener listener, Map<String, String> fields){
//        String paramters = createLinkStringByGet(fields);
        Log.i("dc", "sendGuestInfo: " + ApiEndPoint.CREATE_REPLENSH_ORDER);
        String json = fields.get("info");
        ANRequest request = AndroidNetworking.post(ApiEndPoint.CREATE_REPLENSH_ORDER)
                .addHeaders("Authorization",  "bearer " + fields.get("Bearer"))
                .setContentType("application/json")
//                .addBodyParameter(fields)
                .addStringBody(json)
//                .addPathParameter(fields)
                .build();
        request.getAsString(listener);
    }

    /**
     * 上传门铃照片
     * @param listener
     * @param fields
     */
    public void receiveFace(StringRequestListener listener, Map<String, String> fields){
//        String paramters = createLinkStringByGet(fields);
        String json = fields.get("info");
        ANRequest request = AndroidNetworking.post(ApiEndPoint.RECEIVE_FACE)
                .addHeaders("Authorization",  "bearer " + fields.get("Bearer"))
                .setContentType("application/json")
//                .addBodyParameter(fields)
                .addStringBody(json)
//                .addPathParameter(fields)
                .build();
        request.getAsString(listener);
    }

    /**
     * 退房
     * @param listener
     * @param fields
     */
    public void checkout(StringRequestListener listener, Map<String, String> fields) {
        String token = fields.get("Bearer");
        fields.remove("Bearer");
        AndroidNetworking.post(ApiEndPoint.CHECK_OUT)
                .addHeaders("Authorization",  "bearer " + token)
                .addBodyParameter(fields)
                .build()
                .getAsString(listener);
//        AndroidNetworking.get(ApiEndPoint.GET_DATA)
//                .addPathParameter("pageNumber", "0")
//                .addQueryParameter("limit", "3")
//                .build()
//                .getAsString(listener);
    }

    /**
     * 判断微信快速入住订单是否有房间
     * @param listener
     * @param fields
     */
    public void checkDEFOrderRoom(StringRequestListener listener, Map<String, String> fields){
//        String paramters = createLinkStringByGet(fields);
        String json = fields.get("info");
        ANRequest request = AndroidNetworking.post(ApiEndPoint.CHECK_DEF_ORDER_ROOM)
                .addHeaders("Authorization",  "bearer " + fields.get("Bearer"))
                .setContentType("application/json")
//                .addBodyParameter(fields)
                .addStringBody(json)
//                .addPathParameter(fields)
                .build();
        request.getAsString(listener);
    }

    public void checkAndroidAppVersion(StringRequestListener listener, Map<String, String> fields){
//        String paramters = createLinkStringByGet(fields);
        String token = fields.get("Bearer");
        fields.remove("Bearer");
        String paramters = createLinkStringByGet(fields);
        ANRequest request = AndroidNetworking.get(ApiEndPoint.CHECK_ANDROID_APP_VERSION + "?" + paramters)
                .addHeaders("Authorization",  "bearer " + token)
//                .addPathParameter(fields)
                .build();
        request.getAsString(listener);
    }

    public void sendVerificationCode(StringRequestListener listener, Map<String, String> fields){
//        String paramters = createLinkStringByGet(fields);
        String token = fields.get("Bearer");
        fields.remove("Bearer");
        String paramters = createLinkStringByGet(fields);
        ANRequest request = AndroidNetworking.get(ApiEndPoint.SEND_VERIFICATION_CODE + "?" + paramters)
                .addHeaders("Authorization",  "bearer " + token)
//                .addPathParameter(fields)
                .build();
        request.getAsString(listener);
    }



    /**
     　　* 把数组所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
     　　* @param params 需要排序并参与字符拼接的参数组
     　　* @return 拼接后字符串
     　　* @throws UnsupportedEncodingException
     　　*/
    public String createLinkStringByGet(Map<String, String> params) {
        List<String> keys = new ArrayList<>(params.keySet());
        Collections.sort(keys);
        String prestr = "";
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = params.get(key);
            try {
                value = URLEncoder.encode(value, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            if (i == keys.size() - 1) {//拼接时，不包括最后一个&字符
                prestr = prestr + key + "=" + value;
            } else {
                prestr = prestr + key + "=" + value + "&";
            }
        }
        return prestr;
    }
}
