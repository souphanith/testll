package com.example.onepiecegallary;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Listviewgallary extends Activity {
    ListView Mylistview;
    int onepieceImg [] = {R.drawable.pic1,R.drawable.pic2,
    R.drawable.panda3,R.drawable.panda4,
    R.drawable.panda6,R.drawable.panda7,
    R.drawable.panda8,R.drawable.panda9};
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_list_gallary);
        Mylistview = findViewById(R.id.onepiecelist);
        onepieceAdapter onepieceAdapter = new onepieceAdapter(getApplicationContext(),onepieceImg);
        Mylistview.setAdapter(onepieceAdapter);
        Mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent FullIntent = new Intent(getApplicationContext(),Fullviewgallary.class);
                FullIntent.putExtra("position",i);
                startActivity(FullIntent);
            }
        });
    }
}
