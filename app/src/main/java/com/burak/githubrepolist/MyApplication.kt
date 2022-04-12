package com.burak.githubrepolist

import android.app.Application
import com.burak.githubrepolist.di.networkModule
import com.burak.githubrepolist.di.repositoryModule
import com.burak.githubrepolist.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            // declare used Android context
            androidContext(this@MyApplication)
            // declare modules
            val moduleList = mutableListOf<Module>()
            moduleList.add(networkModule)
            moduleList.add(repositoryModule)
            moduleList.add(viewModelModule)
            modules(moduleList)
        }
    }

}