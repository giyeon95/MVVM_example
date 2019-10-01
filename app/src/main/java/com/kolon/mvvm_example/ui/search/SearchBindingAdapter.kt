package com.kolon.mvvm_example.ui.search

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kolon.mvvm_example.data.remote.domain.Repository

@BindingAdapter(value = ["repositories", "viewModel"])
fun setRepositories(view: RecyclerView, items: List<Repository>, vm: SearchViewModel) {
    view.adapter?.run {
        if (this is RepositoryAdapter) {
            this.items = items
            this.notifyDataSetChanged()
        }
    } ?: run {
        RepositoryAdapter(items, vm).apply { view.adapter = this}
    }
}