package com.example.aquafarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button addNew, feeding, feedStock, feedUsage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addNew = findViewById(R.id.add_new);
        feeding = findViewById(R.id.feeding);
        feedStock = findViewById(R.id.feed_stock);
        feedUsage = findViewById(R.id.feed_usage);

        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
        finish();

        addNew.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), AddSiteActivity.class);
            startActivity(i);
        });

        feeding.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), FeedingActivity.class);
            startActivity(i);
        });

        feedStock.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), StockActivity.class);
            startActivity(i);
        });

        feedUsage.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), FeedUsageActivity.class);
            startActivity(i);
        });

    }
}