package com.alpesh1.socia_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Activity7 extends AppCompatActivity {

    WebView ImgWA7;

    String Url = "https://weverse.io/?hl=en";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        ImgWA7 = findViewById(R.id.ImgWA7);

        WebSettings settings2 = ImgWA7.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setSupportZoom(true);

        ImgWA7.loadUrl(Url);
    }
}