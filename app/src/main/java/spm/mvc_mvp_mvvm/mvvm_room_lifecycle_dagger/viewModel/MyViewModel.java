package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.viewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;

import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.dto.Movie;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.networkcall.MovieRepository;

public class MyViewModel extends ViewModel {

//	https://medium.com/@gauravgyal/android-architecture-pattern-components-mvvm-livedata-viewmodel-lifecycle-544e84e85177
//	https://medium.com/@ramtrg/https-medium-com-ramtrg-mvvm-architecture-components-4d17d3f09bb7
//	https://android.jlelse.eu/android-architecture-components-now-with-100-more-mvvm-11629a630125
//	https://medium.com/exploring-android/exploring-the-new-android-architecture-components-c33b15d89c23
	private MovieRepository movieRepository;

	private MutableLiveData<Movie> selectedItem;
    private LiveData<List<Movie>> busList;

	public MyViewModel(@Nullable MovieRepository busRepository) {
		if (this.movieRepository != null) {
			// ViewModel is created per Activity, so instantiate once
			// we know the userId won't change
			return;
		}
		if (movieRepository != null) {
			this.movieRepository = busRepository;
		}
	}

	public void onPullRequested() {
		movieRepository.getMoviesList();
	}


	public LiveData<List<Movie>> getBusList() {
		if (busList == null) {
			busList = new MutableLiveData<>();
			loadBuses();
		}
		return busList;
	}

	public LiveData<Movie> getSelectedItem() {
		if (selectedItem == null) {
			selectedItem = new MutableLiveData<>();
		}
		return selectedItem;
	}

	private void loadBuses() {

	}

}