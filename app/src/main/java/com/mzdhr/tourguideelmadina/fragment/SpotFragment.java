package com.mzdhr.tourguideelmadina.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.mzdhr.tourguideelmadina.R;
import com.mzdhr.tourguideelmadina.adapter.PlaceAdapter;
import com.mzdhr.tourguideelmadina.model.Place;

import java.util.ArrayList;

/**
 * Created by mohammad on 11/21/17.
 */

public class SpotFragment extends Fragment {

    public SpotFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_container, container, false);

        final ArrayList<Place> placesSpots = new ArrayList<>();
        placesSpots.add(new Place("Al Masjid an Nabawi", "Religious", 24.4878472, 39.6481492, R.drawable.nabawi));
        placesSpots.add(new Place("Al Madina Museum in Al Hejaz Railway Station", "Landscape", 24.4619578, 39.5966926, R.drawable.museum));
        placesSpots.add(new Place("Masjid Quba", "Religious", 24.439252, 39.6150999, R.drawable.quba));
        placesSpots.add(new Place("Jabal Auhud", "Landscape", 24.5214825, 39.5884737, R.drawable.auhud));
        placesSpots.add(new Place("Old Ottoman Garrison", "Landscape", 24.4509616, 39.6102161, R.drawable.ottoman));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), placesSpots);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
