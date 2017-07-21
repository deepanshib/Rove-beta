package com.me.sam.rove;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {


    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;





        private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_experience:
               {
                    Experience first = new Experience();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, first).commit();
                }
                    return true;
                case R.id.navigation_explore:
                {
                    Explore second = new Explore();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, second).commit();
                }
                    return true;
                case R.id.navigation_utilities:
                {
                    Utilities third = new Utilities();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, third).commit();
                }
                    return true;
                case R.id.navigation_profile:
                {
                    profile fourth = new profile();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, fourth).commit();

                }
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer, toolbar,  R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView)findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Experience first = new Experience();
        getSupportFragmentManager().beginTransaction().replace(R.id.content, first).commit();

        mAuth = FirebaseAuth.getInstance();

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null) {
                    // User is signed out
                    Toast.makeText(MainActivity.this,"main to sign in",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this,LogInPage.class);
                    startActivity(i);
                    finish();

                } else {
                    // User is signed in
                    //Log.d(TAG, "onAuthStateChanged:signed_out");
                }
                // ...
            }
        };





    }


    @Override
    public void onStart() {

        mAuth.addAuthStateListener(mAuthListener);
        super.onStart();
    }

    @Override
    protected void onStop() {

        mAuth.removeAuthStateListener(mAuthListener);
        super.onStop();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.share) {

        } else if (id == R.id.feedback) {

        } else if (id == R.id.rateus) {

        } else if (id == R.id.developers) {

        }
        else if (id == R.id.SignIn) {

            Intent i = new Intent(MainActivity.this,LogInPage.class);
            startActivity(i);



        }

        DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return false;
    }
}
