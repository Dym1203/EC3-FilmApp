package com.ec3.dylan.myapplication.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ec3.dylan.myapplication.R
import com.ec3.dylan.myapplication.databinding.FragmentMovieFavoriteBinding

class MovieFavoriteFragment : Fragment() {

    private lateinit var binding: FragmentMovieFavoriteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMovieFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

}