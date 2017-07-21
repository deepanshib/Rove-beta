package com.me.sam.rove;

import android.content.Context;
import android.content.Intent;
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
ImageView b1,b2,b3,b4,b5,b6,back;

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
        b4= (ImageView) view.findViewById(R.id.bt4a);
        b5= (ImageView) view.findViewById(R.id.bt5a);
        b6= (ImageView) view.findViewById(R.id.bt6a);
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

                redfortfragment abc = new redfortfragment();
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

                qutabfragment abc = new qutabfragment();
                getChildFragmentManager().beginTransaction().replace(R.id.places,abc).commit();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                jamafargment abc = new jamafargment();
                getChildFragmentManager().beginTransaction().replace(R.id.places,abc).commit();
            }
        });
        return view;
    }


}
