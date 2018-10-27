package com.xiyo.selfhelp.ui.mvppresenter.reservation;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.reservation.SelectMvpView;

import java.util.Map;

public interface SelectMvpPresenter<V extends SelectMvpView> extends MvpPresenter<V> {
    void getRoomType(Map<String, String> fields);
    void login(Map<String, String > fields);
}
