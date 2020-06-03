package com.example.tourguideapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_list, container, false);
        ArrayList<Place> sight = new ArrayList<Place>();
        sight.add(new Place(R.drawable.victoria_memorial,getString(R.string.s1),getString(R.string.sa1)));
        sight.add(new Place(R.drawable.peter,getString(R.string.s2),getString(R.string.sa2)));
        sight.add(new Place(R.drawable.achilles,getString(R.string.s3),getString(R.string.sa3)));
        sight.add(new Place(R.drawable.war,getString(R.string.s4),getString(R.string.sa4)));
        sight.add(new Place(R.drawable.artillery,getString(R.string.s5),getString(R.string.sa5)));
        sight.add(new Place(R.drawable.fountain,getString(R.string.s6),getString(R.string.sa6)));
        sight.add(new Place(R.drawable.bali,getString(R.string.s7),getString(R.string.sa7)));
        sight.add(new Place(R.drawable.richard,getString(R.string.s8),getString(R.string.sa8)));
        sight.add(new Place(R.drawable.sherlock,getString(R.string.s9),getString(R.string.sa9)));
        sight.add(new Place(R.drawable.bobby,getString(R.string.s10),getString(R.string.sa10)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(),sight);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return rootView;
    }
}
