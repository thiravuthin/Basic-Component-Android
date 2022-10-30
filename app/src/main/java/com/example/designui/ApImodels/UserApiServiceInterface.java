package com.example.designui.ApImodels;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface UserApiServiceInterface {

    @GET("users")
    Call<List<User>> getAllUsers();

    // Part variable or part param
    @GET("users/{id}")
    Call<User> getUserByID(@Path("id") int id);
}
