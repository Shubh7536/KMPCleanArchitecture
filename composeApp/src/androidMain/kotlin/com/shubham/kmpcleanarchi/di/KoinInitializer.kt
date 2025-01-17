package com.shubham.kmpcleanarchi.di

import android.content.Context
import com.shubham.kmpcleanarchi.di.module.appModule
import com.shubham.kmpcleanarchi.di.module.httpEngineModule
import com.shubham.kmpcleanarchi.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


actual class KoinInitializer(
    private val context: Context,
) {
    actual fun init(){
        startKoin {
            androidContext(context)
            modules(appModule, viewModelModule, /*dataStoreModule,*/ httpEngineModule/*, databaseModule*/)
        }
    }
}