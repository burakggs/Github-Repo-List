package com.burak.githubrepolist.di

import com.burak.githubrepolist.repository.UserRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { UserRepository(get()) }
}