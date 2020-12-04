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

public class attendance_course extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Spinner dept,year,section;
String Textdept,Textyear,Textsection,n;
Button go,check;
DatePickerDialog d;Calendar c;
int hour=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendance_course);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //AdRequest and load
        AdView mAdView = findViewById(R.id.adView6);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        c=Calendar.getInstance();
        final int dday=c.get(Calendar.DAY_OF_MONTH);
        final int mmonth=c.get(Calendar.MONTH);
        final int yyear=c.get(Calendar.YEAR);


        dept=(Spinner)findViewById(R.id.coursespinner);
        year=(Spinner)findViewById(R.id.yearspinner);
        section=(Spinner)findViewById(R.id.sectionspinner);
        go=(Button)findViewById(R.id.go);
        check=(Button)findViewById(R.id.check);


        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.course,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.year,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(this,R.array.section,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dept.setAdapter(adapter);
        year.setAdapter(adapter1);
        section.setAdapter(adapter2);
        dept.setOnItemSelectedListener(this);
        year.setOnItemSelectedListener(this);
        section.setOnItemSelectedListener(this);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {



                d=new DatePickerDialog(attendance_course.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        if(Textdept.equals("bca") && Textyear.equals("first") && Textsection.equals("a") ){
                            n="bca1";
                        }
                        else if(Textdept.equals("bca") && Textyear.equals("first") && Textsection.equals("b") ){
                            n="bca2";
                        }
                        else if(Textdept.equals("bca") && Textyear.equals("first") && Textsection.equals("c") ) {
                            n = "bca3";
                        }
                        else if(Textdept.equals("bca") && Textyear.equals("first") && Textsection.equals("d") ){
                            n="bca4";
                        }
                        else if(Textdept.equals("bca") && Textyear.equals("second") && Textsection.equals("a") ){
                            n="bca5";
                        }
                        else if(Textdept.equals("bca") && Textyear.equals("second") && Textsection.equals("b") ){
                            n="bca6";
                        }
                        else if(Textdept.equals("bca") && Textyear.equals("second") && Textsection.equals("c") ){
                            n="bca7";
                        }
                        else if(Textdept.equals("bca") && Textyear.equals("second") && Textsection.equals("d") ){
                            n="bca8";
                        }
                        else if(Textdept.equals("bca") && Textyear.equals("third") && Textsection.equals("a") ){
                            n="bca9";

                        }
                        else if(Textdept.equals("bca") && Textyear.equals("third") && Textsection.equals("b") ){
                            n="bca10";
                        }
                        else if(Textdept.equals("bca") && Textyear.equals("third") && Textsection.equals("c") ){
                            n="bca11";
                        }
                        else  if(Textdept.equals("bca") && Textyear.equals("third") && Textsection.equals("d") ){
                            n="bca12";
                        }
                        else if(Textdept.equals("bsccs") && Textyear.equals("first") && Textsection.equals("a") ){
                            n="bsccs1";
                        }
                        else if(Textdept.equals("bsccs") && Textyear.equals("first") && Textsection.equals("b") ){
                            n="bsccs2";
                        }
                        else if(Textdept.equals("bsccs") && Textyear.equals("first") && Textsection.equals("c") ){
                            n="bsccs3";
                        }
                        else if(Textdept.equals("bsccs") && Textyear.equals("first") && Textsection.equals("d") ){
                            n="bsccs4";
                        }
                        else if(Textdept.equals("bsccs") && Textyear.equals("second") && Textsection.equals("a") ){
                            n="bsccs5";
                        }
                        else if(Textdept.equals("bsccs") && Textyear.equals("second") && Textsection.equals("b") ){
                            n="bsccs6";
                        }
                        else if(Textdept.equals("bsccs") && Textyear.equals("second") && Textsection.equals("c") ){
                            n="bsccs7";
                        }
                        else if(Textdept.equals("bsccs") && Textyear.equals("second") && Textsection.equals("d") ){
                            n="bsccs8";
                        }
                        else if(Textdept.equals("bsccs") && Textyear.equals("third") && Textsection.equals("a") ){
                            n="bsccs9";
                        }
                        else if(Textdept.equals("bsccs") && Textyear.equals("third") && Textsection.equals("b") ){
                            n="bsccs10";
                        }
                        else if(Textdept.equals("bsccs") && Textyear.equals("third") && Textsection.equals("c") ){
                            n="bsccs11";
                        }
                        else if(Textdept.equals("bsccs") && Textyear.equals("third") && Textsection.equals("d") ){
                            n="bsccs12";
                        }
                        else if(Textdept.equals("bba") && Textyear.equals("first") && Textsection.equals("a") ){
                            n="bba1";
                        }
                        else if(Textdept.equals("bba") && Textyear.equals("first") && Textsection.equals("b") ){
                            n="bba2";
                        }
                        else if(Textdept.equals("bba") && Textyear.equals("second") && Textsection.equals("a") ){
                            n="bba3";
                        }
                        else if(Textdept.equals("bba") && Textyear.equals("second") && Textsection.equals("b") ){
                            n="bba4";
                        }
                        else if(Textdept.equals("bba") && Textyear.equals("third") && Textsection.equals("a") ){
                            n="bba5";
                        }
                        else if(Textdept.equals("bba") && Textyear.equals("third") && Textsection.equals("b") ){
                            n="bba6";
                        }
                        else if(Textdept.equals("vis") && Textyear.equals("first") && Textsection.equals("a") ){
                            n="vis1";
                        }
                        else if(Textdept.equals("vis") && Textyear.equals("first") && Textsection.equals("b") ){
                            n="vis2";
                        }
                        else if(Textdept.equals("vis") && Textyear.equals("first") && Textsection.equals("c") ){
                            n="vis3";
                        }
                        else if(Textdept.equals("vis") && Textyear.equals("second") && Textsection.equals("a") ){
                            n="vis4";
                        }
                        else if(Textdept.equals("vis") && Textyear.equals("second") && Textsection.equals("b") ){
                            n="vis5";
                        }
                        else if(Textdept.equals("vis") && Textyear.equals("second") && Textsection.equals("c") ){
                            n="vis6";
                        }
                        else  if(Textdept.equals("vis") && Textyear.equals("third") && Textsection.equals("a") ){
                            n="vis7";
                        }
                        else if(Textdept.equals("vis") && Textyear.equals("third") && Textsection.equals("b") ){
                            n="vis8";
                        }
                        else if(Textdept.equals("vis") && Textyear.equals("third") && Textsection.equals("c") ){
                            n="vis9";
                        }
                        else if(Textdept.equals("bcom") && Textyear.equals("first") && Textsection.equals("a") ){
                            n="bcom1";
                        }
                        else if(Textdept.equals("bcom") && Textyear.equals("first") && Textsection.equals("b") ){
                            n="bcom2";
                        }
                        else if(Textdept.equals("bcom") && Textyear.equals("first") && Textsection.equals("c") ){
                            n="bcom3";
                        }
                        else if(Textdept.equals("bcom") && Textyear.equals("first") && Textsection.equals("d") ){
                            n="bcom4";
                        }
                        else if(Textdept.equals("bcom") && Textyear.equals("second") && Textsection.equals("a") ){
                            n="bcom5";
                        }
                        else if(Textdept.equals("bcom") && Textyear.equals("second") && Textsection.equals("b") ){
                            n="bcom6";
                        }
                        else if(Textdept.equals("bcom") && Textyear.equals("second") && Textsection.equals("c") ){
                            n="bcom7";
                        }
                        else if(Textdept.equals("bcom") && Textyear.equals("second") && Textsection.equals("d") ){
                            n="bcom8";
                        }
                        else if(Textdept.equals("bcom") && Textyear.equals("third") && Textsection.equals("a") ){
                            n="bcom9";
                        }
                        else if(Textdept.equals("bcom") && Textyear.equals("third") && Textsection.equals("b") ){
                            n="bcom10";
                        }
                        else if(Textdept.equals("bcom") && Textyear.equals("third") && Textsection.equals("c") ){
                            n="bcom11";
                        }
                        else{
                            n="nodata";
                            Toast.makeText(getApplicationContext(), "No Data", Toast.LENGTH_SHORT).show();
                        }
                        String key=n+"-"+hour+"-"+day+"-"+month+1+"-"+year;
                        Intent intent=new Intent(v.getContext(),attendancelist.class);
                        intent.putExtra("variable",key);
                        startActivity(intent);
                    }
                },yyear,mmonth,dday);
                d.show();

            }
        });
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Textdept.equals("bca") && Textyear.equals("first") && Textsection.equals("a") ){
                    n="bca1";
                }
                else if(Textdept.equals("bca") && Textyear.equals("first") && Textsection.equals("b") ){
                    n="bca2";
                }
                else if(Textdept.equals("bca") && Textyear.equals("first") && Textsection.equals("c") ) {
                    n = "bca3";
                }
                else if(Textdept.equals("bca") && Textyear.equals("first") && Textsection.equals("d") ){
                    n="bca4";
                }
                else if(Textdept.equals("bca") && Textyear.equals("second") && Textsection.equals("a") ){
                    n="bca5";
                }
                else if(Textdept.equals("bca") && Textyear.equals("second") && Textsection.equals("b") ){
                    n="bca6";
                }
                else if(Textdept.equals("bca") && Textyear.equals("second") && Textsection.equals("c") ){
                    n="bca7";
                }
                else if(Textdept.equals("bca") && Textyear.equals("second") && Textsection.equals("d") ){
                    n="bca8";
                }
                else if(Textdept.equals("bca") && Textyear.equals("third") && Textsection.equals("a") ){
                    n="bca9";

                }
                else if(Textdept.equals("bca") && Textyear.equals("third") && Textsection.equals("b") ){
                    n="bca10";
                }
                else if(Textdept.equals("bca") && Textyear.equals("third") && Textsection.equals("c") ){
                    n="bca11";
                }
                else  if(Textdept.equals("bca") && Textyear.equals("third") && Textsection.equals("d") ){
                    n="bca12";
                }
                else if(Textdept.equals("bsccs") && Textyear.equals("first") && Textsection.equals("a") ){
                    n="bsccs1";
                }
                else if(Textdept.equals("bsccs") && Textyear.equals("first") && Textsection.equals("b") ){
                    n="bsccs2";
                }
                else if(Textdept.equals("bsccs") && Textyear.equals("first") && Textsection.equals("c") ){
                    n="bsccs3";
                }
                else if(Textdept.equals("bsccs") && Textyear.equals("first") && Textsection.equals("d") ){
                    n="bsccs4";
                }
                else if(Textdept.equals("bsccs") && Textyear.equals("second") && Textsection.equals("a") ){
                    n="bsccs5";
                }
                else if(Textdept.equals("bsccs") && Textyear.equals("second") && Textsection.equals("b") ){
                    n="bsccs6";
                }
                else if(Textdept.equals("bsccs") && Textyear.equals("second") && Textsection.equals("c") ){
                    n="bsccs7";
                }
                else if(Textdept.equals("bsccs") && Textyear.equals("second") && Textsection.equals("d") ){
                    n="bsccs8";
                }
                else if(Textdept.equals("bsccs") && Textyear.equals("third") && Textsection.equals("a") ){
                    n="bsccs9";
                }
                else if(Textdept.equals("bsccs") && Textyear.equals("third") && Textsection.equals("b") ){
                    n="bsccs10";
                }
                else if(Textdept.equals("bsccs") && Textyear.equals("third") && Textsection.equals("c") ){
                    n="bsccs11";
                }
                else if(Textdept.equals("bsccs") && Textyear.equals("third") && Textsection.equals("d") ){
                    n="bsccs12";
                }
                else if(Textdept.equals("bba") && Textyear.equals("first") && Textsection.equals("a") ){
                    n="bba1";
                }
                else if(Textdept.equals("bba") && Textyear.equals("first") && Textsection.equals("b") ){
                    n="bba2";
                }
                else if(Textdept.equals("bba") && Textyear.equals("second") && Textsection.equals("a") ){
                    n="bba3";
                }
                else if(Textdept.equals("bba") && Textyear.equals("second") && Textsection.equals("b") ){
                    n="bba4";
                }
                else if(Textdept.equals("bba") && Textyear.equals("third") && Textsection.equals("a") ){
                    n="bba5";
                }
                else if(Textdept.equals("bba") && Textyear.equals("third") && Textsection.equals("b") ){
                    n="bba6";
                }
                else if(Textdept.equals("vis") && Textyear.equals("first") && Textsection.equals("a") ){
                    n="vis1";
                }
                else if(Textdept.equals("vis") && Textyear.equals("first") && Textsection.equals("b") ){
                    n="vis2";
                }
                else if(Textdept.equals("vis") && Textyear.equals("first") && Textsection.equals("c") ){
                    n="vis3";
                }
                else if(Textdept.equals("vis") && Textyear.equals("second") && Textsection.equals("a") ){
                    n="vis4";
                }
                else if(Textdept.equals("vis") && Textyear.equals("second") && Textsection.equals("b") ){
                    n="vis5";
                }
                else if(Textdept.equals("vis") && Textyear.equals("second") && Textsection.equals("c") ){
                    n="vis6";
                }
                else  if(Textdept.equals("vis") && Textyear.equals("third") && Textsection.equals("a") ){
                    n="vis7";
                }
                else if(Textdept.equals("vis") && Textyear.equals("third") && Textsection.equals("b") ){
                    n="vis8";
                }
                else if(Textdept.equals("vis") && Textyear.equals("third") && Textsection.equals("c") ){
                    n="vis9";
                }
                else if(Textdept.equals("bcom") && Textyear.equals("first") && Textsection.equals("a") ){
                    n="bcom1";
                }
                else if(Textdept.equals("bcom") && Textyear.equals("first") && Textsection.equals("b") ){
                    n="bcom2";
                }
                else if(Textdept.equals("bcom") && Textyear.equals("first") && Textsection.equals("c") ){
                    n="bcom3";
                }
                else if(Textdept.equals("bcom") && Textyear.equals("first") && Textsection.equals("d") ){
                    n="bcom4";
                }
                else if(Textdept.equals("bcom") && Textyear.equals("second") && Textsection.equals("a") ){
                    n="bcom5";
                }
                else if(Textdept.equals("bcom") && Textyear.equals("second") && Textsection.equals("b") ){
                    n="bcom6";
                }
                else if(Textdept.equals("bcom") && Textyear.equals("second") && Textsection.equals("c") ){
                    n="bcom7";
                }
                else if(Textdept.equals("bcom") && Textyear.equals("second") && Textsection.equals("d") ){
                    n="bcom8";
                }
                else if(Textdept.equals("bcom") && Textyear.equals("third") && Textsection.equals("a") ){
                    n="bcom9";
                }
                else if(Textdept.equals("bcom") && Textyear.equals("third") && Textsection.equals("b") ){
                    n="bcom10";
                }
                else if(Textdept.equals("bcom") && Textyear.equals("third") && Textsection.equals("c") ){
                    n="bcom11";
                }
                else{
                    n="nodata";
                    Toast.makeText(getApplicationContext(), "No Data", Toast.LENGTH_SHORT).show();
                }
                n=n+"-"+hour;
                Intent intent=new Intent(v.getContext(),attendance.class);
                intent.putExtra("variable",n);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch(parent.getId()) {
            case R.id.coursespinner:
                if(position==0){
                    Textdept="bca";
                }
                if(position==1){
                    Textdept="bsccs";
                }
                if(position==2){
                    Textdept="bba";
                }
                if(position==3){
                    Textdept="vis";
                }
                if(position==4){
                    Textdept="bcom";
                }break;
            case R.id.yearspinner:
                if(position==0){
                    Textyear="first";
                }
                if(position==1){
                    Textyear="second";
                }
                if(position==2){
                    Textyear="third";
                }break;
             case R.id.sectionspinner:
                if(position==0){
                    Textsection="a";
                 }
                if(position==1){
                   Textsection="b";
                }
             if(position==2){
                   Textsection="c";
                }
            if(position==3){
                  Textsection="d";
            }break;

        }


    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio1:
                if (checked)
                    hour=1;
                    break;
            case R.id.radio2:
                if (checked)
                    hour=2;
                    break;
            case R.id.radio3:
                if (checked)
                    hour=3;
                    break;
            case R.id.radio4:
                if (checked)
                    hour=4;
                    break;
            case R.id.radio5:
                if (checked)
                    hour=5;
                    break;
            case R.id.radio6:
                if (checked)
                    hour=6;
                    break;
        }
    }

}
