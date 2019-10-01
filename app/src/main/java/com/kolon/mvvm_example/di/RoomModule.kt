package com.kolon.mvvm_example.di

import com.kolon.mvvm_example.data.db.AppDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val roomModule = module {
    single {AppDatabase.getInstance(androidApplication()) }
    single (createdAtStart =  false) { get<AppDatabase>().getBookmarkDao()}
}