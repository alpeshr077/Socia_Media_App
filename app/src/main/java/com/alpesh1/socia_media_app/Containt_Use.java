package com.alpesh1.socia_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Containt_Use extends AppCompatActivity {

    WebView ImgWA;

    String Url = "https://www.instagram.com/";


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_containt_use);

        ImgWA = findViewById(R.id.ImgWA);

        WebSettings settings = ImgWA.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgWA.loadUrl(Url);
    }
}