package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        //DYNAMICALLY ADDING A FRAGMENT TO SECOND ACTIVITY
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.container, new MainFragment()).commit();
    }
}