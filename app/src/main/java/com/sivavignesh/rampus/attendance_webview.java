package com.sivavignesh.rampus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class attendance_webview extends AppCompatActivity {
    private WebView webView;
    ProgressBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendance_webview);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        webView=(WebView)findViewById(R.id.notesblog);
        bar=(ProgressBar)findViewById(R.id.progressBarblog);
        Intent intent = getIntent();
        String value = intent.getStringExtra("variable");
        if(value.equals("bca1")){
            webView.loadUrl("https://docs.google.com/spreadsheets/d/12cnT6Cz9dHmwgTl5Wb41XMcvJQ8mjrPGvFRnAkyvb9M/edit#gid=2143658945");
        }
        if(value.equals("bca2")){
            webView.loadUrl("https://docs.google.com/spreadsheets/d/1W06s5pDjJohBhkHfh-iSyft7LUbKxtVXu_VOp0odzLo/edit#gid=0");
        }
        if(value.equals("bca3")){
            webView.loadUrl("https://docs.google.com/spreadsheets/d/1WxSzEg6n60l6Vr8ZE25J-2Aroz61TgLkRixdcp8yPio/edit#gid=0");
        }
        if(value.equals("bsccs1")){
            webView.loadUrl("https://docs.google.com/spreadsheets/d/1kCy_9dng3Fis2t7gVGEzfvHeo2_IxQMOLJhZCCRhMOY/edit#gid=0");
        }
        if(value.equals("bsccs2")){
            webView.loadUrl("https://docs.google.com/spreadsheets/d/19dPvchZJdAqzklwMPrsFRuOL8Y6Shb5kGFv_0cfHOD0/edit#gid=0");
        }
        if(value.equals("bsccs3")){
            webView.loadUrl("https://docs.google.com/spreadsheets/d/1mc9YFHfCzpy9V0C1RI5y5l44vTGLJU9p7oy6PuRzz8s/edit#gid=0");
        }
        if(value.equals("mca")){
            webView.loadUrl("https://docs.google.com/spreadsheets/d/1ifyiNQa4EuFvz8OudRIhZwnRJ0MG6Xq8sKDHAwt6BNI/edit#gid=0");
        }

    WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
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
        webView.setDownloadListener(new DownloadListener() {
        public void onDownloadStart(String url, String userAgent,
                String contentDisposition, String mimetype,
        long contentLength) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
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
