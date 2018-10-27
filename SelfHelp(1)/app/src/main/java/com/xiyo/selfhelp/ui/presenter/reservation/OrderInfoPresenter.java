package com.xiyo.selfhelp.ui.presenter.reservation;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.CheckInResult;
import com.xiyo.selfhelp.data.model.EmptyRoom;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.reservation.OrderInfoMvpPresenter;
import com.xiyo.selfhelp.ui.mvppresenter.reservation.ReservationMvpPresenter;
import com.xiyo.selfhelp.ui.view.reservation.OrderInfoMvpView;
import com.xiyo.selfhelp.ui.view.reservation.ReservationMvpView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class OrderInfoPresenter<V extends OrderInfoMvpView> extends BasePresenter<V> implements OrderInfoMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public OrderInfoPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void createOrder(Map<String, String> fields) {
        getMvpView().showLoading();
        mDataManager.createOrder(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                Log.i(TAG, "onResponse: data = " + data);
                CheckInResult checkInResult = null;
                try {
                    checkInResult = LoganSquare.parse(data, CheckInResult.class);
                    Log.i(TAG, "onResponse: " + checkInResult);
                } catch (IOException e) {
                    Log.i(TAG, "onResponse: e = " + e.toString());
                    e.printStackTrace();
                }
                getMvpView().createOrderSuccess(checkInResult);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                Log.i(TAG, "onError: " + error);
                getMvpView().createOrderFail(error);
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
