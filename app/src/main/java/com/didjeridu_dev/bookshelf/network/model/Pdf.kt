package com.didjeridu_dev.bookshelf.network.model

import com.google.gson.annotations.SerializedName


data class Pdf (

  @SerializedName("isAvailable" ) var isAvailable : Boolean? = null

)