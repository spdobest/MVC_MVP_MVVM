package spm.mvc_mvp_mvvm.mvvm_java.view.ui;

import android.app.Fragment;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class LifecycleFragment extends Fragment
  implements LifecycleOwner {
  private LifecycleRegistry registry=new LifecycleRegistry(this);

  @Override
  public Lifecycle getLifecycle() {
    return(registry);
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    registry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
  }

  @Override
  public void onStart() {
    super.onStart();

    registry.handleLifecycleEvent(Lifecycle.Event.ON_START);
  }

  @Override
  public void onResume() {
    super.onResume();

    registry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
  }

  @Override
  public void onPause() {
    super.onPause();

    registry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
  }

  @Override
  public void onStop() {
    super.onStop();

    registry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
  }

  @Override
  public void onDestroy() {
    super.onDestroy();

    registry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
  }
}