package spm.mvc_mvp_mvvm.pagingLib

import android.arch.paging.PagedListAdapter
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.arch.lifecycle.MutableLiveData
import android.content.Context
import android.support.v7.util.DiffUtil
import android.view.LayoutInflater
import spm.mvc_mvp_mvvm.R


public class MyPagingAdapter(val context: Context/*,
                             diffCallback: DiffUtil.ItemCallback<Post>*/)
    : PagedListAdapter<Post, MyPagingAdapter.ViewHolder>(PostDiffCallback()) {

    companion object {
        val TAG = "MyPagingAdapter"
    }

    // Use to hold a reference to the
    var postLiveData: MutableLiveData<Post>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.itemview_paging,
                parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var post = getItem(position)

        if (post != null) {

        }
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){


    }

    class PostDiffCallback : DiffUtil.ItemCallback<Post>() {

        override fun areItemsTheSame(oldItem: Post, newItem: Post): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Post?, newItem: Post?): Boolean {
            return oldItem == newItem
        }
    }

}