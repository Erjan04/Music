package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.first_fl,new FragmentFirst()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.second_fl, new FragmentSecond()).commit();

    }
}