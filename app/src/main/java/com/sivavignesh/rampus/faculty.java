package com.sivavignesh.rampus;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class faculty extends AppCompatActivity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faculty);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        final String [] staff={"Dr. J. Dhillipan ","Dr. Agusthiyar Ramu","Mrs. P. Ponveni","Dr. S. Umarani","Dr. N. Vijayalakshmi","Mrs. D. Kanchana","Mrs. J. Shobana","Mrs. Jebeula Dinesh","Mrs. S. Usha","Mr. D. Rajkumar","Mr.R. Ameen Sheriff","Mrs. K. Pushpalatha","Mr. K. Sebestiraj","Mrs.M. Divya","Mr. K. Prabahar","Mr.P Chandrasekar","Mr. N Krishnamoorthy ","Ms. S. Nithya","Mrs. P.M.Kavitha","Mrs. R.Sudha","Ms. R.Tamilarasi","Ms.Gayathri.G.S","Mr.Vijaya Rangan.K","Mr.U.Udaya Kumar","Mr. A.Vignesh"};
        listview =findViewById(R.id.faculty );
        ArrayAdapter<String > arrayAdapter =new ArrayAdapter<String>(this,
                android.R.layout . simple_list_item_1 ,staff );
        listview .setAdapter(arrayAdapter);
        listview .setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==1){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==2){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==3){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }

                if(position ==4){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==5){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==6){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==7){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==8){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==9){
                    String n="rajkumar";
                    Intent myintent=new Intent(view.getContext() ,sivavignesh.class);
                    myintent.putExtra("somevariable",n);
                    startActivity(myintent) ;
                }
                if(position ==10){
                    String n="ameen";
                    Intent myintent=new Intent(view.getContext() ,sivavignesh.class);
                    myintent.putExtra("somevariable",n);
                    startActivity(myintent) ;
                }
                if(position ==11){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==12){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==13){
                    String n="divya";
                    Intent myintent=new Intent(view.getContext() ,sivavignesh.class);
                    myintent.putExtra("somevariable",n);
                    startActivity(myintent) ;
                }
                if(position ==14){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==15){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==16){
                    String n="krishnamoorthy";
                    Intent myintent=new Intent(view.getContext() ,sivavignesh.class);
                    myintent.putExtra("somevariable",n);
                    startActivity(myintent) ;
                }
                if(position ==17){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==18){
                    String n="kavitha";
                    Intent myintent=new Intent(view.getContext() ,sivavignesh.class);
                    myintent.putExtra("somevariable",n);
                    startActivity(myintent) ;
                }
                if(position ==19){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==20){
                    String n="tamilarasi";
                    Intent myintent=new Intent(view.getContext() ,sivavignesh.class);
                    myintent.putExtra("somevariable",n);
                    startActivity(myintent) ;
                }
                if(position ==21){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==22){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }
                if(position ==23){
                    String n="udaya";
                    Intent myintent=new Intent(view.getContext() ,sivavignesh.class);
                    myintent.putExtra("somevariable",n);
                    startActivity(myintent) ;
                }
                if(position ==24){
                    Toast.makeText(getApplicationContext(),"Some faculty profiles are not yet updated" , Toast.LENGTH_SHORT).show();
                }

            }
        }) ;
    }
}
