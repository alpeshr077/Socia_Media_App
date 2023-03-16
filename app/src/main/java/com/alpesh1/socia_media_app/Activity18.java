package com.alpesh1.socia_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Activity18 extends AppCompatActivity {

    WebView ImgWA18;

    String Url = "https://www.yallagroup.com/#/home";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_18);

        ImgWA18 = findViewById(R.id.ImgWA18);

        WebSettings settings2 = ImgWA18.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setSupportZoom(true);

        ImgWA18.loadUrl(Url);
    }
}