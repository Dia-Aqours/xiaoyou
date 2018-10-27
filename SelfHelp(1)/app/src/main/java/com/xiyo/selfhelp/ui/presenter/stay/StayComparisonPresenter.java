package com.xiyo.selfhelp.ui.presenter.stay;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.CheckInOrder;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.stay.StayComparisonMvpPresenter;
import com.xiyo.selfhelp.ui.view.stay.StayComparisonMvpView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class StayComparisonPresenter<V extends StayComparisonMvpView> extends BasePresenter<V> implements StayComparisonMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public StayComparisonPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }


    @Override
    public void getCheckInOrder(Map<String, String> fields) {
        mDataManager.getCheckInOrder(new DataListener() {
            @Override
            public void onResponse(String data) {
                Log.i(TAG, "onResponse: " + data);
                List<CheckInOrder> checkInOrders = null;
                try {
                    checkInOrders = LoganSquare.parseList(data, CheckInOrder.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().getCheckInOrderSuccess(checkInOrders);
            }

            @Override
            public void onError(String error) {

                getMvpView().getCheckInOrderFail(error);
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
