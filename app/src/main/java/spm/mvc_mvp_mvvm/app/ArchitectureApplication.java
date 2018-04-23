package spm.mvc_mvp_mvvm.app;

import android.app.Application;
import android.content.res.Configuration;

import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.di.component.AppComponent;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.di.component.DaggerAppComponent;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.di.module.AppModule;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.di.module.NetworkModule;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.di.module.TwitterModule;

/**
 * Created by root on 4/4/18.
 */

public class ArchitectureApplication extends Application {

    private static AppComponent component;


    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
