package com.sivavignesh.rampus;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;


public class notesblog extends AppCompatActivity {
    private WebView webView;
    ProgressBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notesblog);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        webView=(WebView)findViewById(R.id.notesblog);
        bar=(ProgressBar)findViewById(R.id.progressBarblog);
        Intent intent = getIntent();
        String value = intent.getStringExtra("somevariable");
        if(value.equals("t1")){
            webView.loadUrl("https://drive.google.com/open?id=1IZojXZYhYvzORuBtj4uQeRcP4ph8Bmk7");
        }
        if(value.equals("e1")){
            webView.loadUrl("https://drive.google.com/open?id=1nAKRn-GgAQok4NnwLQ_M6RkBa31Cr2Li");
        }
        if(value.equals("f1")){
            webView.loadUrl("https://drive.google.com/open?id=1VButhttaWBVxCADFu8LsMMwEGwgv0K5T");
        }
        if(value.equals("h1")){
            webView.loadUrl("https://drive.google.com/open?id=10eAUCoYoEbxY61c51dEKdD8uK03CKeeF");
        }
        if(value.equals("c")){
            webView.loadUrl("https://drive.google.com/open?id=1obQ_i5G27oWzr6vlJTL6jBS_szNfmg-m");
        }
        if(value.equals("dlf")){
            webView.loadUrl("https://drive.google.com/open?id=15Zmy-41ftTmfHmewjAPbj9TtKZpGaURL");
        }
        if(value.equals("m1")){
            webView.loadUrl("https://drive.google.com/open?id=1ocG6hIQ5msm8PxnxQpJcqt7ym-RvPGUx");
        }
        if(value.equals("linux")){
            webView.loadUrl("https://drive.google.com/open?id=1aW6SS-oPZveSYpbVUkA9eBkUD1UaVvLb");
        }
        if(value.equals("t2")){
            webView.loadUrl("https://drive.google.com/open?id=12elqNEXJHsRmsr5PQl9P0i-WL-QNNaao");
        }
        if(value.equals("e2")){
            webView.loadUrl("https://drive.google.com/open?id=1yRInly0c4wW3JHXtXPDV7wsQ090r4r63");
        }
        if(value.equals("f2")){
            webView.loadUrl("https://drive.google.com/open?id=1MUGbR_Ryg3xHvFoQaFiTdD_Q6JFMVenV");
        }
        if(value.equals("h2")){
            webView.loadUrl("https://drive.google.com/open?id=1kYAiL5nWqHZMqZwhJxHjIsa4dqxWHZ_5");
        }
        if(value.equals("cpp")){
            webView.loadUrl("https://drive.google.com/open?id=1b33hZUiGj2IQFzBBHR5bfbcXN_ciwx9m");
        }
        if(value.equals("wt")){
            webView.loadUrl("https://drive.google.com/open?id=1E8ZNhMzIdqJp8UsR00TTZ6ukaVRvUzTc");
        }
        if(value.equals("m2")){
            webView.loadUrl("https://drive.google.com/open?id=1tkcXlL263961UeiYS_uA246VcXO5IbiJ");
        }
        if(value.equals("java")){
            webView.loadUrl("https://drive.google.com/open?id=14OulKuLQqixU1z6SRg-KuYWK7RgiPMT5");
        }
        if(value.equals("rdbms")){
            webView.loadUrl("https://drive.google.com/open?id=1rFcFOaQKjrVSx5d-bgVZt3YA4IdTzU4D");
        }
        if(value.equals("ds")){
            webView.loadUrl("https://drive.google.com/open?id=1bEtJYYt7Zt4pzoGEesXYcc3Dl4aCfa1_");
        }
        if(value.equals("spss")){
            webView.loadUrl("https://drive.google.com/open?id=1ylDyJKPZNsZxWTtJ1J-KSLtBOulEyyTn");
        }
        if(value.equals("bi")){
            webView.loadUrl("https://drive.google.com/open?id=1gyB6MjS-qoghokGsC75l-E45EjdBnuTt");
        }
        if(value.equals("m3")){
            webView.loadUrl("https://drive.google.com/open?id=1P8SNxpQNRdVGDO0FkFSQgxTZz5OCRgW1");
        }
        if(value.equals("mm")){
            webView.loadUrl("https://drive.google.com/open?id=11AzN4-avvRCggL9bDForgwy92qemcIpw");
        }

        if(value.equals("vb")){
            webView.loadUrl("https://drive.google.com/open?id=1l9n31RQBngS7xcP87rK0p4DhFWqPd8PR");
        }
        if(value.equals("daa")){
            webView.loadUrl("https://drive.google.com/open?id=19PYbtUHkSydjBZYBEReVydHc95b4Jhv3");
        }

        if(value.equals("la")){
            webView.loadUrl("https://drive.google.com/open?id=1rZ3YZuUfghAxRHXYuJCu3PH81aVs_SkR");
        }
        if(value.equals("ifa")){
            webView.loadUrl("https://drive.google.com/open?id=1TvPFZIVWk1Ww5n0nnb3j-PqGWQnzxnsI");
        }
        if(value.equals("rmt")){
            webView.loadUrl("https://drive.google.com/open?id=14or_0GMGh5mFmNgVA8R7BOOAk0xoVJQo");
        }
        if(value.equals("cn")){
            webView.loadUrl("https://drive.google.com/open?id=1iT9b5OjBUM3SxCpI6d0h619EmJrC7uJg");
        }
        if(value.equals("php")){
            webView.loadUrl("https://drive.google.com/open?id=18DZQsCnP81FplvGrnVdAM5BkRBh52WEt");
        }
        if(value.equals("os")){
            webView.loadUrl("https://drive.google.com/open?id=1J08GNi1tNX1ywndnTxlAQ32k7T6Y79s6");
        }
        if(value.equals("set")){
            webView.loadUrl("https://drive.google.com/open?id=1UUlCowmr7EdKII2WO6eP5P7AJ79QlLt6");
        }
        if(value.equals("mis")){
            webView.loadUrl("https://drive.google.com/open?id=1Gs8p0jqzJXiY537IjCfPlHbbIUxLeVoK");
        }
        if(value.equals("km")){
            webView.loadUrl("https://drive.google.com/open?id=1upj50FQZFp5gbgFJY9Y0AP2c3XXt82-T");
        }

        if(value.equals("evs")){
            webView.loadUrl("https://drive.google.com/open?id=1ymsIFKPICSZBNQgSo-9VWwXHLqMhOd70");
        }
        if(value.equals("mc")){
            webView.loadUrl("https://drive.google.com/open?id=1p9tMpMtmkh7PkVmNu4RUGn80BCV9Hiaa");
        }
        if(value.equals("ooad")){
            webView.loadUrl("https://drive.google.com/open?id=1X3SA6W7fHtPb5cNjBkjOBLyiWdeSJyV8");
        }
        if(value.equals("ecom")){
            webView.loadUrl("https://drive.google.com/open?id=1_gg2Nbrn5uAs6Jg3MvpLKhGbz_vL1CJ4");
        }
        if(value.equals("cns")){
            webView.loadUrl("https://drive.google.com/open?id=1o-vwBqMAmrInH3tGU5EpZydEcFprC2lA");
        }
        if(value.equals("dm")){
            webView.loadUrl("https://drive.google.com/open?id=1DswVrLpKQukkYqgEfGubCKr1aRDXtbGg");
        }
        if(value.equals("soa")){
            webView.loadUrl("https://drive.google.com/open?id=1YoW8TW7KQzvkbcOTKLW8qQ39K3ZQCO4M");
        }
        if(value.equals("imad")){
            webView.loadUrl("https://drive.google.com/open?id=1sYnGZk9xV2xRIpxvXRGWKxAGFZ6DiGEQ");
        }
        if(value.equals("pp")){
            webView.loadUrl("https://drive.google.com/open?id=1PJsqQ77v4qrvavbHMKLZTmJZZ7GDP6Jw");
        }
        if(value.equals("ai")){
            webView.loadUrl("https://drive.google.com/open?id=17lCbFmRyEiPoYCMX3A07OHd1qJG--sxd");
        }
        if(value.equals("cc")){
            webView.loadUrl("https://drive.google.com/open?id=1eacDFt9KXiCEft9hevEdk7XOCGC8i-oc");
        }
        if(value.equals("labc")){
            webView.loadUrl("https://drive.google.com/open?id=1AnBhuzW_DhhdBJkt7YPkDXQ9iIOvATqZ");
        }
        if(value.equals("labopenoffice")){
            webView.loadUrl("https://drive.google.com/open?id=1-hm4nIM9KXSUxYGi3-qxQUbNJpYW3O1y");
        }
        if(value.equals("labcpp")){
            webView.loadUrl("https://drive.google.com/open?id=1M43pyjkgTeadIOuFs-1wWtFSlzFPyf1F");
        }
        if(value.equals("labhtml")){
            webView.loadUrl("https://drive.google.com/open?id=1Twkmr0h0lHWjRYWFqYTleLEiWLjlRznu");
        }
        if(value.equals("labjava")){
            webView.loadUrl("https://drive.google.com/open?id=1m9p7qMVT9FnTmNSjHbXIur0lHi-x69PU");
        }
        if(value.equals("labrdbms")){
            webView.loadUrl("https://drive.google.com/open?id=1x2IlZwcsz5tLHurSzcKoyvi5IeRF142x");
        }
        if(value.equals("labvb")){
            webView.loadUrl("https://drive.google.com/open?id=13K9xgBlGkxnJ7hgzATOaifbaTWOs1fBU");
        }
        if(value.equals("labcn")){
            webView.loadUrl("https://drive.google.com/open?id=1OSpuSmloGD2sfT-3M23f97AaDBzxQFwq");
        }
        if(value.equals("labmm")){
            webView.loadUrl("https://drive.google.com/open?id=18tPwkypbX76CauDfIkUJ9k0ld-B7De3D");
        }
        if(value.equals("labphp")){
            webView.loadUrl("https://drive.google.com/open?id=1DuubHJL7OUw6VLgvynFK8Jk2iX7B0uCc");
        }
        if(value.equals("labooad")){
            webView.loadUrl("https://drive.google.com/open?id=1u2fSDcJ28_8GKxN5HCzA0WRGPUlSvVvK");
        }
        if(value.equals("labproject")){
            webView.loadUrl("https://drive.google.com/open?id=1JGNE9aDszehb3P9LmvqvdqOnkNO3yyKx");
        }
        if(value.equals("timetable")){
            webView.loadUrl("https://drive.google.com/open?id=1Fs84HVuJ74tcCUQGPtCO2izXg8a_GM3w");
        }
        if(value.equals("examtimetable")){
            webView.loadUrl("https://drive.google.com/open?id=1N65zwLTvICRZ3FcOwyyjR25gFihO1VAz");
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
            Toast.makeText(getApplicationContext(),"press again to go back", Toast.LENGTH_SHORT).show();
        }else {
            super.onBackPressed();
        }
    }
}
