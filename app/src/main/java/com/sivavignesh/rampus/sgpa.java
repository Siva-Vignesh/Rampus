package com.sivavignesh.rampus;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.text.DecimalFormat;

public class sgpa extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner at1,at2,at3,at4,at5,at6,at7,at8;
    Spinner atg1, atg2, atg3, atg4, atg5, atg6, atg7, atg8;
    Double cm1=0.0 , cm2 = 0.0, cm3 = 0.0, cm4 = 0.0, cm5 = 0.0, cm6 = 0.0, cm7 = 0.0, cm8 = 0.0, sp1 = 0.0, sp2 = 0.0, sp3 = 0.0, sp4 = 0.0, sp5 = 0.0, sp6 = 0.0, sp7 = 0.0, sp8 = 0.0, ans, ans1;
    TextView r,roundoff;
    Button calc, sreset,sgpainfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sgpa);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        //AdRequest and load
        AdView mAdView = findViewById(R.id.adView3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        at1 =findViewById(R.id.sc1);
        at2 =findViewById(R.id.sc2);
        at3 =findViewById(R.id.sc3);
        at4 =findViewById(R.id.sc4);
        at5 =findViewById(R.id.sc5);
        at6 =findViewById(R.id.sc6);
        at7 =findViewById(R.id.sc7);
        at8 = findViewById(R.id.sc8);
        atg1 = findViewById(R.id.grd1);
        atg2 =  findViewById(R.id.grd2);
        atg3 = findViewById(R.id.grd3);
        atg4 = findViewById(R.id.grd4);
        atg5 = findViewById(R.id.grd5);
        atg6 = findViewById(R.id.grd6);
        atg7 = findViewById(R.id.grd7);
        atg8 = findViewById(R.id.grd8);
        r =  findViewById(R.id.cgparesult);
        roundoff =  findViewById(R.id.r);
        calc =  findViewById(R.id.sgpabt);
        sreset =  findViewById(R.id.sreset);
        sgpainfo=findViewById(R.id.sgpainfobutton) ;
        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.grd,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.creditspinner,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        at1.setAdapter(adapter);
        at1.setOnItemSelectedListener(this);
        at2.setAdapter(adapter);
        at2.setOnItemSelectedListener(this);
        at3.setAdapter(adapter);
        at3.setOnItemSelectedListener(this);
        at4.setAdapter(adapter);
        at4.setOnItemSelectedListener(this);
        at5.setAdapter(adapter);
        at5.setOnItemSelectedListener(this);
        at6.setAdapter(adapter);
        at6.setOnItemSelectedListener(this);
        at7.setAdapter(adapter);
        at7.setOnItemSelectedListener(this);
        at8.setAdapter(adapter);
        at8.setOnItemSelectedListener(this);
        atg1.setAdapter(adapter1);
        atg1.setOnItemSelectedListener(this);
        atg2.setAdapter(adapter1);
        atg2.setOnItemSelectedListener(this);
        atg3.setAdapter(adapter1);
        atg3.setOnItemSelectedListener(this);
        atg4.setAdapter(adapter1);
        atg4.setOnItemSelectedListener(this);
        atg5.setAdapter(adapter1);
        atg5.setOnItemSelectedListener(this);
        atg6.setAdapter(adapter1);
        atg6.setOnItemSelectedListener(this);
        atg7.setAdapter(adapter1);
        atg7.setOnItemSelectedListener(this);
        atg8.setAdapter(adapter1);
        atg8.setOnItemSelectedListener(this);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans = ((cm1 * sp1) + (cm2 * sp2) + (cm3 * sp3) + (cm4 * sp4) + (cm5 * sp5) + (cm6 * sp6) + (cm7 * sp7) + (cm8 * sp8)) / (cm1 + cm2 + cm3 + cm4 + cm5 + cm6 + cm7 + cm8);
                ans1=Math.round (ans*100.0) / 100.0;
                r.setText("SGPA is "+new DecimalFormat("##.####").format(ans));
                roundoff.setText("Round off - "+Double.toString(ans1));
            }
        });
        sgpainfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(v.getContext(),sgpainfo.class);
                startActivity(in);
            }
        });
        sreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cm1=0.0;
                cm2=0.0;
                cm3=0.0;
                cm4=0.0;
                cm5=0.0;
                cm6=0.0;
                cm7=0.0;
                cm8=0.0;
                sp1=0.0;
                sp2=0.0;
                sp3=0.0;
                sp4=0.0;
                sp5=0.0;
                sp6=0.0;
                sp7=0.0;
                sp8=0.0;
                at1.setSelection(0);
                at2.setSelection(0);
                at3.setSelection(0);
                at4.setSelection(0);
                at5.setSelection(0);
                at6.setSelection(0);
                at7.setSelection(0);
                at8.setSelection(0);
                atg1.setSelection(0);
                atg2.setSelection(0);
                atg3.setSelection(0);
                atg4.setSelection(0);
                atg5.setSelection(0);
                atg6.setSelection(0);
                atg7.setSelection(0);
                atg8.setSelection(0);
                r.setText("");
                roundoff.setText("");
            }
        });
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch(parent.getId()){
            case R.id.grd1 :
                if(position==0){
                    sp1=10.0;
                }
                if(position==1){
                    sp1=9.0;
                }
                if(position==2){
                    sp1=8.0;
                }
                if(position==3){
                    sp1=7.0;
                }
                if(position==4){
                    sp1=6.0;
                }
                if(position==5){
                    sp1=5.0;
                }
                if(position==6){
                    sp1=4.0;
                }
                break;
            case R.id.grd2 :
                if(position==1){
                    sp2=10.0;
                }
                if(position==1){
                    sp2=9.0;
                }
                if(position==2){
                    sp2=8.0;
                }
                if(position==3){
                    sp2=7.0;
                }
                if(position==4){
                    sp2=6.0;
                }
                if(position==5){
                    sp2=5.0;
                }
                if(position==6){
                    sp2=4.0;
                }break;
            case R.id.grd3 :
                if(position==0){
                    sp3=10.0;
                }
                if(position==1){
                    sp3=9.0;
                }
                if(position==2){
                    sp3=8.0;
                }
                if(position==3){
                    sp3=7.0;
                }
                if(position==4){
                    sp3=6.0;
                }
                if(position==5){
                    sp3=5.0;
                }
                if(position==6){
                    sp3=4.0;
                }break;
            case R.id.grd4 :
                if(position==0){
                    sp4=10.0;
                }
                if(position==1){
                    sp4=9.0;
                }
                if(position==2){
                    sp4=8.0;
                }
                if(position==3){
                    sp4=7.0;
                }
                if(position==4){
                    sp4=6.0;
                }
                if(position==5){
                    sp4=5.0;
                }
                if(position==6){
                    sp4=4.0;
                }break;
            case R.id.grd5 :
                if(position==0){
                    sp5=10.0;
                }
                if(position==1){
                    sp5=9.0;
                }
                if(position==2){
                    sp5=8.0;
                }
                if(position==3){
                    sp5=7.0;
                }
                if(position==4){
                    sp5=6.0;
                }
                if(position==5){
                    sp5=5.0;
                }
                if(position==6){
                    sp5=4.0;
                }break;
            case R.id.grd6 :
                if(position==0){
                    sp6=10.0;
                }
                if(position==1){
                    sp6=9.0;
                }
                if(position==2){
                    sp6=8.0;
                }
                if(position==3){
                    sp6=7.0;
                }
                if(position==4){
                    sp6=6.0;
                }
                if(position==5){
                    sp6=5.0;
                }
                if(position==6){
                    sp6=4.0;
                }break;
            case R.id.grd7 :
                if(position==0){
                    sp7=10.0;
                }
                if(position==1){
                    sp7=9.0;
                }
                if(position==2){
                    sp7=8.0;
                }
                if(position==3){
                    sp7=7.0;
                }
                if(position==4){
                    sp7=6.0;
                }
                if(position==5){
                    sp7=5.0;
                }
                if(position==6){
                    sp7=4.0;
                }break;
            case R.id.grd8 :
                if(position==0){
                    sp8=10.0;
                }
                if(position==1){
                    sp8=9.0;
                }
                if(position==2){
                    sp8=8.0;
                }
                if(position==3){
                    sp8=7.0;
                }
                if(position==4){
                    sp8=6.0;
                }
                if(position==5){
                    sp8=5.0;
                }
                if(position==6){
                    sp8=4.0;
                }break;
            case R.id.sc1:
                if(position==1){
                    cm1=1.0;
                }
                if(position==2){
                    cm1=2.0;
                }
                if(position==3){
                    cm1=3.0;
                }
                if(position==4){
                    cm1=4.0;
                }
                if(position==5){
                    cm1=5.0;
                }break;
            case R.id.sc2:
                if(position==2){
                    cm2=1.0;
                }
                if(position==2){
                    cm2=2.0;
                }
                if(position==3){
                    cm2=3.0;
                }
                if(position==4){
                    cm2=4.0;
                }
                if(position==5){
                    cm2=5.0;
                }break;
            case R.id.sc3:
                if(position==1){
                    cm3=1.0;
                }
                if(position==2){
                    cm3=2.0;
                }
                if(position==3){
                    cm3=3.0;
                }
                if(position==4){
                    cm3=4.0;
                }
                if(position==5){
                    cm3=5.0;
                }break;
            case R.id.sc4:
                if(position==1){
                    cm4=1.0;
                }
                if(position==2){
                    cm4=2.0;
                }
                if(position==3){
                    cm4=3.0;
                }
                if(position==4){
                    cm4=4.0;
                }
                if(position==5){
                    cm4=5.0;
                }break;
            case R.id.sc5:
                if(position==1){
                    cm5=1.0;
                }
                if(position==2){
                    cm5=2.0;
                }
                if(position==3){
                    cm5=3.0;
                }
                if(position==4){
                    cm5=4.0;
                }
                if(position==5){
                    cm5=5.0;
                }break;
            case R.id.sc6:
                if(position==1){
                    cm6=1.0;
                }
                if(position==2){
                    cm6=2.0;
                }
                if(position==3){
                    cm6=3.0;
                }
                if(position==4){
                    cm6=4.0;
                }
                if(position==5){
                    cm6=5.0;
                }break;
            case R.id.sc7:
                if(position==1){
                    cm7=1.0;
                }
                if(position==2){
                    cm7=2.0;
                }
                if(position==3){
                    cm7=3.0;
                }
                if(position==4){
                    cm7=4.0;
                }
                if(position==5){
                    cm7=5.0;
                }break;
            case R.id.sc8:
                if(position==1){
                    cm8=1.0;
                }
                if(position==2){
                    cm8=2.0;
                }
                if(position==3){
                    cm8=3.0;
                }
                if(position==4){
                    cm8=4.0;
                }
                if(position==5){
                    cm8=5.0;
                }break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}

