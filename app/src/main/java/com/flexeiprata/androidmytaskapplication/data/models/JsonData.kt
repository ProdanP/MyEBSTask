package com.flexeiprata.androidmytaskapplication.data.models

import com.google.gson.annotations.SerializedName

data class JsonData(
    val count: Int,
    val current_page: Int,
    val per_page: Int,
    @SerializedName("results")
    val products: List<Product>,
    val total_pages: Int
)