package com.example.phonecleaner.ui.fragments.homepager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.phonecleaner.R
import com.example.phonecleaner.databinding.FragmentPhoneCoolerBinding
import com.example.phonecleaner.databinding.HomePhoneCleanerIndicatorLayout1Binding

class PhoneCoolerHomeFragment : Fragment() {
    private var views : FragmentPhoneCoolerBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        views = FragmentPhoneCoolerBinding.inflate(layoutInflater, container, false)
        return views?.root
    }

}