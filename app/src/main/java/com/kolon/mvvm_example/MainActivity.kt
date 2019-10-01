package com.kolon.mvvm_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kolon.mvvm_example.di.apiModule
import com.kolon.mvvm_example.di.networkModule
import com.kolon.mvvm_example.di.roomModule
import com.kolon.mvvm_example.di.viewModeModule
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
