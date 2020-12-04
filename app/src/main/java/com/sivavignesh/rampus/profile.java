package com.sivavignesh.rampus;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class profile extends AppCompatActivity {
EditText name;
Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        EditText name=(EditText)findViewById(R.id.editText2);
        Button save= (Button)findViewById(R.id.button9);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savefile();
            }
        });
        }
    private void savefile(){
        SharedPreferences sharepref=getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharepref.edit();
        editor.putString("name",name.getText().toString());
        editor.commit();
        Toast.makeText(this, "Saved Successfully", Toast.LENGTH_SHORT).show();
    }
}
