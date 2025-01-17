package com.flexeiprata.androidmytaskapplication.data.repository

import com.flexeiprata.androidmytaskapplication.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {
    suspend fun getProducts(page: Int, text: String) = apiHelper.getProducts(page, text)
    suspend fun getProductById(id: Int) = apiHelper.getProductById(id)
}