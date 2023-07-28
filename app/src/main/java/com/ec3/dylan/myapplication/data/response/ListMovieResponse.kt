package com.ec3.dylan.myapplication.data.response

import com.ec3.dylan.myapplication.model.Movie
import com.google.gson.annotations.SerializedName

data class ListMovieResponse(
    @SerializedName("results")
    var movies : List<Movie>
)
