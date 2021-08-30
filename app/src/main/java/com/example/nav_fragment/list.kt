package com.example.nav_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_list.view.*

class list : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        var view= inflater.inflate(R.layout.fragment_list, container, false)
        view.move.setOnClickListener {
            findNavController().navigate(R.id.action_list_to_add)
        }
        return view

    }

}