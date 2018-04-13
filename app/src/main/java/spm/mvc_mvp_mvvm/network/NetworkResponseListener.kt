package spm.mvc_mvp_mvvm.network

/**
 * Created by root on 4/13/18.
 */
interface NetworkResponseListener<in T> {
    fun onResponse(responseObject: T )
    fun onError(responseObject: T)
}