package com.xiyo.selfhelp.ui.presenter.reservation;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.ReservationModel;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.WeatherData;
import com.xiyo.selfhelp.data.model.WeatherEntity;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.main.LaunchMvpPresenter;
import com.xiyo.selfhelp.ui.mvppresenter.reservation.SelectMvpPresenter;
import com.xiyo.selfhelp.ui.view.main.LaunchMvpView;
import com.xiyo.selfhelp.ui.view.reservation.SelectMvpView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class SelectPresenter<V extends SelectMvpView> extends BasePresenter<V> implements SelectMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public SelectPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void getRoomType(Map<String, String> fields) {

        getMvpView().showLoading();

        mDataManager.getRoomType(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                Log.i(TAG, "onResponse: data = " + data);
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
