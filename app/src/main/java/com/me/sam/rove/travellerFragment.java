package com.me.sam.rove;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;


public class travellerFragment extends Fragment {
    ImageView b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,back;
ImageView b12;
    public travellerFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.locations_two, container, false);
        b1=(ImageView) view.findViewById(R.id.bt1b);
        b2= (ImageView) view.findViewById(R.id.bt2b);
        b3= (ImageView) view.findViewById(R.id.bt3b);
        b4= (ImageView) view.findViewById(R.id.bt4b);
        b5= (ImageView) view.findViewById(R.id.bt5b);
        b6= (ImageView) view.findViewById(R.id.bt3a);
        b6= (ImageView) view.findViewById(R.id.bt3a);
        b7= (ImageView) view.findViewById(R.id.bt1a);
        b8= (ImageView) view.findViewById(R.id.bt2a);
        b9= (ImageView) view.findViewById(R.id.bt5a);
        b10= (ImageView) view.findViewById(R.id.bt6a);
        b11= (ImageView) view.findViewById(R.id.bt4a);
        b12= (ImageView) view.findViewById(R.id.bt7a);
        back= (ImageView) view.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(),MainActivity.class));
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dollfragment abc = new dollfragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places2,abc).commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dillihaat abc = new dillihaat();
                getChildFragmentManager().beginTransaction().replace(R.id.places2,abc).commit();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iskontemple abc = new iskontemple();
                getChildFragmentManager().beginTransaction().replace(R.id.places2,abc).commit();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nehrufragment abc = new nehrufragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places2,abc).commit();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                redfortfragment abc = new redfortfragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places2,abc).commit();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                qutabfragment abc = new qutabfragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places2,abc).commit();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               lotus abc = new lotus();
                getChildFragmentManager().beginTransaction().replace(R.id.places2,abc).commit();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                jamafargment abc = new jamafargment();
                getChildFragmentManager().beginTransaction().replace(R.id.places2,abc).commit();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                akshardham abc = new akshardham();
                getChildFragmentManager().beginTransaction().replace(R.id.places2,abc).commit();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                indiagatefragment abc = new indiagatefragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places2,abc).commit();
            }
        });
        return view;

    }

}
