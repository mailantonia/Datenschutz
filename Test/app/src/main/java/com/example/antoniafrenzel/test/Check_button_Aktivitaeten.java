package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Antonia Frenzel on 26.10.2017.
 */

public class Check_button_Aktivitaeten extends AppCompatActivity{
    private TextView Kapitel;
    private TextView Teaser;
    private TextView Informationstext;
    private TextView Link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_button_mail);

        Kapitel = (TextView) findViewById(R.id.textView10);
        Kapitel.setText("Google Meine Aktivitäten");

        Teaser = (TextView) findViewById(R.id.textView6);
        Teaser.setText("Wenn du etwas über die Google-Suche suchst, dann wird der Eintrag von Google gespeichert. Das funktioniert mit jedem Geräte, mit welchem du über dein Google-Konto angemeldet bist. Auf der Seite 'Meine Aktivitäten' kannst du sehen. wass Google von dir gespeichert hat.");

        Informationstext = (TextView) findViewById(R.id.textView5);
        Informationstext.setText("Unter diesem Link kommst du zu 'Meine Aktivitäten': \n");

        Link = (TextView) findViewById(R.id.textView7);
        Link.setText("https://myactivity.google.com/myactivity");
    }
    //Zurück in das Menü
    public void goback(View v)
    {
        Intent intent = new Intent(this, Check.class);
        startActivity(intent);
    }
}
