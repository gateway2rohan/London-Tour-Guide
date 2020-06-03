package com.example.tourguideapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;


public class FoodsFragment extends Fragment {

    public FoodsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.activity_list, container, false);
        ArrayList<Place> foods = new ArrayList<Place>();
        foods.add(new Place(R.drawable.amrutha_lounge, getString(R.string.fd1), getString(R.string.fda1)));
        foods.add(new Place(R.drawable.andy_greek_taverna, getString(R.string.fd2), getString(R.string.fda2)));
        foods.add(new Place(R.drawable.bar_sixty_one, getString(R.string.fd3), getString(R.string.fda3)));
        foods.add(new Place(R.drawable.core, getString(R.string.fd4), getString(R.string.fda4)));
        foods.add(new Place(R.drawable.dobar, getString(R.string.fd5), getString(R.string.fda5)));
        foods.add(new Place(R.drawable.mezcalito_chelesa, getString(R.string.fd6), getString(R.string.fda6)));
        foods.add(new Place(R.drawable.taste_of_nawab, getString(R.string.fd7), getString(R.string.fda7)));
        foods.add(new Place(R.drawable.the_ledbury, getString(R.string.fd8), getString(R.string.fda8)));
        foods.add(new Place(R.drawable.udaya_kerala_res, getString(R.string.fd9), getString(R.string.fda9)));
        foods.add(new Place(R.drawable.zeret_kitchen, getString(R.string.fd10), getString(R.string.fda10)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), foods);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);
        return rootView;
    }
}
