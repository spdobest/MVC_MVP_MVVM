package spm.mvc_mvp_mvvm.architecturComponent.mvvm.repositori;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import spm.mvc_mvp_mvvm.architecturComponent.mvvm.model.User;
import spm.mvc_mvp_mvvm.architecturComponent.mvvm.room.UserCache;

public class UserRepository {
    private Webservice webservice;
    // simple in memory cache, details omitted for brevity
    // private UserCache userCache;
    public LiveData<User> getUser(String userId) {
       /* LiveData<User> cached = userCache.get(userId);
        if (cached != null) {
            return cached;
        }*/

        final MutableLiveData<User> data = new MutableLiveData<>();
       // userCache.put(userId, data);
        // this is still suboptimal but better than before.
        // a complete implementation must also handle the error cases.
        webservice.getUser(userId).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
        return data;
    }
}
