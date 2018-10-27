package com.xiyo.selfhelp.ui.view.order;

import com.xiyo.selfhelp.data.model.AuthenticaTokenModel;
import com.xiyo.selfhelp.data.model.CheckInResult;
import com.xiyo.selfhelp.data.model.HotelInfo;
import com.xiyo.selfhelp.data.model.PayConfig;
import com.xiyo.selfhelp.data.model.PoliceComparisonResult;
import com.xiyo.selfhelp.data.model.ReceiveFaceResult;
import com.xiyo.selfhelp.data.model.StatusResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.TokenResult;
import com.xiyo.selfhelp.data.model.VerifyIdentityResult;
import com.xiyo.selfhelp.ui.base.MvpView;

public interface OrderReComparisonMvpView extends MvpView {
    void createTokenSuccess(TokenResult tokenResult);
    void createTokenFail(String error);

    void verifyIdentitySuccess(VerifyIdentityResult verifyIdentityResult);
    void verifyIdentityFail(String error);

    void receiveFaceSuccess(ReceiveFaceResult receiveFaceResult);
    void receiveFaceFail(String error);

    void sendGuestInfoSuccess(PoliceComparisonResult policeComparisonResult);
    void sendGuestInfoFail(String error);

    void getHotelPayConfigInfoSuccess(PayConfig payConfig);
    void getHotelPayConfigInfoFail(String error);

    void checkInSuccess(CheckInResult checkInResult);
    void checkInFail(String error);

    void unLockRoom(StatusResult statusResult);
    void unLockRoomFail(String error);

    void loginSuccess(Token token);
    void loginFail(String error);

    void getHotelInfoSuccess(HotelInfo info);
    void getHotelInfoFail(String error);

    void getHotelQrcedSuccess(AuthenticaTokenModel authenticaTokenModel);
    void getHotelQrcedFail(String error);


}
