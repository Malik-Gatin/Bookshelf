package com.didjeridu_dev.bookshelf.network

import com.didjeridu_dev.bookshelf.network.model.Bookshelf
import retrofit2.http.GET
import retrofit2.http.Query

interface BookService {
    @GET("volumes")
    suspend fun bookSearch(
        @Query("q") searchQuery: String,
        @Query("maxResults") maxResults: Int
    ) : Bookshelf
}