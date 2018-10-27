package com.xiyo.selfhelp.ui.presenter.stay;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.CheckInResult;
import com.xiyo.selfhelp.data.model.EmptyRoom;
import com.xiyo.selfhelp.data.model.ReplenishResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.reservation.ReservationMvpPresenter;
import com.xiyo.selfhelp.ui.mvppresenter.stay.StayReservationMvpPresenter;
import com.xiyo.selfhelp.ui.view.reservation.ReservationMvpView;
import com.xiyo.selfhelp.ui.view.stay.StayReservationMvpView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class StayReservationPresenter<V extends StayReservationMvpView> extends BasePresenter<V> implements StayReservationMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public StayReservationPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void createReplenshOrder(Map<String, String> fields) {
        getMvpView().showLoading();
        mDataManager.createReplenshOrder(new DataListener() {
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
                getMvpView().createReplenshOrderSuccess(checkInResult);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                Log.i(TAG, "onError: " + error);
                getMvpView().createReplenshOrderFail(error);
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
