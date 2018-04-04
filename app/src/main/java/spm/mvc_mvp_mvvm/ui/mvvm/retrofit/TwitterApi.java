package spm.mvc_mvp_mvvm.ui.mvvm.retrofit;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Query;
import spm.mvc_mvp_mvvm.ui.mvvm.model.UserData;


public interface TwitterApi {

    // +919821273130
    @POST("GetAvailableChatList.php")
    Observable<List<UserData>> getTrends(@Query("UserId") String userId);
}