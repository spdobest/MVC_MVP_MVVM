package spm.mvc_mvp_mvvm.mvvm.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import spm.mvc_mvp_mvvm.R;
import spm.mvc_mvp_mvvm.databinding.ActivityDataBindingBinding;
import spm.mvc_mvp_mvvm.mvvm.databinding.adapter.BindingDataAdapter;
import spm.mvc_mvp_mvvm.mvvm.databinding.callBack.BindingDataClickListener;
import spm.mvc_mvp_mvvm.mvvm.databinding.dto.DataBindingModel;

public class DataBindingActivity extends AppCompatActivity implements BindingDataClickListener {

    ActivityDataBindingBinding activityDataBindingBinding;
    List<DataBindingModel> listDataBindingModel = new ArrayList<>();
    private BindingDataAdapter bindingDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        for (int i = 0; i < 10; i++) {
            DataBindingModel dataBindingModel = new DataBindingModel();
            dataBindingModel.setDesc("SIBA");
            dataBindingModel.setTitle("SIBA");
            dataBindingModel.setImageUrl("https://homepages.cae.wisc.edu/~ece533/images/airplane.png");
            listDataBindingModel.add(dataBindingModel);
        }


        super.onCreate(savedInstanceState);
        activityDataBindingBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
        activityDataBindingBinding.setData(listDataBindingModel.get(0));

        activityDataBindingBinding.recyclerviewDataBinding.setLayoutManager(new LinearLayoutManager(this));

        bindingDataAdapter = new BindingDataAdapter(this, listDataBindingModel);
        activityDataBindingBinding.recyclerviewDataBinding.setAdapter(bindingDataAdapter);
        /*ImageView imageView = activityDataBindingBinding.imageViewLoadImage;
        String imageUrl = "https://homepages.cae.wisc.edu/~ece533/images/airplane.png";
        Picasso.with(this).load(imageUrl)
                .centerCrop()
                .into(imageView);*/
    }

    @Override
    public void onBindingClick() {

    }
}
