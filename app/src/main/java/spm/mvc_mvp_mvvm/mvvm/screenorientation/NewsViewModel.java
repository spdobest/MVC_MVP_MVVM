package spm.mvc_mvp_mvvm.mvvm.screenorientation;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

public class NewsViewModel extends AndroidViewModel {
    // https://android.jlelse.eu/android-architecture-pattern-components-mvvm-livedata-viewmodel-lifecycle-544e84e85177
    private final LiveData<RegistrationModel> registerLiveData;

    public ObservableField<RegistrationModel> news = new ObservableField<>();

    public NewsViewModel(@NonNull Application application) {
        super(application);
        // a differnt source can be passed, here i am passing techcrunch
        registerLiveData = NewsRepository.getInstance().getNews("techcrunch");
    }

    public LiveData<RegistrationModel> getObservableRegistrationModel() {
        return registerLiveData;
    }
}
