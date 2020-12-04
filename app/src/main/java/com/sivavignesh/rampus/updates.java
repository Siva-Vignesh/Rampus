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

public class updates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.updates);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        Button bt1=findViewById(R.id.bt1);
        Button bt2=findViewById(R.id.bt2);
        Button bt3=findViewById(R.id.bt3);
        Button bt4=findViewById(R.id.bt4);
        Button bt5=findViewById(R.id.bt5);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                    String n="timetable";
                    Intent intent=new Intent(v.getContext(), com.sivavignesh.rampus.login.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }else{
                    nointernet();
                }

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                    String n="examtimetable";
                    Intent intent=new Intent(v.getContext(),login.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }else{
                   nointernet();
                }


            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
               // android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
              // android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
               // if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                   // String n="noticeboard";
                Toast toast = Toast.makeText(getApplicationContext(), "Available in upcoming updates",Toast.LENGTH_SHORT);toast.show();
               // }else{
                //    nointernet();
               // }

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),placementideas.class);
                    startActivity(intent);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                    String n="placement";
                    Intent intent=new Intent(v.getContext(),login.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }else {
                    nointernet();
                }

            }
        });
    }
    public void nointernet()
    {
        Toast toast = Toast.makeText(getApplicationContext(), "No Internet Connection",Toast.LENGTH_SHORT);toast.show();
    }
}
