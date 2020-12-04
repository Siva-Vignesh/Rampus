package com.sivavignesh.rampus;

import android.content.Intent;
import android.graphics.Bitmap;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class login extends AppCompatActivity {
    private WebView webView;
    ProgressBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        webView =(WebView) findViewById(R.id.webview);
        bar=(ProgressBar)findViewById(R.id.progressBarlogin);
        webView.setWebViewClient(new WebViewClient());
        Intent intent = getIntent();
        String value = intent.getStringExtra("somevariable");
        if(value.equals("erp")){
            webView.loadUrl("http://evarsity.srmuniv.ac.in/srmsip/");
        }
        if(value.equals("result")){
            webView.loadUrl("http://evarsity.srmuniv.ac.in/srmwebonline/exam/onlineResult.jsp");
        }
        if(value.equals("feekart")){
            webView.loadUrl("https://feekart.srmuniv.ac.in/srmopp/");
        }
        if(value.equals("faculty")){
            webView.loadUrl("http://evarsity. srmuniv.ac.in/srmweb/usermanager/youLogin.jsp");
        }
        if(value.equals("timetable")){
            webView.loadUrl("https://drive.google.com/open?id=1Fs84HVuJ74tcCUQGPtCO2izXg8a_GM3w");
        }
        if(value.equals("examtimetable")){
            webView.loadUrl("https://drive.google.com/open?id=1N65zwLTvICRZ3FcOwyyjR25gFihO1VAz");
        }
        if(value.equals("noticeboard")){
            webView.loadUrl("https://drive.google.com/open?id=1Usksrb2ZJz87JeMZPtjvEqA5sHoftq1I");
        }
        if(value.equals("srmlife")){
            webView.loadUrl("https://sivavignesh.home.blog/srm-life/");
        }
        if(value.equals("placement")){
            webView.loadUrl("https://drive.google.com/open?id=1728lJj3kvf0c2pk_7NZo-a2se_QpyDSR");
        }
        if(value.equals("others")){
            webView.loadUrl("https://drive.google.com/open?id=1j1fT6D_qGk1HdCs6TvgjYf95JyKpvHJV");
        }
        WebSettings webSettings = webView.getSettings();

        webView.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                bar.setVisibility(view.VISIBLE);
                setTitle("Loading...");
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                bar.setVisibility(view.GONE);
                setTitle(view.getTitle());
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (webView .canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
