package spm.mvc_mvp_mvvm.twoWayDatabinding.viewModel;

/**
 * Created by root on 4/27/18.
 */

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.transition.Visibility;
import android.view.View;

import com.android.databinding.library.baseAdapters.BR;

public class LoginViewModel extends BaseObservable {
    private String email;
    private String password;
    private int busy;

    public LoginViewModel(String email, String password) {
        this.email = email;
        this.password = password;
        this.busy = View.GONE;
    }

    public LoginViewModel(LoginViewModel lvm) {
        this.email = lvm.email;
        this.password = lvm.password;
        this.busy = lvm.busy;
    }

    @Bindable
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    @Bindable
    public int getBusy() {
        return this.busy;
    }

}