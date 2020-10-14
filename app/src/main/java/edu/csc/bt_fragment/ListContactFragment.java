package edu.csc.bt_fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ListContactFragment extends Fragment {
    ArrayList<Contact> arrayList;
    ContactAdapter contactAdapter;
    ContactAdapter.Contactlistener contactlistener;
    RecyclerView rc;


    public ListContactFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context!=null)
        {
            if(context instanceof ContactAdapter.Contactlistener)
            {
                contactlistener=(ContactAdapter.Contactlistener) context;
            }
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_contact, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rc=view.findViewById(R.id.rc);
        arrayList=Contact.getMockupData();
        contactAdapter=new ContactAdapter(arrayList,contactlistener);
        rc.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        rc.setAdapter(contactAdapter);
    }
}