package spm.mvc_mvp_mvvm.app;

import android.app.Application;
import android.content.res.Configuration;

import spm.mvc_mvp_mvvm.di.component.AppComponent;
import spm.mvc_mvp_mvvm.di.component.DaggerAppComponent;
import spm.mvc_mvp_mvvm.di.module.AppModule;
import spm.mvc_mvp_mvvm.di.module.NetworkModule;
import spm.mvc_mvp_mvvm.di.module.TwitterModule;

/**
 * Created by root on 4/4/18.
 */

public class ArchitectureApplication extends Application {

    private static AppComponent component;


    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder()
                .twitterModule(new TwitterModule())
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .build();

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
