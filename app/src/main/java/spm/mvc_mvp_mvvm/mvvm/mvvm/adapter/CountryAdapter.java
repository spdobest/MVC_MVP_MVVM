package spm.mvc_mvp_mvvm.mvvm.mvvm.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import java.util.List;

import spm.mvc_mvp_mvvm.R;
import spm.mvc_mvp_mvvm.databinding.ItemviewCountryBinding;
import spm.mvc_mvp_mvvm.mvvm.mvvm.callBack.OnClickCallback;
import spm.mvc_mvp_mvvm.mvvm.mvvm.dto.CountryResult;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ArticleViewHolder> {

    List<? extends CountryResult> articleList;

    public CountryAdapter(List<? extends CountryResult> articleList) {
        this.articleList = articleList;
    }

    public void setProjectList(final List<? extends CountryResult> articleList) {
        if (this.articleList == null) {
            this.articleList = articleList;
            notifyItemRangeInserted(0, articleList.size());
        } else {
            DiffUtil.DiffResult result = DiffUtil.calculateDiff(new DiffUtil.Callback() {
                @Override
                public int getOldListSize() {
                    return CountryAdapter.this.articleList.size();
                }

                @Override
                public int getNewListSize() {
                    return articleList.size();
                }

                @Override
                public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                    return CountryAdapter.this.articleList.get(oldItemPosition).getName() ==
                            CountryAdapter.this.articleList.get(newItemPosition).getName();
                }

                @Override
                public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                    CountryResult newCountry = articleList.get(newItemPosition);
                    CountryResult oldCountries = articleList.get(oldItemPosition);
                    return newCountry.getName().equals(oldCountries.getName())
                            && oldCountries.getAlpha2_code().equals(newCountry.getAlpha2_code());
                }
            });
            this.articleList = articleList;
            result.dispatchUpdatesTo(this);
        }
    }

    @Override
    public ArticleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemviewCountryBinding binding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()), R.layout.itemview_country,
                        parent, false);

        binding.setCallback(new OnClickCallback());

        return new ArticleViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ArticleViewHolder holder, int position) {
        holder.binding.setCountry(articleList.get(position));
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return /*articleList == null ? 0 :*/ articleList.size();
    }

    static class ArticleViewHolder extends RecyclerView.ViewHolder {
        final ItemviewCountryBinding binding;

        public ArticleViewHolder(ItemviewCountryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}