package com.winning.mvp_dagger2_retrofit_master.di.module;

import com.squareup.okhttp.OkHttpClient;
import com.winning.mvp_dagger2_retrofit_master.service.api.ApiService;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * 2019/1/26
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
@Module
public class ApiServiceModule {
    private static final String ENDPOINT = "";
    @Singleton
    @Provides
    public OkHttpClient providerOkHttpClient(){
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(60 * 1000, TimeUnit.MILLISECONDS);
        okHttpClient.setReadTimeout(60 * 1000, TimeUnit.MILLISECONDS);
        return okHttpClient;
    }
    @Singleton
    @Provides
    public RestAdapter providerRestAdapter(OkHttpClient okHttpClient){
        RestAdapter.Builder builder = new RestAdapter.Builder();
        builder.setClient(new OkClient(okHttpClient))
                .setEndpoint(ENDPOINT);
        return builder.build();
    }
    @Singleton
    @Provides
    public ApiService providerApiService(RestAdapter adapter){
        return adapter.create(ApiService.class);
    }
}
