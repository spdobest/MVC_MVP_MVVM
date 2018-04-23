package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.adapter;

import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import spm.mvc_mvp_mvvm.R;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.dto.Movie;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {



    private List<Movie> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.imageViewMovie)
        AppCompatImageView imageViewMovie;
        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.genre)
        TextView genre;
        @BindView(R.id.year)
        TextView year;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(view);
        }
    }


    public MoviesAdapter(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itemview_movies, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText("" + movie.getGenre_ids());
        holder.year.setText(movie.getRelease_date());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}