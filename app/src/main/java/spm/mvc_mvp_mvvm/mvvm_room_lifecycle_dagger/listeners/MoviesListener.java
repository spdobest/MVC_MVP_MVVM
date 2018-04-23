package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.listeners;

import java.util.List;

import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.dto.Movie;

public interface MoviesListener {
    void onMoviesRefresh(List<Movie> listMovies);
}
