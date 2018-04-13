package spm.mvc_mvp_mvvm.dto

/**
 * Created by root on 4/13/18.
 */
data class User(
        val login: String,
        val id: Long,
        val url: String,
        val html_url: String,
        val followers_url: String,
        val following_url: String,
        val starred_url: String,
        val gists_url: String,
        val type: String,
        val score: Int
)