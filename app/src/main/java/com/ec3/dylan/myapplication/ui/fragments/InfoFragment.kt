package com.ec3.dylan.myapplication.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cn.pedant.SweetAlert.SweetAlertDialog
import com.ec3.dylan.myapplication.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private lateinit var binding : FragmentInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.btnPresionar.setOnClickListener {
            SweetAlertDialog(requireContext(), SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("¡Muchas Gracias!")
                .setContentText("Por ver mi trabajo")
                .setConfirmText("Aceptar")
                .show()
        }
        return view
    }

}