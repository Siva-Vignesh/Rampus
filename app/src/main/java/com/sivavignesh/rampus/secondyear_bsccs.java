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

public class secondyear_bsccs extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondyear_bsccs);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //AdRequest and load
        AdView mAdView = findViewById(R.id.adView123);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        b1=findViewById(R.id.bsccs_java);
        b2=findViewById(R.id.bsccs_multimedia);
        b3=findViewById(R.id.bsccs_statisticalmethods);
        b4=findViewById(R.id.bsccs_se);
        b5=findViewById(R.id.bsccs_os);
        b6=findViewById(R.id.bsccs_co);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(secondyear_bsccs.this))
                {
                    String n="java";
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
                if(isInternetAvailable(secondyear_bsccs.this))
                {
                    String n="mm";
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
                if(isInternetAvailable(secondyear_bsccs.this))
                {
                    String n="statisticalmethod";
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
                if(isInternetAvailable(secondyear_bsccs.this))
                {
                    String n="se";
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
                if(isInternetAvailable(secondyear_bsccs.this))
                {
                    String n="os";
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
                if(isInternetAvailable(secondyear_bsccs.this))
                {
                    String n="co";
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
