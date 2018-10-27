package com.xiyo.selfhelp.ui.mvppresenter.reservation;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.reservation.PayResultMvpView;

import java.util.Map;

public interface PayResultMvpPresenter<V extends PayResultMvpView> extends MvpPresenter<V> {
    void login(Map<String, String> fields);
    void getHotelQrced(Map<String, String> fields);
    void getHotelInfo(Map<String, String> fields);
}
