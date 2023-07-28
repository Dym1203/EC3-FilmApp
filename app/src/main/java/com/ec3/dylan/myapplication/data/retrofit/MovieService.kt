package com.ec3.dylan.myapplication.data.retrofit

import com.ec3.dylan.myapplication.data.response.ListMovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {
    @GET("upcoming")
    suspend fun getMoviesUpcoming(@Query("api_key") apiKey: String) : ListMovieResponse
}