package com.sivavignesh.rampus;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class placementideas extends AppCompatActivity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.placementideas);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        final String [] staff={"Employee Transport Management System Project","Online College Fee Payment System Project Using ASP.net","Online Election System Project","Campus Recruitment System","Online Blood Bank Project","Car Comparison System Project","Movie Success Prediction Using Data Mining Php","Customer Targeted E-Commerce","Canteen Food Ordering and Management System"," On Road Vehicle Breakdown Assistance Finder","Credit Card Fraud Detection Project","Online Bakery Shop System"," Hotel Reservation Android","Advanced Tour Guide","Android Smart Alarm System","Android Based School Bus Tracking System","Android Smart City Traveler","Android Smart Health Monitoring System"};
        listview =findViewById(R.id.ideaslist );
        ArrayAdapter<String > arrayAdapter =new ArrayAdapter<String>(this,
                android.R.layout . simple_list_item_1 ,staff );
        listview .setAdapter(arrayAdapter);

}
}
