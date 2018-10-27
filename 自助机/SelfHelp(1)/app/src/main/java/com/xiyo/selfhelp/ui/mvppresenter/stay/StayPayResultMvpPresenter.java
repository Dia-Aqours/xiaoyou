package com.xiyo.selfhelp.ui.mvppresenter.stay;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.reservation.PayResultMvpView;
import com.xiyo.selfhelp.ui.view.stay.StayPayResultMvpView;

import java.util.Map;

public interface StayPayResultMvpPresenter<V extends StayPayResultMvpView> extends MvpPresenter<V> {
    void login(Map<String, String> fields);
    void getHotelQrced(Map<String, String> fields);
    void getHotelInfo(Map<String, String> fields);
}
