package com.xiyo.selfhelp.ui.presenter.stay;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.EmptyRoom;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.reservation.OrderInfoMvpPresenter;
import com.xiyo.selfhelp.ui.mvppresenter.stay.StayOrderInfoMvpPresenter;
import com.xiyo.selfhelp.ui.view.reservation.OrderInfoMvpView;
import com.xiyo.selfhelp.ui.view.stay.StayOrderInfoMvpView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class StayOrderInfoPresenter<V extends StayOrderInfoMvpView> extends BasePresenter<V> implements StayOrderInfoMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public StayOrderInfoPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void reservation(Map<String, String> fields) {
        getMvpView().showLoading();
        mDataManager.getEmptyRoom(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                Log.i(TAG, "onResponse: data = " + data);
                List<EmptyRoom> roomData = null;
                try {
                    roomData = LoganSquare.parseList(data, EmptyRoom.class);
                    Log.i(TAG, "onResponse: " + roomData.size());
                } catch (IOException e) {
                    Log.i(TAG, "onResponse: e = " + e.toString());
                    e.printStackTrace();
                }
                getMvpView().reservationSuccess(roomData.get(0));
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                Log.i(TAG, "onError: " + error);
                getMvpView().reservationFail(error);
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
