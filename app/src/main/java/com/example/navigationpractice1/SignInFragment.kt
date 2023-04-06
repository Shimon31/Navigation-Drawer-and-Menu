package com.example.navigationpractice1

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationpractice1.databinding.FragmentSignInBinding


class SignInFragment : Fragment() {

    lateinit var binding: FragmentSignInBinding


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentSignInBinding.inflate(layoutInflater,container,false)

        binding.loginBTN.setOnClickListener(){
            findNavController().navigate(R.id.action_signInFragment_to_homeFragment)
        }

        return binding.root
    }


}