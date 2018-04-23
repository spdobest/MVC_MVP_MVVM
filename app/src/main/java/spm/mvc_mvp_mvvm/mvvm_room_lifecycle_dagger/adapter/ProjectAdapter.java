package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import java.util.Objects;
import spm.mvc_mvp_mvvm.R;
import spm.mvc_mvp_mvvm.databinding.MoviesListItemBinding;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.dto.Movie;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.listeners.MoviesClickCallback;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {

    List<? extends Movie> projectList;

    @Nullable
    private final MoviesClickCallback projectClickCallback;

    public ProjectAdapter(@Nullable MoviesClickCallback projectClickCallback) {
        this.projectClickCallback = projectClickCallback;
    }

    public void setProjectList(final List<? extends Movie> projectList) {
        if (this.projectList == null) {
            this.projectList = projectList;
            notifyItemRangeInserted(0, projectList.size());
        } else {
            DiffUtil.DiffResult result = DiffUtil.calculateDiff(new DiffUtil.Callback() {
                @Override
                public int getOldListSize() {
                    return ProjectAdapter.this.projectList.size();
                }

                @Override
                public int getNewListSize() {
                    return projectList.size();
                }

                @Override
                public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                    return ProjectAdapter.this.projectList.get(oldItemPosition).MoviesId ==
                            projectList.get(newItemPosition).MoviesId;
                }

                @Override
                public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                    Movie project = projectList.get(newItemPosition);
                    Movie old = projectList.get(oldItemPosition);
                    return project.MoviesId == old.MoviesId
                            && Objects.equals(project.MoviesGenre_ids, old.MoviesGenre_ids);
                }
            });
            this.projectList = projectList;
            result.dispatchUpdatesTo(this);
        }
    }

    @Override
    public ProjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MoviesListItemBinding binding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()), R.layout.movies_list_item,
                        parent, false);

        binding.setCallback(projectClickCallback);

        return new ProjectViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ProjectViewHolder holder, int position) {
        holder.binding.setMovie(projectList.get(position));
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return projectList == null ? 0 : projectList.size();
    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder {

        final MoviesListItemBinding binding;

        public ProjectViewHolder(MoviesListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}