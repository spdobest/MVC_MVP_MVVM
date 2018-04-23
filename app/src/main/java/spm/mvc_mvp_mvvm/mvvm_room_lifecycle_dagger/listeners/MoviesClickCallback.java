package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.listeners;

import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.dto.Movie;

public interface MoviesClickCallback {
    void onMovieClickClick(Movie movie);
}