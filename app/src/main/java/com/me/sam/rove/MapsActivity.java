package com.me.sam.rove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.location.Address;
import android.location.Geocoder;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        String location[] = {"Doll Museum Delhi", "Red fort", "Qutub Minar", "India gate Delhi","chandni chowk delhi","Lotus temple","humayun's tomb","Delhi Zoo","INA delhi haat ","Akshardhaam temple Delhi"};
        //is array me aur naam add krdio
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
        LatLng latLng = new LatLng(28.7041, 77.1025);
        CameraUpdate yourLocation = CameraUpdateFactory.newLatLngZoom(latLng, 11.0f);
        mMap.animateCamera(yourLocation);
    }
}

