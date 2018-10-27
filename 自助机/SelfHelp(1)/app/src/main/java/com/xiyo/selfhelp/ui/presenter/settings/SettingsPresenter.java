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

package com.xiyo.selfhelp.ui.presenter.settings;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.BannerResult;
import com.xiyo.selfhelp.data.model.HotelInfo;
import com.xiyo.selfhelp.data.model.StatusResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.VersionResult;
import com.xiyo.selfhelp.data.model.WeatherData;
import com.xiyo.selfhelp.data.model.WeatherEntity;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.main.LaunchMvpPresenter;
import com.xiyo.selfhelp.ui.mvppresenter.settings.SettingsMvpPresenter;
import com.xiyo.selfhelp.ui.view.main.LaunchMvpView;
import com.xiyo.selfhelp.ui.view.settings.SettingsMvpView;

import java.io.IOException;
import java.util.Map;

import javax.inject.Inject;

/**
 * Created by amitshekhar on 13/01/17.
 */

public class SettingsPresenter<V extends SettingsMvpView> extends BasePresenter<V> implements SettingsMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public SettingsPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
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
    public void getVersion(Map<String, String> fields) {
        getMvpView().showLoading();
        mDataManager.checkAndroidAppVersion(new DataListener() {
            @Override
            public void onResponse(String data) {
                Log.i(TAG, "checkAndroidAppVersion: data = " + data);
                getMvpView().hideLoading();
                VersionResult versionResult = null;
                try {
                    versionResult = LoganSquare.parse(data, VersionResult.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().getVersionSuccess(versionResult);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                getMvpView().getVersionFail(error);
            }
        }, fields);
    }

    @Override
    public void update(Map<String, String> fields) {
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
//                getMvpView().updateSuccess(hotelInfo);
            }

            @Override
            public void onError(String error) {
                getMvpView().updateFail(error);
            }
        }, fields);
    }

    @Override
    public void sendSMS(Map<String, String> fields) {
        getMvpView().showLoading();
        mDataManager.sendVerificationCode(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                StatusResult statusResult = null;
                try {
                    statusResult = LoganSquare.parse(data, StatusResult.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().sendSMSSuccess(statusResult);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                getMvpView().sendSMSFail(error);
            }
        }, fields);

    }


}
