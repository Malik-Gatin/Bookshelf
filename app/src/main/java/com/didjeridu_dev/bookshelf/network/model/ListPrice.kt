package com.didjeridu_dev.bookshelf.network.model

import com.google.gson.annotations.SerializedName


data class ListPrice (

  @SerializedName("amountInMicros" ) var amountInMicros : Int?    = null,
  @SerializedName("currencyCode"   ) var currencyCode   : String? = null

)