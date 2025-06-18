package com.plcoding.koinannotationsguide

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.plcoding.koinannotationsguide.core.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "KoinAnnotationsGuide",
        ) {
            App()
        }
    }
}