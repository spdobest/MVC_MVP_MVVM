package spm.mvc_mvp_mvvm.roomAndPaging.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import spm.mvc_mvp_mvvm.R;
import spm.mvc_mvp_mvvm.roomAndPaging.room.dao.MyProduct;

class MyProductViewHolder extends RecyclerView.ViewHolder {

    private static final String POKE_IMAGE_URL_PREFIX = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/";
    private static final String POKE_IMAGE_URL_SUFFIX = ".png";

    private TextView pokemonIdTextView;
    private ImageView pokemonSpriteImageView;
    private TextView pokemonNameTextView;

    MyProductViewHolder(View itemView) {
        super(itemView);
        pokemonIdTextView = (TextView) itemView.findViewById(R.id.tv_pokemon_id);
        pokemonNameTextView = (TextView) itemView.findViewById(R.id.tv_pokemon);
        pokemonSpriteImageView = (ImageView) itemView.findViewById(R.id.iv_pokemon);
    }

    void bindTo(MyProduct myProduct) {
        itemView.setTag(myProduct.id);
        pokemonIdTextView.setText("spm");
        pokemonNameTextView.setText(myProduct.name);

    }

    void clear() {
        itemView.invalidate();
        pokemonIdTextView.invalidate();
        pokemonNameTextView.invalidate();
        pokemonSpriteImageView.invalidate();
    }
}