package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.di.component;

import javax.inject.Singleton;

import dagger.Component;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.di.module.AppModule;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.di.module.NetworkModule;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.di.module.TwitterModule;
import spm.mvc_mvp_mvvm.mvc.MvcMainActivity;
import spm.mvc_mvp_mvvm.mvp.MvpMainActivity;
import spm.mvc_mvp_mvvm.ui.mvvm.MvvmMainActivity;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class, TwitterModule.class})
public interface AppComponent {

    void inject(MvcMainActivity activity);

    void inject(MvpMainActivity activity);

    void inject(MvvmMainActivity activity);

}