package com.xiyo.selfhelp.ui.mvppresenter.checkout;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.checkout.OutReservationMvpView;
import com.xiyo.selfhelp.ui.view.reservation.ReservationMvpView;

import java.util.Map;

public interface OutReservationMvpPresenter<V extends OutReservationMvpView> extends MvpPresenter<V> {
    void checkout(Map<String, String> fields);
    void login(Map<String, String> fields);
}
