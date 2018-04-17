package spm.mvc_mvp_mvvm.ui.mvp.presenter;

import android.content.Context;
import android.text.TextUtils;

import spm.mvc_mvp_mvvm.ui.mvp.interactor.LoginInteractor;
import spm.mvc_mvp_mvvm.ui.mvp.view.LoginViewInterface;

/**
 * Created by root on 4/17/18.
 */

public class LoginPresenter implements PresenterInterface {

    Context context;
    LoginViewInterface loginViewInterface;
    LoginInteractor loginInteractor;


    public LoginPresenter(Context context, LoginViewInterface loginViewInterface) {
        this.context = context;
        this.loginViewInterface = loginViewInterface;
        loginInteractor = new LoginInteractor(context, this);
    }

    public void makeUserValidation(String email,String password){

        if(TextUtils.isEmpty(email)){

        }
        else if(TextUtils.isEmpty(password)){
            loginViewInterface.showError("Password Must Be more than 6 digits");
        }
        else{
            loginInteractor.makeLogin(email,password);
        }
    }

    @Override
    public void showError(String errorMessage) {

    }

    @Override
    public void setData(String loginData) {
        loginViewInterface.setData(loginData);
    }
}
