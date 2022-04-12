package com.burak.githubrepolist.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.burak.githubrepolist.databinding.ActivityMainBinding
import com.burak.githubrepolist.viewmodels.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // Lazy inject Viewmodel
    val viewModel: HomeViewModel by viewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.callApi()
    }
}