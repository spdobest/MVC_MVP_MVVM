package spm.mvc_mvp_mvvm.mvvm.twoWayDataBinding.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableList;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import spm.mvc_mvp_mvvm.R;
import spm.mvc_mvp_mvvm.databinding.ItemviewEmployeeBinding;
import spm.mvc_mvp_mvvm.mvvm.twoWayDataBinding.viewmodel.EmployeeViewModel;

/**
 * Created by FRAMGIA\nguyen.viet.manh on 21/11/2016.
 */

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.UserViewHolder> {
    private ObservableList<EmployeeViewModel> mUsers;
    private LayoutInflater mInflater;

    public EmployeeAdapter() {

    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mInflater == null) mInflater = LayoutInflater.from(parent.getContext());
        ItemviewEmployeeBinding binding =
                DataBindingUtil.inflate(mInflater, R.layout.itemview_employee, parent, false);
        return new UserViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.set(mUsers.get(position));
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    public void setUsers(ObservableList<EmployeeViewModel> users) {
        mUsers = users;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private ItemviewEmployeeBinding binding;

        public UserViewHolder(ItemviewEmployeeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void set(EmployeeViewModel userViewModel) {
            binding.setEmployee(userViewModel);
        }
    }
}