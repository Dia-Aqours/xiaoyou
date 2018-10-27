package com.xiyo.selfhelp.ui.view.stay;

import com.xiyo.selfhelp.data.model.CheckInResult;
import com.xiyo.selfhelp.data.model.EmptyRoom;
import com.xiyo.selfhelp.data.model.ReplenishResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.MvpView;

public interface StayReservationMvpView extends MvpView {
    void loginSuccess(Token token);
    void loginFail(String error);
    void createReplenshOrderSuccess(CheckInResult checkInResult);
    void createReplenshOrderFail(String error);
}
