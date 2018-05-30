package com.example.administrator.sdkdemo.kotlincode.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class KBaseListAdapter<T>(context:Context, list:List<T>): BaseAdapter() {
    var mContext:Context = context
    var list:List<T> = list

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItem(p0: Int): T {
        return list!!.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
       return list.size
    }
}