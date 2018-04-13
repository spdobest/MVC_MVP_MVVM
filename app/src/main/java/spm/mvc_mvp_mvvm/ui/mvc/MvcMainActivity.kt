package spm.mvc_mvp_mvvm.ui.mvc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_mvc_main.*
import spm.mvc_mvp_mvvm.R
import spm.mvc_mvp_mvvm.network.NetworkResponseListener
import spm.mvc_mvp_mvvm.network.WikiApiService
import java.util.*

class MvcMainActivity : AppCompatActivity(),NetworkResponseListener<Objects> {

    private var disposable: Disposable? = null

    private val wikiApiServe by lazy {
        WikiApiService.create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc_main)


        btn_search.setOnClickListener {
            if (edit_search.text.toString().isNotEmpty()) {
                beginSearch(edit_search.text.toString())
            }
        }

    }

    private fun beginSearch(searchString: String) {
        disposable = wikiApiServe.hitCountCheck("query", "json", "search", searchString)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result -> txt_search_result.text = "${result.query.searchinfo.totalhits} result found" },
                        { error -> Toast.makeText(this, error.message, Toast.LENGTH_SHORT).show() }
                )
    }

    override fun onPause() {
        super.onPause()
        disposable?.dispose()
    }

    override fun onResponse(responseObject: Objects) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(responseObject: Objects) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
