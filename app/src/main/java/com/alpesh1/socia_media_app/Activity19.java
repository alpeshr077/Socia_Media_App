package com.alpesh1.socia_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Activity19 extends AppCompatActivity {

    WebView ImgWa19;

    String Url = "https://tiki.video/?lang=en";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_19);

        ImgWa19 = findViewById(R.id.ImgWA19);

        WebSettings settings2 = ImgWa19.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setSupportZoom(true);

        ImgWa19.loadUrl(Url);
    }
}