package spm.mvc_mvp_mvvm.network

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import spm.mvc_mvp_mvvm.dto.SearchResponse

/**
 * Created by root on 4/13/18.
 */
interface ApiInterface {
    @GET("api.php")
    fun hitCountCheck(@Query("action") action: String,
                      @Query("format") format: String,
                      @Query("list") list: String,
                      @Query("srsearch") srsearch: String):
            Observable<SearchResponse.Result>

}