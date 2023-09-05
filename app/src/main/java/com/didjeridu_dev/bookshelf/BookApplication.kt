package com.didjeridu_dev.bookshelf

import android.app.Application
import com.didjeridu_dev.bookshelf.data.AppContainer
import com.didjeridu_dev.bookshelf.data.DefaultAppContainer

class BookApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}