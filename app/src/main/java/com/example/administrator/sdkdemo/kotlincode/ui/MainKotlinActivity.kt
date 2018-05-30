package com.example.administrator.sdkdemo.kotlincode.ui


import android.support.v4.app.Fragment
import com.example.administrator.sdkdemo.R
import com.example.administrator.sdkdemo.kotlincode.BaseActivity
import com.example.administrator.sdkdemo.kotlincode.adapter.VpFragmentAdapter
import com.example.administrator.sdkdemo.kotlincode.frament.OneFragment
import com.example.administrator.sdkdemo.kotlincode.frament.ThreeFragment
import com.example.administrator.sdkdemo.kotlincode.frament.TwoFragment
import kotlinx.android.synthetic.main.kotlin_class_layout.*

class MainKotlinActivity : BaseActivity() {
    var fragments: MutableList<Fragment> = ArrayList()
    override fun initView(): Int {
        return R.layout.kotlin_class_layout
    }

    override fun initData() {
        fragments.add(OneFragment())
        fragments.add(TwoFragment())
        fragments.add(ThreeFragment())
        var vpAdapter = VpFragmentAdapter(supportFragmentManager, fragments)

        search_pager.adapter = vpAdapter
        search_pager.offscreenPageLimit = 0
        tab_layout.setupWithViewPager(search_pager)

    }

    override fun initListener() {

    }


}