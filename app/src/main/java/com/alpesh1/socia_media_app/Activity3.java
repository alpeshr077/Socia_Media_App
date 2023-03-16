package com.alpesh1.socia_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Activity3 extends AppCompatActivity {

    WebView ImgWA3;

    String Url = "https://www.facebook.com/";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        ImgWA3 = findViewById(R.id.ImgWA3);

        WebSettings settings2 = ImgWA3.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setSupportZoom(true);

        ImgWA3.loadUrl(Url);
    }
}