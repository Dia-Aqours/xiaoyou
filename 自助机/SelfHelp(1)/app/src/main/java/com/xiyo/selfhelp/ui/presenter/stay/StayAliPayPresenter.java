package com.xiyo.selfhelp.ui.presenter.stay;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.PayConfig;
import com.xiyo.selfhelp.data.model.PoliceComparisonResult;
import com.xiyo.selfhelp.data.model.ReplenishResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.stay.StayAliPayMvpPresenter;
import com.xiyo.selfhelp.ui.mvppresenter.stay.StayWeiPayMvpPresenter;
import com.xiyo.selfhelp.ui.view.stay.StayAliPayMvpView;
import com.xiyo.selfhelp.ui.view.stay.StayWeiPayMvpView;

import java.io.IOException;
import java.util.Map;

import javax.inject.Inject;

public class StayAliPayPresenter<V extends StayAliPayMvpView> extends BasePresenter<V> implements StayAliPayMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public StayAliPayPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void replenish(Map<String, String> fields) {
        getMvpView().showLoading();
        mDataManager.replenish(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                Log.i(TAG, "onResponse: data = " + data);
                ReplenishResult replenishResult = null;
                try {
                    replenishResult = LoganSquare.parse(data, ReplenishResult.class);
                    Log.i(TAG, "onResponse: " + replenishResult);
                } catch (IOException e) {
                    Log.i(TAG, "onResponse: e = " + e.toString());
                    e.printStackTrace();
                }
                getMvpView().replenishSuccess(replenishResult);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                Log.i(TAG, "onError: " + error);
                getMvpView().replenishFail(error);
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

    public int getReplenishResult(String key){
        return mDataManager.getData(key);
    }

    public void setReplenishResult(String key, int value){
        mDataManager.putData(key, value);
    }
}
