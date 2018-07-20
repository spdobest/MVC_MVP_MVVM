package spm.mvc_mvp_mvvm

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_design_pattern.*
import spm.mvc_mvp_mvvm.mvc.MvcMainActivity

class DesignPatternActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_design_pattern)

        buttonMvc.setOnClickListener(View.OnClickListener {
            var intentMvc = Intent(this,MvcMainActivity::class.java)
            startActivity(intentMvc); })

       /* buttonMVVM.setOnClickListener(View.OnClickListener {
            var intentMvc = Intent(this, AllMainActivity::class.java)
            startActivity(intentMvc); })

        buttonMVVM.setOnClickListener(View.OnClickListener {
            var intentMvc = Intent(this, AllMainActivity::class.java)
            startActivity(intentMvc); })

        buttonMvvmWithLiveData.setOnClickListener(View.OnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.frameContainer, CountryListFragment.newInstance(""), "").commit()
             })

        buttonTwoWayDataBinding.setOnClickListener(View.OnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.frameContainer, TwoDataBindingFragment.newInstance(""), "").commit()
        })*/



    }
}
