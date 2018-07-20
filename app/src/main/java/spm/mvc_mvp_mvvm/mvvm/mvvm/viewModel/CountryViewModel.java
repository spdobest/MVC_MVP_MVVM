package spm.mvc_mvp_mvvm.mvvm.mvvm.viewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.NonNull;
import android.util.Log;

import java.util.List;

import spm.mvc_mvp_mvvm.mvvm.mvvm.interactor.CountryInteractor;
import spm.mvc_mvp_mvvm.mvvm.mvvm.dto.CountryResult;


/**
 * Created by root on 4/26/18.
 */

public class CountryViewModel extends AndroidViewModel implements LifecycleObserver {

    private static final String TAG = "CountryViewModel";

    private LiveData<List<CountryResult>> countryList = new MutableLiveData<>();

    // create livedata country list
    private LiveData<List<CountryResult>> livedataCountryList;

    public CountryViewModel(@NonNull Application application) {
        super(application);

        countryList = CountryInteractor.getInstance().getCountryList();

    }

    public LiveData<List<CountryResult>> getCOuntriesListObservable() {
        return countryList;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    void any() {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void stop() {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate() {
        Log.i(TAG, "onCreate: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStart() {
        Log.i(TAG, "onStart: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop() {
        Log.i(TAG, "onStop: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause() {
        Log.i(TAG, "onPause: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume() {
        Log.i(TAG, "onResume: ");
    }

}