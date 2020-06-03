package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(@NonNull Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (convertView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        Place currentPlace = getItem(position);
        if (currentPlace!= null) {
            ImageView currentImage = (ImageView) listItemView.findViewById(R.id.list_place_image);
            currentImage.setImageResource(currentPlace.getImage());
            TextView currentPlaceName = (TextView) listItemView.findViewById(R.id.list_place_name);
            currentPlaceName.setText(currentPlace.getName());
            TextView currentPlaceAddress = (TextView) listItemView.findViewById(R.id.list_place_address);
            currentPlaceAddress.setText(currentPlace.getAddress());
            return listItemView;
        }
        return listItemView;
    }
}
