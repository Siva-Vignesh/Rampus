package com.sivavignesh.rampus;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class timegame extends AppCompatActivity {
    private Spinner spinner;
    private Spinner spinner1;
    private static final String[] first = {"m", "km", "mile"};
    private static final String[] second = {"m", "km", "mile"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timegame);
        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(timegame.this,
                android.R.layout.simple_spinner_item,first);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner1 = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(timegame.this,
                android.R.layout.simple_spinner_item,second);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        Button btn=(Button)findViewById(R.id.button7);

        btn.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {

            }
        });
    }
}
