package com.eddie.moxy;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

public interface IMainView extends MvpView {

    @StateStrategyType(value = AddToEndSingleStrategy.class)
    void setCount(int count);

}
