package com.xiyo.selfhelp.ui.view.checkout;

import com.xiyo.selfhelp.data.model.CheckInOrder;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.MvpView;

import java.util.List;

public interface OutComparisonMvpView extends MvpView {
    void loginSuccess(Token token);
    void loginFail(String error);
    void getCheckInOrderSuccess(List<CheckInOrder> checkInOrders);
    void getCheckInOrderFail(String error);
}
