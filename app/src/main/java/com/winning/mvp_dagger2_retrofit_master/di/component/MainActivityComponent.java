package com.winning.mvp_dagger2_retrofit_master.di.component;

import com.winning.mvp_dagger2_retrofit_master.di.annotation.ActivityScope;
import com.winning.mvp_dagger2_retrofit_master.di.module.MainActivityModule;
import com.winning.mvp_dagger2_retrofit_master.service.presenter.MainPresenter;
import com.winning.mvp_dagger2_retrofit_master.ui.view.MainActivity;

import dagger.Component;

/**
 * 2019/1/26
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
@ActivityScope
@Component(modules = MainActivityModule.class , dependencies = AppComponent.class)
public interface MainActivityComponent {
    MainActivity inject(MainActivity mainActivity);
    MainPresenter providerMainPresenter();
}
