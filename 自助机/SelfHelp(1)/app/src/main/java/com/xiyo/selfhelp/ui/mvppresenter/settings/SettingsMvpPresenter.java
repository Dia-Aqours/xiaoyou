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

package com.xiyo.selfhelp.ui.mvppresenter.settings;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.main.LaunchMvpView;
import com.xiyo.selfhelp.ui.view.settings.SettingsMvpView;

import java.util.Map;

/**
 * Created by amitshekhar on 13/01/17.
 */

public interface SettingsMvpPresenter<V extends SettingsMvpView> extends MvpPresenter<V> {

    void login(Map<String, String> fields);

    void getVersion(Map<String, String> fields);

    void update(Map<String, String> fields);

    void sendSMS(Map<String, String> fields);
}
