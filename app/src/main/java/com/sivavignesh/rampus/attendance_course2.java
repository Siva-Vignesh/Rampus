package com.sivavignesh.rampus;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class attendance_course2 extends AppCompatActivity {
    ListView listview;
    String n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendance_course2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        final String [] list={"I BCOM E","I BCOM A&F","I BCOM ISM","II BCOM A&F","II BCOM ISM","I CHEM","I BIOTECH","I BA ENG","II BA ENG","II MCA","III MCA"};
        listview =findViewById(R.id.courselist );
        ArrayAdapter<String > arrayAdapter =new ArrayAdapter<String>(this,
                android.R.layout . simple_list_item_1 ,list );
        listview .setAdapter(arrayAdapter);
        listview .setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    n="bcomE";
                }
                if(position==1){
                    n="bcomA&F";
                }
                if(position==2){
                    n="bcomISM";
                }
                if(position==3){
                    n="bcomA&F1";
                }
                if(position==4){
                    n="bcomISM1";
                }
                if(position==5){
                    n="phy1";
                }
                if(position==6){
                    n="chem1";
                }
                if(position==7){
                    n="biotech1";
                }
                if(position==8){
                    n="baeng1";
                }
                if(position==9){
                    n="baeng2";
                }
                if(position==10){
                    n="mca1";
                }
                if(position==11){
                    n="mca2";
                }
                Intent intent=new Intent(view.getContext(),attendance.class);
                intent.putExtra("variable",n);
                startActivity(intent);
            }
        }) ;

    }
}
