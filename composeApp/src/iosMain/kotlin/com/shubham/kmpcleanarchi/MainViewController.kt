package com.shubham.kmpcleanarchi

import androidx.compose.ui.window.ComposeUIViewController
import com.shubham.kmpcleanarchi.di.KoinInitializer

fun MainViewController() = ComposeUIViewController(
    configure = {
        KoinInitializer().init()
    }
) {

    App()

}