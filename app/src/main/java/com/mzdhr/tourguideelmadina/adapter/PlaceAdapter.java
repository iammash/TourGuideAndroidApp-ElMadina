package com.mzdhr.tourguideelmadina.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mzdhr.tourguideelmadina.R;
import com.mzdhr.tourguideelmadina.model.Place;

import java.util.ArrayList;

/**
 * Created by mohammad on 11/20/17.
 */

public class PlaceAdapter extends ArrayAdapter<Place>{

    public PlaceAdapter(Context context, ArrayList<Place> places){
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Place currentPlace = getItem(position);

        // getting views and setting values into them
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        TextView subTitleTextView = (TextView) listItemView.findViewById(R.id.sub_title_text_view);
        titleTextView.setText(currentPlace.getPlaceName());
        subTitleTextView.setText(currentPlace.getSubText());

        if (currentPlace.hasStarRating()){
            // in this case it is a Hotel place, hotel has 5 star system rating.
            subTitleTextView.setTextColor(ContextCompat.getColor(getContext(), R.color.colorAccent));
        }

        ImageView coverImageView = (ImageView) listItemView.findViewById(R.id.place_cover_image_view);
        if (currentPlace.hasCover()){
            // in this case it is a Spot (landmark), and a spot should have a cover (image).
            coverImageView.setImageResource(currentPlace.getCover());
            coverImageView.setVisibility(View.VISIBLE);
        }

            // setting a click listener to each item to open the place location in Google Map.
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:"+currentPlace.getLatitude()+","+currentPlace.getLongitude()+"?q="+currentPlace.getPlaceName());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getContext().getPackageManager()) != null) {
                    getContext().startActivity(mapIntent);
                }

            }
        });

        return listItemView;
    }
}
