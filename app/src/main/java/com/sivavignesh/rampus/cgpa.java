package com.sivavignesh.rampus;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.text.DecimalFormat;

public class cgpa extends AppCompatActivity {
    EditText tc1,tc2,tc3,tc4,tc5,tc6,tc7,tc8,sgpa1,sgpa2,sgpa3,sgpa4,sgpa5,sgpa6,sgpa7,sgpa8;
    TextView res,roundoff;
    Double c1,c2,c3,c4,c5,c6,c7,c8,s1,s2,s3,s4,s5,s6,s7,s8,ans,ans1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cgpa);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        //AdRequest and load
        AdView mAdView = findViewById(R.id.adView4);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        Button cgpabt=(Button)findViewById(R.id.cgpabt);
        Button reset=(Button)  findViewById(R.id.reset);
        Button info=(Button)findViewById(R.id.cgpainfobutton);
        tc1=(EditText)findViewById(R.id.tc1);
        tc2=(EditText)findViewById(R.id.tc2);
        tc3=(EditText)findViewById(R.id.tc3);
        tc4=(EditText)findViewById(R.id.tc4);
        tc5=(EditText)findViewById(R.id.tc5);
        tc6=(EditText)findViewById(R.id.tc6);
        tc7=(EditText)findViewById(R.id.tc7);
        tc8=(EditText)findViewById(R.id.tc8);
        sgpa1=(EditText)findViewById(R.id.sgpa1);
        sgpa2=(EditText)findViewById(R.id.sgpa2);
        sgpa3=(EditText)findViewById(R.id.sgpa3);
        sgpa4=(EditText)findViewById(R.id.sgpa4);
        sgpa5=(EditText)findViewById(R.id.sgpa5);
        sgpa6=(EditText)findViewById(R.id.sgpa6);
        sgpa7=(EditText)findViewById(R.id.sgpa7);
        sgpa8=(EditText)findViewById(R.id.sgpa8);
        res = (TextView)findViewById(R.id.ans);
        roundoff=(TextView)findViewById(R.id.res) ;
        cgpabt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tc1.getText().toString().equals("")|| sgpa1.getText().toString().equals("")) {
                    c1=0.0;
                    s1=0.0;
                    Toast.makeText(getApplicationContext(),"enter atleast one row" , Toast.LENGTH_LONG).show();
                }
                else{
                    c1 = Double.parseDouble(tc1.getText().toString());
                    s1 = Double.parseDouble(sgpa1.getText().toString());
                }
                if(tc2.getText().toString().equals("")){
                    c2=0.0;
                    s2=0.0;
                }
                else{
                    c2 = Double.parseDouble(tc2.getText().toString());
                    if(sgpa2.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(),"enter sgpa of semester 2" , Toast.LENGTH_LONG).show();
                        c2=0.0;
                        s2=0.0;
                    }
                    else{
                        s2 = Double.parseDouble(sgpa2.getText().toString());
                    }
                }
                if(tc3.getText().toString().equals("")){
                    c3=0.0;
                    s3=0.0;
                }
                else{
                    c3 = Double.parseDouble(tc3.getText().toString());
                    if(sgpa3.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(),"enter sgpa of semester 3" , Toast.LENGTH_LONG).show();
                        c3=0.0;
                        s3=0.0;
                    }
                    else{
                        s3 = Double.parseDouble(sgpa3.getText().toString());
                    }
                }
                if(tc4.getText().toString().equals("")){
                    c4=0.0;
                    s4=0.0;
                }
                else{
                    c4 = Double.parseDouble(tc4.getText().toString());
                    if(sgpa4.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(),"enter sgpa of semester 4" , Toast.LENGTH_LONG).show();
                        c4=0.0;
                        s4=0.0;
                    }
                    else{
                        s4 = Double.parseDouble(sgpa4.getText().toString());
                    }
                }
                if(tc5.getText().toString().equals("")){
                    c5=0.0;
                    s5=0.0;
                }
                else{
                    c5 = Double.parseDouble(tc5.getText().toString());
                    if(sgpa5.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(),"enter sgpa of semester 5" , Toast.LENGTH_LONG).show();
                        c5=0.0;
                        s5=0.0;
                    }
                    else{
                        s5 = Double.parseDouble(sgpa5.getText().toString());
                    }
                }
                if(tc6.getText().toString().equals("")){
                    c6=0.0;
                    s6=0.0;
                }
                else{
                    c6 = Double.parseDouble(tc6.getText().toString());
                    if(sgpa6.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(),"enter sgpa of semester 6" , Toast.LENGTH_LONG).show();
                        c6=0.0;
                        s6=0.0;
                    }
                    else{
                        s6 = Double.parseDouble(sgpa6.getText().toString());
                    }
                }
                if(tc7.getText().toString().equals("")){
                    c7=0.0;
                    s7=0.0;
                }
                else{
                    c7 = Double.parseDouble(tc7.getText().toString());
                    if(sgpa7.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(),"enter sgpa of semester 7" , Toast.LENGTH_LONG).show();
                        c7=0.0;
                        s7=0.0;
                    }
                    else{
                        s7 = Double.parseDouble(sgpa7.getText().toString());
                    }
                }
                if(tc8.getText().toString().equals("")){
                    c8=0.0;
                    s8=0.0;
                }
                else{
                    c8= Double.parseDouble(tc8.getText().toString());
                    if(sgpa8.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(),"enter sgpa of semester 8" , Toast.LENGTH_LONG).show();
                        c8=0.0;
                        s8=0.0;
                    }
                    else{
                        s8 = Double.parseDouble(sgpa8.getText().toString());
                    }
                }
                ans=((c1*s1)+(c2*s2)+(c3*s3)+(c4*s4)+(c5*s5)+(c6*s6)+(c7*s7)+(c8*s8))/(c1+c2+c3+c4+c5+c6+c7+c8);
                ans1=Math.round (ans*100.0) / 100.0;
                res.setText("Cgpa is "+ new DecimalFormat("##.##").format(ans));
                roundoff.setText("Round Off - "+Double.toString(ans1));
            }
        });
     reset.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             tc1.setText("");
             tc2.setText("");
             tc3.setText("");
             tc4.setText("");
             tc5.setText("");
             tc6.setText("");
             tc7.setText("");
             tc8.setText("");
             sgpa1.setText("");
             sgpa2.setText("");
             sgpa3.setText("");
             sgpa4.setText("");
             sgpa5.setText("");
             sgpa6.setText("");
             sgpa7.setText("");
             sgpa8.setText("");
             res.setText("");
             roundoff.setText("");
         }
     });
     info.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent in=new Intent(v.getContext(),cgpainfo.class);
             startActivity(in);
         }
     });
    }
}
