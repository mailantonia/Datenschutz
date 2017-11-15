package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Hier wird das Layout zu dem Thema 'E-Mail Sicherheitscheck' gefüllt

public class Check_button_mail extends AppCompatActivity {

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
        Kapitel.setText("E-Mail Sicherheitscheck");

        Teaser = (TextView) findViewById(R.id.textView6);
        Teaser.setText("Wurden schon einmal SPAM-E-Mails in deinem Namen und ohne dein Wissen versendet? Wurde schon einmal dein Facebook-Account gehackt? Oder fühlst du dich sicher im Internet? Mache jetzt deinen persönlichen E-Mail Sicherheitscheck!");

        Informationstext = (TextView) findViewById(R.id.textView5);
        Informationstext.setText("Häufig werden E-Mail-Accounts zum Ziel von Hackerangriffen. Durch den illegalen Zugang zu privaten E-Mail-Accounts können Hacker diese zum Versand von SPAM-Mails missbrauchen. Zudem besteht die Gefahr, dass dein Zugang zu sozialen Netzwerken und Online-Shops, die mit der entsprechenden Mailadresse verknüpft sind nicht mehr sicher sind. Daher ist es wichtig sein privates Konto gut zu schützen. Teste unter folgendem Link, ob deine E-Mail-Adresse schon einmal gehackt wurde: \n");

        Link = (TextView) findViewById(R.id.textView7);
        Link.setText("https://haveibeenpwned.com/");
    }

    //Zurück in das Check-Dich-Menü
    public void goback(View v)
    {
        Intent intent = new Intent(this, Check.class);
        startActivity(intent);
    }
}