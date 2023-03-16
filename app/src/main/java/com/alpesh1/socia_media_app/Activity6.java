package com.alpesh1.socia_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Activity6 extends AppCompatActivity {

    WebView ImgWa6;

    String Url = "https://mojapp.in/";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        ImgWa6 = findViewById(R.id.ImgWA6);

        WebSettings settings2 = ImgWa6.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setSupportZoom(true);

        ImgWa6.loadUrl(Url);
    }
}