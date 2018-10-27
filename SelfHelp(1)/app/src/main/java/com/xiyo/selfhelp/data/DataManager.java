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

package com.xiyo.selfhelp.data;

import android.util.Log;

import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.local.PreferencesHelper;
import com.xiyo.selfhelp.data.remote.ApiHelper;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by amitshekhar on 13/01/17.
 */
@Singleton
public class DataManager {
    private static final String TAG = "dc";
    private final PreferencesHelper mPreferencesHelper;
    private final ApiHelper mApiHelper;

    @Inject
    public DataManager(PreferencesHelper preferencesHelper, ApiHelper apiHelper) {
        this.mPreferencesHelper = preferencesHelper;
        this.mApiHelper = apiHelper;
    }

    public int getData(String key) {
        int data = mPreferencesHelper.getData(key);
        return data;
    }

    public void putData(String key, int value){
        mPreferencesHelper.putData(key, value);
    }


    public void getData(final DataListener listener) {

        final String data = mPreferencesHelper.getData();

        if (data != null) {
            listener.onResponse(data);
            return;
        }

        mApiHelper.getData(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {
                listener.onError(anError.getErrorDetail());
            }
        });
    }

    public void login(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }

        mApiHelper.login(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {
                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void getBanner(final DataListener listener, Map<String, String> fields) {

        mApiHelper.getBanner(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {
                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void getHotelInfo(final DataListener listener, Map<String, String> fields) {
//        final String data = mPreferencesHelper.getHotelInfo();
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }

        mApiHelper.getHotelInfo(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
                mPreferencesHelper.putHotelInfo(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {
                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void getWeather(final DataListener listener, Map<String, String> fields) {
//        final String data = mPreferencesHelper.getHotelInfo();
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }

        mApiHelper.getWeather(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putHotelInfo(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {
                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void getRoomType(final DataListener listener, Map<String, String> fields) {
        String read = fields.get("read");
        if(read != null && !read.isEmpty()){
            final String data = mPreferencesHelper.getRoom();
            if (data != null) {
                listener.onResponse(data);
                return;
            }
        }

        mApiHelper.getRoomType(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
                mPreferencesHelper.putRoom(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {

                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }


    public void getEmptyRoom(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.getEmptyRoom(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {

                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void unLockRoom(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.unLockRoom(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {

                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void sendGuestInfo(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.sendGuestInfo(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {

                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void getCheckInOrder(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.getCheckInOrder(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {
                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void createOrder(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.CreateOrder(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {
                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void verifyIdentity(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.verifyIdentity(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {
                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void createToken(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.createToken(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {
                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void getOrderByCertNo(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.getOrderByCertNo(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {
                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void getAuthenticaToken(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.getAuthenticaToken(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {

                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void getAuthenticaTokenList(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.getAuthenticaTokenList(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {

                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }



    public void getHotelPayConfigInfo(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.getHotelPayConfigInfo(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {

                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void receiveFace(final DataListener listener, Map<String, String> fields) {

        mApiHelper.receiveFace(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {

                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void CheckIn(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.CheckIn(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {

                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void replenish(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.replenish(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {

                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void createReplenshOrder(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.createReplenshOrder(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {

                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void checkout(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.checkout(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {

                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void checkDEFOrderRoom(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.checkDEFOrderRoom(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {

                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void checkAndroidAppVersion(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.checkAndroidAppVersion(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {

                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }

    public void sendVerificationCode(final DataListener listener, Map<String, String> fields) {

//        final String data = mPreferencesHelper.getData();
//
//        if (data != null) {
//            listener.onResponse(data);
//            return;
//        }
        mApiHelper.sendVerificationCode(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
//                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {

                listener.onError(anError.getErrorDetail());
            }
        }, fields);
    }
}
