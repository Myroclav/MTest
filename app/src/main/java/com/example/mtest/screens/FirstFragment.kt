package com.example.mtest.screens

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mtest.R
import com.example.mtest.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated ----> Start")

        binding.btnNext.setOnClickListener {
            Log.d(TAG, "onViewCreated ----> clicked!!!")
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }

    companion object {
        val TAG = FirstFragment::class.simpleName
    }
}