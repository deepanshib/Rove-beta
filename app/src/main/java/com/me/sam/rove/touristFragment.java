package com.me.sam.rove;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class touristFragment extends Fragment {
ImageView b1,b2,b3;

    public touristFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.locations_one, container, false);
        b1=(ImageView) view.findViewById(R.id.bt1a);
        b2= (ImageView) view.findViewById(R.id.bt2a);
        b3= (ImageView) view.findViewById(R.id.bt3a);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dollfragment abc = new dollfragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places,abc).commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gandhifragment abc = new gandhifragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places,abc).commit();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sciencefragment abc = new sciencefragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places,abc).commit();
            }
        });
        return view;
    }


}
