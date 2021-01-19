package com.elingga.github.api

import com.elingga.github.data.model.DetailUserResponse
import com.elingga.github.data.model.User
import com.elingga.github.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token c08084925c3b6d8c22ad44989e9f49076f0a299f")
    fun getSearchUsers(
        @Query("q") quesy: String
    ):Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token c08084925c3b6d8c22ad44989e9f49076f0a299f")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token c08084925c3b6d8c22ad44989e9f49076f0a299f")
    fun getFollowers(
        @Path("username") username: String
    ):Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token c08084925c3b6d8c22ad44989e9f49076f0a299f")
    fun getFollowing(
        @Path("username") username: String
    ):Call<ArrayList<User>>
}