package com.example.navigationpractice1

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationpractice1.databinding.FragmentLogOutBinding


class LogOutFragment : Fragment() {
    lateinit var binding: FragmentLogOutBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLogOutBinding.inflate(inflater,container,false)

        binding.HomeBTN.setOnClickListener(){

            findNavController().navigate(R.id.action_logOutFragment_to_signInFragment)
        }

        return binding.root
    }


}