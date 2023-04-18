package com.example.phonecleaner.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.phonecleaner.R
import com.example.phonecleaner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var views : ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityMainBinding.inflate(layoutInflater)
        setContentView(views?.root)

    }
}