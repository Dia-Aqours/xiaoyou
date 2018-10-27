package com.xiyo.selfhelp.ui.mvppresenter.checkout;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.checkout.OutSelectMvpView;
import com.xiyo.selfhelp.ui.view.reservation.SelectMvpView;

import java.util.Map;

public interface OutSelectMvpPresenter<V extends OutSelectMvpView> extends MvpPresenter<V> {
    void getRoomType(Map<String, String> fields);
    void login(Map<String, String> fields);
}
