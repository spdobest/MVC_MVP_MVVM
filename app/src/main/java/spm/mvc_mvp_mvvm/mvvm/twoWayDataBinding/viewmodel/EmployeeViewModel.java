package spm.mvc_mvp_mvvm.mvvm.twoWayDataBinding.viewmodel;

import android.databinding.ObservableField;


public class EmployeeViewModel implements BaseViewModel {
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableField<String> dob = new ObservableField<>();

    public EmployeeViewModel() {

    }

    public void update() {
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }
}