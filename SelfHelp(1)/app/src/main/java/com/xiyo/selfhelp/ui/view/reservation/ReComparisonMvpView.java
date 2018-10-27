package com.xiyo.selfhelp.ui.view.reservation;

import com.xiyo.selfhelp.data.model.PoliceComparisonResult;
import com.xiyo.selfhelp.data.model.StatusResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.TokenResult;
import com.xiyo.selfhelp.data.model.VerifyIdentityResult;
import com.xiyo.selfhelp.ui.base.MvpView;

public interface ReComparisonMvpView extends MvpView {
    void sendGuestInfoSuccess(PoliceComparisonResult policeComparisonResult);
    void sendGuestInfoFail(String error);

    void createTokenSuccess(TokenResult tokenResult);
    void createTokenFail(String error);

    void verifyIdentitySuccess(VerifyIdentityResult verifyIdentityResult);
    void verifyIdentityFail(String error);

    void unLockRoom(StatusResult statusResult);
    void unLockRoomFail(String error);

    void loginSuccess(Token token);
    void loginFail(String error);
}
