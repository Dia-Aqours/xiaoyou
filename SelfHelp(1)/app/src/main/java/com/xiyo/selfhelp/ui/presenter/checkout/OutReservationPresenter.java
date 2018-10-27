package com.xiyo.selfhelp.ui.presenter.checkout;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.EmptyRoom;
import com.xiyo.selfhelp.data.model.StatusResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.checkout.OutReservationMvpPresenter;
import com.xiyo.selfhelp.ui.view.checkout.OutReservationMvpView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class OutReservationPresenter<V extends OutReservationMvpView> extends BasePresenter<V> implements OutReservationMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public OutReservationPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void checkout(Map<String, String> fields) {
        getMvpView().showLoading();
        mDataManager.checkout(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                Log.i(TAG, "onResponse: data = " + data);
                if(data != null && !data.isEmpty() && !"null".equals(data)){
                    StatusResult statusResult = null;
                    try {
                        statusResult = LoganSquare.parse(data, StatusResult.class);
                        Log.i(TAG, "onResponse: " + statusResult.toString());
                    } catch (IOException e) {
                        Log.i(TAG, "onResponse: e = " + e.toString());
                        e.printStackTrace();
                    }
                    getMvpView().checkoutSuccess(statusResult);
                }else {
                    getMvpView().checkoutFail("系统错误，请稍后再试！");
                }
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                Log.i(TAG, "onError: " + error);
                getMvpView().checkoutFail(error);
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
