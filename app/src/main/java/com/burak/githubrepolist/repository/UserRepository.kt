package com.burak.githubrepolist.repository

import com.burak.githubrepolist.model.UserRepo


class UserRepository(val userApi: UserApi) {

    suspend fun getUserRepos(userName: String): List<UserRepo> {
        return userApi.getUserRepos(userName)

    }
}