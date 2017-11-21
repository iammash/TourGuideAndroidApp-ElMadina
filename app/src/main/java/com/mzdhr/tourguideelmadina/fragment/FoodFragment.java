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
        View rootView = inflater.inflate(R.layout.fragment_container, container, false);

        final ArrayList<Place> placesFood = new ArrayList<>();
        placesFood.add(new Place("Albaik Restaurant", "7AM - 10PM", 24.4878472, 39.6481492));
        placesFood.add(new Place("Albaik", "7AM - 10PM", 24.4695945, 39.606515));
        placesFood.add(new Place("Herfy", "9AM - 9PM", 24.4878472, 39.6481492));
        placesFood.add(new Place("KFC", "11AM - 11PM", 24.4878472, 39.6481492));
        placesFood.add(new Place("STARBUCKS COFFEE", "7AM - 10PM", 24.4878472, 39.6481492));
        placesFood.add(new Place("McDonald's", "7AM - 10PM", 24.4878472, 39.6481492));
        placesFood.add(new Place("Cinnabon", "8AM - 9PM", 24.4878472, 39.6481492));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), placesFood);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
