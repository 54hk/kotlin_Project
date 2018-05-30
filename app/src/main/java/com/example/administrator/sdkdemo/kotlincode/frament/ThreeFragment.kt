package com.example.administrator.sdkdemo.kotlincode.frament

import android.view.View
import com.example.administrator.sdkdemo.R
import com.example.administrator.sdkdemo.kotlincode.BaseFragment
import kotlinx.android.synthetic.main.three_fragment.*

class ThreeFragment : BaseFragment() {

    override fun initVIew(): Int {
        return R.layout.three_fragment
    }

    override fun initData() {

    }

    override fun getView(): View? {
        return super.getView()
    }

    override fun initListener() {

        startbut.setOnClickListener { toast("你TM 点 jb") }
    }
}