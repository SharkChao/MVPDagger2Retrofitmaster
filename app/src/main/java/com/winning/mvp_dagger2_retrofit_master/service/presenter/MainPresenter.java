package com.winning.mvp_dagger2_retrofit_master.service.presenter;

import com.winning.mvp_dagger2_retrofit_master.service.model.User;
import com.winning.mvp_dagger2_retrofit_master.ui.view.MainActivity;

/**
 * 2019/1/26
 * Created by SharkChao
 * 827623353@qq.com
 * https://github.com/sharkchao
 */
public class MainPresenter {
    private MainActivity mainActivity;
    private User user;

    public MainPresenter(MainActivity mainActivity, User user) {
        this.mainActivity = mainActivity;
        this.user = user;
    }

    public void showUserName(){
        mainActivity.setTextName(user.getName());
    }
}
