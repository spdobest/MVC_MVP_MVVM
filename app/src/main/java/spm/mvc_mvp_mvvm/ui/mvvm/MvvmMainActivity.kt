package spm.mvc_mvp_mvvm.ui.mvvm

import android.graphics.Movie
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import spm.mvc_mvp_mvvm.R
import spm.mvc_mvp_mvvm.ui.mvvm.retrofit.APIClient
import spm.mvc_mvp_mvvm.ui.mvvm.retrofit.TwitterApi
import javax.inject.Inject


// www.trigbug.com/Connect/WebServices/GetAvailableChatList.php
// UserId : +919821273130

class MvvmMainActivity : AppCompatActivity() {

    lateinit var apiService:TwitterApi

    // example
    // https://github.com/r7v/Tweetz/tree/master/app/src/main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm_main)

        apiService = APIClient.getClient().create(TwitterApi::class.java)


    }
}


}