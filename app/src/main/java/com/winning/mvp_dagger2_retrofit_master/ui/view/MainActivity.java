package com.winning.mvp_dagger2_retrofit_master.ui.view;

import android.os.Bundle;
import android.widget.TextView;

import com.winning.mvp_dagger2_retrofit_master.R;
import com.winning.mvp_dagger2_retrofit_master.base.BaseActivity;
import com.winning.mvp_dagger2_retrofit_master.di.component.AppComponent;
import com.winning.mvp_dagger2_retrofit_master.di.component.DaggerMainActivityComponent;
import com.winning.mvp_dagger2_retrofit_master.di.module.MainActivityModule;
import com.winning.mvp_dagger2_retrofit_master.service.presenter.MainPresenter;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    private TextView tvName;
    @Inject
    MainPresenter mMainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvName = findViewById(R.id.tvName);
        mMainPresenter.showUserName();
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerMainActivityComponent.builder()
                .appComponent(appComponent)
                .mainActivityModule(new MainActivityModule(this))
                .build().inject(this);
    }

    public void setTextName(String name){
        tvName.setText(name);
    }
}
