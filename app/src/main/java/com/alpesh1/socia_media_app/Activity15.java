package com.alpesh1.socia_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Activity15 extends AppCompatActivity {

    WebView ImgWA15;

    String Url = "https://appmagic.rocks/google-play/noizz-video-editor-with-music/com.yy.biu/info";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_15);

        ImgWA15 = findViewById(R.id.ImgWA15);

        WebSettings settings2 = ImgWA15.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setSupportZoom(true);

        ImgWA15.loadUrl(Url);
    }
}