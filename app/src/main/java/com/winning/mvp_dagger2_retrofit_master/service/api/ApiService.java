package com.winning.mvp_dagger2_retrofit_master.service.api;

import com.winning.mvp_dagger2_retrofit_master.service.model.User;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by clevo on 2015/6/10.
 */
public interface ApiService {

    @GET("/users")
    void getUsers(Callback<List<User>> callback);
}
