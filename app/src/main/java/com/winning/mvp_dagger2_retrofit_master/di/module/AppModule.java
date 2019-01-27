package com.winning.mvp_dagger2_retrofit_master.di.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 2019/1/26
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 *
 *
 */
@Module
public class AppModule {
    Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Singleton
    @Provides
    public Application providerApplication(){
        return mApplication;
    }

}
