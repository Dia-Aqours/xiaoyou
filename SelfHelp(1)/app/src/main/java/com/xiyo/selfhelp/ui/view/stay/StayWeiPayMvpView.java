package com.xiyo.selfhelp.ui.view.stay;

import com.xiyo.selfhelp.data.model.CheckInResult;
import com.xiyo.selfhelp.data.model.PayConfig;
import com.xiyo.selfhelp.data.model.PoliceComparisonResult;
import com.xiyo.selfhelp.data.model.ReceiveFaceResult;
import com.xiyo.selfhelp.data.model.ReplenishResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.MvpView;

public interface StayWeiPayMvpView extends MvpView {
    void loginSuccess(Token token);
    void loginFail(String error);

    void replenishSuccess(ReplenishResult replenishResult);
    void replenishFail(String error);

    void sendGuestInfoSuccess(PoliceComparisonResult policeComparisonResult);
    void sendGuestInfoFail(String error);

    void getHotelPayConfigInfoSuccess(PayConfig payConfig);
    void getHotelPayConfigInfoFail(String error);
}
