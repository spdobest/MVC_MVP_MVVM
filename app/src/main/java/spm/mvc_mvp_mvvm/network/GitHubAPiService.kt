package spm.mvc_mvp_mvvm.network

import retrofit2.converter.gson.GsonConverterFactory
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query
import spm.mvc_mvp_mvvm.dto.SearchResponse


/**
 * Created by root on 4/13/18.
 */
interface GithubApiService {

    @GET("search/users")
    fun search(@Query("q") query: String, @Query("page") page: Int, @Query("per_page") perPage: Int): Observable<SearchResponse>

    /**
     * Factory class for convenient creation of the Api Service interface
     */
    object Factory {

        fun create(): GithubApiService {
            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://api.github.com/")
                    .build()

            return retrofit.create(GithubApiService::class.java)
        }
    }
}