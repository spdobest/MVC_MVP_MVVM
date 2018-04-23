package spm.mvc_mvp_mvvm.mvp.interactor;

import android.content.Context;

import spm.mvc_mvp_mvvm.mvp.presenter.PresenterInterface;

/**
 * Created by root on 4/17/18.
 */

public class LoginInteractor {
    Context context;
    PresenterInterface presenterInterface;

    public LoginInteractor(Context context, PresenterInterface presenterInterface) {
        this.context = context;
        this.presenterInterface = presenterInterface;
    }

    public void makeLogin(String email,String password){
        // make the network call
        presenterInterface.setData("Login Success");
    }
}
