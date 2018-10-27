package com.xiyo.selfhelp.ui.presenter.order;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.StatusResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.order.OrderResult;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.checkout.OutReservationMvpPresenter;
import com.xiyo.selfhelp.ui.mvppresenter.order.OrderReservationMvpPresenter;
import com.xiyo.selfhelp.ui.view.checkout.OutReservationMvpView;
import com.xiyo.selfhelp.ui.view.order.OrderReservationMvpView;

import java.io.IOException;
import java.util.Map;

import javax.inject.Inject;

public class OrderReservationPresenter<V extends OrderReservationMvpView> extends BasePresenter<V> implements OrderReservationMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public OrderReservationPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void checkDEFOrderRoom(Map<String, String> fields) {
        getMvpView().showLoading();
        mDataManager.checkDEFOrderRoom(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                Log.i(TAG, "onResponse: data = " + data);
                OrderResult orderResult = null;
                try {
                    orderResult = LoganSquare.parse(data, OrderResult.class);
                    Log.i(TAG, "onResponse: " + orderResult.toString());
                } catch (IOException e) {
                    Log.i(TAG, "onResponse: e = " + e.toString());
                    e.printStackTrace();
                }
                getMvpView().checkDEFOrderRoomSuccess(orderResult);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                Log.i(TAG, "onError: " + error);
                getMvpView().checkDEFOrderRoomFail(error);
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
