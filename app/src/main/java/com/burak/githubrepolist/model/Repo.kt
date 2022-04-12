package com.burak.githubrepolist.model

import com.google.gson.annotations.SerializedName


data class UserRepo(
    var id: Long?,
    @SerializedName("name") val repoName: String? = null,
    @SerializedName("stargazers_count") val starCount: Int,
    @SerializedName("owner") val repoOwner: RepoOwner?,
    val open_issues: Long?
)

data class RepoOwner(
    @SerializedName("login") var userName: String? = null,
    @SerializedName("avatar_url") var avatarUrl: String? = null
)