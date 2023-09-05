package com.didjeridu_dev.bookshelf.network.model

import com.google.gson.annotations.SerializedName


data class Bookshelf (

  @SerializedName("kind"       ) var kind       : String?          = null,
  @SerializedName("totalItems" ) var totalItems : Int?             = null,
  @SerializedName("items"      ) var items      : ArrayList<Items> = arrayListOf()

)