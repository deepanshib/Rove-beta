package com.me.sam.rove;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class Explore extends Fragment {
ImageButton maps, services;
    public Explore() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_explore, container, false);

        maps = (ImageButton) view.findViewById(R.id.mapButton);
        services=(ImageButton)view.findViewById(R.id.services);


        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                services abc = new services();
                getChildFragmentManager().beginTransaction().replace(R.id.container,abc).commit();
            }
        });

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(getActivity(),MapsActivity.class));// either getContext() or getActivity()

            }
        });
        return inflater.inflate(R.layout.fragment_explore, container, false);
    }

}
