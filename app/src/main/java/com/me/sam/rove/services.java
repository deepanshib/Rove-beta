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


public class services extends Fragment {
    Button b, hop,ps,bnk,lib;

    public services() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_gandhi_m, container, false);

        b=(Button)view.findViewById(R.id.back);
        hop=(Button)view.findViewById(R.id.hospitals);
        ps=(Button)view.findViewById(R.id.ps);
        bnk=(Button)view.findViewById(R.id.bank);
        lib=(Button)view.findViewById(R.id.lib);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Explore abc = new Explore();
                getChildFragmentManager().beginTransaction().replace(R.id.container,abc).commit();
            }
        });

        hop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.maps.google.co.uk/maps?q=HospitalsinDelhi&h1=en")));

            }
        });
        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.maps.google.co.uk/maps?q=PoliceStationsinDelhi&h1=en")));

            }
        });

        bnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.maps.google.co.uk/maps?q=BanksinDelhi&h1=en")));

            }
        });

        lib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.maps.google.co.uk/maps?q=LibrariessinDelhi&h1=en")));

            }
        });





        return view;

    }


}
