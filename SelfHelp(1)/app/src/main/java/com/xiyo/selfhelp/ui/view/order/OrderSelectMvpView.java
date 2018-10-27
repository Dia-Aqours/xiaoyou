package com.xiyo.selfhelp.ui.view.order;

import com.xiyo.selfhelp.data.model.ReservationModel;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.MvpView;

import java.util.List;

public interface OrderSelectMvpView extends MvpView {
    void loginSuccess(Token token);
    void loginFail(String error);
    void showRoomType(List<ReservationModel> roomData);
    void showRoomTypeError(String error);
}
