package edu.csc.bt_fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    Button btnRed,btnGreen,btnYellow;
    Red_Fragment red_fragment;
    GreenFragment greenFragment;
    YellowFragment yellowFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState==null)
        {
            red_fragment=Red_Fragment.newInstance();
            greenFragment =new GreenFragment();
            yellowFragment=new YellowFragment();
        }
        btnRed=findViewById(R.id.btnRed);
        btnGreen=findViewById(R.id.btnGreen);
        btnYellow=findViewById(R.id.btnYellow);
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayRed();
            }
        });
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayGreen();
            }
        });
        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayYellow();
            }
        });
    }
    void displayRed()
    {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,red_fragment);
        fragmentTransaction.commit();
    }
    void displayGreen()
    {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,greenFragment);
        fragmentTransaction.commit();
    }
    void displayYellow()
    {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,yellowFragment);
        fragmentTransaction.commit();
    }
}