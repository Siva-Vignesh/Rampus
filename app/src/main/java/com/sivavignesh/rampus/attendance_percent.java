package com.sivavignesh.rampus;

import android.app.DatePickerDialog;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Calendar;

public class attendance_percent extends AppCompatActivity implements AdapterView.OnItemSelectedListener
 {
    Spinner dept, year, section;
    String Textdept, Textyear, n;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendance_percent);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        //AdRequest and load
        //AdView mAdView = findViewById(R.id.adView6);
        // AdRequest adRequest = new AdRequest.Builder().build();
        //mAdView.loadAd(adRequest);


        dept=(Spinner)findViewById(R.id.acoursespinner);
        year=(Spinner)findViewById(R.id.ayearspinner);
        check=(Button)findViewById(R.id.acheck);
        String[] course={"bca","bsccs"};
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.ccourse,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.year,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dept.setAdapter(adapter);
        year.setAdapter(adapter1);
        dept.setOnItemSelectedListener(this);
        year.setOnItemSelectedListener(this);



        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Textdept.equals("bca") && Textyear.equals("first")  ){
                    n="bca1";
                }
                else if(Textdept.equals("bca") && Textyear.equals("second")){
                    n="bca2";
                }
                else if(Textdept.equals("bca") && Textyear.equals("third") ){
                    n="bca3";
                }
                else if(Textdept.equals("bsccs") && Textyear.equals("first")  ){
                    n="bsccs1";
                }
                else if(Textdept.equals("bsccs") && Textyear.equals("second")){
                    n="bsccs5";
                }
                else if(Textdept.equals("bsccs") && Textyear.equals("third") ){
                    n="bsccs9";
                }
                else if(Textdept.equals("mca") && Textyear.equals("first")  ){
                    n="mca";
                }
                else if(Textdept.equals("mca") && Textyear.equals("second")){
                    n="mca";
                }
                else if(Textdept.equals("mca") && Textyear.equals("third") ){
                    n="mca";
                }
                else{
                    n="nodata";
                    Toast.makeText(getApplicationContext(), "No Data", Toast.LENGTH_SHORT).show();
                }

                Intent intent=new Intent(v.getContext(),attendance_webview.class);
                intent.putExtra("variable",n);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch(parent.getId()) {
            case R.id.acoursespinner:
                if(position==0){
                    Textdept="bca";
                }
                if(position==1){
                    Textdept="bsccs";
                }
            case R.id.ayearspinner:
                if(position==0){
                    Textyear="first";
                }
                if(position==1){
                    Textyear="second";
                }
                if(position==2){
                    Textyear="third";
                }break;

        }


    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    }

