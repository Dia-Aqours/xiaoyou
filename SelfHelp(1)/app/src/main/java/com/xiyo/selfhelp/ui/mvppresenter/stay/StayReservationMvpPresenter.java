package com.xiyo.selfhelp.ui.mvppresenter.stay;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.reservation.ReservationMvpView;
import com.xiyo.selfhelp.ui.view.stay.StayReservationMvpView;

import java.util.Map;

public interface StayReservationMvpPresenter<V extends StayReservationMvpView> extends MvpPresenter<V> {
    void createReplenshOrder(Map<String, String> fields);
    void login(Map<String, String> fields);
}
