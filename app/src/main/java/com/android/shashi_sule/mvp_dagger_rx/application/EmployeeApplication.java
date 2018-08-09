package com.android.shashi_sule.mvp_dagger_rx.application;

import android.app.Application;

import com.android.shashi_sule.mvp_dagger_rx.di.component.ApplicationComponent;

public class EmployeeApplication extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeApplicationComponent();
    }

    private void initializeApplicationComponent() {
//        mApplicationComponent
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}