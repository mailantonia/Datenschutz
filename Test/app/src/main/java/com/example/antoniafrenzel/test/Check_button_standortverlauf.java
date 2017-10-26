package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Check_button_standortverlauf extends AppCompatActivity {

    private TextView Kapitel;
    private TextView Teaser;
    private TextView Informationstext;
    private TextView Link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_button_mail);

        Kapitel = (TextView) findViewById(R.id.textView10);
        Kapitel.setText("Google Zeitachse");

        Teaser = (TextView) findViewById(R.id.textView6);
        Teaser.setText("Auf deinem Smartphone ist standartmäßig die Standortlokalisierung eingeschaltet. Solltest du das nicht wollen, dann solltest du das jetzt unter deinen Einstellungen ändern.");

        Informationstext = (TextView) findViewById(R.id.textView5);
        Informationstext.setText("Unter diesem Link kannst du sehen, welchen Standorte Google von dir gespeichert hat: \n");

        Link = (TextView) findViewById(R.id.textView7);
        Link.setText("https://www.google.de/maps/timeline?hl=de&pb");
    }

    //Zurück in das Menü
    public void goback(View v)
    {
        Intent intent = new Intent(this, Check.class);
        startActivity(intent);
    }
}