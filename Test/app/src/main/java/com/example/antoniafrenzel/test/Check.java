package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Check extends AppCompatActivity {

    private Button B1_Standortverlauf;
    private Button B2_Mail_Check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        B1_Standortverlauf = (Button) findViewById(R.id.button9);
        B2_Mail_Check = (Button) findViewById(R.id.button10);
    }
}
