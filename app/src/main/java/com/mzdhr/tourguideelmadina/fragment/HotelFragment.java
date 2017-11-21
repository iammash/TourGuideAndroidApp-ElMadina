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

public class HotelFragment extends Fragment {

    public HotelFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_container, container, false);

        final ArrayList<Place> placesHotels = new ArrayList<>();
        placesHotels.add(new Place("InterContinental Dar Al Hijra Madinah", "★★★★★", 24.4726119, 39.607875));
        placesHotels.add(new Place("Al Madinah Harmony Hotel", "★★★★☆", 24.4726119, 39.607875));
        placesHotels.add(new Place("DAR AL TAQWA HOTEL MADINAH", "★★★☆☆", 24.4726119, 39.607875));
        placesHotels.add(new Place("Anwar Al Madinah Mövenpick Hotel", "★★☆☆☆", 24.4726119, 39.607875));
        placesHotels.add(new Place("Zowar International", "★★★★☆", 24.4726119, 39.607875));
        placesHotels.add(new Place("Dar Al Shohadaa Hotel", "★★★☆☆", 24.4726119, 39.607875));
        placesHotels.add(new Place("Elaf Taibah", "★★★★★", 24.4726119, 39.607875));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), placesHotels);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
