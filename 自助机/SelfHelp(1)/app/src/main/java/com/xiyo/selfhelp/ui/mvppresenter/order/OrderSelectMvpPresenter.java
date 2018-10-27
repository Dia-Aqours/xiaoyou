package com.xiyo.selfhelp.ui.mvppresenter.order;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.checkout.OutSelectMvpView;
import com.xiyo.selfhelp.ui.view.order.OrderSelectMvpView;

import java.util.Map;

public interface OrderSelectMvpPresenter<V extends OrderSelectMvpView> extends MvpPresenter<V> {
    void getRoomType(Map<String, String> fields);
    void login(Map<String, String> fields);
}
