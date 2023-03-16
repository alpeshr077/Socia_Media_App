package com.alpesh1.socia_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Activity10 extends AppCompatActivity {

    WebView ImgWA10;

    String Url = "https://www.reddit.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        ImgWA10 = findViewById(R.id.ImgWA10);

        WebSettings settings2 = ImgWA10.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setSupportZoom(true);

        ImgWA10.loadUrl(Url);
    }
}