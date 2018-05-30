package com.example.administrator.sdkdemo.recycleadapter

import android.support.v7.widget.RecyclerView

interface RecycleCallBack {
    fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int)
}