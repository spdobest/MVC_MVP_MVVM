package spm.mvc_mvp_mvvm.mvvm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import spm.mvc_mvp_mvvm.R;

public class MvvmNewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvm_new);

        recyclerView = findViewById(R.id.recyclerViewCountry);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
