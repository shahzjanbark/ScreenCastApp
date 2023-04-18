package com.example.phonecleaner.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.phonecleaner.databinding.ActivityLauncherBinding
import com.example.phonecleaner.ui.onboarding.Screen1Activity
import kotlinx.coroutines.*

class LauncherActivity : AppCompatActivity() {
    var views : ActivityLauncherBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityLauncherBinding.inflate(layoutInflater)
        setContentView(views?.root)

        views?.startBtn?.setOnClickListener {
            startAnim()
        }
    }

    private fun startAnim() {

        CoroutineScope(Dispatchers.Main).launch {
            views?.apply {
                startIc.visibility = View.GONE
                agreeTv.visibility = View.GONE
                privacyTv.visibility = View.GONE
                progressCircleDeterminate.visibility = View.VISIBLE
            }

            delay(5000)
            gotoNextActivity()
        }

    }

    private fun gotoNextActivity() {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
        finish()
    }
}