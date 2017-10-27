package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Informationen_Menue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seite3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}

    public void startNewActivity(View v) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void Infos_Datenschutz(View v) {

        Intent intent = new Intent(this, Informationen.class);
        startActivity(intent);
    }

    public void Infos_Standortlokalisierung(View v) {

        Intent intent = new Intent(this, Informationen_Standort.class);
        startActivity(intent);
    }

    public void Infos_Google(View v) {

        Intent intent = new Intent(this, Informationen_Google.class);
        startActivity(intent);
    }
}