package spm.mvc_mvp_mvvm.mvvm.mvvm;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import spm.mvc_mvp_mvvm.R;
import spm.mvc_mvp_mvvm.mvvm.mvvm.adapter.CountryAdapter;
import spm.mvc_mvp_mvvm.mvvm.mvvm.dto.CountryResult;
import spm.mvc_mvp_mvvm.mvvm.mvvm.viewModel.CountryViewModel;

public class SimpleMvvmActivity extends AppCompatActivity implements LifecycleOwner {

    List<CountryResult> countryResultList = new ArrayList<>();
    private CountryAdapter countryAdapter;

    private RecyclerView recyclerViewCountry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_mvvm);

        recyclerViewCountry = findViewById(R.id.recyclerViewCountry);
        recyclerViewCountry.setLayoutManager(new LinearLayoutManager(this));
        countryAdapter = new CountryAdapter(countryResultList);
        recyclerViewCountry.setAdapter(countryAdapter);
        CountryViewModel countryViewModel = ViewModelProviders.of(this).get(CountryViewModel.class);
        subscribeCountryList(countryViewModel);
        getLifecycle().addObserver(countryViewModel);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    private void subscribeCountryList(CountryViewModel countryViewModel) {
        countryViewModel.getCOuntriesListObservable().observe(this, countryResults -> {
            if (countryResults != null) {

                countryResultList.clear();
                countryResultList.addAll(countryResults);
                countryAdapter.notifyDataSetChanged();
//               countryAdapter.setProjectList(countryResultList);
            }
        });
    }
}
