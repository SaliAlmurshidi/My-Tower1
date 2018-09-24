package com.my_tower.my_tower.startPage;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.my_tower.my_tower.R;

public class splashScreen extends AppCompatActivity {

    // Final value to select time to show image
    private final int splashTime = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Remove notification bar
       // this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        new Handler().postDelayed(new Runnable() {

            /*
             * Showin9g splash screen with a timer.
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start login activity
                Intent i = new Intent(splashScreen.this, login.class);
                startActivity(i);
                // close this activity
                finish();
            }
        }, splashTime);

    }
}
