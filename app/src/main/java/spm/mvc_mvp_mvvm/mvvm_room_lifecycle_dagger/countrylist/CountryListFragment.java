package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import spm.mvc_mvp_mvvm.R;
import spm.mvc_mvp_mvvm.databinding.FragmentCountryBinding;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist.adapter.CountryAdapter;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist.model.CountryResult;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist.viewModel.CountryViewModel;

public class CountryListFragment extends Fragment implements LifecycleOwner {

    private static final String TAG = "CountryListFragment";

    List<CountryResult> countryResultList = new ArrayList<>();

    String mParam1;


    private CountryAdapter countryAdapter;
    private FragmentCountryBinding fragmentCountryBinding;

    public CountryListFragment() {
        // Required empty public constructor
    }

    public static CountryListFragment newInstance(String param1) {
        CountryListFragment fragment = new CountryListFragment();
        Bundle args = new Bundle();
        args.putString("ARG_PARAM1", param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString("ARG_PARAM1");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        fragmentCountryBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_country, container, false);

        countryAdapter = new CountryAdapter();
        fragmentCountryBinding.countryList.setAdapter(countryAdapter);
        fragmentCountryBinding.setIsLoading(true);

        CountryViewModel countryViewModel = ViewModelProviders.of(this).get(CountryViewModel.class);
        subscribeCountryList(countryViewModel);

        getLifecycle().addObserver(countryViewModel);

        return fragmentCountryBinding.getRoot();
    }

   /* @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }*/


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

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }


    private void subscribeCountryList(CountryViewModel countryViewModel) {
        countryViewModel.getCOuntriesListObservable().observe(this, countryResults -> {
            if (countryResults != null) {
                fragmentCountryBinding.setIsLoading(false);

                countryResultList.clear();
                countryResultList.addAll(countryResults);
                countryAdapter.setProjectList(countryResultList);
            }
        });
    }

}
