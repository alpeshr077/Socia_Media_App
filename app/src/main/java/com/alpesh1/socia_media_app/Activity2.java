package com.alpesh1.socia_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Activity2 extends AppCompatActivity {

    WebView ImgWA2;

    String Url = "https://www.whatsapp.com/";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ImgWA2 = findViewById(R.id.ImgWA2);

        WebSettings settings2 = ImgWA2.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setSupportZoom(true);

        ImgWA2.loadUrl(Url);
    }
}