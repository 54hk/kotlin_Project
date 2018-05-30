package com.example.administrator.sdkdemo.kotlincode

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(initView())
        initData()
        initListener()
    }

    abstract fun initView(): Int
    abstract fun initData()
    abstract fun initListener()
}