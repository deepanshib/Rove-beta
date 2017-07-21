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


public class dollfragment extends Fragment {
Button b,b1;

    public dollfragment() {
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

        View view=inflater.inflate(R.layout.fragment_doll_m, container, false);
//        b1=(Button)view.findViewById(R.id.b1);
//        b=(Button)view.findViewById(R.id.b);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                touristFragment abc = new touristFragment();
//                getChildFragmentManager().beginTransaction().replace(R.id.container,abc).commit();
//            }
//        });
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.maps.google.co.uk/maps?q=DelhiDollMuseum&h1=en")));
//
//            }
//        });
        return view;
    }

}
