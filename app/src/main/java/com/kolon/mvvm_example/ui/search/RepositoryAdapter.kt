package com.kolon.mvvm_example.ui.search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kolon.mvvm_example.R
import com.kolon.mvvm_example.data.remote.domain.Repository
import com.kolon.mvvm_example.databinding.ItemRepositoryBinding
import com.kolon.mvvm_example.ui.BindingViewHolder

class RepositoryAdapter(var items: List<Repository> = arrayListOf(), val vm: SearchViewModel) :
        RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryAdapter.RepositoryViewHolder {
        return RepositoryViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_repository,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RepositoryAdapter.RepositoryViewHolder, position: Int) {
        holder.binding.item = items[position]
        holder.binding.vm = vm
    }

    override fun getItemCount(): Int = items.size
    class RepositoryViewHolder(view: View) : BindingViewHolder<ItemRepositoryBinding>(view)

}