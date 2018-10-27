package com.xiyo.selfhelp.ui.mvppresenter.order;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.checkout.OutReservationMvpView;
import com.xiyo.selfhelp.ui.view.order.OrderReservationMvpView;

import java.util.Map;

public interface OrderReservationMvpPresenter<V extends OrderReservationMvpView> extends MvpPresenter<V> {
    void checkDEFOrderRoom(Map<String, String> fields);
    void login(Map<String, String> fields);
}
