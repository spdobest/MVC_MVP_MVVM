package spm.mvc_mvp_mvvm.mvvm.twoWayDataBinding.utils;

import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;

public class BaseObservable implements Observable {
    private PropertyChangeRegistry mCallbacks;

    public synchronized void addOnPropertyChangedCallback(OnPropertyChangedCallback listener) {
        if (this.mCallbacks == null) {
            this.mCallbacks = new PropertyChangeRegistry();
        }

        this.mCallbacks.add(listener);
    }

    public synchronized void removeOnPropertyChangedCallback(OnPropertyChangedCallback listener) {
        if (this.mCallbacks != null) {
            this.mCallbacks.remove(listener);
        }
    }

    public synchronized void notifyChange() {
        if (this.mCallbacks != null) {
            this.mCallbacks.notifyCallbacks(this, 0, null);
        }
    }

    public void notifyPropertyChanged(int fieldId) {
        if (this.mCallbacks != null) {
            this.mCallbacks.notifyCallbacks(this, fieldId, null);
        }
    }
}