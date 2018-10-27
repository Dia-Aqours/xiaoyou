package com.xiyo.selfhelp.ui.view.reservation;

import com.xiyo.selfhelp.data.model.CheckInResult;
import com.xiyo.selfhelp.data.model.EmptyRoom;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.MvpView;

public interface OrderInfoMvpView extends MvpView {
    void loginSuccess(Token token);
    void loginFail(String error);
    void createOrderSuccess(CheckInResult checkInResult);
    void createOrderFail(String error);
}
