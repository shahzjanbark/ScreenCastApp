package com.example.phonecleaner.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.phonecleaner.databinding.FragmentHomeBinding
import com.example.phonecleaner.ui.fragments.homepager.PhoneBoosterHomeFragment


class HomeFragment : Fragment() {
    private var views : FragmentHomeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        views = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return views?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val demoCollectionPagerAdapter = CollectionPagerAdapter(childFragmentManager)
        //viewPager = view.findViewById(R.id.pager)
        views?.pager?.adapter = demoCollectionPagerAdapter
        views?.springDotsIndicator?.attachTo(views!!.pager)
    }

    class CollectionPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

        override fun getCount(): Int  = 5

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> PhoneBoosterHomeFragment()
                1 -> PhoneBoosterHomeFragment()
                2 -> PhoneBoosterHomeFragment()
                else -> PhoneBoosterHomeFragment()
            }
        }

        override fun getPageTitle(position: Int): CharSequence {
            return "OBJECT ${(position + 1)}"
        }
    }


//    class MyPagerAdapter(fragmentManager: FragmentManager?) :
//        FragmentStatePagerAdapter(fragmentManager) {
//        // Returns total number of pages
//        override fun getCount(): Int {
//            return NUM_ITEMS
//        }
//
//        // Returns the fragment to display for that page
//        override fun getItem(position: Int): Fragment {
//            return when (position) {
//                0 -> FirstFragment.newInstance(0, "Page # 1")
//                1 -> FirstFragment.newInstance(1, "Page # 2")
//                2 -> SecondFragment.newInstance(2, "Page # 3")
//                else -> null
//            }
//        }
//
//        // Returns the page title for the top indicator
//        override fun getPageTitle(position: Int): CharSequence? {
//            return "Page $position"
//        }
//
//        companion object {
//            private const val NUM_ITEMS = 5
//        }
//    }
}