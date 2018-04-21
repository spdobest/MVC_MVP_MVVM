package spm.mvc_mvp_mvvm.ui.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import spm.mvc_mvp_mvvm.R;
import spm.mvc_mvp_mvvm.ui.mvp.presenter.LoginPresenter;
import spm.mvc_mvp_mvvm.ui.mvp.view.LoginViewInterface;

public class MvpLoginActivity extends AppCompatActivity implements LoginViewInterface {
    private static final String TAG = "MvpLoginActivity";


    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp_login);

        loginPresenter = new LoginPresenter(MvpLoginActivity.this,this);


        loginPresenter.makeUserValidation("emailid","password");
    }

    @Override
    public void showError(String errorMessage) {
        Log.i(TAG, "showError: ");
    }

    @Override
    public void setData(String loginData) {
        Log.i(TAG, "setData: "+loginData);
    }
}
