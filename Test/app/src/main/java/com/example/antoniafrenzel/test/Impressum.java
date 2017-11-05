package com.example.antoniafrenzel.test;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;  //evtl falsch...
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import android.support.annotation.Nullable;

public class Impressum extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impressum);
        //setContentView(R.layout.activity_quiz);
    }

    public void BackToMain(View v) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
