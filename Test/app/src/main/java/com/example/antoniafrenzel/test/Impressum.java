package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.support.annotation.Nullable;

public class Impressum extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impressum);
    }

    public void BackToMain(View v) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
