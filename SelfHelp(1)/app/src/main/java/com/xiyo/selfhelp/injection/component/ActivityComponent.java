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

package com.xiyo.selfhelp.injection.component;

import com.xiyo.selfhelp.injection.annotation.PerActivity;
import com.xiyo.selfhelp.injection.module.ActivityModule;
import com.xiyo.selfhelp.ui.activity.card.CardComparisonActivity;
import com.xiyo.selfhelp.ui.activity.card.CardNoRoomActivity;
import com.xiyo.selfhelp.ui.activity.card.CardQrcedActivity;
import com.xiyo.selfhelp.ui.activity.checkout.OutComparisonActivity;
import com.xiyo.selfhelp.ui.activity.checkout.OutNoRoomActivity;
import com.xiyo.selfhelp.ui.activity.checkout.OutPayResultActivity;
import com.xiyo.selfhelp.ui.activity.checkout.OutReservationActivity;
import com.xiyo.selfhelp.ui.activity.checkout.OutSelectActivity;
import com.xiyo.selfhelp.ui.activity.comparsion.ComparisonActivity;
import com.xiyo.selfhelp.ui.activity.main.LaunchActivity;
import com.xiyo.selfhelp.ui.activity.MainActivity;
import com.xiyo.selfhelp.ui.activity.order.OrderComparisonActivity;
import com.xiyo.selfhelp.ui.activity.order.OrderNoRoomActivity;
import com.xiyo.selfhelp.ui.activity.order.OrderPayResultActivity;
import com.xiyo.selfhelp.ui.activity.order.OrderReComparisonActivity;
import com.xiyo.selfhelp.ui.activity.order.OrderReservationActivity;
import com.xiyo.selfhelp.ui.activity.order.OrderSelectActivity;
import com.xiyo.selfhelp.ui.activity.reservation.AliPayActivity;
import com.xiyo.selfhelp.ui.activity.reservation.OrderInfoActivity;
import com.xiyo.selfhelp.ui.activity.reservation.PayResultActivity;
import com.xiyo.selfhelp.ui.activity.reservation.ReComparisonActivity;
import com.xiyo.selfhelp.ui.activity.reservation.ReservationActivity;
import com.xiyo.selfhelp.ui.activity.reservation.ReservationResultActivity;
import com.xiyo.selfhelp.ui.activity.reservation.SelectActivity;
import com.xiyo.selfhelp.ui.activity.reservation.WeiPayActivity;
import com.xiyo.selfhelp.ui.activity.settings.BaseSettingsActivity;
import com.xiyo.selfhelp.ui.activity.settings.SettingsActivity;
import com.xiyo.selfhelp.ui.activity.stayin.StayAliPayActivity;
import com.xiyo.selfhelp.ui.activity.stayin.StayComparisonActivity;
import com.xiyo.selfhelp.ui.activity.stayin.StayNoRoomActivity;
import com.xiyo.selfhelp.ui.activity.stayin.StayOrderInfoActivity;
import com.xiyo.selfhelp.ui.activity.stayin.StayPayResultActivity;
import com.xiyo.selfhelp.ui.activity.stayin.StayReservationActivity;
import com.xiyo.selfhelp.ui.activity.stayin.StaySelectActivity;
import com.xiyo.selfhelp.ui.activity.stayin.StayWeiPayActivity;

import dagger.Component;

/**
 * Created by amitshekhar on 13/01/17.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    void inject(LaunchActivity launchActivity);

    //订单入住
    void inject(SelectActivity selectActivity);

    void inject(ReservationActivity reservationActivity);

    void inject(ReservationResultActivity reservationResultActivity);

    void inject(ReComparisonActivity reComparisonActivity);

    void inject(OrderInfoActivity orderInfoActivity);

    void inject(AliPayActivity aliPayActivity);

    void inject(WeiPayActivity weiPayActivity);

    void inject(PayResultActivity payResultActivity);

    //续住
    void inject(StayComparisonActivity stayComparisonActivity);

    void inject(StayNoRoomActivity stayNoRoomActivity);

    void inject(StaySelectActivity staySelectActivity);

    void inject(StayReservationActivity stayReservationActivity);

    void inject(StayOrderInfoActivity stayOrderInfoActivity);

    void inject(StayWeiPayActivity stayWeiPayActivity);

    void inject(StayAliPayActivity stayAliPayActivity);

    void inject(StayPayResultActivity stayPayResultActivity);

    //退房
    void inject(OutComparisonActivity outComparisonActivity);

    void inject(OutNoRoomActivity outNoRoomActivity);

    void inject(OutSelectActivity outSelectActivity);

    void inject(OutReservationActivity outReservationActivity);

    void inject(OutPayResultActivity outPayResultActivity);

    //订单
    void inject(OrderComparisonActivity orderComparisonActivity);

    void inject(OrderNoRoomActivity orderNoRoomActivity);

    void inject(OrderReservationActivity orderReservationActivity);

    void inject(OrderSelectActivity orderSelectActivity);

    void inject(OrderReComparisonActivity orderReComparisonActivity);

    void inject(OrderPayResultActivity orderPayResultActivity);

    //房卡
    void inject(CardComparisonActivity cardComparisonActivity);

    void inject(CardQrcedActivity cardQrcedActivity);

    void inject(CardNoRoomActivity cardNoRoomActivity);

    //人证比对
    void inject(ComparisonActivity comparisonActivity);

    //设置
    void inject(SettingsActivity settingsActivity);

    void inject(BaseSettingsActivity baseSettingsActivity);

}
