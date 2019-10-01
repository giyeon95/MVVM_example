package com.kolon.mvvm_example.di

import com.kolon.mvvm_example.ui.bookmark.BookmarkViewModel
import com.kolon.mvvm_example.ui.search.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModeModule = module {
    viewModel { SearchViewModel(get(), get()) }
    viewModel { BookmarkViewModel(get()) }
}