package com.xiyo.selfhelp.ui.view.order;

import com.xiyo.selfhelp.data.model.StatusResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.order.OrderResult;
import com.xiyo.selfhelp.ui.base.MvpView;

public interface OrderReservationMvpView extends MvpView {
    void loginSuccess(Token token);
    void loginFail(String error);
    void checkDEFOrderRoomSuccess(OrderResult orderResult);
    void checkDEFOrderRoomFail(String error);
}
