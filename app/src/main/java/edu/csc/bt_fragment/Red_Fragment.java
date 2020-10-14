package edu.csc.bt_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Red_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Red_Fragment extends Fragment {


    public Red_Fragment() {
        // Required empty public constructor
    }

    public static Red_Fragment newInstance() {
        Red_Fragment fragment = new Red_Fragment();
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
        return inflater.inflate(R.layout.fragment_red_, container, false);
    }
}