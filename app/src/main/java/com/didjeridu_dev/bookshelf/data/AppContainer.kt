package com.didjeridu_dev.bookshelf.data

import com.didjeridu_dev.bookshelf.network.BookService
import com.didjeridu_dev.bookshelf.network.model.Bookshelf
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// гарантирует, что экземпляр репозитория будет создан только однажды
// в процессе работы. Паттерн DI (manual - через интерфейс)
interface AppContainer {
    val booksRepository:BooksRepository
}

class DefaultAppContainer : AppContainer {
    private val BASE_URL = "https://www.googleapis.com/books/v1/"

    private val retrofit = Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService: BookService by lazy{
        retrofit.create(BookService::class.java)
    }

    override val booksRepository: BooksRepository by lazy{
        NetworkBooksRepository(retrofitService)
    }
}