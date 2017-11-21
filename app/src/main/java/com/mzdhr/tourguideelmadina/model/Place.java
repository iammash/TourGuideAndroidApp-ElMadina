package com.mzdhr.tourguideelmadina.model;

/**
 * Created by mohammad on 11/20/17.
 */

public class Place {
    String mTitle;

    public Place(String title) {
        mTitle = title;
    }

    public Place(int x){

    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
