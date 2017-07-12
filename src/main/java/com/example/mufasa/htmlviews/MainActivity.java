package com.example.mufasa.htmlviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=(WebView)findViewById(R.id.webView);
    //enables javascript for better loading of the website
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("file:///android_asset/index.html");

    }
}
