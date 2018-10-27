package com.xiyo.selfhelp.ui.mvppresenter.stay;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.stay.StayComparisonMvpView;

import java.util.Map;

public interface StayComparisonMvpPresenter<V extends StayComparisonMvpView> extends MvpPresenter<V> {
    void getCheckInOrder(Map<String, String> fields);
    void login(Map<String, String > fields);
}
