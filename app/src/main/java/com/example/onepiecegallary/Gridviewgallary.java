package com.example.onepiecegallary;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class Gridviewgallary extends AppCompatActivity {
    GridView onepieceGridview;
    int onepiecImg [] ={R.drawable.panda1,R.drawable.panda2,
            R.drawable.panda2,
            R.drawable.panda10,
            R.drawable.panda7,
            R.drawable.panda10,
            R.drawable.panda9,
            R.drawable.panda9,
            R.drawable.panda10,
            R.drawable.panda1,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_grid_gallary);
        onepieceGridview = findViewById(R.id.onepieceGrid);
        onepieceAdapter myonepieceAdapter = new onepieceAdapter(getApplicationContext(),onepiecImg);
        onepieceGridview.setAdapter(myonepieceAdapter);
    }
}
