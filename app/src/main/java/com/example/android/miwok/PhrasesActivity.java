package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        // create ArrayList from type object word that created from Class Word
        //then add in line ten words each one use the constraction with two String
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?","minto wuksus"));
        words.add(new Word("What is your name?","tinnә oyaase'nә"));
        words.add(new Word("My name is...","oyaaset"));
        words.add(new Word("How are you feeling?","michәksәs?"));
        words.add(new Word("I’m feeling good.","kuchi achit"));
        words.add(new Word("Are you coming?","әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        words.add(new Word("I’m coming.","әәnәm"));
        words.add(new Word("Let’s go.","yoowutis"));
        words.add(new Word("Come here.","әnni'nem"));





        //here we create adapter from class WordAdapter that we create this adapter use constraction of the context and ArrayList
        //that we created inthe upper section
        //then create listView from class ListView and add in it the list from xml file we create activity_number.xml
        //and add in that listView the adapter we create that contain the two words


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list_phrases);

        listView.setAdapter(adapter);
    }
}
