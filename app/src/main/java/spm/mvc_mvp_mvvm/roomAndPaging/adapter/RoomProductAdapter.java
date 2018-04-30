package spm.mvc_mvp_mvvm.roomAndPaging.adapter;

import android.arch.paging.PagedListAdapter;
import android.support.annotation.NonNull;
import android.support.v7.recyclerview.extensions.AsyncDifferConfig;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import spm.mvc_mvp_mvvm.R;
import spm.mvc_mvp_mvvm.roomAndPaging.room.Pokemon;
import spm.mvc_mvp_mvvm.roomAndPaging.room.dao.MyProduct;


class RoomProductAdapter extends PagedListAdapter<MyProduct, MyProductViewHolder> {


    protected RoomProductAdapter(@NonNull AsyncDifferConfig<MyProduct> config) {
        super(config);
    }

    @Override
    public MyProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview_room, parent, false);
        return new MyProductViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyProductViewHolder holder, int position) {
        MyProduct pokemon = getItem(position);

        if (pokemon != null) {
            holder.bindTo(pokemon);
        } else {
            holder.clear();
        }
    }
}