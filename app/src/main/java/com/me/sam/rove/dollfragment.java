package com.me.sam.rove;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class dollfragment extends Fragment {
Button b1;
    ViewPager viewPager;
    int images[] = {R.drawable.dollm};
    MyCustomPageAdapter myCustomPagerAdapter;
    public dollfragment() {
        // Required empty public constructor
    }

ImageView back;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_doll_m, container, false);
        viewPager = (ViewPager)view.findViewById(R.id.viewPager);
        myCustomPagerAdapter = new MyCustomPageAdapter(getActivity(), images);
        viewPager.setAdapter(myCustomPagerAdapter);
        back= (ImageView) view.findViewById(R.id.back);
        b1= (Button) view.findViewById(R.id.b1);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(),MainActivity.class));
            }
        });
//        b1=(Button)view.findViewById(R.id.b1);
//        b=(Button)view.findViewById(R.id.b);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                touristFragment abc = new touristFragment();
//                getChildFragmentManager().beginTransaction().replace(R.id.container,abc).commit();
//            }
//        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.maps.google.co.uk/maps?q=DollMuseum&h1=en")));

            }
        });
        return view;
    }

}
