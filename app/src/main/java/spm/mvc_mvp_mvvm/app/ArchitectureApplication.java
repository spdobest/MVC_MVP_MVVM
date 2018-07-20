package spm.mvc_mvp_mvvm.app;

import android.app.Application;
import android.content.res.Configuration;



/**
 * Created by root on 4/4/18.
 */

public class ArchitectureApplication extends Application {



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
