package com.shubham.kmpcleanarchi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform