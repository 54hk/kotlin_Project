package com.example.administrator.sdkdemo.kotlincode

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.administrator.sdkdemo.R

abstract class BaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val inflate: View = inflater!!.inflate(initVIew(), null)
        initData()
        initListener()
        return inflate
    }


    //初始化view
    abstract fun initVIew(): Int

    //初始化数据
    abstract fun initData()

    // 监听事件
    abstract fun initListener()

}