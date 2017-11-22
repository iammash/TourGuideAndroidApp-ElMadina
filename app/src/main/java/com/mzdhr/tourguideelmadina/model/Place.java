package com.mzdhr.tourguideelmadina.model;

/**
 * Created by mohammad on 11/20/17.
 */

public class Place {
    private String mPlaceName;
    private String mSubText;
    private double mLatitude;
    private double mLongitude;
    private int mCover;
    private boolean hasCover;
    private boolean isHasStarRating;


    public Place(String placeName, String subText, double latitude, double longitude) {
        mPlaceName = placeName;
        mLatitude = latitude;
        mLongitude = longitude;
        mSubText = subText;
        if (subText.contains("★")){
            // that means any place that have a start icon system in his sub-title, it should be a hotel.
            isHasStarRating = true;
        }
    }

    // overloading the constructor so Spot Places used it to add their cover image.
    public Place(String placeName, String subText, double latitude, double longitude, int cover) {
        mPlaceName = placeName;
        mLatitude = latitude;
        mLongitude = longitude;
        mCover = cover;
        hasCover = true;
        mSubText = subText;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public void setPlaceName(String placeName) {
        mPlaceName = placeName;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(double latitude) {
        mLatitude = latitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(double longitude) {
        mLongitude = longitude;
    }

    public int getCover() {
        return mCover;
    }

    public void setCover(int cover) {
        mCover = cover;
    }

    public boolean hasCover() {
        return hasCover;
    }

    public void setHasCover(boolean hasCover) {
        this.hasCover = hasCover;
    }

    public String getSubText() {
        return mSubText;
    }

    public void setSubText(String subText) {
        mSubText = subText;
    }

    public boolean hasStarRating() {
        return isHasStarRating;
    }

    public void setHasStarRating(boolean hasStarRating) {
        isHasStarRating = hasStarRating;
    }
}
