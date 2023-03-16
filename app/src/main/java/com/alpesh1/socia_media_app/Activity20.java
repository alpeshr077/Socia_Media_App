package com.alpesh1.socia_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Activity20 extends AppCompatActivity {

    WebView ImgWA20;

    String Url = "https://www.resso.com/in/";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_20);

        ImgWA20 = findViewById(R.id.ImgWA20);

        WebSettings settings2 = ImgWA20.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setSupportZoom(true);

        ImgWA20.loadUrl(Url);
    }
}