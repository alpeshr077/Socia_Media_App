package com.alpesh1.socia_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Activity5 extends AppCompatActivity {

    WebView ImgWA5;

    String Url = "https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        ImgWA5 = findViewById(R.id.ImgWA5);

        WebSettings settings2 = ImgWA5.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setSupportZoom(true);

        ImgWA5.loadUrl(Url);
    }
}