package com.alpesh1.socia_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView WA1,WA2,WA3,WA4,WA5,WA6,WA7,WA8,WA9,WA10,WA11,WA12,WA13,WA14,WA15,WA16,WA17,WA18,WA19,WA20;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WA1 = findViewById(R.id.WA1);
        WA2 = findViewById(R.id.WA2);
        WA3 = findViewById(R.id.WA3);
        WA4 = findViewById(R.id.WA4);
        WA5 = findViewById(R.id.WA5);
        WA6 = findViewById(R.id.WA6);
        WA7 = findViewById(R.id.WA7);
        WA8 = findViewById(R.id.WA8);
        WA9 = findViewById(R.id.WA9);
        WA10 = findViewById(R.id.WA10);
        WA11 = findViewById(R.id.WA11);
        WA12 = findViewById(R.id.WA12);
        WA13 = findViewById(R.id.WA13);
        WA14 = findViewById(R.id.WA14);
        WA15 = findViewById(R.id.Wa15);
        WA16 = findViewById(R.id.WA16);
        WA17 = findViewById(R.id.WA17);
        WA18 = findViewById(R.id.WA18);
        WA19 = findViewById(R.id.WA19);
        WA20 = findViewById(R.id.WA20);

        WA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Containt_Use.class);
                startActivity(intent);
            }
        });

        WA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);
            }
        });

        WA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity3.class);
                startActivity(intent);
            }
        });

        WA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity4.class);
                startActivity(intent);
            }
        });
        WA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity5.class);
                startActivity(intent);
            }
        });
        WA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity6.class);
                startActivity(intent);
            }
        });
        WA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity7.class);
                startActivity(intent);
            }
        });
        WA8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity8.class);
                startActivity(intent);
            }
        });
        WA9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity9.class);
                startActivity(intent);
            }
        });
        WA10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity10.class);
                startActivity(intent);
            }
        });
        WA11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity11.class);
                startActivity(intent);
            }
        });
        WA12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity12.class);
                startActivity(intent);
            }
        });
        WA13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity13.class);
                startActivity(intent);
            }
        });
        WA14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity14.class);
                startActivity(intent);
            }
        });
        WA15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity15.class);
                startActivity(intent);
            }
        });
        WA16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity16.class);
                startActivity(intent);
            }
        });
        WA17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity17.class);
                startActivity(intent);
            }
        });
        WA18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity18.class);
                startActivity(intent);
            }
        });
        WA19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity19.class);
                startActivity(intent);
            }
        });
        WA20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity20.class);
                startActivity(intent);
            }
        });
    }
}