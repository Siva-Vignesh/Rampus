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

public class spcalc extends AppCompatActivity {
    EditText ct1,ct2,model,extra,semester;
    Double sc1,sc2,sm,se,ss,ans;
    TextView mark,grade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spcalc);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //AdRequest and load
        AdView mAdView = findViewById(R.id.adView5);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Button spcalcbtn=(Button)findViewById(R.id.spcalcbtn);
        Button reset=(Button)findViewById(R.id.spcalcreset);
        Button info=(Button)findViewById(R.id.spcalcinfobutton);
            ct1=(EditText)findViewById(R.id.ct1);
            ct2=(EditText)findViewById(R.id.ct2);
            model=(EditText)findViewById(R.id.model);
            extra=(EditText)findViewById(R.id.extra);
            semester=(EditText)findViewById(R.id.semester);
            mark=(TextView) findViewById(R.id.grade);
            grade=(TextView)findViewById(R.id.grade2);

            spcalcbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(ct1.getText().toString().equals("")|| ct2.getText().toString().equals("")|| model.getText().toString().equals("")|| extra.getText().toString().equals("")|| semester.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(),"Enter all the field" , Toast.LENGTH_SHORT).show();
                    }

                    else {
                        sc1 = Double.parseDouble(ct1.getText().toString());
                        sc2 = Double.parseDouble(ct2.getText().toString());
                        sm = Double.parseDouble(model.getText().toString());
                        se = Double.parseDouble(extra.getText().toString());
                        ss = Double.parseDouble(semester.getText().toString());
                        if (sc1 > 50 || sc2 > 50 || sm > 100 || se > 10 || ss > 100) {
                            Toast.makeText(getApplicationContext(), "Enter values between the range", Toast.LENGTH_SHORT).show();
                        } else {

                            sc1 = sc1 / 5;
                            sc2 = sc2 / 5;
                            sm = sm / 5;
                            ss = ss / 2;
                            ans = sc1 + sc2 + sm + se + ss;
                            mark.setText(Double.toString(ans));

                            if (ans <= 100 && ans >= 95) {
                                grade.setText("is O");
                            } else if (ans <= 94 && ans >= 85) {
                                grade.setText("is A+");
                            } else if (ans <= 84 && ans >= 75) {
                                grade.setText("is A");
                            } else if (ans <= 74 && ans >= 65) {
                                grade.setText("is B+");
                            } else if (ans <= 64 && ans >= 55) {
                                grade.setText("is B");
                            } else if (ans <= 54 && ans >= 45) {
                                grade.setText("is C");
                            } else if (ans <= 44 && ans >= 40) {
                                grade.setText("is P");
                            } else {
                                grade.setText("is F");
                                Toast.makeText(getApplicationContext(), "Sorry to say, you fail", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                }
            });

            reset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ct1.setText("");
                    ct2.setText("");
                    model.setText("");
                    extra.setText("");
                    semester.setText("");
                    mark.setText("");
                    grade.setText("");
                }
            });
            info.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in=new Intent(v.getContext(),spcalcinfo.class);
                    startActivity(in);
                }
            });

    }
}
