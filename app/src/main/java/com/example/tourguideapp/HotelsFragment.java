package com.example.tourguideapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_list, container, false);
        ArrayList<Place> hotels = new ArrayList<Place>();
        hotels.add(new Place(R.drawable.hilton, getString(R.string.h1), getString(R.string.ha1)));
        hotels.add(new Place(R.drawable.britannia, getString(R.string.h2), getString(R.string.ha2)));
        hotels.add(new Place(R.drawable.tower, getString(R.string.h3), getString(R.string.ha3)));
        hotels.add(new Place(R.drawable.kensington_h, getString(R.string.h4), getString(R.string.ha4)));
        hotels.add(new Place(R.drawable.wellesley, getString(R.string.h5), getString(R.string.ha5)));
        hotels.add(new Place(R.drawable.clayton, getString(R.string.h6), getString(R.string.ha6)));
        hotels.add(new Place(R.drawable.western, getString(R.string.h7), getString(R.string.ha7)));
        hotels.add(new Place(R.drawable.qbic, getString(R.string.h8), getString(R.string.ha8)));
        hotels.add(new Place(R.drawable.airways, getString(R.string.h9), getString(R.string.ha9)));
        hotels.add(new Place(R.drawable.eden, getString(R.string.h10), getString(R.string.ha10)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), hotels);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);
        return rootView;
    }
}
