package com.example.pr15_nastygl_22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Popular extends AppCompatActivity implements View.OnClickListener {
    ImageView btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);
        btn = (ImageView) findViewById(R.id.imageView16);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, Habib.class);
        startActivity(intent);
    }
}