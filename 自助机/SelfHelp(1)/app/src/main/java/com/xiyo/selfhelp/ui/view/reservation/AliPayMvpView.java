package com.xiyo.selfhelp.ui.view.reservation;

import com.xiyo.selfhelp.data.model.CheckInResult;
import com.xiyo.selfhelp.data.model.EmptyRoom;
import com.xiyo.selfhelp.data.model.PayConfig;
import com.xiyo.selfhelp.data.model.PoliceComparisonResult;
import com.xiyo.selfhelp.data.model.ReceiveFaceResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.MvpView;

public interface AliPayMvpView extends MvpView {
    void loginSuccess(Token token);
    void loginFail(String error);

    void checkInSuccess(CheckInResult checkInResult);
    void checkInFail(String error);

    void receiveFaceSuccess(ReceiveFaceResult receiveFaceResult);
    void receiveFaceFail(String error);

    void sendGuestInfoSuccess(PoliceComparisonResult policeComparisonResult);
    void sendGuestInfoFail(String error);

    void getHotelPayConfigInfoSuccess(PayConfig payConfig);
    void getHotelPayConfigInfoFail(String error);
}
