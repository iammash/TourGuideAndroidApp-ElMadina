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

public class ShopFragment extends Fragment {

    public ShopFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_container, container, false);

        final ArrayList<Place> placesShops = new ArrayList<>();
        placesShops.add(new Place("dd", "8AM - 10PM", 24.4878472, 39.6481492));
        placesShops.add(new Place("d", "8AM - 10PM", 24.4695945, 39.606515));
        placesShops.add(new Place("d", "8AM - 10PM", 24.4878472, 39.6481492));
        placesShops.add(new Place("d", "8AM - 10PM", 24.4878472, 39.6481492));
        placesShops.add(new Place("ee dfe", "8AM - 10PM", 24.4878472, 39.6481492));
        placesShops.add(new Place("dd's", "8AM - 10PM", 24.4878472, 39.6481492));
        placesShops.add(new Place("d", "8AM - 10PM", 24.4878472, 39.6481492));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), placesShops);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
