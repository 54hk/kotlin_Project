package hk.meiyan.com.kotlincode.okhttp

import okhttp3.*
import java.io.IOException

/**
 * Created by 54hk on 2018/5/25.
 */
class OkhttpUtils private constructor() {
    companion object {
        private var okhttp: OkhttpUtils? = null
        fun getIndance(): OkhttpUtils {
            if (okhttp == null) {
                synchronized(OkhttpUtils::class.java) {
                    if (okhttp == null) {
                        okhttp = OkhttpUtils()

                    }
                }
            }
            return okhttp!!
        }
    }

    // get 请求
    fun get(url: String, callBack: OkCallBack) {

        OkHttpClient().newCall(Request.Builder().get().url(url).build()).enqueue(object : Callback {
            override fun onFailure(call: Call?, e: IOException?) {
                callBack.onFailure(call, e)
            }

            override fun onResponse(call: Call?, response: Response?) {
                callBack.onResponse(call, response)
            }
        })

    }

    fun post(url: String, map: MutableMap<String, String>, callBack: OkCallBack) {
        var postBody = MultipartBody.Builder()
                .setType(MultipartBody.FORM);
        for ((key, value) in map) {
            postBody.addFormDataPart(key, value)
        }
        OkHttpClient().newCall(Request.Builder().url(url).post(postBody.build()).build()).enqueue(object : Callback {
            override fun onFailure(call: Call?, e: IOException?) {
                callBack.onFailure(call, e)
            }

            override fun onResponse(call: Call?, response: Response?) {
                callBack.onResponse(call, response)
            }

        })

    }
}
