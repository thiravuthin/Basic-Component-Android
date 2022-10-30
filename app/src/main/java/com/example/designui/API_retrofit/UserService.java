package com.example.designui.API_retrofit;

import com.example.designui.ApImodels.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {
    @GET("users")
    Call<List <User>> getAllUsers ();

    // part variable or get param
    @GET("users/{id}")
    Call<User> getUserById(@Path("id") int id);


}
