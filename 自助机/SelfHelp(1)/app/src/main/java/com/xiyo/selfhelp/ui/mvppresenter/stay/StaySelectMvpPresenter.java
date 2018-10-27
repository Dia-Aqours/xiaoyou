package com.xiyo.selfhelp.ui.mvppresenter.stay;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.checkout.OutSelectMvpView;
import com.xiyo.selfhelp.ui.view.reservation.SelectMvpView;
import com.xiyo.selfhelp.ui.view.stay.StaySelectMvpView;

import java.util.Map;

public interface StaySelectMvpPresenter<V extends StaySelectMvpView> extends MvpPresenter<V> {
    void getRoomType(Map<String, String> fields);
    void login(Map<String, String> fields);
}
