package spm.mvc_mvp_mvvm.architecturComponent;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

import android.content.Context;

import static android.arch.lifecycle.Lifecycle.State.STARTED;

class MyLocationListener implements LifecycleObserver {
    Lifecycle lifecycle;
    MyLOcationListener myLOcationListener;
    private boolean enabled = false;
    public MyLocationListener(Context context, Lifecycle lifecycle, MyLOcationListener callback) {
        this.lifecycle = lifecycle;
        this.myLOcationListener = callback;
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void start() {
        if (enabled) {
            // connect and get the location and send to Activity through callback
        }
    }
    public void enable() {
        enabled = true;
        if (lifecycle.getCurrentState().isAtLeast(STARTED)) {
            // connect if not connected
            myLOcationListener.onDetectLocation("location");
        }
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void stop() {
        // disconnect if connected
        myLOcationListener.onDetectLocation("location stop");
    }
}