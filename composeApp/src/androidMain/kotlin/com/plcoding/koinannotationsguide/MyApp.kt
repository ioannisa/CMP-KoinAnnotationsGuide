package com.plcoding.koinannotationsguide

import android.app.Application
import com.plcoding.koinannotationsguide.core.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MyApp)
        }
    }
}