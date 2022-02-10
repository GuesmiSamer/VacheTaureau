package com.example.vachetaureau;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
   ImageButton B1 ;
   ImageButton B2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.B1 = (ImageButton) findViewById(R.id.B1);
        this.B2 = (ImageButton) findViewById(R.id.B2);
        B1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,training.class);
                startActivity(i);
    }
});
        B2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this,p2.class);
                startActivity(j);
            }
        });}}
