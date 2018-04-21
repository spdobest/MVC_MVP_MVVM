package spm.mvc_mvp_mvvm.architecturComponent.mvvm.repositori;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import spm.mvc_mvp_mvvm.architecturComponent.mvvm.model.User;

public interface Webservice {
    /**
     * @GET declares an HTTP GET request
     * @Path("user") annotation on the userId parameter marks it as a
     * replacement for the {user} placeholder in the @GET path
     */
    @GET("/users/{user}")
    Call<User> getUser(@Path("user") String userId);
}