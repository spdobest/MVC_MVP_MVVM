package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.networkcall;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.dto.Movie;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.dto.MovieResponse;
import spm.mvc_mvp_mvvm.network.RetrofitAPIInterface;

public class MovieRepository {

    private RetrofitAPIInterface retrofitAPIInterface;
    private static MovieRepository movieRepository;

    private MovieRepository() {
        //TODO this gitHubService instance will be injected using Dagger in part #2 ...
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofitAPIInterface = retrofit.create(RetrofitAPIInterface.class);
    }

    public synchronized static MovieRepository getInstance() {
        if (movieRepository == null) {
            if (movieRepository == null) {
                movieRepository = new MovieRepository();
            }
        }
        return movieRepository;
    }


    public LiveData<List<Movie>> getMoviesList() {
        final MutableLiveData<List<Movie>> data = new MutableLiveData<>();

        retrofitAPIInterface.getTopMovies().enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                if(response!=null && response.body()!=null && response.body().getResults().size()>0){
                    data.setValue(response.body().getResults());
                }
            }
            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {
            }
            // Error handling will be explained in the next article …
        });
        return data;
    }
    private void simulateDelay() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}