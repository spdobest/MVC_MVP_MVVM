package spm.mvc_mvp_mvvm.dto

/**
 * Created by root on 4/13/18.
 */
object Model {
    data class Result(val query: Query)
    data class Query(val searchinfo: SearchInfo)
    data class SearchInfo(val totalhits: Int)
}