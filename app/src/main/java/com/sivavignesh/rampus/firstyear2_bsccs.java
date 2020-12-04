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

public class firstyear2_bsccs extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstyear2_bsccs);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //AdRequest and load
        AdView mAdView = findViewById(R.id.adView122);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        b1=findViewById(R.id.bsccs_t2);
        b2=findViewById(R.id.bsccs_e2);
        b3=findViewById(R.id.bsccs_f2);
        b4=findViewById(R.id.bsccs_h2);
        b5=findViewById(R.id.bsccs_cpp);
        b6=findViewById(R.id.bsccs_ds);
        b7=findViewById(R.id.bsccs_m2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(firstyear2_bsccs.this))
                {
                    String n="t2";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(firstyear2_bsccs.this))
                {
                    String n="e2";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(firstyear2_bsccs.this))
                {
                    String n="f2";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(firstyear2_bsccs.this))
                {
                    String n="h2";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(firstyear2_bsccs.this))
                {
                    String n="cpp";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(firstyear2_bsccs.this))
                {
                    String n="ds";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(firstyear2_bsccs.this))
                {
                    String n="m2";
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
