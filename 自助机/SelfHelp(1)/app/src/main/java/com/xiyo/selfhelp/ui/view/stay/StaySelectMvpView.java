package com.xiyo.selfhelp.ui.view.stay;

import com.xiyo.selfhelp.data.model.ReservationModel;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.MvpView;

import java.util.List;

public interface StaySelectMvpView extends MvpView {
    void loginSuccess(Token token);
    void loginFail(String error);
    void showRoomType(List<ReservationModel> roomData);
    void showRoomTypeError(String error);
}
