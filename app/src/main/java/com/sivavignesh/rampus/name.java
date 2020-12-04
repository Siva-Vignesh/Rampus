package com.sivavignesh.rampus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class name extends AppCompatActivity {
EditText name;
Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name);
        getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, android.view.WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setSoftInputMode(android.view.WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);


        name=findViewById(R.id.name);
        save=findViewById(R.id.save);

        final String SHARED_PREF="sharedpref";
        final String TEXT="Name";


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPreferences= getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString(TEXT,name.getText().toString());
                editor.apply();
                Toast.makeText(getApplicationContext(),name.getText().toString(), Toast.LENGTH_LONG).show();
                Intent i=new Intent(v.getContext(),MainActivity.class);
                startActivity(i);

            }
        });
    }
}
