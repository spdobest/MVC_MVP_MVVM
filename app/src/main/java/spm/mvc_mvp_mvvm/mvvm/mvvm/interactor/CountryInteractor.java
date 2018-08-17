package spm.mvc_mvp_mvvm.mvvm.mvvm.interactor;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import java.util.List;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import spm.mvc_mvp_mvvm.mvvm.mvvm.dto.CountryResponse;
import spm.mvc_mvp_mvvm.mvvm.mvvm.dto.CountryResult;
import spm.mvc_mvp_mvvm.network.RetrofitAPIInterface;

/**
 * Created by root on 7/20/18.
 */

public class CountryInteractor {

    private static final String TAG = "CountryInteractor";
    /**
     * Here we will do all the network call and send the data to viewModel
     *
     */

    private RetrofitAPIInterface retrofitAPIInterface;
    private static CountryInteractor CountryInteractor;

    private CountryInteractor(Application application) {


        int cacheSize = 10 * 1024 * 1024; // 10 MB
        Cache cache = new Cache(application.getCacheDir(), cacheSize);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .cache(cache)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://services.groupkt.com/country/get/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        retrofitAPIInterface = retrofit.create(RetrofitAPIInterface.class);
    }

    public synchronized static CountryInteractor getInstance(Application application) {
        if (CountryInteractor == null) {
            if (CountryInteractor == null) {
                CountryInteractor = new CountryInteractor(application);
            }
        }
        return CountryInteractor;
    }

    public LiveData<List<CountryResult>> getCountryList() {
        final MutableLiveData<List<CountryResult>> data = new MutableLiveData<>();

        retrofitAPIInterface.getAllCountries().enqueue(new Callback<CountryResponse>() {
            @Override
            public void onResponse(Call<CountryResponse> call, Response<CountryResponse> response) {
                if(response!=null && response.body()!=null &&
                        response.body().getRestResponse()!=null &&
                        response.body().getRestResponse().getResult()!=null &&
                        response.body().getRestResponse().getResult().size()>0
                        ){
                    data.setValue(response.body().getRestResponse().getResult());
                }
            }
            @Override
            public void onFailure(Call<CountryResponse> call, Throwable t) {
                Log.i(TAG, "onFailure: "+call.toString());
            }
            // Error handling will be explained in the next article …
        });
        Log.i(TAG, "on Return Value");
        return data;
    }
}
