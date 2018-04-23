package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Movie {
    @Expose
    @SerializedName("release_date")
    public String MoviesRelease_date;
    @Expose
    @SerializedName("overview")
    public String MoviesOverview;
    @Expose
    @SerializedName("adult")
    public boolean MoviesAdult;
    @Expose
    @SerializedName("backdrop_path")
    public String MoviesBackdrop_path;
    @Expose
    @SerializedName("genre_ids")
    public List<Integer> MoviesGenre_ids;
    @Expose
    @SerializedName("original_title")
    public String MoviesOriginal_title;
    @Expose
    @SerializedName("original_language")
    public String MoviesOriginal_language;
    @Expose
    @SerializedName("poster_path")
    public String MoviesPoster_path;
    @Expose
    @SerializedName("popularity")
    public double MoviesPopularity;
    @Expose
    @SerializedName("title")
    public String MoviesTitle;
    @Expose
    @SerializedName("vote_average")
    public double MoviesVote_average;
    @Expose
    @SerializedName("video")
    public boolean MoviesVideo;
    @Expose
    @SerializedName("id")
    public int MoviesId;
    @Expose
    @SerializedName("vote_count")
    public int MoviesVote_count;

    public String getRelease_date() {
        return MoviesRelease_date;
    }

    public void setRelease_date(String MoviesRelease_date) {
        this.MoviesRelease_date = MoviesRelease_date;
    }

    public String getOverview() {
        return MoviesOverview;
    }

    public void setOverview(String MoviesOverview) {
        this.MoviesOverview = MoviesOverview;
    }

    public boolean getAdult() {
        return MoviesAdult;
    }

    public void setAdult(boolean MoviesAdult) {
        this.MoviesAdult = MoviesAdult;
    }

    public String getBackdrop_path() {
        return MoviesBackdrop_path;
    }

    public void setBackdrop_path(String MoviesBackdrop_path) {
        this.MoviesBackdrop_path = MoviesBackdrop_path;
    }

    public List<Integer> getGenre_ids() {
        return MoviesGenre_ids;
    }

    public void setGenre_ids(List<Integer> MoviesGenre_ids) {
        this.MoviesGenre_ids = MoviesGenre_ids;
    }

    public String getOriginal_title() {
        return MoviesOriginal_title;
    }

    public void setOriginal_title(String MoviesOriginal_title) {
        this.MoviesOriginal_title = MoviesOriginal_title;
    }

    public String getOriginal_language() {
        return MoviesOriginal_language;
    }

    public void setOriginal_language(String MoviesOriginal_language) {
        this.MoviesOriginal_language = MoviesOriginal_language;
    }

    public String getPoster_path() {
        return MoviesPoster_path;
    }

    public void setPoster_path(String MoviesPoster_path) {
        this.MoviesPoster_path = MoviesPoster_path;
    }

    public double getPopularity() {
        return MoviesPopularity;
    }

    public void setPopularity(double MoviesPopularity) {
        this.MoviesPopularity = MoviesPopularity;
    }

    public String getTitle() {
        return MoviesTitle;
    }

    public void setTitle(String MoviesTitle) {
        this.MoviesTitle = MoviesTitle;
    }

    public double getVote_average() {
        return MoviesVote_average;
    }

    public void setVote_average(double MoviesVote_average) {
        this.MoviesVote_average = MoviesVote_average;
    }

    public boolean getVideo() {
        return MoviesVideo;
    }

    public void setVideo(boolean MoviesVideo) {
        this.MoviesVideo = MoviesVideo;
    }

    public int getId() {
        return MoviesId;
    }

    public void setId(int MoviesId) {
        this.MoviesId = MoviesId;
    }

    public int getVote_count() {
        return MoviesVote_count;
    }

    public void setVote_count(int MoviesVote_count) {
        this.MoviesVote_count = MoviesVote_count;
    }
}
