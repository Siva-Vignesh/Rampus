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

public class firstyear2 extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstyear2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        //AdRequest and load
        AdView mAdView = findViewById(R.id.adView112);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        btn1=findViewById(R.id.t2);
        btn2=findViewById(R.id.e2);
        btn3=findViewById(R.id.cpp);
        btn4=findViewById(R.id.wt);
        btn5=findViewById(R.id.m2);
        btn6=findViewById(R.id.f2);
        btn7=findViewById(R.id.h2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                    String n="t2";
                    Intent intent=new Intent(v.getContext(),notesblog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "No Internet Connection",Toast.LENGTH_LONG);toast.show();
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                    String n="e2";
                    Intent intent=new Intent(v.getContext(),notesblog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "No Internet Connection",Toast.LENGTH_LONG);toast.show();
                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                    String n="cpp";
                    Intent intent=new Intent(v.getContext(),notesblog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "No Internet Connection",Toast.LENGTH_LONG);toast.show();
                }

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                    String n="wt";
                    Intent intent=new Intent(v.getContext(),notesblog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "No Internet Connection",Toast.LENGTH_LONG);toast.show();
                }

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                    String n="m2";
                    Intent intent=new Intent(v.getContext(),notesblog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "No Internet Connection",Toast.LENGTH_LONG);toast.show();
                }

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                    String n="f2";
                    Intent intent=new Intent(v.getContext(),notesblog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "No Internet Connection",Toast.LENGTH_LONG);toast.show();
                }

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                    String n="h2";
                    Intent intent=new Intent(v.getContext(),notesblog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "No Internet Connection",Toast.LENGTH_LONG);toast.show();
                }

            }
        });
    }
}
