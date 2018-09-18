package spm.mvc_mvp_mvvm.mvvm.screenorientation;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LiveData;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

public class RegistrationViewModel extends AndroidViewModel implements LifecycleObserver {
    // https://android.jlelse.eu/android-architecture-pattern-components-mvvm-livedata-viewmodel-lifecycle-544e84e85177
    private LiveData<RegistrationModel> registerLiveData;

    public ObservableField<RegistrationModel> news = new ObservableField<>();

    public RegistrationViewModel(@NonNull Application application) {
        super(application);
        // a differnt source can be passed, here i am passing techcrunch
    }
    public LiveData<RegistrationModel> getObservableRegistrationModel() {
        return registerLiveData;
    }

    public void setObservableRegistrationModel(LiveData<RegistrationModel> registrationModel) {
        this.registerLiveData = registrationModel;
    }
}
