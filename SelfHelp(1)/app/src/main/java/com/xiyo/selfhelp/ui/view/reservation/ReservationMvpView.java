package com.xiyo.selfhelp.ui.view.reservation;

import com.xiyo.selfhelp.data.model.BannerResult;
import com.xiyo.selfhelp.data.model.EmptyRoom;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.MvpView;

public interface ReservationMvpView extends MvpView {
    void loginSuccess(Token token);
    void loginFail(String error);
    void reservationSuccess(EmptyRoom roomData);
    void reservationFail(String error);

    void showBanner(BannerResult bannerResult);

    void showBannerError(String error);
}
