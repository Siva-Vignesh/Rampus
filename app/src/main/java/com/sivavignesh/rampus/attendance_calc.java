package com.sivavignesh.rampus;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class attendance_calc extends AppCompatActivity {
Button calc,reset,nextbtn,type2;
TextView percent ,next;
EditText hourtaken, absenthour;
Double a,b,c,d,e=0.0,f,g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendance_calc);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        hourtaken=findViewById(R.id.hourtakenedittext);
        absenthour=findViewById(R.id.absenthour);
        calc=findViewById(R.id.attendancecalcbtn);
        reset=findViewById(R.id.attendancecalcresetbtn);
        percent=findViewById(R.id.attendancepercent);
        next=findViewById(R.id.next);
        nextbtn = findViewById(R.id.nextbtn);
        type2=findViewById(R.id.type2);
        type2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),attendance_calc2.class);
                startActivity(i);
            }
        });
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hourtaken.getText().toString().equals("") || absenthour.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter all the field", Toast.LENGTH_SHORT).show();
                } else {
                    b = Double.parseDouble(hourtaken.getText().toString());
                    c=  Double.parseDouble(absenthour.getText().toString());
                    if(c>b){
                        Toast.makeText(getApplicationContext(), "absent hour must be less than hour taken", Toast.LENGTH_SHORT).show();
                    }
                    else{

                    d=b-c;
                    e = (d / b) * 100;
                    e=Math.round (e*100.0) / 100.0;
                    percent.setText("Current Percent : "+ e);
                        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                                   }
                }

            }
        });
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hourtaken.getText().toString().equals("") || absenthour.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter all the field", Toast.LENGTH_SHORT).show();
                } else if(e==0.0) {
                    Toast.makeText(getApplicationContext(), "First click calc button", Toast.LENGTH_SHORT).show();
                }
                else{
                        b = ++b;
                        d = b - c;
                        e = (d / b) * 100;
                        e = Math.round(e * 100.0) / 100.0;
                        String copy = next.getText().toString();
                        next.setText(copy + "\n Hour " + b + " : " + e);

                }

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                     b=0.0;
                     c=0.0;
                     d=0.0;
                     e=0.0;
                    hourtaken.setText("");
                    absenthour.setText("");
                    percent.setText("");
                    next.setText("");

            }
        });
    }
}
