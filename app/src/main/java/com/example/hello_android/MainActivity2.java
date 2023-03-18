package com.example.hello_android;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("Actionbar Title!");
        actionBar.setSubtitle("subtitle!");
    }
}