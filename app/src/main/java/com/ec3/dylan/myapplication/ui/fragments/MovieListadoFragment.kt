package com.ec3.dylan.myapplication.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.ec3.dylan.myapplication.databinding.FragmentMovieListadoBinding
import com.ec3.dylan.myapplication.model.getData
import com.ec3.dylan.myapplication.ui.viewmodels.MovieListViewModel

class MovieListadoFragment : Fragment() {

    private lateinit var binding : FragmentMovieListadoBinding
    private lateinit var viewModel : MovieListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MovieListViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMovieListadoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RVMovieListAdapter(listOf())
        binding.rvMovieList.adapter = adapter
        viewModel.movies.observe(requireActivity()) { movies ->
            movies?.let {
                adapter.movies = it
                adapter.notifyDataSetChanged()
            }
            viewModel.getMoviesFromService()
        }
        /*viewModel.getMovies()*/
    }

}