package com.sivavignesh.rampus;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class theme extends AppCompatActivity {
Button theme1,theme2,theme3,theme4,theme5,theme6,theme7,theme8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.theme);
        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.7));

        WindowManager.LayoutParams params=getWindow().getAttributes();
        params.gravity= Gravity.CENTER;
        params.x=0;
        params.y=-20;
        getWindow().setAttributes(params);

        theme1=findViewById(R.id.theme1);
        theme2=findViewById(R.id.theme2);
        theme3=findViewById(R.id.theme3);
        theme4=findViewById(R.id.theme4);
        theme5=findViewById(R.id.theme5);
        theme6=findViewById(R.id.theme6);
        theme7=findViewById(R.id.theme7);
        theme8=findViewById(R.id.theme8);
        theme1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n="theme1";
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                intent.putExtra("variable",n);
                startActivity(intent);
                finish();
            }
        });
        theme2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n="theme2";
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                intent.putExtra("variable",n);
                startActivity(intent);
                finish();
            }
        });
        theme3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n="theme3";
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                intent.putExtra("variable",n);
                startActivity(intent);
                finish();
            }
        });
        theme4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n="theme4";
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                intent.putExtra("variable",n);
                startActivity(intent);
                finish();
            }
        });
        theme5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n="theme5";
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                intent.putExtra("variable",n);
                startActivity(intent);
                finish();
            }
        });
        theme6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n="theme6";
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                intent.putExtra("variable",n);
                startActivity(intent);
                finish();
            }
        });
        theme7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n="theme7";
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                intent.putExtra("variable",n);
                startActivity(intent);
                finish();
            }
        });
        theme8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n="theme8";
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                intent.putExtra("variable",n);
                finish();
                startActivity(intent);

            }
        });
    }
}
