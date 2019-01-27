package com.winning.mvp_dagger2_retrofit_master.di.module;

import com.winning.mvp_dagger2_retrofit_master.service.model.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 2019/1/26
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
@Module
public class AppServiceModule {
    @Singleton
    @Provides
    public User providerUser(){
        User user = new User();
        user.setId("1");
        user.setName("小明");
        return user;
    }
}
