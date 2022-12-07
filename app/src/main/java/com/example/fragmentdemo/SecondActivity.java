package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        //DYNAMICALLY ADDING A FRAGMENT TO SECOND ACTIVITY
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.container, new MainFragment(), "FIRST").commit();



        findViewById(R.id.btn).setOnClickListener(v -> replaceFragment()
        );
    }


    private void replaceFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new fragment_main2()).addToBackStack(null).commit();
    }
}