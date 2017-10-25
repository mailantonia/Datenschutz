package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Check_button_mail extends AppCompatActivity {

    private TextView Kapitel;
    private TextView Teaser;
    private TextView Informationstext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_button_mail);

        Kapitel = (TextView) findViewById(R.id.textView10);
        Kapitel.setText("E-Mail Sicherheitscheck");

        Teaser = (TextView) findViewById(R.id.textView6);
        Teaser.setText("Wirst Du mit Werbe-Emails zugespammt? Oder liegen regelmäßig unseriöse Rechnungen und Gewinnspiele in Deinem Posteingang? Dann mache jetzt den E-Mail Sicherheitscheck!");

        Informationstext = (TextView) findViewById(R.id.textView5);
        Informationstext.setText("Hier findest Du den Link: www.google.de");
    }

    //Zurück in das Menü
    public void goback(View v)
    {
        Intent intent = new Intent(this, Check.class);
        startActivity(intent);
    }
}