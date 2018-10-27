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

package com.xiyo.selfhelp.ui.view.main;

import com.xiyo.selfhelp.data.model.BannerData;
import com.xiyo.selfhelp.data.model.BannerResult;
import com.xiyo.selfhelp.data.model.HotelInfo;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.WeatherEntity;
import com.xiyo.selfhelp.ui.base.MvpView;

import java.util.List;

/**
 * Created by amitshekhar on 13/01/17.
 */

public interface LaunchMvpView extends MvpView {

    void showData(String data);

    void showBanner(BannerResult bannerResult);

    void showBannerError(String error);

    void loginSuccess(Token token);

    void loginFail(String error);

    void getHotelInfoSuccess(HotelInfo info);

    void getHotelInfoFail(String error);

    void getWeatherSuccess(WeatherEntity weatherEntity);

    void getWeatherFail(String error);
}
