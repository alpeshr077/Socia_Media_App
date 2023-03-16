package com.alpesh1.socia_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Activity14 extends AppCompatActivity {

    WebView ImgWA14;

    String Url = "https://web.telegram.org/";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_14);

        ImgWA14 = findViewById(R.id.ImgWA14);

        WebSettings settings2 = ImgWA14.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setSupportZoom(true);

        ImgWA14.loadUrl(Url);
    }
}