package com.shubham.kmpcleanarchi

import android.app.Application
import com.shubham.kmpcleanarchi.di.KoinInitializer

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        KoinInitializer(applicationContext).init()
    }
}