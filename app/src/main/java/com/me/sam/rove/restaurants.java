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


public class restaurants extends Fragment {
  Button north,south,east,west;
    ImageButton back;
    public restaurants() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_restaurants, container, false);
        north=(Button)view.findViewById(R.id.north);
        south=(Button)view.findViewById(R.id.south);
        east=(Button)view.findViewById(R.id.east);
        west=(Button)view.findViewById(R.id.west);
        back=(ImageButton)view.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Explore r=new Explore();
                getChildFragmentManager().beginTransaction().replace(R.id.restaurants,r).commit();
            }
        });
        ALL_restaurant n=new ALL_restaurant();
        getChildFragmentManager().beginTransaction().replace(R.id.food_frame,n).commit();
        north.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              north_restaurants n1=new north_restaurants();
                getChildFragmentManager().beginTransaction().replace(R.id.food_frame,n1).commit();
            }
        });
        south.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Southdelhi_restaurants n2=new Southdelhi_restaurants();
                getChildFragmentManager().beginTransaction().replace(R.id.food_frame,n2).commit();
            }
        });
     east.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Eastdelhi_restaurants n3=new Eastdelhi_restaurants();
             getChildFragmentManager().beginTransaction().replace(R.id.food_frame,n3).commit();
         }
     });
        west.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Westdelhi_Restaurants n4=new Westdelhi_Restaurants();
                getChildFragmentManager().beginTransaction().replace(R.id.food_frame,n4).commit();
            }
        });

        return view;

    }


}
