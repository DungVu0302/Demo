package edu.csc.bt_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GreenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GreenFragment extends Fragment {



    public GreenFragment() {
        // Required empty public constructor
    }


    public static GreenFragment newInstance() {
        GreenFragment fragment = new GreenFragment();
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
        return inflater.inflate(R.layout.fragment_green, container, false);
    }
}