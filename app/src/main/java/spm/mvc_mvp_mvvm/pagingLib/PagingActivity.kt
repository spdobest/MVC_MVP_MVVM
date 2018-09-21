package spm.mvc_mvp_mvvm.pagingLib

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import spm.mvc_mvp_mvvm.R
import java.util.Observer

class PagingActivity : AppCompatActivity() {

    // https://code.tutsplus.com/tutorials/android-architecture-components-using-the-paging-library-with-room--cms-31535


    private lateinit var viewModel: PostViewModel
    lateinit var recyclerView:RecyclerView

     var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paging)

        recyclerView = findViewById<RecyclerView>(R.id.recyclerViewPaging)

        viewModel = ViewModelProviders.of(this).get(PostViewModel::class.java)

        val adapter = MyPagingAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        recyclerView.adapter = adapter

        // subscribeUi(adapter)


        Handler().postDelayed(Runnable {
            viewModel.getPostByPage(count++).observe(this,android.arch.lifecycle.Observer {
                adapter.submitList(it)
            })
        },5000)
    }

    private fun subscribeUi(adapter: MyPagingAdapter) {
        viewModel.getPostByPage(1).observe(this,android.arch.lifecycle.Observer {
            adapter.submitList(it)
        })
    }
}
