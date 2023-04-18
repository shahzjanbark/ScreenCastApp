package com.example.phonecleaner.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.phonecleaner.R
import com.example.phonecleaner.databinding.ActivityMainBinding
import com.example.phonecleaner.ui.fragments.AppsFragment
import com.example.phonecleaner.ui.fragments.HomeFragment
import com.example.phonecleaner.ui.fragments.MoreFragment
import com.example.phonecleaner.ui.fragments.ToolboxFragment

class MainActivity : AppCompatActivity() {
    private var views : ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityMainBinding.inflate(layoutInflater)
        setContentView(views?.root)
        setUpFragments()

    }

    private fun setUpFragments() {
        val homeFragment = HomeFragment()
        val toolboxFragagments = ToolboxFragment()
        val appsFragment = AppsFragment()
        val moreFragment = MoreFragment()

        setCurrentFragment(homeFragment)
        views?.bottomNavigationView?.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->setCurrentFragment(homeFragment)
                R.id.toolbox->setCurrentFragment(toolboxFragagments)
                R.id.apps->setCurrentFragment(appsFragment)
                R.id.more->setCurrentFragment(moreFragment)

            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(views?.mainFrame!!.id, fragment)
            commit()
        }
    }
}