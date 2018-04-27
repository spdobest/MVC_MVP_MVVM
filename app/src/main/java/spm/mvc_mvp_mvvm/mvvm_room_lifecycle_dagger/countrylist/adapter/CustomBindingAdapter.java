package spm.mvc_mvp_mvvm.mvvm_room_lifecycle_dagger.countrylist.adapter;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CustomBindingAdapter {

    // https://homepages.cae.wisc.edu/~ece533/images/

    @BindingAdapter("visibleGone")
    public static void showHide(View view, boolean show) {
        view.setVisibility(show ? View.VISIBLE : View.GONE);
    }

    @BindingAdapter("dateText")
    public static void convertToDate(TextView view, String date) {
      //  view.setText(DateUtils.Companion.convertToDateString(date));
    }


    @BindingAdapter("loadurl")
    public static void loadurl(WebView mWebview, String url) {
        mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript

        mWebview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            }
        });
        mWebview.loadUrl(url);
    }
    @BindingAdapter("android:src")
    public static void setImageUri(AppCompatImageView view, String imageUri) {
        if (imageUri == null) {
            view.setImageURI(null);
        } else {
            imageUri = "https://homepages.cae.wisc.edu/~ece533/images/airplane.png";
            view.setImageURI(Uri.parse(imageUri));
        }
    }

    @BindingAdapter("android:src")
    public static void setImageUri(AppCompatImageView view, Uri imageUri) {
        view.setImageURI(imageUri);
    }

    @BindingAdapter("android:src")
    public static void setImageDrawable(AppCompatImageView view, Drawable drawable) {
        view.setImageDrawable(drawable);
    }

    @BindingAdapter("android:src")
    public static void setImageResource(AppCompatImageView imageView, int resource){
        imageView.setImageResource(resource);
    }

    @BindingAdapter("bind:imageUrl")
    public static void loadImage(AppCompatImageView imageView, String url) {
        String imageUri = "https://homepages.cae.wisc.edu/~ece533/images/airplane.png";
        Picasso.with(imageView.getContext()).load(imageUri).into(imageView);

    }
}