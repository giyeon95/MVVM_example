package com.kolon.mvvm_example.ui.search

import com.kolon.mvvm_example.core.BaseViewModel
import com.kolon.mvvm_example.data.db.dao.BookmarkDao
import com.kolon.mvvm_example.data.db.entity.Bookmark
import com.kolon.mvvm_example.data.remote.api.SearchAPI
import com.kolon.mvvm_example.data.remote.domain.Repository
import com.kolon.mvvm_example.util.NotNullMutableLiveData
import com.kolon.mvvm_example.util.ioThread

class SearchViewModel (private val api: SearchAPI, private val dao: BookmarkDao): BaseViewModel() {
    private var query: String = ""
    get() = if(field.isEmpty()) "MVVM" else field


    private val _refreshing: NotNullMutableLiveData<Boolean> = NotNullMutableLiveData(false)
    val refreshing: NotNullMutableLiveData<Boolean>
        get() = _refreshing

    private val _items: NotNullMutableLiveData<List<Repository>> = NotNullMutableLiveData(arrayListOf())
    val items: NotNullMutableLiveData<List<Repository>>
    get() = _items

    fun doSearch() {
        val params = mutableMapOf<String, String>().apply {
            this["q"] = query
            this["sort"] = "stars"
        }
        addToDisposable (api.search(params)
            .doOnSubscribe {_refreshing.value = true}
            .doOnSuccess { _refreshing.value = false}
            .doOnError { _refreshing.value = false}
            .subscribe ({
                _items.value = it.repositories
            }, {
                //error
            })
        )
    }

    fun onQueryChange(query: CharSequence) {
        this.query = query.toString()
    }

    fun saveToBookmark(repository: Repository) = ioThread {dao.insert(Bookmark.to(repository))}
}