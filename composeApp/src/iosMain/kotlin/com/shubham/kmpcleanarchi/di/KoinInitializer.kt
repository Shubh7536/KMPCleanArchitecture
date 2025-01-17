package com.shubham.kmpcleanarchi.di

import com.shubham.kmpcleanarchi.di.module.appModule
import com.shubham.kmpcleanarchi.di.module.httpEngineModule
import com.shubham.kmpcleanarchi.di.module.viewModelModule
import org.koin.core.context.startKoin

actual class KoinInitializer {
    actual fun init(){
        startKoin {
            modules(appModule, viewModelModule, /*dataStoreModule,*/ httpEngineModule/*, databaseModule*/)
        }
    }
}