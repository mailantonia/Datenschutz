package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
    }

    public void Mail_check(View v) {

        Intent intent = new Intent(this, Check_button_mail.class);
        startActivity(intent);
    }

    public void StartNewZeitachse(View v) {

        Intent intent = new Intent(this, Check_button_standortverlauf.class);
        startActivity(intent);
    }

    public void Zurück(View v) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void Passwort_check(View v) {

        Intent intent = new Intent(this, Check_button_passwort.class);
        startActivity(intent);
    }

    public void StartNewAktivitaeten(View v) {

        Intent intent = new Intent(this, Check_button_Aktivitaeten.class);
        startActivity(intent);
    }
    public void StartNewWerbung(View v) {

        Intent intent = new Intent(this, Check_button_Werbung.class);
        startActivity(intent);
    }
}