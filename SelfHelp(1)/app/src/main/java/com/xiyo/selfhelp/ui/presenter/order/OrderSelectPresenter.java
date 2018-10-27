package com.xiyo.selfhelp.ui.presenter.order;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.ReservationModel;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.checkout.OutSelectMvpPresenter;
import com.xiyo.selfhelp.ui.mvppresenter.order.OrderSelectMvpPresenter;
import com.xiyo.selfhelp.ui.view.checkout.OutSelectMvpView;
import com.xiyo.selfhelp.ui.view.order.OrderSelectMvpView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class OrderSelectPresenter<V extends OrderSelectMvpView> extends BasePresenter<V> implements OrderSelectMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public OrderSelectPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void getRoomType(Map<String, String> fields) {

        getMvpView().showLoading();

        mDataManager.getRoomType(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
//                Log.i(TAG, "onResponse: data = " + data);
                List<ReservationModel> roomData = null;
                try {
                    roomData = LoganSquare.parseList(data, ReservationModel.class);
                } catch (IOException e) {
                    Log.i(TAG, "onResponse: e = " + e.toString());
                    e.printStackTrace();
                }
                getMvpView().showRoomType(roomData);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                Log.i(TAG, "onError: " + error);
                getMvpView().showRoomTypeError(error);
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
