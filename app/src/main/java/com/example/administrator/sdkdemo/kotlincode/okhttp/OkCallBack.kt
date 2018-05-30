package hk.meiyan.com.kotlincode.okhttp

import okhttp3.Call
import okhttp3.Response
import java.io.IOException

/**
 * Created by 54hk on 2018/5/25.
 */
interface OkCallBack {
     fun onFailure(call: Call?, e: IOException?)
     fun onResponse(call: Call?, response: Response?)
}