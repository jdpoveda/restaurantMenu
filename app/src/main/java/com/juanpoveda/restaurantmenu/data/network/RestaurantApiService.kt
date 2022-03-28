package com.juanpoveda.restaurantmenu.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://api.documenu.com/v2/"

private val retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .build()

object RestaurantApi {
    val retrofitService : Webservice by lazy { retrofit.create(Webservice::class.java) }
}