package com.example.topic4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.topic4.databinding.FragmentHalamanKetigaBinding


class HalamanKetigaFragment : Fragment() {
    lateinit var binding: FragmentHalamanKetigaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHalamanKetigaBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //menampilkan data yang dikirim dari halaman kedua
        val dapatNama = arguments?.getString("input")
        binding.nama.setText(dapatNama)
    }


}