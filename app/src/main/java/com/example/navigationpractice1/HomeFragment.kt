package com.example.navigationpractice1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationpractice1.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)

        binding.profileBTn.setOnClickListener(){
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
        }

        binding.userBTn.setOnClickListener(){
            findNavController().navigate(R.id.action_homeFragment_to_userFragment)
        }

        return binding.root
    }


}