package com.xiyo.selfhelp.ui.presenter.checkout;

import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
import com.xiyo.selfhelp.data.DataManager;
import com.xiyo.selfhelp.data.listeners.DataListener;
import com.xiyo.selfhelp.data.model.ReservationModel;
import com.xiyo.selfhelp.data.model.Token;
import com.xiyo.selfhelp.ui.base.BasePresenter;
import com.xiyo.selfhelp.ui.mvppresenter.checkout.OutPayResultMvpPresenter;
import com.xiyo.selfhelp.ui.mvppresenter.checkout.OutSelectMvpPresenter;
import com.xiyo.selfhelp.ui.view.checkout.OutPayResultMvpView;
import com.xiyo.selfhelp.ui.view.checkout.OutSelectMvpView;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class OutPayResultPresenter<V extends OutPayResultMvpView> extends BasePresenter<V> implements OutPayResultMvpPresenter<V> {

    private static final String TAG = "dc";

    private final DataManager mDataManager;

    @Inject
    public OutPayResultPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }
}
