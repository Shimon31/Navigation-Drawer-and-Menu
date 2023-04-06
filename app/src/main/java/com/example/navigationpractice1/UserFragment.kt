package com.example.navigationpractice1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationpractice1.databinding.FragmentUserBinding


class UserFragment : Fragment() {
        lateinit var binding: FragmentUserBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserBinding.inflate(inflater,container,false)


        binding.logOutBTN.setOnClickListener(){

            findNavController().navigate(R.id.action_userFragment_to_logOutFragment)
        }

        return binding.root
    }


}