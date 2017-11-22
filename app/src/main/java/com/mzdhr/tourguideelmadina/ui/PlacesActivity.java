package com.mzdhr.tourguideelmadina.ui;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import com.mzdhr.tourguideelmadina.R;
import com.mzdhr.tourguideelmadina.adapter.SectionsPagerAdapter;

public class PlacesActivity extends AppCompatActivity {

    private static final String TAG = PlacesActivity.class.getSimpleName();
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We (Google Developers) use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_activity);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


        // Setting icons and title for the tab layout
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_hotel);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_restaurant);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_shopping);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_tourism);

        tabLayout.getTabAt(0).setText(R.string.tab_title_01);
        tabLayout.getTabAt(1).setText(R.string.tab_title_02);
        tabLayout.getTabAt(2).setText(R.string.tab_title_03);
        tabLayout.getTabAt(3).setText(R.string.tab_title_04);

        // Changing the color of tabs while user moving between them
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.iconTabColor), PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


}
