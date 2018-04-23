package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponse {


    @Expose
    @SerializedName("results")
    private List<Movie> MoviesResults;
    @Expose
    @SerializedName("total_pages")
    private int MoviesTotal_pages;
    @Expose
    @SerializedName("total_results")
    private int MoviesTotal_results;
    @Expose
    @SerializedName("page")
    private int MoviesPage;

    public List<Movie> getResults() {
        return MoviesResults;
    }

    public void setResults(List<Movie> MoviesResults) {
        this.MoviesResults = MoviesResults;
    }

    public int getTotal_pages() {
        return MoviesTotal_pages;
    }

    public void setTotal_pages(int MoviesTotal_pages) {
        this.MoviesTotal_pages = MoviesTotal_pages;
    }

    public int getTotal_results() {
        return MoviesTotal_results;
    }

    public void setTotal_results(int MoviesTotal_results) {
        this.MoviesTotal_results = MoviesTotal_results;
    }

    public int getPage() {
        return MoviesPage;
    }

    public void setPage(int MoviesPage) {
        this.MoviesPage = MoviesPage;
    }
}