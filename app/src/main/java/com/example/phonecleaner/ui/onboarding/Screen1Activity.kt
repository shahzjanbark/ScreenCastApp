package com.example.phonecleaner.ui.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.phonecleaner.databinding.ActivityScreen1Binding

class Screen1Activity : AppCompatActivity() {
    lateinit var binding: ActivityScreen1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScreen1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}