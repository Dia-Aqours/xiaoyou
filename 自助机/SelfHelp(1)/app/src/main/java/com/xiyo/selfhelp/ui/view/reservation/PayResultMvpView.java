package com.xiyo.selfhelp.ui.view.reservation;

import com.xiyo.selfhelp.data.model.AuthenticaTokenModel;
import com.xiyo.selfhelp.data.model.HotelInfo;
import com.xiyo.selfhelp.data.model.HotelQrced;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.MvpView;

import java.util.List;

public interface PayResultMvpView extends MvpView {
    void loginSuccess(Token token);
    void loginFail(String error);

    void getHotelInfoSuccess(HotelInfo info);
    void getHotelInfoFail(String error);

    void getHotelQrcedSuccess(AuthenticaTokenModel authenticaTokenModel);
    void getHotelQrcedFail(String error);
}
