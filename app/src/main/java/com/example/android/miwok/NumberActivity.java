package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        String [] word = new String[10];
        word[0]= "one";
        word[1]= "two";
        word[2]= "three";
        word[3]= "four";
        word[4]= "five";
        word[5]= "six";
        word[6]= "seven";
        word[7]= "eight";
        word[8]= "nine";
        word[0]= "ten";
    }
}
