package com.example.topic4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.topic4.databinding.FragmentHalamankeduaBinding

class HalamanKeduaFragment : Fragment() {
    lateinit var binding:FragmentHalamankeduaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHalamankeduaBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
        // Inflate the layout for this fragment

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn2.setOnClickListener{
            //cara ngambil value dari edit text
            val inputNama = binding.textnama.toString()
            val bund = Bundle()
            bund.putString("input", inputNama)
            //Cara membawa bundle
            findNavController().navigate(R.id.action_halamanKeduaFragment_to_halamanKetigaFragment, bund)
        }

    }
}
