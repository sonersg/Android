package com.example.tablayoutwithkotlin.fragments.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tablayoutwithkotlin.fragments.FavoritesFragment
import com.example.tablayoutwithkotlin.fragments.HomeFragment
import com.example.tablayoutwithkotlin.fragments.SettingsFragment

internal class ViewPagerAdapter(
    var context: Context, fm: FragmentManager,
    var totalTabs: Int
) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        TODO("Not yet implemented")
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                FavoritesFragment()
            }
            2 -> {
                SettingsFragment()
            }
            else -> getItem(position)
        }
    }
}