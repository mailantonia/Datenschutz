package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Check_button_passwort extends AppCompatActivity {

    private TextView Kapitel;
    private TextView Teaser;
    private TextView Informationstext;
    private TextView Link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_button_mail);

        Kapitel = (TextView) findViewById(R.id.textView10);
        Kapitel.setText("Passwort Sicherheitscheck");

        Teaser = (TextView) findViewById(R.id.textView6);
        Teaser.setText("Wie sicher ist Dein Passwort?");

        Informationstext = (TextView) findViewById(R.id.textView5);
        Informationstext.setText("Teste die Sicherheit Deines Passwortes unter folgendem Link: \n");

        Link = (TextView) findViewById(R.id.textView7);
        Link.setText("https://checkdeinpasswort.de/");
    }

    //Zurück in das Menü
    public void goback(View v)
    {
        Intent intent = new Intent(this, Check.class);
        startActivity(intent);
    }
}