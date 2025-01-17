package com.shubham.kmpcleanarchi.di.module

import io.ktor.client.engine.okhttp.OkHttp
import org.koin.dsl.module

actual val httpEngineModule = module {
    single { OkHttp.create() }
}