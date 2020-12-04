package com.sivavignesh.rampus;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class aboutus extends AppCompatActivity {
Button siva,praveen,karthick,srmlife;
TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        siva=findViewById(R.id.siva);
        praveen=findViewById(R.id.praveen);
        karthick=findViewById(R.id.karthick);
        description=findViewById(R.id.description);
        srmlife=findViewById(R.id.ourbatch);
        siva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/siva_vignesh7/");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.instagram.com/siva_vignesh7/")));
                }
            }
        });
        praveen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/praveenkumar_08/");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.instagram.com/praveenkumar_08/")));
                }
            }

        });
        karthick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/karthi_4ever/");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.instagram.com/karthi_4ever/")));
                }
            }
        });
        srmlife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                    String n="srmlife";
                    Intent intent=new Intent(getApplicationContext(),login.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                }else{
                    String n="srmlife";
                    Intent intent=new Intent(getApplicationContext(),login.class);
                    intent.putExtra("somevariable",n);
                    startActivity(intent);
                    Toast toast = Toast.makeText(getApplicationContext(), "No Internet Connection",Toast.LENGTH_LONG);toast.show();
                }

            }
        });
    }
}
