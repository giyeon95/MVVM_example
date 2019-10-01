package com.kolon.mvvm_example.di

import com.kolon.mvvm_example.data.remote.api.SearchAPI
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    single(createdAtStart = false) {get<Retrofit>().create(SearchAPI::class.java)}
}