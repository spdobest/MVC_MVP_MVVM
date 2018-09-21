package spm.mvc_mvp_mvvm.pagingLib

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.paging.DataSource
import android.arch.paging.LivePagedListBuilder
import android.arch.paging.PagedList
import spm.mvc_mvp_mvvm.mvvm.mvvm.dto.CountryResult

class PostViewModel constructor(application: Application)
    : AndroidViewModel(application) {


    private val postLiveData = MutableLiveData<PagedList<Post>>()

    init {
        postLiveData.value?.size
    }

   // fun getPersonsLiveData() = postLiveData

    fun getPostByPage(pageNo:Int = 1) : LiveData<PagedList<Post>> {
        for(i in 1..10){
            val postId = pageNo.toString()+""+i
            val post = Post(postId,"Post Title "+postId,
                    "Post Description "+postId,"Date "+postId,
                    "Author "+postId
                    )
            postLiveData.value?.add(post)
        }
        return  postLiveData
    }

}