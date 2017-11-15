package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Hier wird das Layout zu dem Thema 'Passwort Sicherheitscheck' gefüllt

public class Check_button_passwort extends AppCompatActivity {

    //Initialisierung der Variablen
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
        Teaser.setText("Häufig vergeben Internetnutzer spontan ein Passwort, dass sie sich leicht merken können oder bereits mehrfach als Passwort zu anderen Accounts nutzen. Das kann zu Sicherheitslücken führen. Wie sicher ist dein Passwort?");

        Informationstext = (TextView) findViewById(R.id.textView5);
        Informationstext.setText("\n1. Ein sicheres Passwort besteht aus Klein- und\n    Großbuchstaben sowie Zahlen und Sonderzeichen.\n\n2. Verwende kein geläufiges Wort sondern eine Abfolge\n     von Buchstaben, die für Dritte keinen Sinn ergibt.\n\n3. Tipp: Merke Dir beispielsweise einen Satz und\n     verwende die Anfangsbuchstaben der Wörter als\n     Passwort. \n\nTeste die Sicherheit Deines persönlichen Passwortes unter folgendem Link:\n");

        Link = (TextView) findViewById(R.id.textView7);
        Link.setText("https://checkdeinpasswort.de/");
    }

    //Zurück in das Check-Dich-Menü
    public void goback(View v)
    {
        Intent intent = new Intent(this, Check.class);
        startActivity(intent);
    }
}