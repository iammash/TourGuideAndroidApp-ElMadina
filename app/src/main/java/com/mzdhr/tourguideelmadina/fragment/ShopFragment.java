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
        View rootView = inflater.inflate(R.layout.fragments_container, container, false);

        final ArrayList<Place> placesShops = new ArrayList<>();
        placesShops.add(new Place("Al Jazeera Hotel & Shopping Mall", "8AM - 10PM", 24.4512006, 39.6076065));
        placesShops.add(new Place("Central Shop", "8AM - 10PM", 24.4736487, 39.6071544));
        placesShops.add(new Place("Mazaia Mall", "8AM - 10PM", 24.471266, 39.6047082));
        placesShops.add(new Place("Al Rawasi Shopping Centee", "8AM - 10PM", 24.4512006, 39.6076065));
        placesShops.add(new Place("Yaseen Shop", "8AM - 10PM", 24.4512006, 39.6076065));
        placesShops.add(new Place("Sham 1 Hotel Shopping Mall", "8AM - 10PM", 24.4512006, 39.6076065));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), placesShops);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
