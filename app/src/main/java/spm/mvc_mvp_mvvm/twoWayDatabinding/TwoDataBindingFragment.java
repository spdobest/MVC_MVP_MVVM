package spm.mvc_mvp_mvvm.twoWayDatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import spm.mvc_mvp_mvvm.R;
import spm.mvc_mvp_mvvm.databinding.FragmentTwoDataBindingBinding;
import spm.mvc_mvp_mvvm.twoWayDatabinding.dto.UserData;

public class TwoDataBindingFragment extends Fragment implements View.OnClickListener {

    private static final String TAG = "TwoDataBindingFragment";

    FragmentTwoDataBindingBinding fragmentTwoDataBindingBinding;

    public static TwoDataBindingFragment newInstance(String str) {
        Bundle args = new Bundle();
        TwoDataBindingFragment fragment = new TwoDataBindingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        fragmentTwoDataBindingBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_two_data_binding, container, false);

        UserData obj = new UserData(getActivity());
        obj.setEmail("");
        obj.setPassword("");
        fragmentTwoDataBindingBinding.setUserdata(obj);

        fragmentTwoDataBindingBinding.login.setOnClickListener(this);

        return fragmentTwoDataBindingBinding.getRoot();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login :
                Toast.makeText(getActivity(), "Login", Toast.LENGTH_SHORT).show();

                break;
        }
    }
}
