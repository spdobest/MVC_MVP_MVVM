package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist.model.CountryResponse;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist.model.CountryResult;
import spm.mvc_mvp_mvvm.network.RetrofitAPIInterface;

/**
 * Created by root on 4/26/18.
 */

public class CountryRepository {

    private static final String TAG = "CountryRepository";


    private RetrofitAPIInterface retrofitAPIInterface;
    private static CountryRepository countryRepository;

    private CountryRepository() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://services.groupkt.com/country/get/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofitAPIInterface = retrofit.create(RetrofitAPIInterface.class);
    }

    public synchronized static CountryRepository getInstance() {
        if (countryRepository == null) {
            if (countryRepository == null) {
                countryRepository = new CountryRepository();
            }
        }
        return countryRepository;
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
