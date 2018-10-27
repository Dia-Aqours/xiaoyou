package com.xiyo.selfhelp.ui.view.stay;

import com.xiyo.selfhelp.data.model.EmptyRoom;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.MvpView;

public interface StayOrderInfoMvpView extends MvpView {
    void loginSuccess(Token token);
    void loginFail(String error);
    void reservationSuccess(EmptyRoom roomData);
    void reservationFail(String error);
}
