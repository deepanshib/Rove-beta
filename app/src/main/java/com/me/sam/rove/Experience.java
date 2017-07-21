package com.me.sam.rove;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;


public class Experience extends Fragment{

    private CardView cvTourist, cvTraveller, cvExplorer;

    public Experience() {
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
        View view = inflater.inflate(R.layout.fragment_experience, container, false);

        cvTourist = (CardView) view.findViewById(R.id.cvTourist);
        cvTraveller = (CardView) view.findViewById(R.id.cvTraveller);
        cvExplorer = (CardView) view.findViewById(R.id.cvExplorer);



        cvTourist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                touristFragment abc = new touristFragment();
                getChildFragmentManager().beginTransaction().replace(R.id.layoutExperience,abc).commit();
                  //R.id.LayoutExperience
            }
        });

        cvTraveller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                travellerFragment abc = new travellerFragment();

                getChildFragmentManager().beginTransaction().replace(R.id.content,abc).commit();

            }
        });

        cvExplorer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                explorerFragment abc = new explorerFragment();

                getChildFragmentManager().beginTransaction().replace(R.id.content,abc).commit();
            }
        });


        return view;


    }



}
