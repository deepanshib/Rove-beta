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


public class explorerFragment extends Fragment {
    ImageView b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,back,b17,b18;

    public explorerFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.locations_three, container, false);

        back= (ImageView) view.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),MainActivity.class));
            }
        });
        b1=(ImageView) view.findViewById(R.id.bt1);
        b2= (ImageView) view.findViewById(R.id.bt2);
        b3= (ImageView) view.findViewById(R.id.bt3);
        b4= (ImageView) view.findViewById(R.id.bt4);
        b5= (ImageView) view.findViewById(R.id.bt5);
        b6= (ImageView) view.findViewById(R.id.bt6);
        b7= (ImageView) view.findViewById(R.id.bt1b);
        b8= (ImageView) view.findViewById(R.id.bt2b);
        b9= (ImageView) view.findViewById(R.id.bt3b);
        b10= (ImageView) view.findViewById(R.id.bt4b);
        b11= (ImageView) view.findViewById(R.id.bt6a);
        b11= (ImageView) view.findViewById(R.id.bt5b);
        b12= (ImageView) view.findViewById(R.id.bt3a);
        b13=(ImageView) view.findViewById(R.id.bt1a);
        b14= (ImageView) view.findViewById(R.id.bt2a);
        b15= (ImageView) view.findViewById(R.id.bt5a);
        b16= (ImageView) view.findViewById(R.id.bt6a);//zoo
        b17= (ImageView) view.findViewById(R.id.bt4a);
        b18= (ImageView) view.findViewById(R.id.sarojni);

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

                gardenOfFiveSenses abc = new gardenOfFiveSenses();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gandhifragment abc = new gandhifragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sciencefragment abc = new sciencefragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AgrasenKiBouli abc = new AgrasenKiBouli();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                jantarmantarfragment abc = new jantarmantarfragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               indragandhi abc = new indragandhi();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dollfragment abc = new dollfragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               dillihaat abc = new dillihaat();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                humayunTomb abc = new humayunTomb();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nehrufragment abc = new nehrufragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iskontemple abc = new iskontemple();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                qutabfragment abc = new qutabfragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                redfortfragment abc = new redfortfragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lotus abc = new lotus();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                jamafargment abc = new jamafargment();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                zoo abc = new zoo();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                akshardham abc = new akshardham();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sarojinimarket abc = new sarojinimarket();
                getChildFragmentManager().beginTransaction().replace(R.id.places3,abc).commit();
            }
        });
        return view;
    }


}
