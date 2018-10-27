package com.xiyo.selfhelp.ui.mvppresenter.checkout;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.checkout.OutComparisonMvpView;
import com.xiyo.selfhelp.ui.view.stay.StayComparisonMvpView;

import java.util.Map;

public interface OutComparisonMvpPresenter<V extends OutComparisonMvpView> extends MvpPresenter<V> {
    void getCheckInOrder(Map<String, String> fields);
    void login(Map<String, String> fields);
}
