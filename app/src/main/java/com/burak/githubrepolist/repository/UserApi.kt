package com.burak.githubrepolist.repository

import com.burak.githubrepolist.model.UserRepo
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface UserApi {

    @Headers("Content-Type: application/json")
    @GET("users/{user}/repos")
    suspend fun getUserRepos(@Path("user") userName: String) : List<UserRepo>

}