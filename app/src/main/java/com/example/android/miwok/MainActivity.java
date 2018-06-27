package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openFamilyList(View view){
        Intent intent = new Intent(this , FamilyMemebrActivity.class);
        startActivity(intent);
    }
    public void openColorsList(View view){
        Intent intent = new Intent(this , ColorActivity.class);
        startActivity(intent);
    }
    public void openPhrasesList(View view){
        Intent intent = new Intent(this , PhrasesActivity.class);
        startActivity(intent);
    }
    public void openNumberList(View view){
        Intent intent = new Intent(this , NumberActivity.class);
        startActivity(intent);
    }
}
