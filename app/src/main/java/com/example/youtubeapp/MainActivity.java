package com.example.youtubeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    public WebView myyoutuve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myyoutuve = (WebView)findViewById(R.id.webview);
        WebSettings webSettings = myyoutuve.getSettings();
        webSettings.setJavaScriptEnabled(true);

        myyoutuve.loadUrl("https://www.youtube.com/watch?v=lrzBX0qTfMQ");

        myyoutuve.setWebViewClient(new WebViewClient());

    }
    @Override
    public void onBackPressed(){
        if (myyoutuve.canGoBack())
        {
          myyoutuve.goBack();
        }
        else { super.onBackPressed();

        }
    }
}
