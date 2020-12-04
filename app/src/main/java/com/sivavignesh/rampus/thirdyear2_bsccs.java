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

public class thirdyear2_bsccs extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdyear2_bsccs);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        //AdRequest and load
        AdView mAdView = findViewById(R.id.adView126);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        b1=findViewById(R.id.bsccs_python);
        b2=findViewById(R.id.bsccs_ooad);
        b3=findViewById(R.id.bsccs_aies);
        b4=findViewById(R.id.bsccs_ecom);
        b5=findViewById(R.id.bsccs_ss);
        b6=findViewById(R.id.bsccs_wi);
        b7=findViewById(R.id.bsccs_cc);
        b8=findViewById(R.id.bsccs_bda);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(thirdyear2_bsccs.this))
                {
                    String n="python";
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
                if(isInternetAvailable(thirdyear2_bsccs.this))
                {
                    String n="ooad";
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
                if(isInternetAvailable(thirdyear2_bsccs.this))
                {
                    String n="aies";
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
                if(isInternetAvailable(thirdyear2_bsccs.this))
                {
                    String n="ecom";
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
                if(isInternetAvailable(thirdyear2_bsccs.this))
                {
                    String n="ss";
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
                if(isInternetAvailable(thirdyear2_bsccs.this))
                {
                    String n="wi";
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
                if(isInternetAvailable(thirdyear2_bsccs.this))
                {
                    String n="cc";
                    Intent intent=new Intent(v.getContext(),bsccsBlog.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }
                else{
                    nointernet();
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInternetAvailable(thirdyear2_bsccs.this))
                {
                    String n="bda";
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
