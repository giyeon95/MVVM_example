package com.kolon.mvvm_example.ui.bookmark

import android.os.Bundle
import com.kolon.mvvm_example.R
import com.kolon.mvvm_example.databinding.ActivityBookmarkBinding
import com.kolon.mvvm_example.ui.BindingActivity
import org.koin.androidx.viewmodel.ext.android.getViewModel

class BookmarkActivity: BindingActivity<ActivityBookmarkBinding>() {
    override fun getLayoutResId(): Int = R.layout.activity_bookmark

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.vm = getViewModel()
        binding.lifecycleOwner = this
    }
}