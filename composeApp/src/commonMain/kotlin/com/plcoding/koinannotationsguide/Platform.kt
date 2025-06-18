package com.plcoding.koinannotationsguide

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform