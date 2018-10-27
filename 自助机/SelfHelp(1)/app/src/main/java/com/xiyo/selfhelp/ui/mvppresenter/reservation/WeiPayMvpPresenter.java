package com.xiyo.selfhelp.ui.mvppresenter.reservation;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.reservation.WeiPayMvpView;

import java.util.Map;

public interface WeiPayMvpPresenter<V extends WeiPayMvpView> extends MvpPresenter<V> {
    void checkIn(Map<String, String> fields);
    void login(Map<String, String> fields);
    void receiveFace(Map<String, String> fields);
    void sendGuestInfo(Map<String, String> fields);
    void getHotelPayConfigInfo(Map<String, String> fields);
}
