package com.hfad.planmap;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
//import java.util.*;------>For using vectors

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.LatLngBounds;
//where is the console?----------------------->import  java.io.Console;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
 //   Vector locations=new Vector();
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Chembur = new LatLng(19.062053,72.883436);
        LatLng Mulund = new LatLng(19.172554,72.942554);
        LatLng Dadar = new LatLng(19.021324,72.842418);
        LatLng CST= new LatLng(18.941067,72.836639);
        mMap.addMarker(new MarkerOptions().position(Chembur).title("Chembur"));
        mMap.addMarker(new MarkerOptions().position(Mulund).title("Mulund"));
        mMap.addMarker(new MarkerOptions().position(Dadar).title("Dadar"));
        mMap.addMarker(new MarkerOptions().position(CST).title("CST"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chembur));
//Vector locations=new Vector();

            //getcenter


//LatLng //getcenter
            LatLngBounds bound = new LatLngBounds(CST,Mulund);


                bound.including(Chembur);
        bound.including( Dadar );


        // OTHER CODE

//LatLng object
            LatLng centroid;


                    centroid=bound.getCenter();
            mMap.addMarker(new MarkerOptions().position(centroid).title("Centroid"));

            //Vector to store the LatLng object
            //Vector locations=new Vector();
            //locations.addElement(LatLng);
            //LatLng Centroid= new LatLng();
            //Centroid=bound.getCenter();
            //mMap.addMarker(new MarkerOptions().position(Centroid).title("Centroid"));

            //Vector to store the LatLng object
            //Vector locations=new Vector(LatLng);
            //locations.addElement(LatLng);
        }

    }

    /*
    @function Shows the center of multiple locations
    @param locations[][]
    contains the latitudes and longitudes of locations
     */
    /*
public void showCenter(Vector locations){
    //getcenter
    int i;

    LatLngBounds bound = new LatLngBounds();

    for (i = 0; i < locations.length; i++) {
        bound.extend( new LatLng(locations[i][2], locations[i][3]) );

        // OTHER CODE
    }
//LatLng //getcenter
LatLngBounds bound = new LatLngBounds();

for (i = 0; i < locations.length; i++) {
  bound.extend( new LatLng(locations[i][2], locations[i][3]) );

  // OTHER CODE
}
//LatLng object
 LatLng Centroid= new LatLng();
Centroid=bound.getCenter();
 mMap.addMarker(new MarkerOptions().position(Centroid).title("Centroid"));

 //Vector to store the LatLng object
 Vector locations=new Vector();
locations.addElement(LatLng);
    LatLng Centroid= new LatLng();
    Centroid=bound.getCenter();
    mMap.addMarker(new MarkerOptions().position(Centroid).title("Centroid"));

    //Vector to store the LatLng object
    Vector locations=new Vector(LatLng);
    locations.addElement(LatLng);
}*/

//}


