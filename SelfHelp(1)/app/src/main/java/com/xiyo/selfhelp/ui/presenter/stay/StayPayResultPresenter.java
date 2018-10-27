package com.xiyo.selfhelp.ui.presenter.stay;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.HotelInfo;
import com.xiyo.selfhelp.data.model.HotelQrced;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.stay.StayPayResultMvpPresenter;
import com.xiyo.selfhelp.ui.view.stay.StayPayResultMvpView;

import java.io.IOException;
import java.util.Map;

import javax.inject.Inject;

public class StayPayResultPresenter<V extends StayPayResultMvpView> extends BasePresenter<V> implements StayPayResultMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public StayPayResultPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
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
    public void getHotelQrced(Map<String, String> fields) {
        getMvpView().showLoading();
        mDataManager.getHotelPayConfigInfo(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                Log.i(TAG, "onResponse: data = " + data);
                HotelQrced hotelQrced = null;
                try {
                    hotelQrced = LoganSquare.parse(data, HotelQrced.class);
                } catch (IOException e) {
                    Log.i(TAG, "onResponse: e = " + e.toString());
                    e.printStackTrace();
                }
                getMvpView().getHotelQrcedSuccess(hotelQrced);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                Log.i(TAG, "onError: " + error);
                getMvpView().getHotelQrcedFail(error);
            }
        }, fields);
    }

    @Override
    public void getHotelInfo(Map<String, String> fields) {
        getMvpView().showLoading();
        mDataManager.getHotelInfo(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                Log.i(TAG, "onResponse: data = " + data);
                HotelInfo hotelInfo = null;
                try {
                    hotelInfo = LoganSquare.parse(data, HotelInfo.class);
                } catch (IOException e) {
                    Log.i(TAG, "onResponse: e = " + e.toString());
                    e.printStackTrace();
                }
                getMvpView().getHotelInfoSuccess(hotelInfo);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                Log.i(TAG, "onError: " + error);
                getMvpView().getHotelInfoFail(error);
            }
        }, fields);
    }
}
