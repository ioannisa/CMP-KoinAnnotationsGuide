package com.plcoding.koinannotationsguide.todo.domain

interface TodoRepository {
    suspend fun getTodos(): List<String>
}