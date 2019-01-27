package com.winning.mvp_dagger2_retrofit_master.di.module;

import com.winning.mvp_dagger2_retrofit_master.di.annotation.ActivityScope;
import com.winning.mvp_dagger2_retrofit_master.service.model.User;
import com.winning.mvp_dagger2_retrofit_master.service.presenter.MainPresenter;
import com.winning.mvp_dagger2_retrofit_master.ui.view.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * 2019/1/26
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
@Module
public class MainActivityModule {
    private MainActivity mMainActivity;


    public MainActivityModule(MainActivity mainActivity) {
        mMainActivity = mainActivity;
    }
    @ActivityScope
    @Provides
    public MainActivity providerMainActivity(){
        return mMainActivity;
    }
    @ActivityScope
    @Provides
    public MainPresenter providerMainPresenter(MainActivity mainActivity, User user){
        return new MainPresenter(mainActivity,user);
    }
}
