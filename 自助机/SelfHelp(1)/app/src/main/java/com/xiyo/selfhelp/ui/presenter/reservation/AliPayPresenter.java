package com.xiyo.selfhelp.ui.presenter.reservation;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.CheckInResult;
import com.xiyo.selfhelp.data.model.EmptyRoom;
import com.xiyo.selfhelp.data.model.PayConfig;
import com.xiyo.selfhelp.data.model.PoliceComparisonResult;
import com.xiyo.selfhelp.data.model.ReceiveFaceResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.reservation.AliPayMvpPresenter;
import com.xiyo.selfhelp.ui.view.reservation.AliPayMvpView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class AliPayPresenter<V extends AliPayMvpView> extends BasePresenter<V> implements AliPayMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public AliPayPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void checkIn(Map<String, String> fields) {
        getMvpView().showLoading();
        mDataManager.CheckIn(new DataListener() {
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
                getMvpView().checkInSuccess(checkInResult);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                Log.i(TAG, "onError: " + error);
                getMvpView().checkInFail(error);
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

    @Override
    public void receiveFace(Map<String, String> fields) {
        mDataManager.receiveFace(new DataListener() {
            @Override
            public void onResponse(String data) {
//                getMvpView().hideLoading();
                ReceiveFaceResult receiveFaceResult = null;
                try {
                    receiveFaceResult = LoganSquare.parse(data, ReceiveFaceResult.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().receiveFaceSuccess(receiveFaceResult);
            }

            @Override
            public void onError(String error) {
                getMvpView().receiveFaceFail(error);
            }
        }, fields);
    }

    @Override
    public void sendGuestInfo(Map<String, String> fields) {
        getMvpView().showLoading();
        mDataManager.sendGuestInfo(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                Log.i(TAG, "onResponse: " + data);
                PoliceComparisonResult policeComparisonResult = null;
                try {
                    policeComparisonResult = LoganSquare.parse(data, PoliceComparisonResult.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().sendGuestInfoSuccess(policeComparisonResult);
            }

            @Override
            public void onError(String error) {
                Log.i(TAG, "onError: " + error);
                getMvpView().sendGuestInfoFail(error);
            }
        }, fields);
    }

    @Override
    public void getHotelPayConfigInfo(Map<String, String> fields) {
        getMvpView().showLoading();
        mDataManager.getHotelPayConfigInfo(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                Log.i(TAG, "onResponse: " + data);
                PayConfig payConfig = null;
                try {
                    payConfig = LoganSquare.parse(data, PayConfig.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().getHotelPayConfigInfoSuccess(payConfig);
            }

            @Override
            public void onError(String error) {
                Log.i(TAG, "onError: " + error);
                getMvpView().getHotelPayConfigInfoFail(error);
            }
        }, fields);
    }
}
