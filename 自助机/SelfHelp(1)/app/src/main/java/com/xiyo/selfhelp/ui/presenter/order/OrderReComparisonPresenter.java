package com.xiyo.selfhelp.ui.presenter.order;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.AuthenticaTokenModel;
import com.xiyo.selfhelp.data.model.CheckInResult;
import com.xiyo.selfhelp.data.model.HotelInfo;
import com.xiyo.selfhelp.data.model.PayConfig;
import com.xiyo.selfhelp.data.model.PoliceComparisonResult;
import com.xiyo.selfhelp.data.model.ReceiveFaceResult;
import com.xiyo.selfhelp.data.model.StatusResult;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.data.model.TokenResult;
import com.xiyo.selfhelp.data.model.VerifyIdentityResult;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.order.OrderReComparisonMvpPresenter;
import com.xiyo.selfhelp.ui.mvppresenter.reservation.ReComparisonMvpPresenter;
import com.xiyo.selfhelp.ui.view.order.OrderReComparisonMvpView;
import com.xiyo.selfhelp.ui.view.reservation.ReComparisonMvpView;

import java.io.IOException;
import java.util.Map;

import javax.inject.Inject;

public class OrderReComparisonPresenter<V extends OrderReComparisonMvpView> extends BasePresenter<V> implements OrderReComparisonMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public OrderReComparisonPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void sendGuestInfo(Map<String, String> fields) {
//        getMvpView().showLoading();
        mDataManager.sendGuestInfo(new DataListener() {
            @Override
            public void onResponse(String data) {
//                getMvpView().hideLoading();
                Log.i(TAG, "onResponse: " + data);
                PoliceComparisonResult unLockRoom = null;
                try {
                    unLockRoom = LoganSquare.parse(data, PoliceComparisonResult.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().sendGuestInfoSuccess(unLockRoom);
            }

            @Override
            public void onError(String error) {
                Log.i(TAG, "onError: " + error);
                getMvpView().sendGuestInfoFail(error);
            }
        }, fields);
    }

    @Override
    public void unLockRoom(Map<String, String> fields) {
        mDataManager.unLockRoom(new DataListener() {
            @Override
            public void onResponse(String data) {
//                getMvpView().hideLoading();`
                Log.i(TAG, "onResponse: " + data);
                StatusResult statusResult = null;
                try {
                    statusResult = LoganSquare.parse(data, StatusResult.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().unLockRoom(statusResult);
            }

            @Override
            public void onError(String error) {
                getMvpView().unLockRoomFail(error);
            }
        }, fields);
    }

    @Override
    public void checkIn(Map<String, String> fields) {
//        getMvpView().showLoading();
        mDataManager.CheckIn(new DataListener() {
            @Override
            public void onResponse(String data) {
//                getMvpView().hideLoading();
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
//                getMvpView().hideLoading();
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
    public void getHotelPayConfigInfo(Map<String, String> fields) {
//        getMvpView().showLoading();
        mDataManager.getHotelPayConfigInfo(new DataListener() {
            @Override
            public void onResponse(String data) {
//                getMvpView().hideLoading();
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

    @Override
    public void verifyIdentity(Map<String, String > fields) {
//        getMvpView().showLoading();
        mDataManager.verifyIdentity(new DataListener() {
            @Override
            public void onResponse(String data) {
//                getMvpView().hideLoading();
                VerifyIdentityResult verifyIdentityResult = null;
                try {
                    verifyIdentityResult = LoganSquare.parse(data, VerifyIdentityResult.class);
                    Log.i(TAG, "onResponse: token = " + verifyIdentityResult.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().verifyIdentitySuccess(verifyIdentityResult);
            }

            @Override
            public void onError(String error) {
//                getMvpView().hideLoading();
                getMvpView().verifyIdentityFail(error);
            }
        }, fields);
    }

    @Override
    public void createToken(Map<String, String > fields) {
//        getMvpView().showLoading();
        mDataManager.createToken(new DataListener() {
            @Override
            public void onResponse(String data) {
//                getMvpView().hideLoading();
                TokenResult tokenResult = null;
                try {
                    tokenResult = LoganSquare.parse(data, TokenResult.class);
                    Log.i(TAG, "onResponse: token = " + tokenResult.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getMvpView().createTokenSuccess(tokenResult);
            }

            @Override
            public void onError(String error) {
                getMvpView().createTokenFail(error);
            }
        }, fields);
    }

    @Override
    public void getHotelQrced(Map<String, String> fields) {
        mDataManager.getAuthenticaToken(new DataListener() {
            @Override
            public void onResponse(String data) {
                Log.i(TAG, "onResponse: data = " + data);
                AuthenticaTokenModel authenticaTokenModel = null;
                try {
                    authenticaTokenModel = LoganSquare.parse(data, AuthenticaTokenModel.class);
                } catch (IOException e) {
                    Log.i(TAG, "onResponse: e = " + e.toString());
                    e.printStackTrace();
                }
                getMvpView().getHotelQrcedSuccess(authenticaTokenModel);
            }

            @Override
            public void onError(String error) {
                Log.i(TAG, "onError: " + error);
                getMvpView().getHotelQrcedFail(error);
            }
        }, fields);
    }

    @Override
    public void getHotelInfo(Map<String, String> fields) {
        mDataManager.getHotelInfo(new DataListener() {
            @Override
            public void onResponse(String data) {
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
                Log.i(TAG, "onError: " + error);
                getMvpView().getHotelInfoFail(error);
            }
        }, fields);
    }
}
