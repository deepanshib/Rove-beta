package com.me.sam.rove;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.wajahatkarim3.easyflipview.EasyFlipView;


public class Explore extends Fragment {
    ImageView food,accomodation;
    ImageView img;
TextView ola,uber,bus,metro;
ImageView nearby;
    ImageView cabs;


    public Explore() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_exploring__fragment, container, false);
        cabs=(ImageView)view.findViewById(R.id.cabs1);
        ola=(TextView)view.findViewById(R.id.ola);
        uber=(TextView)view.findViewById(R.id.uber);
        bus=(TextView)view.findViewById(R.id.bus);
        metro=(TextView)view.findViewById(R.id.metro);
        ola.setPaintFlags(ola.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        uber.setPaintFlags(uber.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        bus.setPaintFlags(bus.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        metro.setPaintFlags(metro.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

        ola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.olacabs.com")));

            }
        });
        uber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.uber.com/en-IN/cities/new-delhi/")));


            }
        }); bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.delhitravelhelp.in")));


            }
        }); metro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.delhimetrorail.com")));

            }
        });
        accomodation=(ImageView) view.findViewById(R.id.accomodation4);
 img= (ImageView) view.findViewById(R.id.mapButton);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Please Wait until the Map loads",Toast.LENGTH_LONG).show();
                startActivity(new Intent(getContext(),mapactivity.class));
            }
        });
        final EasyFlipView easyFlipView = (EasyFlipView) view.findViewById(R.id.easyFlipView);
        easyFlipView.setFlipDuration(1000);
        easyFlipView.setFlipEnabled(true);

        view.findViewById(R.id.imgFrontCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 easyFlipView.flipTheView();

            }
        });

        view.findViewById(R.id.imgBackCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                easyFlipView.flipTheView();
            }
        });
        final EasyFlipView easyFlipView1=(EasyFlipView)view.findViewById(R.id.easyFlipView1);
        easyFlipView1.setFlipDuration(1000);
        easyFlipView.setFlipEnabled(true);
        view.findViewById(R.id.imgFrontCard2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                easyFlipView1.flipTheView();
            }
        });
      view.findViewById(R.id.imgBackCard2).setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              easyFlipView1.flipTheView();
          }
      });

         food= (ImageView) view.findViewById(R.id.food);

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                restaurants childFragment = new restaurants();
                getChildFragmentManager().beginTransaction().replace(R.id.explore_by_d,childFragment).commit();
            }
        });
        nearby= (ImageView) view.findViewById(R.id.nearby);
        nearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.maps.google.co.uk/maps?q=NearbyPlaces&h1=en")));
            }
        });
        accomodation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Hotels childFragment = new Hotels();
                getChildFragmentManager().beginTransaction().replace(R.id.explore_by_d,childFragment).commit();
            }
        });


        return view;

    }

}
