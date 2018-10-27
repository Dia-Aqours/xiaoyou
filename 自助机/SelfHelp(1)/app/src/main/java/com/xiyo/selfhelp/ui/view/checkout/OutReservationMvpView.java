package com.xiyo.selfhelp.ui.view.checkout;

import com.xiyo.selfhelp.data.model.EmptyRoom;
import com.xiyo.selfhelp.data.model.StatusResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.MvpView;

public interface OutReservationMvpView extends MvpView {
    void loginSuccess(Token token);
    void loginFail(String error);
    void checkoutSuccess(StatusResult statusResult);
    void checkoutFail(String error);
}
