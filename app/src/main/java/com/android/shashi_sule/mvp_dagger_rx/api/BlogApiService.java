package com.android.shashi_sule.mvp_dagger_rx.api;

import com.android.shashi_sule.mvp_dagger_rx.mvp.model.Employee;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface BlogApiService {

    @GET("/feeds/posts/default?alt=json-in-script&callback=myFunc")
    Observable<Employee> getBlogs();

    @GET("/feeds/posts/default?alt=json-in-script&callback=myFunc")
    Call<Employee> getAllBlogs();
} 