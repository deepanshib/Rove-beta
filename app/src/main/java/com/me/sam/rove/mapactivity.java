package com.me.sam.rove;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

public class mapactivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        String location[] = {"Doll Museum Delhi", "Red Fort","Jama Masjid", "Adventure Island","Qutub Minar","hauz khas","chanakyapuri", "India Gate Delhi","Chandni Chowk delhi","Lotus temple","Humayun's Tomb","Delhi Zoo","INA Delhi Haat ","Akshardhaam Temple Delhi","Janter Manter Delhi"};
        List<Address> addressList = null;
        for (int i = 0; i < location.length; i++) {
            if (location[i] != null || !location[i].equals("")) {
                Geocoder geo = new Geocoder((this));
                try {
                    addressList = geo.getFromLocationName(location[i], 1);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                Address add = addressList.get(0);
                LatLng latLng = new LatLng(add.getLatitude(), add.getLongitude());
                mMap.addMarker(new MarkerOptions().position(latLng).title(location[i]));

            }
        }
        LatLng latLng = new LatLng(28.7196,77.0662);
        CameraUpdate yourLocation = CameraUpdateFactory.newLatLngZoom(latLng, 11.0f);
        mMap.animateCamera(yourLocation);
        mMap.addMarker(new MarkerOptions().position(latLng).title("Current Location"));
      //  mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
    }
public void back(View view){
   startActivity(new Intent(this, MainActivity.class));
}
}
