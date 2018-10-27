package com.xiyo.selfhelp.ui.presenter.card;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.AuthenticaTokenModel;
import com.xiyo.selfhelp.data.model.CheckInOrder;
import com.xiyo.selfhelp.data.model.HotelInfo;
import com.xiyo.selfhelp.data.model.HotelQrced;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.card.CardComparisonMvpPresenter;
import com.xiyo.selfhelp.ui.mvppresenter.order.OrderComparisonMvpPresenter;
import com.xiyo.selfhelp.ui.view.card.CardComparisonMvpView;
import com.xiyo.selfhelp.ui.view.order.OrderComparisonMvpView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class CardComparisonPresenter<V extends CardComparisonMvpView> extends BasePresenter<V> implements CardComparisonMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public CardComparisonPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void getAuthenticaTokenList(Map<String, String> fields) {
        getMvpView().showLoading();
        mDataManager.getAuthenticaTokenList(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                Log.i(TAG, "onResponse: data = " + data);
                AuthenticaTokenModel authenticaTokenModel = null;
                try {
                    authenticaTokenModel = LoganSquare.parse(data, AuthenticaTokenModel.class);
                } catch (IOException e) {
                    Log.i(TAG, "onResponse: e = " + e.toString());
                    e.printStackTrace();
                }
                getMvpView().getAuthenticaTokenListSuccess(authenticaTokenModel);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                Log.i(TAG, "onError: " + error);
                getMvpView().getAuthenticaTokenListFail(error);
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
