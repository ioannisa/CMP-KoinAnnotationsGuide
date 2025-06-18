package com.plcoding.koinannotationsguide.todo.data

import com.plcoding.koinannotationsguide.todo.domain.TodoRepository
import io.ktor.client.HttpClient

class KtorTodoRepository(
    private val httpClient: HttpClient
): TodoRepository {

    override suspend fun getTodos(): List<String> {
        return (1..10).map {
            "Todo $it"
        }
    }
}