package com.juanpoveda.restaurantmenu.data.network

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface Webservice {
    @GET("restaurant/{id}")
    suspend fun getRestaurant(@Header("X-API-KEY") apiKey: String, @Path("id") id: Long): Restaurant
}