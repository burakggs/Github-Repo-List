package com.burak.githubrepolist.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.burak.githubrepolist.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HomeViewModel(val userRepository: UserRepository) : ViewModel() {

    fun callApi() {
        viewModelScope.launch(Dispatchers.IO) {
            val userRepos = userRepository.getUserRepos("burakggs")
            withContext(Dispatchers.Main) {
                userRepos[0].repoName?.let { Log.i(HomeViewModel::class.simpleName, it) }

            }
        }

    }

}