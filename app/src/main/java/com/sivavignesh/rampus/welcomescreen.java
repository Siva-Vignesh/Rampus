package com.sivavignesh.rampus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class welcomescreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcomescreen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                final String PREFS_NAME = "firsttime";
                SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                if (settings.getBoolean("my_first_time", true)) {
                    Intent welcome=new Intent(welcomescreen.this, com.sivavignesh.rampus.name.class);
                    settings.edit().putBoolean("my_first_time", false).apply();
                    startActivity(welcome);
                    finish();

                }else{
                    Intent welcome=new Intent(welcomescreen.this, com.sivavignesh.rampus.MainActivity.class);
                    startActivity(welcome);
                    finish();
                }



            }
        },SPLASH_TIME_OUT);
    }
}
