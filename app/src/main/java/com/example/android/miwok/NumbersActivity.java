package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        // create ArrayList from type object word that created from Class Word
        //then add in line ten words each one use the constraction with two String
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","lutti",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("two","otiiko",R.drawable.number_two , R.raw.number_two));
        words.add(new Word("three","tolookosu",R.drawable.number_three , R.raw.number_three));
        words.add(new Word("four","oyyisa",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("five","massokka",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("sex","temmokka",R.drawable.number_six,R.raw.number_six));
        words.add(new Word("seven","kenekaku",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Word("eight","kawinta",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word("nine","wo'e",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Word("ten","na'aacha",R.drawable.number_ten,R.raw.number_ten));





        //here we create adapter from class WordAdapter that we create this adapter use constraction of the context and ArrayList
        //that we created inthe upper section
        //then create listView from class ListView and add in it the list from xml file we create activity_number.xml
        //and add in that listView the adapter we create that contain the two words

        WordAdapter adapter = new WordAdapter(this, words,R.color.category_numbers);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ;
                mediaPlayer = MediaPlayer.create(NumbersActivity.this,words.get(position).getmSongId());
                mediaPlayer.start();

            }
        });


        listView.setAdapter(adapter);
    }
}
