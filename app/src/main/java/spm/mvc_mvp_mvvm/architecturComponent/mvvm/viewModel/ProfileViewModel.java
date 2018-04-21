package spm.mvc_mvp_mvvm.architecturComponent.mvvm.viewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import spm.mvc_mvp_mvvm.architecturComponent.mvvm.model.User;

/**
 * Created by root on 4/21/18.
 */

public class ProfileViewModel extends AndroidViewModel {
    public ProfileViewModel(@NonNull Application application) {
        super(application);
    }

    private LiveData<User> user;
    public LiveData<User> getUser(){
        return user;
    }

}
