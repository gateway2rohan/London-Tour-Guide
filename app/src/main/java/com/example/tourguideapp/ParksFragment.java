package com.example.tourguideapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;


public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_list, container, false);
        ArrayList<Place> parks = new ArrayList<Place>();
        parks.add(new Place(R.drawable.hyde_park, getString(R.string.p1), getString(R.string.pa1)));
        parks.add(new Place(R.drawable.st_james, getString(R.string.p2), getString(R.string.pa2)));
        parks.add(new Place(R.drawable.regent, getString(R.string.p3), getString(R.string.pa3)));
        parks.add(new Place(R.drawable.crystal, getString(R.string.p4), getString(R.string.pa4)));
        parks.add(new Place(R.drawable.greenwich, getString(R.string.p5), getString(R.string.pa5)));
        parks.add(new Place(R.drawable.kensington, getString(R.string.p6), getString(R.string.pa6)));
        parks.add(new Place(R.drawable.victoria, getString(R.string.p7), getString(R.string.pa7)));
        parks.add(new Place(R.drawable.battersea, getString(R.string.p8), getString(R.string.pa8)));
        parks.add(new Place(R.drawable.green, getString(R.string.p9), getString(R.string.pa9)));
        parks.add(new Place(R.drawable.holland, getString(R.string.p10), getString(R.string.pa10)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), parks);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return rootView;
    }
}
