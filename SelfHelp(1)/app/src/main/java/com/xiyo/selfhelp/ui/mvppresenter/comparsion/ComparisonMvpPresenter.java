package com.xiyo.selfhelp.ui.mvppresenter.comparsion;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.comparsion.ComparisonMvpView;
import com.xiyo.selfhelp.ui.view.reservation.ReComparisonMvpView;

import java.util.Map;

public interface ComparisonMvpPresenter<V extends ComparisonMvpView> extends MvpPresenter<V> {
    void verifyIdentity(Map<String, String> fields);
    void createToken(Map<String, String> fields);

    void login(Map<String, String> fields);
}
