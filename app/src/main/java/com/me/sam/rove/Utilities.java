package com.me.sam.rove;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Utilities extends Fragment {

    CardView cv, cv2, cv3, cv4, cv5, cv6, cv7;
    TextView tv2,tv4,tv5,tv6,tv7;

    private boolean a=false;



    public Utilities() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_utilities, container, false);
        tv2=(TextView)view.findViewById(R.id.tv2);
        tv4=(TextView)view.findViewById(R.id.tv4);
        tv5=(TextView)view.findViewById(R.id.tv5);
        tv6=(TextView)view.findViewById(R.id.tv6);
        tv7=(TextView)view.findViewById(R.id.tv7);

        cv = (CardView) view.findViewById(R.id.cv);
       // cv2 = (CardView) view.findViewById(R.id.cv2);
        cv3 = (CardView) view.findViewById(R.id.cv3);
        cv4 = (CardView) view.findViewById(R.id.cv4);
        cv5 = (CardView) view.findViewById(R.id.cv5);
        cv6 = (CardView) view.findViewById(R.id.cv6);
        cv7 = (CardView) view.findViewById(R.id.cv7);











        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
startActivity(new Intent(getContext(),weather.class));
            }
        });

//        cv2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//
//            }
//        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),currencyconvrtr.class));

            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(a==false) {
                    tv4.setText("  Police\t\t\t\t\t100\n\n" +
                            "  Fire\t\t\t\t\t101\n\n" +
                            "  Ambulance\t\t\t102\n\n" +
                            "  Women Helpline\t\t\t181\n\n"+
                            "  Child Helpline\t\t\t1098\n\n");

                    tv4.setVisibility(View.VISIBLE);
                }
                else{
                    tv4.setVisibility(View.GONE);


                }
                a=!a;

            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(a==false) {
                    tv5.setText("\n* International Trade Fair usually held in late November in Pragati Maidan.It is an art & craft fair.\n\n"+
                            "* International Mango Festival at Dilli Haat. Held between the months of June-July.\n\n"+
                            "* Qutub Festival at Qutub Complex,Mehrauli Road.\n\n"+
                            "* Delhi Book Fair at Pragati Maidan held in the month of January\n\n");

                    tv5.setVisibility(View.VISIBLE);
                }
                else{
                    tv5.setVisibility(View.GONE);


                }
                a=!a;

            }
        });

        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==false) {
                    tv6.setText("\n* Visit Delhi in the months of February, March, October or November.\n"+
                            "\n* Delhi has the BEST food. Period. You can find some of the best Mughalai curries, chaat (vegetarian street food), international restaurants and cuisines from all over India.\n"+
                            "\n* The best way to get around is Delhi Metro which connects most parts of Delhi really well.\n"+
                            "\n* Delhi Metro has a separate dedicated coach for female passengers, which is usually the first coach.\n"+
                            "\n* Wearing a traditional sari every day may not be necessary for ladies but it would be wise to cover up and dress modestly to avoid unwarranted advances. \n"+
                            "\n* For guys, long pants and sandals are a good bet on any given day.\n"+
                            "\n* Humidity is worst in the early summer months when temperatures soar over 100° F, but tends to wash off with the monsoon towards August.\n"+
                            "\n* Don’t drink the tap water, wash your hands frequently, and make sure that your food is thoroughly rinsed.\n"+
                            "\n* Only drink bottled water\n");

                    tv6.setVisibility(View.VISIBLE);
                }
                else{
                    tv6.setVisibility(View.GONE);


                }
                a=!a;

            }
        });
        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==false) {
                    tv7.setText("\n* Always stand in que.\n" +
                            "\n* Use Dustbins\n" +
                            "\n* Do not bring eatable inside the metro station premises\n"+
                            "\n* Avoid carrying children inside movie theater\n"+
                            "\n* Don't play your mobile songs on loudspeaker mode\n"+
                            "\n* Let people come out first, before you barge in - elevators, metro, malls.\n");

                    tv7.setVisibility(View.VISIBLE);
                }
                else{
                    tv7.setVisibility(View.GONE);


                }
                a=!a;

            }
        });

        return view;

    }



}
