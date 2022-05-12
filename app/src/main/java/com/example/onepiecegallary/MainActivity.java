package com.example.onepiecegallary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button myGridview, myListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myGridview = findViewById(R.id.grid);
        myListview = findViewById(R.id.List);

        myGridview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GridInttent = new Intent(getApplicationContext(),Gridviewgallary.class);
                startActivity(GridInttent);
            }
        });

        myListview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ListIntent = new Intent(getApplicationContext(),Listviewgallary.class);
                startActivity(ListIntent);
            }
        });
    }
}