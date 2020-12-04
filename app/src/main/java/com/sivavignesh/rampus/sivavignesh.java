package com.sivavignesh.rampus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class sivavignesh extends Activity {
    Button blog,close;
    ImageView image;
    TextView text , achivement ,location,quote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sivavignesh);
       /* DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.7));

        WindowManager.LayoutParams params=getWindow().getAttributes();
        params.gravity=Gravity.CENTER;
        params.x=0;
        params.y=-20;
        getWindow().setAttributes(params);

        blog=(Button)findViewById(R.id.blog);
        close=(Button)findViewById(R.id.close);
        image=(ImageView)findViewById(R.id.imageView2);
        text=(TextView)findViewById(R.id.textView13);
        quote=(TextView)findViewById(R.id.quote);
        achivement=(TextView)findViewById(R.id.textView24);
        location=(TextView)findViewById(R.id.textView25);
        Intent intent = getIntent();
        final String value = intent.getStringExtra("somevariable");
        if(value.equals("dhillipan")){
            image.setImageResource(R.drawable.sivavignesh);
            text.setText("Dr. J. Dhillipan");
            quote.setText(getString(R.string.srmist));
            achivement.setText(getString(R.string.oscar));
            location.setText(getString(R.string.ramapuram));
        }
        if(value.equals("usha")) {
            image.setImageResource(R.drawable.logo);
            text.setText("S.Usha");
            quote.setText("");
            achivement.setText("Assistant professor");
            location.setText("Porur");
        }
        if(value.equals("kavitha")) {
            image.setImageResource(R.drawable.kavitha);
            text.setText("PM Kavitha");
            quote.setText("Kowledge will give you power .only Character will give you respect.");
            achivement.setText("Assistant professor");
            location.setText("Choolaimedu,Chennai");
        }
        if(value.equals("divya")) {
            image.setImageResource(R.drawable.divya);
            text.setText("M. Divya");
            quote.setText("");
            achivement.setText("Assistant professor");
            location.setText("Avadi, Chennai");
        }
        if(value.equals("udaya")) {
            image.setImageResource(R.drawable.udaya);
            text.setText("U Udayakumar ");
            quote.setText("Successful people never worry about what others are doing.");
            achivement.setText("Assistant professor");
            location.setText("MKB nagar");
        }
        if(value.equals("ameen")) {
            image.setImageResource(R.drawable.ameen);
            text.setText("AMEEN R SHERIFF");
            quote.setText("Good things come to those who wait");
            achivement.setText("Assistant professor");
            location.setText("GERUGAMBAKKAM");
        }
        if(value.equals("krishnamoorthy")) {
            image.setImageResource(R.drawable.krishnamoorthy);
            text.setText("Krishnamoorthy");
            quote.setText("It is the supreme art of the teacher to awaken joy in creative expression and knowledge.");
            achivement.setText("Assistant professor");
            location.setText("Thirumudicakkam");
        }
        if(value.equals("rajkumar")) {
            image.setImageResource(R.drawable.rajkumar);
            text.setText("D. Rajkumar");
            quote.setText("");
            achivement.setText("Assistant professor");
            location.setText("Virugambakkam");
        }
        if(value.equals("tamilarasi")) {
            image.setImageResource(R.drawable.tamilarasi);
            text.setText("R.Tamilarasi");
            quote.setText("");
            achivement.setText("Assistant professor");
            location.setText("Maduravoyal");
        }
        if(value.equals("vignesh")) {
            image.setImageResource(R.drawable.sivavignesh);
            text.setText("A Vignesh");
            quote.setText("");
            achivement.setText("Assistant professor");
            location.setText("Chennai");
        }


        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                    if(value.equals("divya") || value.equals("usha")||value.equals("tamilarasi")) {
                        Toast.makeText(getApplicationContext(),"No blog" , Toast.LENGTH_LONG).show();
                    }else{
                        Intent intent = new Intent(getApplicationContext(), sivavigneshblog.class);
                        intent.putExtra("variable", value);
                        startActivity(intent);
                    }
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "No Internet Connection",Toast.LENGTH_LONG);toast.show();
                }


            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });*/
    }

}
