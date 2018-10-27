package com.xiyo.selfhelp.ui.mvppresenter.card;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.card.CardComparisonMvpView;
import com.xiyo.selfhelp.ui.view.order.OrderComparisonMvpView;

import java.util.Map;

public interface CardComparisonMvpPresenter<V extends CardComparisonMvpView> extends MvpPresenter<V> {
    void getAuthenticaTokenList(Map<String, String> fields);
    void getHotelInfo(Map<String, String> fields);
    void login(Map<String, String> fields);
}
