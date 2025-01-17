package com.shubham.kmpcleanarchi.di.module

import io.ktor.client.engine.darwin.Darwin
import org.koin.dsl.module

actual val httpEngineModule = module {
    single { Darwin.create() }
}