package com.didjeridu_dev.bookshelf.data

import com.didjeridu_dev.bookshelf.network.BookService
import com.didjeridu_dev.bookshelf.network.model.Bookshelf

interface BooksRepository {
    suspend fun getBooks(query: String, maxResult: Int): List<Book>
}

// принимает запрос к серверу и реализует BooksRepository
class NetworkBooksRepository(
    private val bookService: BookService
) : BooksRepository{
    // принимает параметры запроса к серверу и возвращает его ответ
    override suspend fun getBooks(
        query: String,
        maxResult: Int
    ): List<Book> = bookService.bookSearch(query,maxResult).items.map{item->
        Book(
            title = item.volumeInfo?.title!!,
            previewLink = item.volumeInfo?.previewLink,
            imageLink = item.volumeInfo?.imageLinks?.thumbnail
        )
    }
}
