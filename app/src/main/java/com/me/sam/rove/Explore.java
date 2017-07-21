package com.me.sam.rove;

import android.content.Context;
import android.content.Intent;
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
import android.widget.Toast;

import com.wajahatkarim3.easyflipview.EasyFlipView;


public class Explore extends Fragment {
    ImageView food,accomodation;
    ImageView img;


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
                /*FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.explore_by_d,childFragment,childFragment.getTag()).commit();*/
                getChildFragmentManager().beginTransaction().replace(R.id.explore_by_d,childFragment).commit();
            }
        });
//     transport.setOnClickListener(new View.OnClickListener() {
//         @Override
//         public void onClick(View view) {
//             PopupMenu popupmenu = new PopupMenu(getActivity(),transport);
//             popupmenu.getMenuInflater().inflate(R.menu.options_transport,popupmenu.getMenu());
//             popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                 @Override
//                 public boolean onMenuItemClick(MenuItem menuItem) {
//                     int s=menuItem.getItemId();
//                     if(s==R.id.METRO)
//                     {
//                         Intent callIntent = new Intent(Intent.ACTION_VIEW);
//                         callIntent.setData(Uri.parse(""));
//                         startActivity(callIntent);
//
//                     }
//                     else
//                     {
//                         Intent callIntent = new Intent(Intent.ACTION_VIEW);
//                         callIntent.setData(Uri.parse("http://delhi.gov.in/wps/wcm/connect/DOIT_DTC/dtc/home"));
//                         startActivity(callIntent);
//                     }
//                     return true;
//                 }
//             }); popupmenu.show();
//         }
//     });
        accomodation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hotels h=new Hotels();
                getChildFragmentManager().beginTransaction().replace(R.id.explore_by_d,h).commit();

            }
        });
//        cabs.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                PopupMenu popupMenu =new PopupMenu(getActivity(),cabs);
//                popupMenu.getMenuInflater().inflate(R.menu.options_cabs,popupMenu.getMenu());
//                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                    @Override
//                    public boolean onMenuItemClick(MenuItem menuItem) {
//                        int s=menuItem.getItemId();
//                        if(s==R.id.OLA)
//                        {
//                            Intent callIntent = new Intent(Intent.ACTION_VIEW);
//                            callIntent.setData(Uri.parse("https://www.olacabs.com"));
//                            startActivity(callIntent);
//                        }
//                        else
//                        {
//                            Intent callIntent = new Intent(Intent.ACTION_VIEW);
//                            callIntent.setData(Uri.parse("https://www.uber.com/en-IN/cities/new-delhi/"));
//                            startActivity(callIntent);
//                        }
//
//
//
//                        return true;
//                    }
//                });
//                popupMenu.show();
//            }
//         }  );

        return view;

    }

//    private void flipCard() {
//
//
//
//        FlipAnimation flipAnimation = new FlipAnimation(cardface, cardback);
//
//        if (cardface.getVisibility() == View.INVISIBLE)
//        {
//            flipAnimation.reverse();
//        }
//        rootLayout.startAnimation(flipAnimation);
//    }


}
