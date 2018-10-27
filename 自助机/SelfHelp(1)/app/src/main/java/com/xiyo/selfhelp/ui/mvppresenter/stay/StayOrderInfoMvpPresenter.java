package com.xiyo.selfhelp.ui.mvppresenter.stay;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.reservation.OrderInfoMvpView;
import com.xiyo.selfhelp.ui.view.stay.StayOrderInfoMvpView;

import java.util.Map;

public interface StayOrderInfoMvpPresenter<V extends StayOrderInfoMvpView> extends MvpPresenter<V> {
    void reservation(Map<String, String> fields);
    void login(Map<String, String> fields);
}
