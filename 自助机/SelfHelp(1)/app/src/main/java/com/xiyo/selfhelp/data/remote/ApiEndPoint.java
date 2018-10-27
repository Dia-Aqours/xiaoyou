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

/**
 * Created by amitshekhar on 13/01/17.
 */

public final class ApiEndPoint {

    private static final String BASE_URL = "http://open.xiezhuqa.cn";
//    private static final String BASE_URL = "http://open.xiezhuwang.com";

    private static final String POLICE_URL = "https://police.xiezhuqa.cn";
    private static final String USTORE =  "http://ustore.xiezhuqa.cn";
//    private static final String AUTHENTICATION = "http://103.25.37.165/ntid";
    private static final String AUTHENTICATION = "http://101.49.147.37/ntid";

    public static final String GET_DATA = BASE_URL + "/getAllUsers/{pageNumber}";

    public static final String LOGIN = BASE_URL + "/token";

    public static final String GET_BANNER = BASE_URL + "/api/Kiosk/v2/GetHotelAdvertise";

    public static final String GET_HOTEL_INFO = BASE_URL + "/api/Kiosk/v2/GetHotelInfo";

    public static final String GET_WEATHER = BASE_URL + "/api/Kiosk/v2/GetWeather";

    public static final String GET_ROOM_TYPE = BASE_URL + "/api/Kiosk/v2/GetNewRoomTypeInfo";

    public static final String GET_EMPTY_ROOM = BASE_URL + "/api/Kiosk/v2/GetEmptyRoom";

    public static final String UN_LOCK_ROOM = BASE_URL + "/api/Kiosk/v2/StatusResult";

    public static final String SEND_GUEST_INFO = POLICE_URL + "/v1/SendGuestInfo";

    public static final String CREATE_TOEKN = AUTHENTICATION + "/createToken";

    public static final String VERIFY_IDENTITY = AUTHENTICATION + "/verifyIdentity";

    public static final String GET_CHECK_IN_ORDER = BASE_URL + "/api/Kiosk/v2/GetCheckInOrder";

    public static final String GET_ORDER_BY_CERNO = BASE_URL + "/api/Kiosk/v2/GetOrderByCertNo";

    public static final String GET_AUTHENTICA_TOKEN = BASE_URL + "/api/Kiosk/v2/GetAuthenticaToken";

    public static final String GET_AUTHENTICA_TOKEN_LIST = BASE_URL + "/api/Kiosk/v2/GetAuthenticaTokenList";

    public static final String GET_GOTEL_PAY_CONFIG_INFO = BASE_URL + "/api/Kiosk/v2/GetHotelPayConfigInfo";

    public static final String CHECK_IN = BASE_URL + "/api/Kiosk/v2/CheckIn";

    public static final String CREATE_ORDER = BASE_URL + "/api/Kiosk/v2/CreateOrder";

    public static final String REPLENISH = BASE_URL + "/api/Kiosk/v2/Replenish";

    public static final String CREATE_REPLENSH_ORDER = BASE_URL + "/api/Kiosk/v2/CreateReplenshOrder";

    public static final String RECEIVE_FACE  = BASE_URL + "/api/Kiosk/v2/ReceiveFace";

    public static final String CHECK_OUT  = BASE_URL + "/api/Kiosk/v2/CheckOut";

    public static final String SEND_VERIFICATION_CODE  = BASE_URL + "/api/Kiosk/v2/SendVerificationCode";

    public static final String CHECK_DEF_ORDER_ROOM   = BASE_URL + "/api/Kiosk/v2/CheckDEFOrderRoom";

    public static final String CHECK_ANDROID_APP_VERSION   = USTORE + "/app/CheckAndroidAppVersion";


}
