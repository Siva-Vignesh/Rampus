package com.sivavignesh.rampus;

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

public class finecalc extends AppCompatActivity {
EditText books,days;
Button calc,reset;
Double a,b,c,d;
TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finecalc);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //AdRequest and load
        AdView mAdView = findViewById(R.id.adView7);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        books=findViewById(R.id.noofbookedittext);
        days=findViewById(R.id.noofdaysedittext);
        calc=findViewById(R.id.finecalcbtn);
        reset=findViewById(R.id.finecalcresetbtn);
        ans=findViewById(R.id.finecalcresult);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(books.getText().toString().equals("") ||days.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(), "Enter all the field", Toast.LENGTH_SHORT).show();

                }
                else{
                    a = Double.parseDouble(books.getText().toString());
                    b = Double.parseDouble(days.getText().toString());
                    if(b<=14){
                        Toast.makeText(getApplicationContext(), "No fine required", Toast.LENGTH_SHORT).show();
                        }
                        else{
                        c=(b-14)*2;
                        d=a*c;
                        ans.setText("Your fine amount is "+d);

                    }
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("");
                books.setText("");
                days.setText("");
                a=0.0;
                b=0.0;
                c=0.0;
                d=0.0;
            }
        });
    }
}
