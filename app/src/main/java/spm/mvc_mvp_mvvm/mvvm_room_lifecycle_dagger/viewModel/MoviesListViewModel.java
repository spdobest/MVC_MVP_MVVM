package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.viewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

import java.util.List;

import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.dto.Movie;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.listeners.MoviesListener;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.networkcall.MovieRepository;


public class MoviesListViewModel extends AndroidViewModel  implements LifecycleObserver  {
    private  LiveData<List<Movie>> projectListObservable;

    public MoviesListViewModel(@NonNull Application application) {
        super(application);
    }

    /**
     * Expose the LiveData Projects query so the UI can observe it.
     */
    public LiveData<List<Movie>> getMoviesListObservable() {
        return projectListObservable;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void start() {
        // If any transformation is needed, this can be simply done by Transformations class ...
        projectListObservable = MovieRepository.getInstance().getMoviesList();
     //   moviesListener.onMoviesRefresh(projectListObservable.getValue());
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void stop() {

    }

}