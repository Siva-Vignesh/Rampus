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

public class bsccsBlog extends AppCompatActivity {
    private WebView webView;
    ProgressBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bsccsblog);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        webView=findViewById(R.id.notesblog);
        bar=findViewById(R.id.progressBarblog);
        Intent intent = getIntent();
        String value = intent.getStringExtra("somevariable");
        if(value.equals("t1")){
            webView.loadUrl("https://drive.google.com/open?id=1W5MHXxwrUyB0_jg605rJtk8S6U0-wwP6");
        }
        if(value.equals("e1")){
            webView.loadUrl("https://drive.google.com/open?id=1t4Dv-NNmrBb6s9lP0nWBGxXIk8joSJL8");
        }
        if(value.equals("f1")){
            webView.loadUrl("https://drive.google.com/open?id=1O693Pw2n2OTBpWbEp8pPXBrobh_so61-");
        }
        if(value.equals("h1")){
            webView.loadUrl("https://drive.google.com/open?id=1thzoKXSRA5GRU2UjSxsSDZNan0G-D8ep");
        }
        if(value.equals("dlf")){
            webView.loadUrl("https://drive.google.com/open?id=1T9iKDyr7Wp20fueTvLGskqUPQa0EvoOU");
        }
        if(value.equals("pst")){
            webView.loadUrl("https://drive.google.com/open?id=1CE1Qiz3akTGS6akVLm340-Zh_BmdkX-w");
        }
        if(value.equals("m1")){
            webView.loadUrl("https://drive.google.com/open?id=1ZgxlLrz-jy_BlguABHUZy4aEPlottamO");
        }
        if(value.equals("t2")){
            webView.loadUrl("https://drive.google.com/open?id=1fHkh9pTpm4WepUW5HLP_Xeh22z6wQDgO");
        }
        if(value.equals("e2")){
            webView.loadUrl("https://drive.google.com/open?id=1R_tPbC4YeUKS8aQm8g0nUSxxXcShcr1i");
        }
        if(value.equals("f2")){
            webView.loadUrl("https://drive.google.com/open?id=1sIPX9e__uUzqHpAlG2ORslpm9UwsapuK");
        }
        if(value.equals("h2")){
            webView.loadUrl("https://drive.google.com/open?id=1325G9n6mLWOJpRg_G-VcI4Yd7nMjhxiA");
        }
        if(value.equals("cpp")){
            webView.loadUrl("https://drive.google.com/open?id=1W4UZhnJ18IFv9M75vwiMYavBcQbvoUGU");
        }
        if(value.equals("ds")){
            webView.loadUrl("https://drive.google.com/open?id=1zVpj-zgDQcry3wBu4ZpxplUPWfU8aw2z");
        }
        if(value.equals("m2")){
            webView.loadUrl("https://drive.google.com/open?id=1SP1w1qSa5YZa_MEHUQIJi5PgEWS9TEIn");
        }
        if(value.equals("java")){
            webView.loadUrl("https://drive.google.com/open?id=1AqDPzwv3V-7N1H4fKdc9UDmhX_lH69MJ");
        }
        if(value.equals("mm")){
            webView.loadUrl("https://drive.google.com/open?id=1Ogehgzs-rV7P2fCq8YTnrTDfJ2nsNPOR");
        }
        if(value.equals("statisticalmethod")){
            webView.loadUrl("https://drive.google.com/open?id=1vKXMfjiFD6X_mUF62HqZa0Ckb7H7smW-");
        }
        if(value.equals("se")){
            webView.loadUrl("https://drive.google.com/open?id=1QZcAvdkA-8QasgfkJsu5PocGYw5ZUOGQ");
        }
        if(value.equals("os")){
            webView.loadUrl("https://drive.google.com/open?id=17CmoUW7rD0u1XQn30ZiDBNQFJ2IcMwaj");
        }
        if(value.equals("co")){
            webView.loadUrl("https://drive.google.com/open?id=1LgGE3OFkslBkNBd-I5E3OV2RuQr2qw85");
        }
        if(value.equals("dbms")){
            webView.loadUrl("https://drive.google.com/open?id=1q72RlUEqy8P2KIpDyWJYlWZn7DG-dxxo");
        }
        if(value.equals("sl")){
            webView.loadUrl("https://drive.google.com/open?id=1u7pfsBqTwtRlbwGgGI4xkQZaiWs5ZRXx");
        }
        if(value.equals("rmt")){
            webView.loadUrl("https://drive.google.com/open?id=1fQBKwZ7fVG0p-EvaVlQl6NXAnKJ9Lda2");
        }
        if(value.equals("spm")){
            webView.loadUrl("https://drive.google.com/open?id=1827HotltApZsc8u-phQalynwlzf_HNAs");
        }
        if(value.equals("st")){
            webView.loadUrl("https://drive.google.com/open?id=17d1atCJcoDgfDjo7XsDPbHUMG4UjwzdB");
        }
        if(value.equals("mis")){
            webView.loadUrl("https://drive.google.com/open?id=1EameVG2rGoJxrpn12rPYVDcJCFM4uB65");
        }
        if(value.equals("advancejava")){
            webView.loadUrl("https://drive.google.com/open?id=1YXtTeTfbf04jS7umpz71ECSUeP4ewjTM");
        }
        if(value.equals("ost")){
            webView.loadUrl("https://drive.google.com/open?id=1v4CnnuQMTKfWkQzKQvLz7SEnHG9tm8B7");
        }
        if(value.equals("dcn")){
            webView.loadUrl("https://drive.google.com/open?id=16lIo0Sl-8A-AGTIJkz3P-hzQT8d_kQoC");
        }
        if(value.equals("dm")){
            webView.loadUrl("https://drive.google.com/open?id=1aixnZPVSAsFJ04GrZA9wZFd_QIscKzQJ");
        }
        if(value.equals("cd")){
            webView.loadUrl("https://drive.google.com/open?id=11U7JzPePCtdQiFKsnhbZvjsPThJkepaN");
        }
        if(value.equals("sa")){
            webView.loadUrl("https://drive.google.com/open?id=1cLGPT_c2dn1u2yYrzsJcWpT8yw-ES17K");
        }
        if(value.equals("evs")){
            webView.loadUrl("https://drive.google.com/open?id=1B-cGm2D4d8-lnVpLODhnFVk3xo0XUOAP");
        }
        if(value.equals("python")){
            webView.loadUrl("https://drive.google.com/open?id=1NpMPFmSCuVoqOcETW-boyjICXKqpnbzd");
        }
        if(value.equals("ooad")){
            webView.loadUrl("https://drive.google.com/open?id=1wi-jZVDoSOlWuNhqhntBXxHjOAMh-s2_");
        }
        if(value.equals("aies")){
            webView.loadUrl("https://drive.google.com/open?id=1jqo7ua8FvD6EWKTFh-WXbg3Kah3t3Dia");
        }
        if(value.equals("ecom")){
            webView.loadUrl("https://drive.google.com/open?id=14aUU6A4baXgggUbJMSUbfCPYER6Xdb8d");
        }
        if(value.equals("ss")){
            webView.loadUrl("https://drive.google.com/open?id=1360SpLih9VdNQA0IL5H6n3ZRBy-L99vg");
        }
        if(value.equals("wi")){
            webView.loadUrl("https://drive.google.com/open?id=1hcWuUvyq7P6_6dQrM6MSLTZOZW4V6z9k");
        }
        if(value.equals("cc")){
            webView.loadUrl("https://drive.google.com/open?id=1t1wnv7wr8BcxIXLI0DiCf0rJXq3vqBjR");
        }
        if(value.equals("bda")){
            webView.loadUrl("https://drive.google.com/open?id=11kdXPjKqWvv6vFear-zlrDUalEQ4sCWZ");
        }
        if(value.equals("c")){
            webView.loadUrl("https://drive.google.com/open?id=1rD2B-UZ7X3FHI6vvvnNq6VurDrr0GY_w");
        }
        if(value.equals("c2")){
            webView.loadUrl("https://drive.google.com/open?id=1h3UnWyr-NJkvYDWJX8YWfpJ4VsC9DSa_");
        }
        if(value.equals("c3")){
            webView.loadUrl("https://drive.google.com/open?id=1JhtZtVoBOgbc2LptdxQAVXpLcJNPR3qk");
        }
        if(value.equals("c4")){
            webView.loadUrl("https://drive.google.com/open?id=1wxidMXT8hqCO_0NMRln6FJPxPMcmQhCg");
        }
        if(value.equals("c5")){
            webView.loadUrl("https://drive.google.com/open?id=1hlisaSrFlk8lDGNNfeIGASs9EBLkttVE");
        }
        if(value.equals("c6")){
            webView.loadUrl("https://drive.google.com/open?id=1PyQ1tryNLptH7Wb5Brrp-qMgfUF1zu96");
        }
        if(value.equals("c7")){
            webView.loadUrl("https://drive.google.com/open?id=1k-oH7QbiC1-dxJDw1QNL5gfHPBW9mwH3");
        }
        if(value.equals("c8")){
            webView.loadUrl("https://drive.google.com/open?id=1WjN2xXTm7v1J4F8zMEf8XtyEEtg1C0mU");
        }
        if(value.equals("c9")){
            webView.loadUrl("https://drive.google.com/open?id=1_T6ogqx-Me2FotPLWX7upiATpKn-cPuL");
        }
        if(value.equals("c10")){
            webView.loadUrl("https://drive.google.com/open?id=1cYHIMzPOn9hCfff98qh4bQTje8dEFLdK");
        }
        if(value.equals("c11")){
            webView.loadUrl("https://drive.google.com/open?id=1udBerJv7R90E2yafUiPpZnnqIkFBJv3z");
        }
        if(value.equals("c12")){
            webView.loadUrl("https://drive.google.com/open?id=1B3--oXmmIxBHAOfh-GiSm7UHkdytJZRM");
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
