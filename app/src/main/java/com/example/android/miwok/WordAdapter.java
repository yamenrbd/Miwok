package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


//this class extend the ArrayAdapter but with object of type Word that we already define in the Word class
//this class overWrite the function getView from original class ArrayAdapter
//and create listItemView from type of View  and check if that ListItemView is empty
//it will inflate it with textView from listItem that create it in xml file "list_item.xml"
//the create an instance with name word from class Word store in it the position
//then create two TextView link it with TextView from list_item.xml one link with miwak_text_view
//and the other with TextView linke with default_text_view
// store all that in the listItemView that we create it earlier  and return that listItemView

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //create listItemView from type View and check if the listItemView is empty
        //it will git all data from list_item.xml and inflate them in the listItemView View

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //create object currentWord from type Word class and get the position which will be 0
        Word currentWord = getItem(position);


        //create textView defaultTranslation from type TextView and connect it to
        // the default_text_view in list_item.xml
        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        //create textView miwak from type TextView and connect it to
        // the miwak_text_view in list_item.xml
        TextView miwak = (TextView) listItemView.findViewById(R.id.miwak_text_view);
        miwak.setText(currentWord.getMiwokTranslation());


        //create an imageIcon from type of ImageView and connect it to
        // the image in list_item.xml

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // if the currentWord has an image and return true it will set the imageView
        //from imageresourceID and if return false it will make the ImageView desipear
        //using view.gone method
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResurceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }


}
