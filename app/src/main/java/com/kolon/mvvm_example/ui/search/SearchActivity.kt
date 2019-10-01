package com.kolon.mvvm_example.ui.search

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.annotation.LayoutRes
import com.kolon.mvvm_example.R
import com.kolon.mvvm_example.databinding.ActivitySearchBinding
import com.kolon.mvvm_example.ui.BindingActivity
import com.kolon.mvvm_example.ui.bookmark.BookmarkActivity
import org.koin.androidx.viewmodel.ext.android.getViewModel

class SearchActivity : BindingActivity<ActivitySearchBinding>() {
    @LayoutRes
    override fun getLayoutResId(): Int = R.layout.activity_search

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.vm = getViewModel()
        binding.lifecycleOwner = this

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_search, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.bookmark -> {
                startActivity(Intent(this, BookmarkActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}