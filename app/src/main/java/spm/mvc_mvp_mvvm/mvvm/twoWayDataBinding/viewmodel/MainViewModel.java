package spm.mvc_mvp_mvvm.mvvm.twoWayDataBinding.viewmodel;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;

import spm.mvc_mvp_mvvm.mvvm.twoWayDataBinding.utils.BindableEditText;

public class MainViewModel implements BaseViewModel {
    public final BindableEditText bookTitle = new BindableEditText();
    public final ObservableList<EmployeeViewModel> items = new ObservableArrayList<>();

    public MainViewModel() {
        for (int i = 0; i < 15; i++) {
            EmployeeViewModel model = new EmployeeViewModel();
            model.name.set("name " + (i + 1));
            model.dob.set((10 + i) + "-" + "02-" + (1890 + i));
            items.add(model);
        }
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }
}