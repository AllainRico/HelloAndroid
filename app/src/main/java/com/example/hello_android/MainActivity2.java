package com.example.hello_android;

import androidx.appcompat.app.AppCompatActivity;

import  android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button firstfragment, secondfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        firstfragment = (Button) findViewById(R.id.firstfragment);
        secondfragment = (Button) findViewById(R.id.secondfragment);
    }

//    firstfragment.setOnClickListener(new View.OnClickListener(){
//       @Override
//       public void onclick(View v){
//           loadfragment(new BlankFragmentA());
//        }
//    });




}