package com.xiyo.selfhelp.ui.view.order;

import com.xiyo.selfhelp.data.model.CheckInOrder;
import com.xiyo.selfhelp.data.model.ReservationModel;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.MvpView;

import java.util.List;

public interface OrderComparisonMvpView extends MvpView {
    void loginSuccess(Token token);
    void loginFail(String error);
    void getNewRoomTypeInfoSuccess(List<ReservationModel> roomData);
    void getNewRoomTypeInfoFail(String error);
    void getOrderByCertNoSuccess(List<CheckInOrder> checkInOrders);
    void getOrderByCertNoFail(String error);
}
