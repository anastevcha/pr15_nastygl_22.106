package com.example.pr15_nastygl_22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Playlists extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);
        btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, Popular.class);
        startActivity(intent);
    }
}