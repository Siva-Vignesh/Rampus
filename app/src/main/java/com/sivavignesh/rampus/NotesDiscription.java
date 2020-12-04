package com.sivavignesh.rampus;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NotesDiscription extends Activity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notesdiscription);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        final String [] staff={"-Don't depend this app for your exam(Only for last minute revise).",
                "-Refer textbook to score high.",
                "-If you have notes , just mail me (click me to mail)",
                "-Also suggest any updates!!.."};
        listview =findViewById(R.id.notesdescriptionlistview );
        ArrayAdapter<String > arrayAdapter =new ArrayAdapter<String>(this,
                android.R.layout . simple_list_item_1 ,staff );
        listview .setAdapter(arrayAdapter);
        listview .setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==2){
                    Intent intent=new Intent(Intent.ACTION_SEND);
                    intent.setData(Uri.parse("email"));
                    intent.setType("message/rfc822");
                    String[] s={"titankings07@gmail.com"};
                    intent.putExtra(intent.EXTRA_EMAIL,s);

                    Intent chooser=Intent.createChooser(intent, "Launcher Email");
                    startActivity(chooser);
                }
            }
        }) ;
    }
    }

