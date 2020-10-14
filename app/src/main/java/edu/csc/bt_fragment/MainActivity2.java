package edu.csc.bt_fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity2 extends AppCompatActivity implements ContactAdapter.Contactlistener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout3,new ListContactFragment());
        fragmentTransaction.commit();
    }

    @Override
    public void ContactClick(Contact contact) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager()
                .beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout3,new DetailFragment(contact));
        fragmentTransaction.addToBackStack("");
        fragmentTransaction.commit();
    }
}