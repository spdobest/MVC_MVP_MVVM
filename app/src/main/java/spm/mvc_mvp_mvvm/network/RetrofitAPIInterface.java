package spm.mvc_mvp_mvvm.network;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import spm.mvc_mvp_mvvm.architecturComponent.mvvm.model.User;
import spm.mvc_mvp_mvvm.mvvm.mvvm.dto.CountryResponse;

public interface RetrofitAPIInterface {

    @POST("/api/users")
    Call<User> createUser(@Body User user);

   // @GET("movie/550?api_key=b7eb389e9e6ad5e434077e4b6d83ad78")
   // Call<MovieResponse> getTopMovies();

//  http://services.groupkt.com/country/get/all
    @GET("all")
    Call<CountryResponse> getAllCountries();



}