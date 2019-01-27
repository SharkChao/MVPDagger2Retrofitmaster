package com.winning.mvp_dagger2_retrofit_master.base;

import android.app.Application;
import android.content.Context;

import com.winning.mvp_dagger2_retrofit_master.di.component.AppComponent;
import com.winning.mvp_dagger2_retrofit_master.di.component.DaggerAppComponent;
import com.winning.mvp_dagger2_retrofit_master.di.module.ApiServiceModule;
import com.winning.mvp_dagger2_retrofit_master.di.module.AppModule;
import com.winning.mvp_dagger2_retrofit_master.di.module.AppServiceModule;

/**
 * 2019/1/26
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
public class MyApplication extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .apiServiceModule(new ApiServiceModule())
                .appServiceModule(new AppServiceModule())
                .build();
    }

    public static MyApplication get(Context context){
        return (MyApplication) context.getApplicationContext();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
