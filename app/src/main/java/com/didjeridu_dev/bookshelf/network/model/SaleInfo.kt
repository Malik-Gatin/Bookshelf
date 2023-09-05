package com.didjeridu_dev.bookshelf.network.model

import com.didjeridu_dev.bookshelf.network.model.ListPrice
import com.didjeridu_dev.bookshelf.network.model.Offers
import com.didjeridu_dev.bookshelf.network.model.RetailPrice
import com.google.gson.annotations.SerializedName


data class SaleInfo (

    @SerializedName("country"     ) var country     : String?           = null,
    @SerializedName("saleability" ) var saleability : String?           = null,
    @SerializedName("isEbook"     ) var isEbook     : Boolean?          = null,
    @SerializedName("listPrice"   ) var listPrice   : ListPrice?        = ListPrice(),
    @SerializedName("retailPrice" ) var retailPrice : RetailPrice?      = RetailPrice(),
    @SerializedName("buyLink"     ) var buyLink     : String?           = null,
    @SerializedName("offers"      ) var offers      : ArrayList<Offers> = arrayListOf()

)