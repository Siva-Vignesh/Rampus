package com.sivavignesh.rampus;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class c extends AppCompatActivity {
ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        String[] c = {  "Addition of two number",
                        "Sum of First N Numbers",
                        "Odd or Even",
                        "factorial of a given number",
                        "check if given number is prime or not",
                        "Largest of three input numbers",
                        "check if given number is Armstrong or not",
                        "check if given number is palindrome or not",
                        "Swapping Two Numbers",
                        "Swapping Two Numbers without third variable",
                        "Multiplication Table of any Number",
                        "addition and subtraction of Matrices",
                        "Matrix Multiplication",
                        "transpose of matrix"};
        listview = findViewById(R.id.c);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, c);
        listview.setAdapter(arrayAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0) {
                    String n="c0";
                    Intent myintent = new Intent(view.getContext(), cprogram.class);
                    myintent.putExtra("variable", n);
                    startActivity(myintent);
                }
                if(position==1) {
                    String n="c1";
                    Intent myintent = new Intent(view.getContext(), cprogram.class);
                    myintent.putExtra("variable", n);
                    startActivity(myintent);
                }
                if(position==2) {
                    String n="c2";
                    Intent myintent = new Intent(view.getContext(), cprogram.class);
                    myintent.putExtra("variable", n);
                    startActivity(myintent);
                }
                if(position==3) {
                    String n = "c3";
                    Intent myintent = new Intent(view.getContext(), cprogram.class);
                    myintent.putExtra("variable", n);
                    startActivity(myintent);
                }
                if(position==4) {
                    String n = "c4";
                    Intent myintent = new Intent(view.getContext(), cprogram.class);
                    myintent.putExtra("variable", n);
                    startActivity(myintent);
                }
                if(position==5) {
                    String n = "c5";
                    Intent myintent = new Intent(view.getContext(), cprogram.class);
                    myintent.putExtra("variable", n);
                    startActivity(myintent);
                }
                if(position==6) {
                    String n = "c6";
                    Intent myintent = new Intent(view.getContext(), cprogram.class);
                    myintent.putExtra("variable", n);
                    startActivity(myintent);
                }
                if(position==7) {
                    String n = "c7";
                    Intent myintent = new Intent(view.getContext(), cprogram.class);
                    myintent.putExtra("variable", n);
                    startActivity(myintent);
                }
                if(position==8) {
                    String n = "c8";
                    Intent myintent = new Intent(view.getContext(), cprogram.class);
                    myintent.putExtra("variable", n);
                    startActivity(myintent);
                }
                if(position==9) {
                    String n = "c9";
                    Intent myintent = new Intent(view.getContext(), cprogram.class);
                    myintent.putExtra("variable", n);
                    startActivity(myintent);
                }
                if(position==10) {
                    String n = "c10";
                    Intent myintent = new Intent(view.getContext(), cprogram.class);
                    myintent.putExtra("variable", n);
                    startActivity(myintent);
                }
                if(position==11) {
                    String n = "c11";
                    Intent myintent = new Intent(view.getContext(), cprogram.class);
                    myintent.putExtra("variable", n);
                    startActivity(myintent);
                }
                if(position==12) {
                    String n = "c12";
                    Intent myintent = new Intent(view.getContext(), cprogram.class);
                    myintent.putExtra("variable", n);
                    startActivity(myintent);
                }
                if(position==13) {
                    String n = "c13";
                    Intent myintent = new Intent(view.getContext(), cprogram.class);
                    myintent.putExtra("variable", n);
                    startActivity(myintent);
                }
                if(position==14) {
                    String n = "c14";
                    Intent myintent = new Intent(view.getContext(), cprogram.class);
                    myintent.putExtra("variable", n);
                    startActivity(myintent);
                }
            }
        });
    }
}
