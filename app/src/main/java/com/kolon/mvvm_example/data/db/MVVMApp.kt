package com.kolon.mvvm_example.data.db

import android.app.Application
import com.kolon.mvvm_example.di.apiModule
import com.kolon.mvvm_example.di.networkModule
import com.kolon.mvvm_example.di.roomModule
import com.kolon.mvvm_example.di.viewModeModule
import org.koin.core.context.startKoin

class MVVMApp: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            listOf(networkModule,
                    apiModule,
                    roomModule,
                    viewModeModule)
        }



    }
}
