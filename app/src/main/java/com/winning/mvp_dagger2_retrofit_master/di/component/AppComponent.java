package com.winning.mvp_dagger2_retrofit_master.di.component;

import android.app.Application;

import com.winning.mvp_dagger2_retrofit_master.di.module.ApiServiceModule;
import com.winning.mvp_dagger2_retrofit_master.di.module.AppModule;
import com.winning.mvp_dagger2_retrofit_master.di.module.AppServiceModule;
import com.winning.mvp_dagger2_retrofit_master.service.api.ApiService;
import com.winning.mvp_dagger2_retrofit_master.service.model.User;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 2019/1/26
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
@Singleton
@Component(modules = {AppModule.class , ApiServiceModule.class , AppServiceModule.class})
public interface AppComponent {
    Application getApplication();
    ApiService getService();
    User getUser();
}
