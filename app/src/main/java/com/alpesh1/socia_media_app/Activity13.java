package com.alpesh1.socia_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Activity13 extends AppCompatActivity {

    WebView ImgWA13;

    String Url = "https://www.fanbase.app/";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);

        ImgWA13 = findViewById(R.id.ImgWA13);

        WebSettings settings2 = ImgWA13.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setSupportZoom(true);

        ImgWA13.loadUrl(Url);
    }
}