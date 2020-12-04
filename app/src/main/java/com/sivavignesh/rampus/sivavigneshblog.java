package com.sivavignesh.rampus;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class sivavigneshblog extends AppCompatActivity {
    private WebView webView;
    ProgressBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sivavigneshblog);
        webView =(WebView) findViewById(R.id.sivavigneshblogs);
        bar=(ProgressBar)findViewById(R.id.progressBarstaffblog);
        Intent intent = getIntent();
        final String value = intent.getStringExtra("variable");
        switch (value) {
            case "siva":
                webView.loadUrl("https://sivavignesh.home.blog/");
                break;
            case "kavitha":
                webView.loadUrl("https://pmkavitha.wordpress.com");
                break;
            case "udaya":
                webView.loadUrl("https://udayacsmaterials.webnode.com/");
                break;
            case "ameen":
                webView.loadUrl("https://ameensheriffmca.wordpress.com");
                break;
            case "krishnamoorthy":
                webView.loadUrl("https://krishnamoorthymca99.wordpress.com/");
                break;
            case "rajkumar":
                webView.loadUrl("http://www.rajkumardharmaraj.wordpress.com");
                break;
            default:
                webView.loadUrl("https://sivavignesh.home.blog/");
                break;
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
