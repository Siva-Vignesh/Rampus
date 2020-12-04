package com.sivavignesh.rampus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class attendancelist extends AppCompatActivity {
TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendancelist);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        TextView list=findViewById(R.id.attendancelist);
        title=findViewById(R.id.hellotext);


        Intent intent = getIntent();
        String value = intent.getStringExtra("variable");
        final String SHARED_PREF="sharedpref";
        final String TEXT=value;
        String[] date = value.split("-");
        title.setText(date[0].substring(0,date[0].length()-1) +"\n Hour : "+date[1]+"Date :"+date[2]+"-"+date[3]+"-"+date[4] );
        SharedPreferences shared_preferences=getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
        String names=shared_preferences.getString(TEXT,"No data found");
    list.setText(names);
    }
}
