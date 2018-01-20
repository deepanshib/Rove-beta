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
import android.widget.TextView;


public class AgrasenKiBouli extends Fragment {

    Button b;
    TextView b1;
    ImageView back;
    public AgrasenKiBouli() {
        // Required empty public constructor
    }

    ViewPager viewPager;
    int images[] = {R.drawable.agrasen};
    MyCustomPageAdapter myCustomPagerAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_agrasen_ki_bouli, container, false);

        viewPager = (ViewPager)view.findViewById(R.id.viewPager);

        myCustomPagerAdapter = new MyCustomPageAdapter(getActivity(), images);
        viewPager.setAdapter(myCustomPagerAdapter);
        b1 = (TextView) view.findViewById(R.id.b1);
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
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.maps.google.co.uk/maps?q=AgrasenKiBaoli&h1=en")));

            }
        });
        return view;    }

}
