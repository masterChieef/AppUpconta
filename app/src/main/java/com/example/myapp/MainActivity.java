package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView miWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miWebView = findViewById(R.id.wv_main);
        miWebView.getSettings().setJavaScriptEnabled(true);
        miWebView.setWebViewClient(new WebViewClient());
        miWebView.loadUrl("https://app.upconta.com/");

    }
}
