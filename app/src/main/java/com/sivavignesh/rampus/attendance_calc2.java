package com.sivavignesh.rampus;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class attendance_calc2 extends AppCompatActivity {
double a,b,c,d,e,f,g;
Button type1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendance_calc2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        final EditText x=findViewById(R.id.hourtakenedittext);
        final EditText y=findViewById(R.id.absenthouredittext);
        final EditText z=findViewById(R.id.addhouredittext);
        Button calc=findViewById(R.id.attendancecalcbtn);
        Button reset=findViewById(R.id.reset);
        final TextView current=findViewById(R.id.currentpercent);
        final TextView next=findViewById(R.id.nextpercent);
        type1=findViewById(R.id.type1);
        type1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x.getText().toString().equals("") || y.getText().toString().equals("")|| z.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter all the field", Toast.LENGTH_SHORT).show();
                } else {
                    a = Double.parseDouble(x.getText().toString());
                    b = Double.parseDouble(y.getText().toString());
                    c = Double.parseDouble(z.getText().toString());
                    if (b > a) {
                        Toast.makeText(getApplicationContext(), "Absent hour must be less than hour taken", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        d=a-b;
                        e=(d/a)*100;
                        e=Math.round (e*100.0) / 100.0;
                        current.setText("Current Percent : "+ e);
                        f=(a+c)-b;
                        g=(f/(a+c))*100;
                        g=Math.round (g*100.0) / 100.0;
                        next.setText("After "+ c +" hours : "+g);

                    }
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.setText("");
                y.setText("");
                z.setText("");
                current.setText("");
                next.setText("");

            }
        });
    }
}
