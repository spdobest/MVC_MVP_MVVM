package spm.mvc_mvp_mvvm.roomAndPaging.room.dao;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;

import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist.adapter.CountryAdapter;
import spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist.model.CountryResult;
@Entity
public class MyProduct {

    @PrimaryKey
    @ColumnInfo(name = "id")
    public int id;

    @ColumnInfo(name = "name")
    public String name;

    public MyProduct(int id, String name) {
        this.id = id;
        this.name = name;
    }


    /*DiffUtil.DiffResult result = DiffUtil.calculateDiff(new DiffUtil.Callback() {
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
    });*/


    /*public static final DiffCallback<MyProduct> DIFF_CALLBACK = new DiffCallback<MyProduct>() {
        @Override
        public boolean areItemsTheSame(@NonNull Pokemon oldPokemon, @NonNull Pokemon newPokemon) {
            return oldPokemon.id == newPokemon.id;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Pokemon oldPokemon, @NonNull Pokemon newPokemon) {
            return oldPokemon.name.equals(newPokemon.name);
        }
    };*/
}