package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.ui;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import spm.mvc_mvp_mvvm.R;
import spm.mvc_mvp_mvvm.databinding.FragmentMoviesBinding;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.adapter.MoviesAdapter;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.dto.Movie;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.listeners.MoviesListener;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.viewModel.MoviesListViewModel;

public class MoviesFragment extends Fragment implements LifecycleOwner, MoviesListener {
    private static final String TAG = "MoviesFragment";
    @BindView(R.id.loading_projects)
    TextView loadingProjects;
    @BindView(R.id.project_list)
    RecyclerView projectList;
    private MoviesAdapter moviesAdapter;
    private FragmentMoviesBinding fragmentMoviesBinding;

    private MoviesListViewModel moviesListViewModel;

    LiveData<List<Movie>> movieListLiveData;
    List<Movie> movieList = new ArrayList<>();

    // TODO: Rename and change types and number of parameters
    public static MoviesFragment newInstance(String param1) {
        MoviesFragment fragment = new MoviesFragment();
        Bundle args = new Bundle();
        // args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_movies, container, false);


        projectList = rootView.findViewById(R.id.project_list);

        fragmentMoviesBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_movies, container, false);

        ViewDataBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_movies,
                container, false);


       // moviesListViewModel = new MoviesListViewModel(getActivity().getApplication(), this);

      //  getLifecycle().addObserver(moviesListViewModel);
        moviesAdapter = new MoviesAdapter(movieList);

        projectList.setLayoutManager(new LinearLayoutManager(getActivity()));
        projectList.setAdapter(moviesAdapter);

        MoviesListViewModel moviesListViewModel = ViewModelProviders.of(this).get(MoviesListViewModel.class);
        subscribeUi(moviesListViewModel);
//        moviesListViewModel.getMoviesListObservable()
//                .observe(this, this::showMovieList);


      //  movieListLiveData.observe(this, (Observer<List<Movie>>) movieListLiveData);
      //  moviesListViewModel.getMoviesListObservable().observe(this, (Observer<List<Movie>>) movieListLiveData);


        ButterKnife.bind(rootView);
        return fragmentMoviesBinding.getRoot();
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onMoviesRefresh(List<Movie> listMovies) {
        if (listMovies != null) {
            movieList.clear();
            movieList.addAll(listMovies);
            moviesAdapter.notifyDataSetChanged();
        }
    }

    public void showMovieList(List<Movie> listMovies) {
        if (listMovies != null) {
            movieList.clear();
            movieList.addAll(listMovies);
            moviesAdapter.notifyDataSetChanged();
        }
    }
    private void subscribeUi(MoviesListViewModel viewModel) {
        // Update the list when the data changes
        if(viewModel==null)
            viewModel = new MoviesListViewModel(getActivity().getApplication());

        viewModel.getMoviesListObservable().observe(this, new Observer<List<Movie>>() {
            @Override
            public void onChanged(@Nullable List<Movie> myProducts) {
                Log.i(TAG, "onChanged: ");
            }
        });
    }
}
