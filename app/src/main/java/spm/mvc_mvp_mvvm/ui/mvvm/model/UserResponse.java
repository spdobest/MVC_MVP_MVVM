package spm.mvc_mvp_mvvm.ui.mvvm.model;

import java.util.List;

/**
 * Created by root on 4/4/18.
 */

public class UserResponse {

    List<UserData> listUserData ;

    public List<UserData> getListUserData() {
        return listUserData;
    }

    public void setListUserData(List<UserData> listUserData) {
        this.listUserData = listUserData;
    }
}
