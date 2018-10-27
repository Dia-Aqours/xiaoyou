package com.xiyo.selfhelp.ui.presenter.card;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.HotelInfo;
import com.xiyo.selfhelp.data.model.HotelQrced;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.card.CardComparisonMvpPresenter;
import com.xiyo.selfhelp.ui.mvppresenter.card.CardQrcedMvpPresenter;
import com.xiyo.selfhelp.ui.view.card.CardComparisonMvpView;
import com.xiyo.selfhelp.ui.view.card.CardQrcedMvpView;

import java.io.IOException;
import java.util.Map;

import javax.inject.Inject;

public class CardQrcedPresenter<V extends CardQrcedMvpView> extends BasePresenter<V> implements CardQrcedMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public CardQrcedPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }
}
