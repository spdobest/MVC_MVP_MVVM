package spm.mvc_mvp_mvvm.architecturComponent;

import android.arch.lifecycle.LifecycleOwner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import spm.mvc_mvp_mvvm.R;

public class ComponentActivity extends AppCompatActivity
        implements LifecycleOwner,
        MyLOcationListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component);
        getLifecycle().addObserver(new MyLocationListener(this,getLifecycle(),this));
    }
    @Override
    public void onDetectLocation(String location) {
        // Show the location in the map here
    }
    @Override
    public void onLocationFail(String error) {
        // show error
    }
}


