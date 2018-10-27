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

package com.xiyo.selfhelp.ui.presenter.main;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.BannerResult;
import com.xiyo.selfhelp.data.model.HotelInfo;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.WeatherData;
import com.xiyo.selfhelp.data.model.WeatherEntity;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.main.LaunchMvpPresenter;
import com.xiyo.selfhelp.ui.view.main.LaunchMvpView;

import java.io.IOException;
import java.util.Map;

import javax.inject.Inject;

/**
 * Created by amitshekhar on 13/01/17.
 */

public class LaunchPresenter<V extends LaunchMvpView> extends BasePresenter<V> implements LaunchMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public LaunchPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void getData() {

        getMvpView().showLoading();

        mDataManager.getData(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                getMvpView().showData(data);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                getMvpView().showData(error);
            }
        });
    }

    @Override
    public void getBanner(Map<String, String > fields) {
        mDataManager.getBanner(new DataListener() {
            @Override
            public void onResponse(String data) {
//                getMvpView().hideLoading();
                Log.i(TAG, "onResponse: getBanner: " + data);
                BannerResult bannerResult = null;
                try {
                    bannerResult = LoganSquare.parse(data, BannerResult.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().showBanner(bannerResult);
            }

            @Override
            public void onError(String error) {
                getMvpView().showBannerError(error);
            }
        }, fields);
    }

    @Override
    public void login(Map<String, String > fields) {
        mDataManager.login(new DataListener() {
            @Override
            public void onResponse(String data) {
//                getMvpView().hideLoading();
                Token token = null;
                try {
                    token = LoganSquare.parse(data, Token.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().loginSuccess(token);
            }

            @Override
            public void onError(String error) {
                getMvpView().loginFail(error);
            }
        }, fields);
    }

    @Override
    public void getHotelInfo(Map<String, String> fields) {
        mDataManager.getHotelInfo(new DataListener() {
            @Override
            public void onResponse(String data) {
//                getMvpView().hideLoading();
                HotelInfo hotelInfo = null;
                try {
                    hotelInfo = LoganSquare.parse(data, HotelInfo.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().getHotelInfoSuccess(hotelInfo);
            }

            @Override
            public void onError(String error) {
                getMvpView().getHotelInfoFail(error);
            }
        }, fields);
    }

    @Override
    public void getWeather(Map<String, String> fields) {
        mDataManager.getWeather(new DataListener() {
            @Override
            public void onResponse(String data) {
//                getMvpView().hideLoading();
//                data = data.replace("\\", "");
                Log.i(TAG, "onResponse: getWeather...data = " + data);
                WeatherEntity weatherEntity = null;
                try {
                    weatherEntity = LoganSquare.parse(data, WeatherEntity.class);
                    Log.i(TAG, "onResp " + weatherEntity.getData().replace("\\", ""));
                    WeatherData weatherData = LoganSquare.parse(weatherEntity.getData().replace("\\", ""), WeatherData.class);
                    weatherEntity.setWeatherData(weatherData);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().getWeatherSuccess(weatherEntity);
            }

            @Override
            public void onError(String error) {
                getMvpView().getWeatherFail(error);
            }
        }, fields);
    }
}
