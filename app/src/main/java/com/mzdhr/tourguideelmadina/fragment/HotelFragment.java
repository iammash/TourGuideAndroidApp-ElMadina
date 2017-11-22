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
        View rootView = inflater.inflate(R.layout.fragments_container, container, false);

        final ArrayList<Place> placesHotels = new ArrayList<>();
        placesHotels.add(new Place(getString(R.string.hotel01), getString(R.string.stars5), 24.4726119, 39.607875));
        placesHotels.add(new Place(getString(R.string.hotel02), getString(R.string.stars4), 24.4726119, 39.607875));
        placesHotels.add(new Place(getString(R.string.hotel03), getString(R.string.stars3), 24.4726119, 39.607875));
        placesHotels.add(new Place(getString(R.string.hotel04), getString(R.string.stars2), 24.4726119, 39.607875));
        placesHotels.add(new Place(getString(R.string.hotel05), getString(R.string.stars4), 24.4726119, 39.607875));
        placesHotels.add(new Place(getString(R.string.hotel06), getString(R.string.stars3), 24.4726119, 39.607875));
        placesHotels.add(new Place(getString(R.string.hotel07), getString(R.string.stars5), 24.4726119, 39.607875));
        placesHotels.add(new Place(getString(R.string.hotel08), getString(R.string.stars5), 24.4749532, 39.6177886));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), placesHotels);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
