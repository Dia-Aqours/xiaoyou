package com.xiyo.selfhelp.ui.view.stay;

import com.xiyo.selfhelp.data.model.HotelInfo;
import com.xiyo.selfhelp.data.model.HotelQrced;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.MvpView;

public interface StayPayResultMvpView extends MvpView {
    void loginSuccess(Token token);
    void loginFail(String error);

    void getHotelInfoSuccess(HotelInfo info);
    void getHotelInfoFail(String error);

    void getHotelQrcedSuccess(HotelQrced hotelQrced);
    void getHotelQrcedFail(String error);
}
