package com.example.administrator.sdkdemo.kotlincode.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import java.util.logging.LoggingMXBean

class VpFragmentAdapter(fm: FragmentManager?, list: List<Fragment>) : FragmentPagerAdapter(fm) {
    var fm: FragmentManager? = fm
    var list: List<Fragment> = list
    var titles: List<String> = listOf("标题一", "标题二", "标题三")
    override fun getItem(position: Int): Fragment {
        return list.get(position)
    }

    override fun getCount(): Int {
        return list.size
    }

    override fun getPageTitle(position: Int): CharSequence {

        return titles.get(position)
    }
}