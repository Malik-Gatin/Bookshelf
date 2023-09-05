package com.didjeridu_dev.bookshelf.data

// моделька, в которую будем мапить поля из разных дата классов
data class Book(
    val title: String?,
    val previewLink: String?,
    val imageLink: String?,
)
