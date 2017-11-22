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

public class FoodFragment extends Fragment {

    public FoodFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragments_container, container, false);

        final ArrayList<Place> placesFood = new ArrayList<>();
        placesFood.add(new Place(getString(R.string.food01), getString(R.string.food_time), 24.4878472, 39.6481492));
        placesFood.add(new Place(getString(R.string.food02), getString(R.string.food_time), 24.4695945, 39.606515));
        placesFood.add(new Place(getString(R.string.food03), getString(R.string.food_time), 24.4878472, 39.6481492));
        placesFood.add(new Place(getString(R.string.food04), getString(R.string.food_time), 24.4878472, 39.6481492));
        placesFood.add(new Place(getString(R.string.food05), getString(R.string.food_time), 24.4878472, 39.6481492));
        placesFood.add(new Place(getString(R.string.food06), getString(R.string.food_time), 24.4878472, 39.6481492));
        placesFood.add(new Place(getString(R.string.food07), getString(R.string.food_time), 24.4878472, 39.6481492));
        placesFood.add(new Place(getString(R.string.food08), getString(R.string.food_time), 24.4780252, 39.6051526));
        placesFood.add(new Place(getString(R.string.food09), getString(R.string.food_time), 24.4780252, 39.6051526));
        placesFood.add(new Place(getString(R.string.food10), getString(R.string.food_time), 24.4675248, 39.5999492));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), placesFood);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
