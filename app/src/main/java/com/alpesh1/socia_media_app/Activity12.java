package com.alpesh1.socia_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Activity12 extends AppCompatActivity {

    WebView ImgWA12;

    String Url = "https://m.ok.ru/kuz.vasil?current.locale=en";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12);

        ImgWA12 = findViewById(R.id.ImgWA12);

        WebSettings settings2 = ImgWA12.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setSupportZoom(true);

        ImgWA12.loadUrl(Url);
    }
}