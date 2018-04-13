package spm.mvc_mvp_mvvm.network

import retrofit2.converter.gson.GsonConverterFactory
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit



/**
 * Created by root on 4/13/18.
 */

class APiClient{
    val BASE_URL = "http://api.myservice.com/"


    fun getRetrofitClient(baseUrl:String): Retrofit {
        val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build()

        return retrofit
      //  return retrofit.create<GithubApiService>(GithubApiService::class.java!!)
    }

}