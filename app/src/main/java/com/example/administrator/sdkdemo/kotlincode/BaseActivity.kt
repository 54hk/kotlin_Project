package com.example.administrator.sdkdemo.kotlincode

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import java.time.Duration

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
    fun toast(mgs:String,duration: Int = Toast.LENGTH_SHORT){
        Toast.makeText(this,mgs,duration)
    }
}