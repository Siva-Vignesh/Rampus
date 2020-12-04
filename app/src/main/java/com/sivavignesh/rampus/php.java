package com.sivavignesh.rampus;

import android.graphics.Bitmap;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class php extends AppCompatActivity {
    private WebView webView;
    ProgressBar bar;

    @Override
    public void onBackPressed() {
        if (webView .canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.php);
        webView=(WebView)findViewById(R.id.php);
        bar=(ProgressBar)findViewById(R.id.progressBar);
        webView.loadUrl("https://drive.google.com/open?id=18DZQsCnP81FplvGrnVdAM5BkRBh52WEt");
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
    }
}
