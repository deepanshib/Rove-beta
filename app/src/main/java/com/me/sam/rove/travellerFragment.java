package com.me.sam.rove;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class travellerFragment extends Fragment {
    ImageButton b15,b14,b13;

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
        View view= inflater.inflate(R.layout.locations_one, container, false);
        b15=(ImageButton)view.findViewById(R.id.imageButton15);
        b14= (ImageButton)view.findViewById(R.id.imageButton14);
        b13= (ImageButton)view.findViewById(R.id.imageButton13);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nehrufragment abc = new nehrufragment();
                getChildFragmentManager().beginTransaction().replace(R.id.container,abc).commit();
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                qutabfragment abc = new qutabfragment();
                getChildFragmentManager().beginTransaction().replace(R.id.container,abc).commit();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                redfortfragment abc = new redfortfragment();
                getChildFragmentManager().beginTransaction().replace(R.id.container,abc).commit();
            }
        });
        return view;

    }

}
