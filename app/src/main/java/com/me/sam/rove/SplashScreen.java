package com.me.sam.rove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class SplashScreen extends AppCompatActivity {
    Thread splash;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN)
            synchronized (splash) {
                splash.notifyAll();
            }
        return super.onTouchEvent(event);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        splash=new Thread(){
            @Override
            public void run() {
                try {
                    synchronized (this) {
                        wait(3000);
                        startActivity(new Intent(getApplicationContext(), LogInPage.class));
                        finish();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splash.start();
    }
}
