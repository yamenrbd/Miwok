package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMemebrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_memebr);

        // create ArrayList from type object word that created from Class Word
        //then add in line ten words each one use the constraction with two String
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father","әpә"));
        words.add(new Word("mother","әṭa"));
        words.add(new Word("son","angsi"));
        words.add(new Word("daughter","tune"));
        words.add(new Word("older brother","taachi"));
        words.add(new Word("younger brother","chalitti"));
        words.add(new Word("older sister","teṭe"));
        words.add(new Word("younger sister","kolliti"));
        words.add(new Word("grandmother","ama"));
        words.add(new Word("grandfather","paapa"));






        //here we create adapter from class WordAdapter that we create this adapter use constraction of the context and ArrayList
        //that we created inthe upper section
        //then create listView from class ListView and add in it the list from xml file we create activity_number.xml
        //and add in that listView the adapter we create that contain the two words

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list_family_member);

        listView.setAdapter(adapter);
    }
}
