package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import spm.mvc_mvp_mvvm.R;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist.CountryListFragment;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.ui.MoviesFragment;
import spm.mvc_mvp_mvvm.network.RetrofitResponseListener;

public class AllMainActivity extends AppCompatActivity implements RetrofitResponseListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_main);


//        getSupportFragmentManager().beginTransaction().add(MoviesFragment.newInstance(""),"").commit();

    }

    @Override
    public void onResponse(Object object,int tag) {

    }

    @Override
    public void onError(String error) {

    }
}
