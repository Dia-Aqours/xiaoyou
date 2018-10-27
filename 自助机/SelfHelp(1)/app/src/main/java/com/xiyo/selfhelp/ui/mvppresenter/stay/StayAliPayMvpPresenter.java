package com.xiyo.selfhelp.ui.mvppresenter.stay;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.stay.StayAliPayMvpView;
import com.xiyo.selfhelp.ui.view.stay.StayWeiPayMvpView;

import java.util.Map;

public interface StayAliPayMvpPresenter<V extends StayAliPayMvpView> extends MvpPresenter<V> {
    void replenish(Map<String, String> fields);
    void login(Map<String, String> fields);
    void sendGuestInfo(Map<String, String> fields);
    void getHotelPayConfigInfo(Map<String, String> fields);
}
