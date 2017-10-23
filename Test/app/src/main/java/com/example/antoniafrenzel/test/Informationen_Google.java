package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.graphics.ImageFormat;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Clara on 19.10.2017.
 */

public class Informationen_Google extends AppCompatActivity {

    private Auswahl_Informationen N_InfoGoogle = new Auswahl_Informationen();
    private TextView Textfeld_2;
    private Button Weiter_Button;
    private Button Zurück_Button;
    int InfoArrayGoogle = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informationen);

        //Variablen zuweisen aus Designer
        Textfeld_2 = (TextView) findViewById(R.id.textView4);
        Weiter_Button = (Button) findViewById(R.id.button9);
        Zurück_Button = (Button) findViewById(R.id.button10);

        Weiter_Button.setVisibility(View.VISIBLE);
        Zurück_Button.setVisibility(View.INVISIBLE);

        //Funktion aufrufen, um Textfeld aus Array zu füllen
        googleInfos();
    }

    //Button Weiter
    public void Button_Click(View v)
    {
        InfoArrayGoogle = InfoArrayGoogle + 1;
        if (InfoArrayGoogle == 5)
        {
            Weiter_Button.setVisibility(View.INVISIBLE);
            Zurück_Button.setVisibility(View.VISIBLE);
        }
        else
        {
            Weiter_Button.setVisibility(View.VISIBLE);
            Zurück_Button.setVisibility(View.VISIBLE);
        }

        googleInfos();
    }

    //Button Zurück
    public void Button_Click_Zurück(View v)
    {
        InfoArrayGoogle = InfoArrayGoogle - 1;
        if (InfoArrayGoogle == 0)
        {
            Weiter_Button.setVisibility(View.VISIBLE);
            Zurück_Button.setVisibility(View.INVISIBLE);
        }
        else
        {
            Weiter_Button.setVisibility(View.VISIBLE);
            Zurück_Button.setVisibility(View.VISIBLE);
        }

        googleInfos();
    }

    //Button Informationen abbrechen
    public void starttoInformation(View v)
    {
        Intent intent = new Intent(this, Seite3.class);
        startActivity(intent);
    }

    //Text aus Standort Array setzten
    private void googleInfos()
    {
        Textfeld_2.setText(N_InfoGoogle.getInfoGoogle(InfoArrayGoogle));
    }
}