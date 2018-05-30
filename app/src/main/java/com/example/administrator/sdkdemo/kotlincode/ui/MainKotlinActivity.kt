package com.example.administrator.sdkdemo.kotlincode.ui


import android.support.v4.app.Fragment
import com.example.administrator.sdkdemo.R
import com.example.administrator.sdkdemo.R.id.search_pager
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
        var titleList:List<String> =listOf("标题一", "标题二", "标题三")
        var vpAdapter = VpFragmentAdapter(supportFragmentManager, fragments,titleList)

        search_pager.adapter = vpAdapter
        search_pager.offscreenPageLimit = 0
        tab_layout.setupWithViewPager(search_pager)


    }

    override fun initListener() {

    }


}