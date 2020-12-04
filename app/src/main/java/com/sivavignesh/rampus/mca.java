package com.sivavignesh.rampus;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class mca extends AppCompatActivity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mca);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        final String [] mcalist={"Peace bro"};
        listview =findViewById(R.id.mcalist );
        ArrayAdapter<String > arrayAdapter =new ArrayAdapter<String>(this,
                android.R.layout . simple_list_item_1 ,mcalist );
        listview .setAdapter(arrayAdapter);
        listview .setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){

                }
            }
        }) ;
}
}
