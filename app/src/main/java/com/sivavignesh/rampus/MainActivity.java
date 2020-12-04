package com.sivavignesh.rampus;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Uri;
import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Calendar;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private static int SPLASH_TIME_OUT=1200;
    Calendar c = Calendar.getInstance();
    int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
    int month = c.get(Calendar.YEAR);
    TextView tx,quote,day_special;
    DrawerLayout drawerLayout;

    final String SHARED_PREF="sharedpref";
    final String TEXT="Name";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mobile Ads SDK (initialize)
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        //AdRequest and load
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        day_special=findViewById(R.id.day_special);
        day_special.setText("month");




        //timing and name
        tx=findViewById(R.id.imageView);
        if(timeOfDay >= 0 && timeOfDay < 12){
            tx.setText("Good Morning");
        }else if(timeOfDay >= 12 && timeOfDay < 16){
            tx.setText("Good Afternoon");
        }else if(timeOfDay >= 16 && timeOfDay < 20){
            tx.setText("Good Evening");
        }else if(timeOfDay >= 20 && timeOfDay < 24){
            tx.setText("Good Night");
        }
        final SharedPreferences shared_preferences=getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
        final SharedPreferences.Editor editor=shared_preferences.edit();


        TextView name=findViewById(R.id.name);
        name.setText(shared_preferences.getString(TEXT,"name"));



        quote=(TextView) findViewById(R.id.quotetext);
        Random r = new Random();
        int quotetnumber = r.nextInt(32 - 1) + 1;
        quotefunction(quotetnumber);




        //Windmill
        final Button fidget=findViewById(R.id.fidgetspinner);
        Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
        fidget.startAnimation(animation);

        Button theme1=findViewById(R.id.gradient1);
        Button theme2=findViewById(R.id.gradient2);
        Button theme3=findViewById(R.id.gradient3);
        Button theme4=findViewById(R.id.gradient4);
        Button theme5=findViewById(R.id.gradient5);
        Button theme6=findViewById(R.id.gradient6);
        Button theme7=findViewById(R.id.gradient7);
        Button theme8=findViewById(R.id.gradient8);

        //Theme Changing process
        final RelativeLayout bg=findViewById(R.id.mainbg);
        String th=shared_preferences.getString("THEME","");
        if(th.equals("1")){
            bg.setBackgroundResource(R.drawable.gradient1);day_special.setText("Orange shine");
        }
        else if(th.equals("2")){
            bg.setBackgroundResource(R.drawable.gradient2);day_special.setText("Boom Blue");
        }
        else if(th.equals("3")){
            bg.setBackgroundResource(R.drawable.gradient3);day_special.setText("Pinky glow");
        }
        else if(th.equals("4")){
            bg.setBackgroundResource(R.drawable.gradient4);day_special.setText("Greenify");
        }
        else if(th.equals("5")){
            bg.setBackgroundResource(R.drawable.gradient5);day_special.setText("Pinky blue");
        }
        else if(th.equals("6")){
            bg.setBackgroundResource(R.drawable.gradient6);day_special.setText("Ocean blue");
        }
        else if(th.equals("7")){
            bg.setBackgroundResource(R.drawable.gradient7);day_special.setText("Santo");
        }
        else if(th.equals("8")){
            bg.setBackgroundResource(R.drawable.gradient8);day_special.setText("Rosepink");
        }
        else if(th.equals("")){
            bg.setBackgroundResource(R.drawable.gradient5);day_special.setText("Pinky blue");
        }

        theme1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("THEME","1");
                editor.apply();
                bg.setBackgroundResource(R.drawable.gradient1);day_special.setText("Orange shine");
            }
        });
        theme2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("THEME","2");
                editor.apply();
                bg.setBackgroundResource(R.drawable.gradient2);day_special.setText("Boom Blue");
            }
        });
        theme3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("THEME","3");
                editor.apply();
                bg.setBackgroundResource(R.drawable.gradient3);day_special.setText("Pinky glow");
            }
        });
        theme4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("THEME","4");
                editor.apply();
                bg.setBackgroundResource(R.drawable.gradient4);day_special.setText("Greenify");
            }
        });
        theme5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("THEME","5");
                editor.apply();
                bg.setBackgroundResource(R.drawable.gradient5);day_special.setText("Pinky blue");
            }
        });
        theme6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("THEME","6");
                editor.apply();
                bg.setBackgroundResource(R.drawable.gradient6);day_special.setText("Ocean blue");
            }
        });
        theme7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("THEME","7");
                editor.apply();
                bg.setBackgroundResource(R.drawable.gradient7);day_special.setText("Santo");
            }
        });
        theme8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("THEME","8");
                editor.apply();
                bg.setBackgroundResource(R.drawable.gradient8);day_special.setText("Rosepink");
            }
        });
        drawerLayout=findViewById(R.id.drawer);
        Button nav=findViewById(R.id.navigation);
        NavigationView navigationView =findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        Button bt1=findViewById(R.id.button);
        Button bt2=findViewById(R.id.button2);
        Button bt3=findViewById(R.id.button3);
        Button bt4=findViewById(R.id.button4);
        Button bt5=findViewById(R.id.button5);
        Button bt6=findViewById(R.id.button6);

        Button bt8=findViewById(R.id.attendance);

        Button bt10=findViewById(R.id.finecalc);
        Button bt11=findViewById(R.id.attendancecalc);
        Button bt12=findViewById(R.id.program);
        Button update=findViewById(R.id.update);
        Button random=findViewById(R.id.random);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),updates.class);
                startActivity(intent);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),course.class);
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                    Intent intent=new Intent(v.getContext(),placement.class);
                    startActivity(intent);
                }else{
                    nointernet();
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),srm.class);
                startActivity(intent);
            }

        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),sgpa.class);
                startActivity(intent);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),cgpa.class);
                startActivity(intent);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),spcalc.class);
                startActivity(intent);
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),attendance_course.class);
                startActivity(intent);
            }
        });

        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),finecalc.class);
                startActivity(intent);
            }
        });
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),attendance_calc.class);
                startActivity(intent);
            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),Programs.class);
                startActivity(intent);
            }
        });


        nav.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.START);
            }
        });
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int quotetnumber = r.nextInt(32 - 1) + 1;
                quotefunction(quotetnumber);
            }
        });

    }
    public void quotefunction(int x)
    {
        switch(x)
        {
            case 1 : quote.setText("If you cannot do great things, do small things in a great way. \n -Napoleon Hill"); break;
            case 2 : quote.setText("Everybody should learn to program a computer, because it teaches you how to think \n - Steve Jobs");break;
            case 3 : quote.setText("Intelligence is the ability  to adapt to change. \n -Stephen Hawking");break;
            case 4 : quote.setText("If I have seen further than others, it is by standing upon the shoulders of giants.\n -Isaac Newton"); break;
            case 5 : quote.setText("It's kind of fun to do the impossible.\n -Walt Disney");break;
            case 6 : quote.setText("Nothing is impossible, the word itself says 'I'm possible'! \n -Audrey Hepburn");break;
            case 7 : quote.setText("There is nothing permanent  except change.\n -Heraclitus");break;
            case 8 : quote.setText("Intelligence is the ability  to adapt to change. \n-Stephen Hawking");break;
            case 9 : quote.setText("Life is not a problem to be solved  but a reality to be experienced.\n - Soren Kierkegaard");break;
            case 10 : quote.setText("Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment. \n -Buddha");break;
            case 11 : quote.setText("I have not failed. I've just found 10,000 ways that won't work.\n -Thomas Edison");break;
            case 12 : quote.setText(" It is Important to Follow your Dreams and Heart. Do Something that Excites You. \n - Sundar Pichai");break;
            case 13 : quote.setText("Two things define you, Your patience when you have nothing and your attitude when you have everything.\n-Unknown");break;
            case 14 : quote.setText("Imagination is more important than knowledge. \n -Albert Einstein");break;
            case 15 : quote.setText("You have to dream before your dreams can come true. \n -A. P. J. Abdul Kalam");break;
            case 16 : quote.setText("It's not what you look at that matters, it's what you see. \n -Henry David Thoreau");break;
            case 17 : quote.setText("If opportunity doesn't knock, build a door.\n" + "Milton Berle");break;
            case 18 : quote.setText("The best preparation for tomorrow is doing your best today.\n" + "H. Jackson Brown, Jr.");break;
            case 19 : quote.setText("Our industry does not respect tradition – it only respects innovation. \n -Satya Nadella");break;
            case 20 : quote.setText("A new command I give you: Love one another.\n As I have loved you, so you must love one another.\n" + "Jesus Christ");break;
            case 21 : quote.setText("Honesty is the first chapter in the book of wisdom.\n" + "Thomas Jefferson");break;
            case 22 : quote.setText("Keep your face always toward the sunshine\n and shadows will fall behind you.\n" + "Walt Whitman");break;
            case 23 : quote.setText("The only place you find success before work is in the dictionary.\n" + "-May V Smith");break;
            case 24 : quote.setText("Everybody should learn to program a computer, because it teaches you how to think \n - Steve Jobs");break;
            case 25 : quote.setText("Good things come to those who wait");break;
            case 26 : quote.setText("It does not matter how slowly you  go as long as you do not stop.\n  -Confucius");break;
            case 27 : quote.setText("Talk is cheap. Show me the code. \n -Linus Torvalds");break;
            case 28 : quote.setText("It's fine to celebrate success but it is more important to heed the lessons of failure. \n -Bill Gates");break;
            case 29 : quote.setText("Only do what your heart tells you.\n" + "Princess Diana");break;
            case 30 : quote.setText("A man should never neglect his family for business.\"\n" + "\n" + "-Walt Disney");break;
            case 31 : quote.setText("When you change your thoughts, you change your world.\n" + "\n" + "- Norman Vincent Peale");break;
            default : quote.setText("You have to dream before your dreams can come true. \n -A. P. J. Abdul Kalam");break;
        }
    }
    public void nointernet()
    {
        Toast toast = Toast.makeText(getApplicationContext(), "No Internet Connection",Toast.LENGTH_SHORT);toast.show();
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.bca){
            Intent in=new Intent(getApplicationContext(),bca.class);
            startActivity(in);
        }
        if(id==R.id.others){
            ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                String n="others";
                Intent intent=new Intent(getApplicationContext(),login.class);
                intent.putExtra("somevariable",n);
                startActivity(intent);
            }else{
                nointernet();
            }
        }
        if(id==R.id.bsccs){
            Intent in=new Intent(getApplicationContext(),bsccs.class);
            startActivity(in);
        }

        if(id == R.id.StudentERP){
            ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW) ;
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://evarsity.srmuniv.ac.in/srmsip/"));
                startActivity(intent);
            }else{
                nointernet();
            }

        }
        if(id == R.id.Studentresult){
            ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW) ;
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://evarsity.srmuniv.ac.in/srmwebonline/exam/onlineResult.jsp"));
                startActivity(intent);
            }else{
                nointernet();
            }

        }
        if(id == R.id.Studentfeekart){
            ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW) ;
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://feekart.srmuniv.ac.in/srmopp/"));
                startActivity(intent);
            }else{
                nointernet();
            }

        }
        if(id == R.id.facultylogin){
            ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo datac = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            if ((wifi != null & datac != null) && (wifi.isConnected() | datac.isConnected())) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW) ;
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://evarsity. srmuniv.ac.in/srmweb/usermanager/youLogin.jsp"));
                startActivity(intent);
            }else{
                nointernet();
            }

        }
        if (id == R.id.feedback) {
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("email"));
            intent.setType("message/rfc822");
            String[] s={"titankings07@gmail.com"};
            intent.putExtra(intent.EXTRA_EMAIL,s);

            Intent chooser=Intent.createChooser(intent, "Launcher Email");
            startActivity(chooser);
        } else if (id == R.id.aboutus) {
            Intent intent1 = new Intent(MainActivity.this, aboutus.class);
            startActivity(intent1);
        }
        else if (id == R.id.Share) {
            Intent intent1 = new Intent(android.content.Intent.ACTION_VIEW);
            intent1.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.sivavignesh.rampus"));
            startActivity(intent1);
        }
        else if(id == R.id.credits){
            Intent in=new Intent(this,credits.class);
            startActivity(in);
        }
        else if(id == R.id.name){
            Intent in=new Intent(this,name.class);
            startActivity(in);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onClick(View view) {
        HorizontalScrollView h=findViewById(R.id.themelayout);
        ViewGroup.LayoutParams params= h.getLayoutParams();
        if(params.height==150){
            params.height=0;
        }
        else{
            params.height=150;
        }
        h.setLayoutParams(params);

    }
}
