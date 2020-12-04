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

public class thirdyear extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdyear);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        //AdRequest and load
        AdView mAdView = findViewById(R.id.adView115);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btn1=findViewById(R.id.php);
        btn2=findViewById(R.id.cn);
        btn3=findViewById(R.id.os);
        btn4=findViewById(R.id.set);
        btn5=findViewById(R.id.mis);
        btn6=findViewById(R.id.km);
        btn7=findViewById(R.id.evs);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                    String n="php";
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
                    String n="cn";
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
                    String n="os";
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
                    String n="set";
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
                    String n="mis";
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
                    String n = "km";
                    Intent intent = new Intent(v.getContext(), notesblog.class);
                    intent.putExtra("somevariable", n);
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
                    String n = "evs";
                    Intent intent = new Intent(v.getContext(), notesblog.class);
                    intent.putExtra("somevariable", n);
                    startActivity(intent);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "No Internet Connection",Toast.LENGTH_LONG);toast.show();
                }

            }
        });
    }
}
