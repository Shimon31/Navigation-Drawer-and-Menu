package com.example.navigationpractice1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationpractice1.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
        lateinit var binding:FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater,container,false)

        binding.userBTn.setOnClickListener(){

            findNavController().navigate(R.id.action_profileFragment_to_userFragment)

        }


        return binding.root
    }


}