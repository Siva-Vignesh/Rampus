package com.sivavignesh.rampus;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class bsccs extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10,lab11,lab12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bsccs);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //AdRequest and load
        AdView mAdView = findViewById(R.id.adView12);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        b1=findViewById(R.id.bsccsfirstyear);
        b2=findViewById(R.id.bsccsfirstyear2);
        b3=findViewById(R.id.bsccssecondyear);
        b4=findViewById(R.id.bsccssecondyear2);
        b5=findViewById(R.id.bsccsthirdyear);
        b6=findViewById(R.id.bsccsthirdyear2);
        lab1=findViewById(R.id.lab_c);
        lab2=findViewById(R.id.lab_c2);
        lab3=findViewById(R.id.lab_c3);
        lab4=findViewById(R.id.lab_c4);
        lab5=findViewById(R.id.lab_c5);
        lab6=findViewById(R.id.lab_c6);
        lab7=findViewById(R.id.lab_c7);
        lab8=findViewById(R.id.lab_c8);
        lab9=findViewById(R.id.lab_c9);
        lab10=findViewById(R.id.lab_c10);
        lab11=findViewById(R.id.lab_c11);
        lab12=findViewById(R.id.lab_c12);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(v.getContext(),firstyear_bsccs.class);
                startActivity(in);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(v.getContext(),firstyear2_bsccs.class);
                startActivity(in);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(v.getContext(),secondyear_bsccs.class);
                startActivity(in);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(v.getContext(),secondyear2_bsccs.class);
                startActivity(in);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(v.getContext(),thirdyear_bsccs.class);
                startActivity(in);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(v.getContext(),thirdyear2_bsccs.class);
                startActivity(in);
            }
        });
        lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(bsccs.this))
                {
                    String n="c";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(bsccs.this))
                {
                    String n="c2";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        lab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(bsccs.this))
                {
                    String n="c3";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        lab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(bsccs.this))
                {
                    String n="c4";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        lab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(bsccs.this))
                {
                    String n="c5";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        lab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(bsccs.this))
                {
                    String n="c6";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        lab7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(bsccs.this))
                {
                    String n="c7";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        lab8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(bsccs.this))
                {
                    String n="c8";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        lab9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(bsccs.this))
                {
                    String n="c9";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        lab10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(bsccs.this))
                {
                    String n="c10";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        lab11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(bsccs.this))
                {
                    String n="c11";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        lab12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(bsccs.this))
                {
                    String n="c12";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
    }
    public boolean isInternetAvailable(Context context)
    {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
            return true;
        }
        else{
            return false;
        }
    }
    public void nointernet()
    {
        Toast toast = Toast.makeText(getApplicationContext(), "No Internet Connection",Toast.LENGTH_SHORT);toast.show();
    }
}
