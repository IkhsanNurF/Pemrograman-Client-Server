package com.appsanur.app.data.model

data class NewsList (
    val data: List<News> = arrayListOf(),
    val length: Int = 0,
    val status: Int = 0
)
