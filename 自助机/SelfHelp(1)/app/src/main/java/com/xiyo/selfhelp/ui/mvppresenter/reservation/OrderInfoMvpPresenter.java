package com.xiyo.selfhelp.ui.mvppresenter.reservation;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.reservation.OrderInfoMvpView;
import com.xiyo.selfhelp.ui.view.reservation.ReservationMvpView;

import java.util.Map;

public interface OrderInfoMvpPresenter<V extends OrderInfoMvpView> extends MvpPresenter<V> {
    void createOrder(Map<String, String> fields);
    void login(Map<String, String> fields);
}
