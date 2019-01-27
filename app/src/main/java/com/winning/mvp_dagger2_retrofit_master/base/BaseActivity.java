package com.winning.mvp_dagger2_retrofit_master.base;

import android.app.Activity;
import android.os.Bundle;

import com.winning.mvp_dagger2_retrofit_master.di.component.AppComponent;

/**
 * Created by clevo on 2015/6/10.
 */
public abstract  class BaseActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActivityComponent(MyApplication.get(this).getAppComponent());
    }

    protected abstract void setupActivityComponent(AppComponent appComponent);
}
