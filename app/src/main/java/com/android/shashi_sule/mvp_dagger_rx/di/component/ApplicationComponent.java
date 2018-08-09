package com.android.shashi_sule.mvp_dagger_rx.di.component;

import android.content.Context;

import com.android.shashi_sule.mvp_dagger_rx.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    Context exposeContext();
} 