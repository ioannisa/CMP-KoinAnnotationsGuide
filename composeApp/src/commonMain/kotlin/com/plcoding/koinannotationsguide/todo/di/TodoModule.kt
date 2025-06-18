package com.plcoding.koinannotationsguide.todo.di

import com.plcoding.koinannotationsguide.core.di.AuthHttpClient
import com.plcoding.koinannotationsguide.todo.data.KtorTodoRepository
import com.plcoding.koinannotationsguide.todo.domain.TodoRepository
import com.plcoding.koinannotationsguide.todo.presentation.TodoViewModel
import io.ktor.client.HttpClient
import org.koin.android.annotation.KoinViewModel
import org.koin.core.annotation.Factory
import org.koin.core.annotation.Module

@Module
class TodoModule {

    @Factory(binds = [TodoRepository::class])
    fun todoRepository(@AuthHttpClient httpClient: HttpClient) = KtorTodoRepository(httpClient)

    @KoinViewModel
    fun todoViewModel(todoRepository: TodoRepository) = TodoViewModel(todoRepository)
}