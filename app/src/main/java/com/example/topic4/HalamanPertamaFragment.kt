package com.example.topic4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.topic4.databinding.FragmentHalamanPertamaBinding


class HalamanPertamaFragment : Fragment() {
    lateinit var binding: FragmentHalamanPertamaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHalamanPertamaBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn1.setOnClickListener{
            findNavController().navigate(R.id.action_halamanPertamaFragment_to_halamanKeduaFragment)
        }
    }


}