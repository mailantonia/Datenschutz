package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Hier wird das Layout zu dem Thema 'Google Werbung' gefüllt

public class Check_button_Werbung extends AppCompatActivity{
    private TextView Kapitel;
    private TextView Teaser;
    private TextView Informationstext;
    private TextView Link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_button_mail);

        Kapitel = (TextView) findViewById(R.id.textView10);
        Kapitel.setText("Google Werbung");

        Teaser = (TextView) findViewById(R.id.textView6);
        Teaser.setText("Hast du dich schon einmal gefragt, wie Google es schafft dir Werbung zu zeigen, die genau auf dich zugeschnitten ist?");

        Informationstext = (TextView) findViewById(R.id.textView5);
        Informationstext.setText("Google verdient sein Geld mit personalisierter Werbung. Wenn du Google nutzt, dannn analysiert die Seite im Hintergrund genau dein Nutzerverhalten. U.a. erstellt die Seite eine Liste von Dingen die dir gefallen. Auf Grundlage dieser Liste bekommst du dann passende Werbung. Google hat dafür einen Algorithmus, der aus deinem Suchverhalten eine Liste erstellt. Unter diesem Link kannst du dir die Liste anschauen. Du kannst die Liste auch ergänzen sowie Punkte davon löschen. \n");

        Link = (TextView) findViewById(R.id.textView7);
        Link.setText("https://adssettings.google.com/authenticated");
    }

    //Zurück in das Menü
    public void goback(View v)
    {
        Intent intent = new Intent(this, Check.class);
        startActivity(intent);
    }
}
