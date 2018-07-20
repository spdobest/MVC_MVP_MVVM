package spm.mvc_mvp_mvvm.mvvm.databinding;

import android.databinding.BindingAdapter;
import android.text.TextUtils;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageBindingAdapter {

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView imageView, String url) {
        if (!TextUtils.isEmpty(url)) {
            Picasso.with(imageView.getContext()).load(url).resize(200, 200).into(imageView);
        }
    }
}