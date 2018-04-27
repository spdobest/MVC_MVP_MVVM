package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import spm.mvc_mvp_mvvm.R;
import spm.mvc_mvp_mvvm.databinding.CountryListItemBinding;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist.model.CountryResult;

public class FlightsRecyclerViewAdapter extends
        RecyclerView.Adapter<FlightsRecyclerViewAdapter.ViewHolder>
       {

    private List<CountryResult> flightsList;
    private Context context;

    public FlightsRecyclerViewAdapter(List<CountryResult> flsLst, Context ctx){
        flightsList = flsLst;
        context = ctx;
    }

    @Override
    public FlightsRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                                   int viewType) {
        CountryListItemBinding binding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()), R.layout.country_list_item,
                        parent, false);

        ViewHolder viewHolder = new ViewHolder(binding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CountryResult flight = flightsList.get(position);
        holder.flightItemBinding.setCountry(flight);
       // holder.flightItemBinding.setItemClickListener(this);
    }

    @Override
    public int getItemCount() {
        return flightsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public CountryListItemBinding flightItemBinding;

        public ViewHolder(CountryListItemBinding flightItemLayoutBinding) {
            super(flightItemLayoutBinding.getRoot());
            flightItemBinding = flightItemLayoutBinding;
        }
    }

}