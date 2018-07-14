package com.example.android.miwok;
// this class used to create object that have two string to insert it iside the ListAdapter becouse the ListAdapter can take only
//item that can be String or Object and we need to insert two string inside that ListAdapter the only way to do that is to create
//object that have two String on it

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResurceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation , String miwokTranslation){
        mDefaultTranslation = defaultTranslation ;
        mMiwokTranslation = miwokTranslation ;
    }


    public Word (String defaultTranslation , String miwokTranslation , int resourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

        mImageResurceId = resourceId ;


    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation){
        mDefaultTranslation = defaultTranslation;
    }
    public void setMiwokTranslation(String miwokTranslation){
        mMiwokTranslation = miwokTranslation ;
    }

    public int getImageResurceId() {
        return mImageResurceId;
    }

    public void setImageResurceId(int imageResurceId) {
        mImageResurceId = imageResurceId;
    }

    //check if there resource image in mImageResource
    public boolean hasImage(){
       return mImageResurceId != NO_IMAGE_PROVIDED;
    }

}
