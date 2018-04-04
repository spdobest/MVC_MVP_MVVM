package spm.mvc_mvp_mvvm.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import spm.mvc_mvp_mvvm.ui.mvvm.retrofit.TwitterApi;

/**
 *
 *
 */
@Module
public class TwitterModule {

    @Provides
    @Singleton
    TwitterApi provideRetrofit(Retrofit retrofit) {
        return retrofit.create(TwitterApi.class);
    }

}