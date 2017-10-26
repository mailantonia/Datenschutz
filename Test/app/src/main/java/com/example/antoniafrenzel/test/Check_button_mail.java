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
    private TextView Link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_button_mail);

        Kapitel = (TextView) findViewById(R.id.textView10);
        Kapitel.setText("E-Mail Sicherheitscheck");

        Teaser = (TextView) findViewById(R.id.textView6);
        Teaser.setText("Wurden schon einmal E-Mails in Deinem Namen ohne Dein Wissen versendet? Oder wurde Dein Facebook-Account gehackt? Dann mache jetzt den E-Mail Sicherheitscheck!");

        Informationstext = (TextView) findViewById(R.id.textView5);
        Informationstext.setText("Häufig werden E-Mailadressen zum Ziel von Hackerangriffen. Durch den illegalen Zugang zu privaten E-Mail Accounts können Hacker diese zum Versand von SPAM-Mails missbrauchen. Zudem besteht die Gefahr, dass Dein Zugang den sozialen Netzwerken und Online-Shops, die mit den Mailadressen verknüpft sind nicht mehr gesichert ist. Daher ist es wichtig sein privates Konto gut zu schützen. Teste unter folgendem Link, ob Dein Mail-Account schon einmal zum Ziel eines Hackerangriffs wurde: \n");

        Link = (TextView) findViewById(R.id.textView7);
        Link.setText("https://haveibeenpwned.com/");
    }

    //Zurück in das Menü
    public void goback(View v)
    {
        Intent intent = new Intent(this, Check.class);
        startActivity(intent);
    }
}