package spm.mvc_mvp_mvvm.mvvm.databinding.dto;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import spm.mvc_mvp_mvvm.BR;

/**
 * Created by root on 7/20/18.
 */

public class DataBindingModel extends BaseObservable {
    String title;
    String desc;
    String imageUrl;

    @Bindable
    public String getTitle() {
        return title;
    }

    @Bindable
    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    @Bindable
    public String getDesc() {
        return desc;
    }

    @Bindable
    public void setDesc(String desc) {
        this.desc = desc;
        notifyPropertyChanged(BR.desc);
    }

    @Bindable
    public String getImageUrl() {
        return imageUrl;
    }

    @Bindable
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        notifyPropertyChanged(BR.imageUrl);
    }


}
