package spm.mvc_mvp_mvvm.mvvm.databinding.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import spm.mvc_mvp_mvvm.R;
import spm.mvc_mvp_mvvm.databinding.ItemviewDatabindingBinding;
import spm.mvc_mvp_mvvm.mvvm.databinding.callBack.BindingDataClickListener;
import spm.mvc_mvp_mvvm.mvvm.databinding.dto.DataBindingModel;

public class BindingDataAdapter extends RecyclerView.Adapter<BindingDataAdapter.ProjectViewHolder> {

    @Nullable
    private final BindingDataClickListener bindingDataClickListener;
    List<? extends DataBindingModel> projectList;

    public BindingDataAdapter(@Nullable BindingDataClickListener projectClickCallback,
                              List<DataBindingModel> listData ) {
        this.bindingDataClickListener = projectClickCallback;
        this.projectList = listData;
    }

    @Override
    public ProjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemviewDatabindingBinding binding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()), R.layout.itemview_databinding,
                        parent, false);

        binding.setCallback(bindingDataClickListener);

        return new ProjectViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ProjectViewHolder holder, int position) {
        holder.binding.setData(projectList.get(position));
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return projectList == null ? 0 : projectList.size();
    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder {

        final ItemviewDatabindingBinding binding;

        public ProjectViewHolder(ItemviewDatabindingBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}