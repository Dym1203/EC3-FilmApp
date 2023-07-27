package com.ec3.dylan.myapplication.data.retrofit

import com.ec3.dylan.myapplication.data.response.ListMovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {
    /*@GET("63d5d0b9cad1af86d5ebb3651456acc6")*/
    @GET("movie/upcoming")
    suspend fun getMoviesUpcoming(@Query("api_key") apiKey: String) : ListMovieResponse
}