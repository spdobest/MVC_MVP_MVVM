package spm.mvc_mvp_mvvm.twoWayDatabinding.dto;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.widget.Toast;

import spm.mvc_mvp_mvvm.BR;

/**
 * Created by root on 4/27/18.
 */

public class UserData extends BaseObservable {
    private String email;
    private String password;
    private Context context;

    public UserData(Context context) {
        this.context = context;
    }

    @Bindable
    public String getEmail() {
        if (email == null) {
            return "";
        }
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable({"email"})
    public String getEmailError() {
        if (getEmail().isEmpty()) {
            return "EMAIL IS EMPTY";
        }
        return "";
    }

    @Bindable
    public String getPassword() {
        if (password == null) {
            return "";
        }
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    @Bindable({"password"})
    public String getPasswordError() {
        if (getPassword().isEmpty()) {
            return "PASSWORD IS EMPTY";
        } else {
            return "";
        }
    }

}