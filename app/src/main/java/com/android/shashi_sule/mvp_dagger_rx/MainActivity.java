package com.android.shashi_sule.mvp_dagger_rx;

import android.content.Intent;
import android.os.Bundle;

import com.android.shashi_sule.mvp_dagger_rx.base.BaseActivity;

public class MainActivity extends BaseActivity {


    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void onViewReady(final Bundle savedInstanceState, final Intent intent) {
        super.onViewReady(savedInstanceState, intent);
    }

    @Override
    protected void showDialog(final String message) {
        showDialog(message);
    }

    @Override
    protected void hideDialog() {
        hideDialog();
    }

    @Override
    protected void resolveDaggerDependency() {

    }
}
