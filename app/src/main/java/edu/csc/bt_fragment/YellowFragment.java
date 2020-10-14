package edu.csc.bt_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link YellowFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class YellowFragment extends Fragment {



    public YellowFragment() {
        // Required empty public constructor
    }


    public static YellowFragment newInstance() {
        YellowFragment fragment = new YellowFragment();
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
        return inflater.inflate(R.layout.fragment_yellow, container, false);
    }
}