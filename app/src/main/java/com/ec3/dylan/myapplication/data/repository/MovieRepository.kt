package com.ec3.dylan.myapplication.data.repository

import com.ec3.dylan.myapplication.data.MovieServiceResult
import com.ec3.dylan.myapplication.data.response.ListMovieResponse
import com.ec3.dylan.myapplication.data.retrofit.RetrofitHelper
import com.ec3.dylan.myapplication.model.Movie

class MovieRepository(private val apiKey : String) {

    /*suspend fun getMovies() : List<Movie> {
        val response = RetrofitHelper.movieService.getMoviesUpcoming()
        return response.movies
    }*/

    suspend fun getMovies() : MovieServiceResult<ListMovieResponse> {
        return try {
            val response = RetrofitHelper.movieService.getMoviesUpcoming("63d5d0b9cad1af86d5ebb3651456acc6")
            MovieServiceResult.Success(response)
        } catch (e: Exception) {
            MovieServiceResult.Error(e)
        }
    }

}