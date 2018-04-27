package spm.mvc_mvp_mvvm.twoWayBindingWithRecycler;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import spm.mvc_mvp_mvvm.R;

public class TwowayBindingListFragment extends Fragment {


    public TwowayBindingListFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static TwowayBindingListFragment newInstance() {
        TwowayBindingListFragment fragment = new TwowayBindingListFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_twoway_binding_list, container, false);
    }
}
