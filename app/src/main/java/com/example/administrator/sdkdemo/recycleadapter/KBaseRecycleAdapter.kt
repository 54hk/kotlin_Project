package com.example.administrator.sdkdemo.recycleadapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class KBaseRecycleAdapter<T>(context:Context ,viewHolder: RecyclerView.ViewHolder,
                             layout: Int,list:List<T>,callBack: RecycleCallBack)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var mContext:Context =context
    var viewHolder:RecyclerView.ViewHolder = viewHolder
    var layout:Int = layout
    var list:List<T> = list
    var callBack: RecycleCallBack = callBack
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val inflate = LayoutInflater.from(mContext).inflate(layout, null)
        viewHolder = KRecycleViewHolder(inflate)
        return viewHolder;
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        callBack.onBindViewHolder(holder,position)
    }


}