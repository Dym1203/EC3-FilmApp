package com.ec3.dylan.myapplication.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ec3.dylan.myapplication.data.MovieServiceResult
import com.ec3.dylan.myapplication.data.repository.MovieRepository
import com.ec3.dylan.myapplication.model.Movie
import com.ec3.dylan.myapplication.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieListViewModel: ViewModel() {

    /*val movies : MutableLiveData<List<Movie>> = MutableLiveData<List<Movie>>()*/
    private val _movies : MutableLiveData<List<Movie>> = MutableLiveData<List<Movie>>()
    val movies : LiveData<List<Movie>> = _movies

    /*val repository = MovieRepository()*/
    private val repository = MovieRepository("63d5d0b9cad1af86d5ebb3651456acc6")

    /*Mismo nombre de función que en en el MovieRepository*/
    /*fun getMovies() {
        val movieList = getData()
        movies.value = movieList
    }*/
    fun getMovies() {
        val movieList = getData()
        _movies.value = movieList
    }

    /*fun getMoviesFromService() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.getMovies()
            movies.postValue(response)
        }
    }*/

    fun getMoviesFromService() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.getMovies()
            when (response) {
                is MovieServiceResult.Success -> {
                    _movies.postValue(response.data.movies) /*movies*/
                }
                is MovieServiceResult.Error -> {
                    //
                }
            }
        }
    }

}