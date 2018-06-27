package com.example.android.miwok;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create variable for each text catagory group
        TextView number = (TextView) findViewById(R.id.numbers);
        TextView color = (TextView) findViewById(R.id.colors);
        TextView family = (TextView) findViewById(R.id.family);
        TextView phrases = (TextView) findViewById(R.id.phrases);


        //create onClickListener for number textView
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create intente to new activity number when textView number have been clicked
                Intent intent = new Intent(MainActivity.this, NumberActivity.class);
                startActivity(intent);
            }
        });

        //create onClickListener for color textView
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create intente to new activity number when textView color have been clicked
                Intent intent = new Intent(MainActivity.this, ColorActivity.class);
                startActivity(intent);
            }
        });

        //create onClickListener for family textView
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create intente to new activity number when textView family have been clicked
                Intent intent = new Intent(MainActivity.this, FamilyMemebrActivity.class);
                startActivity(intent);
            }
        });

        //create onClickListener for phrases textView
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create intente to new activity number when textView phrases have been clicked
                Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(intent);
            }
        });

        String [] numberName = new String[10];
        numberName[0]= "one";
    }
}
