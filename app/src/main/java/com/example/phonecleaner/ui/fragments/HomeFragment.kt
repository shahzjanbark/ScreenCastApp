package com.example.phonecleaner.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.recyclerview.widget.GridLayoutManager
import com.example.phonecleaner.adapter.HomePageOptionAdapter
import com.example.phonecleaner.databinding.FragmentHomeBinding
import com.example.phonecleaner.ui.fragments.homepager.*
import com.example.phonecleaner.utils.HomeItems


class HomeFragment : Fragment() {
    private var views : FragmentHomeBinding? = null
    private var adapter : HomePageOptionAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        views = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return views?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val demoCollectionPagerAdapter = CollectionPagerAdapter(childFragmentManager)
        //viewPager = view.findViewById(R.id.pager)
        views?.pager?.adapter = demoCollectionPagerAdapter
        views?.springDotsIndicator?.attachTo(views!!.pager)
        showHomeItems()
    }

    private fun showHomeItems() {
        adapter = HomePageOptionAdapter(requireContext(), HomeItems.homeList)
        views?.homeFragmentRecyclerView?.layoutManager = GridLayoutManager(requireContext(), 2)
        views?.homeFragmentRecyclerView?.adapter = adapter

    }

    class CollectionPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

        override fun restoreState(state: Parcelable?, loader: ClassLoader?) {
            try {
                super.restoreState(state, loader)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        override fun getCount(): Int  = 5

        override fun getItem(position: Int): Fragment {

            return when (position) {
                0 -> PhoneBoosterHomeFragment()
                1 -> JunkCleanerFragment()
                2 -> PhoneCoolerHomeFragment()
                3 -> PhoneBatteryHomeFragment()
                4 -> PhoneScannerFragment()
                else ->{
                    return PhoneBoosterHomeFragment()
                }

            }
        }

        override fun getPageTitle(position: Int): CharSequence {
            return "OBJECT ${(position + 1)}"
        }
    }
}