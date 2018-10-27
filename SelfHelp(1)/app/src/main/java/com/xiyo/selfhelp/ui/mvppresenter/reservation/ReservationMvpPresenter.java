package com.xiyo.selfhelp.ui.mvppresenter.reservation;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.reservation.ReservationMvpView;
import com.xiyo.selfhelp.ui.view.reservation.SelectMvpView;

import java.util.Map;

public interface ReservationMvpPresenter<V extends ReservationMvpView> extends MvpPresenter<V> {
    void reservation(Map<String, String> fields);
    void login(Map<String, String > fields);
}
