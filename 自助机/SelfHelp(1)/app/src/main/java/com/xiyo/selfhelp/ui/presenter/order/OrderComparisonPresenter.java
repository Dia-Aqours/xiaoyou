package com.xiyo.selfhelp.ui.presenter.order;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.CheckInOrder;
import com.xiyo.selfhelp.data.model.ReservationModel;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.order.OrderComparisonMvpPresenter;
import com.xiyo.selfhelp.ui.view.order.OrderComparisonMvpView;
import com.xiyo.selfhelp.ui.view.order.OrderReComparisonMvpView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class OrderComparisonPresenter<V extends OrderComparisonMvpView> extends BasePresenter<V> implements OrderComparisonMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public OrderComparisonPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }


    @Override
    public void getOrderByCertNo(Map<String, String> fields) {
        getMvpView().showLoading();
        mDataManager.getOrderByCertNo(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                Log.i(TAG, "onResponse: " + data);
                List<CheckInOrder> checkInOrders = null;
                try {
                    checkInOrders = LoganSquare.parseList(data, CheckInOrder.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().getOrderByCertNoSuccess(checkInOrders);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                getMvpView().getOrderByCertNoFail(error);
            }
        }, fields);
    }

    @Override
    public void getNewRoomTypeInfo(Map<String, String> fields) {

        getMvpView().showLoading();

        mDataManager.getRoomType(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                Log.i(TAG, "onResponse: data = " + data);
                List<ReservationModel> roomData = null;
                try {
                    roomData = LoganSquare.parseList(data, ReservationModel.class);
                } catch (IOException e) {
                    Log.i(TAG, "onResponse: e = " + e.toString());
                    e.printStackTrace();
                }
                getMvpView().getNewRoomTypeInfoSuccess(roomData);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                Log.i(TAG, "onError: " + error);
                getMvpView().getNewRoomTypeInfoFail(error);
            }
        }, fields);
    }

    @Override
    public void login(Map<String, String > fields) {
        mDataManager.login(new DataListener() {
            @Override
            public void onResponse(String data) {
//                getMvpView().hideLoading();
                Token token = null;
                try {
                    token = LoganSquare.parse(data, Token.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().loginSuccess(token);
            }

            @Override
            public void onError(String error) {
                getMvpView().loginFail(error);
            }
        }, fields);
    }

}
