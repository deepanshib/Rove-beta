package com.me.sam.rove;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.me.sam.rove.mapactivity;
//import com.wajahatkarim3.easyflipview.EasyFlipView;
import com.me.sam.rove.R;

public class Explore extends Fragment {
    ImageButton img;
    public Explore() {
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
        View view=inflater.inflate(R.layout.fragment_explore, container, false);
        img= (ImageButton) view.findViewById(R.id.mapButton);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Please Wait until the Map loads",Toast.LENGTH_LONG).show();
                startActivity(new Intent(getContext(),mapactivity.class));
            }
        });
//        final EasyFlipView easyFlipView2 = (EasyFlipView) view.findViewById(R.id.easyFlipView2);
//        easyFlipView2.setFlipDuration(1000);
//        easyFlipView2.setFlipEnabled(true);
//        view.findViewById(R.id.imgFrontCard2).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getContext(), "Front Card", Toast.LENGTH_SHORT).show();
//                easyFlipView2.flipTheView();
//
//            }
//        });
//
//        view.findViewById(R.id.imgBackCard2).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getContext(), "Back Card", Toast.LENGTH_SHORT).show();
//                easyFlipView2.flipTheView();
//            }
//        });
        return view;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
    }

}