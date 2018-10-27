package com.xiyo.selfhelp.ui.mvppresenter.order;

import com.xiyo.selfhelp.ui.base.MvpPresenter;
import com.xiyo.selfhelp.ui.view.order.OrderReComparisonMvpView;
import com.xiyo.selfhelp.ui.view.reservation.ReComparisonMvpView;

import java.util.Map;

public interface OrderReComparisonMvpPresenter<V extends OrderReComparisonMvpView> extends MvpPresenter<V> {
    void sendGuestInfo(Map<String, String> fields);
    void checkIn(Map<String, String> fields);
    void receiveFace(Map<String, String> fields);
    void getHotelPayConfigInfo(Map<String, String> fields);

    void createToken(Map<String, String> fields);
    void verifyIdentity(Map<String, String> fields);

    void unLockRoom(Map<String, String> fields);
    void login(Map<String, String> fields);

    void getHotelQrced(Map<String, String> fields);
    void getHotelInfo(Map<String, String> fields);
}
