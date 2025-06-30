package com.plcoding.koinannotationsguide

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.plcoding.koinannotationsguide.core.di.AppModule
import com.plcoding.koinannotationsguide.todo.di.TodoModule
import com.plcoding.koinannotationsguide.todo.presentation.TodoScreen
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinMultiplatformApplication
import org.koin.core.annotation.KoinExperimentalAPI
import org.koin.dsl.KoinConfiguration
import org.koin.ksp.generated.module

@OptIn(KoinExperimentalAPI::class)
@Composable
@Preview
fun App() {
    KoinMultiplatformApplication(
        config = KoinConfiguration {
            modules(
                AppModule().module,
                TodoModule().module
            )
        }
    ) {

        MaterialTheme {
            Scaffold(
                modifier = Modifier
                    .fillMaxSize()
            ) { innerPadding ->
                TodoScreen(
                    modifier = Modifier
                        .padding(innerPadding)
                )
            }
        }
    }
}