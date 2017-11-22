package com.mzdhr.tourguideelmadina.adapter;

/**
 * Created by mohammad on 11/22/17.
 */


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.mzdhr.tourguideelmadina.fragment.FoodFragment;
import com.mzdhr.tourguideelmadina.fragment.HotelFragment;
import com.mzdhr.tourguideelmadina.fragment.ShopFragment;
import com.mzdhr.tourguideelmadina.fragment.SpotFragment;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        if (position == 0) {
            return new HotelFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new ShopFragment();
        } else {
            return new SpotFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

}