package com.xiyo.selfhelp.ui.mvppresenter.reservation;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.reservation.ReComparisonMvpView;
import com.xiyo.selfhelp.ui.view.reservation.SelectMvpView;

import java.util.Map;

public interface ReComparisonMvpPresenter<V extends ReComparisonMvpView> extends MvpPresenter<V> {
    void sendGuestInfo(Map<String, String> fields);
    void unLockRoom(Map<String, String> fields);
    void verifyIdentity(Map<String, String> fields);
    void createToken(Map<String, String> fields);

    void login(Map<String, String> fields);
}
