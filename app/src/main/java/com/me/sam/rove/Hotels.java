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


public class Hotels extends Fragment {
   Button north,south,east,west;
    ImageButton go;

    public Hotels() {
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
        View view=inflater.inflate(R.layout.fragment_hotels, container, false);
        north=(Button)view.findViewById(R.id.north1);
        south=(Button)view.findViewById(R.id.south1);
        east=(Button)view.findViewById(R.id.east1);
        west=(Button)view.findViewById(R.id.west1);
         go=(ImageButton)view.findViewById(R.id.back1);
        All_hotel a=new All_hotel();
        getChildFragmentManager().beginTransaction().replace(R.id.hotel_frame,a).commit();
        north.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                north_hotels h=new north_hotels();
                getChildFragmentManager().beginTransaction().replace(R.id.hotel_frame,h).commit();
            }
        });
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Explore exp=new Explore();
                getChildFragmentManager().beginTransaction().replace(R.id.hotel_layout,exp).commit();
            }
        });
        south.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                south_hotels s=new south_hotels();
                getChildFragmentManager().beginTransaction().replace(R.id.hotel_frame,s).commit();
            }
        });
        east.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                East_hotels e=new East_hotels();
                getChildFragmentManager().beginTransaction().replace(R.id.hotel_frame,e).commit();
            }
        });
        west.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                west_hotels w=new west_hotels();
                getChildFragmentManager().beginTransaction().replace(R.id.hotel_frame,w).commit();
            }
        });
        return view;
    }


}
