package com.xiyo.selfhelp.ui.mvppresenter.order;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.order.OrderComparisonMvpView;
import com.xiyo.selfhelp.ui.view.order.OrderReComparisonMvpView;

import java.util.Map;

public interface OrderComparisonMvpPresenter<V extends OrderComparisonMvpView> extends MvpPresenter<V> {
    void getOrderByCertNo(Map<String, String> fields);
    void getNewRoomTypeInfo(Map<String, String> fields);
    void login(Map<String, String> fields);
}
