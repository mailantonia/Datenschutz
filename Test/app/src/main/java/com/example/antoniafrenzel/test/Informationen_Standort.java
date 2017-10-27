package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Clara on 19.10.2017.
 */

public class Informationen_Standort extends AppCompatActivity {

    //Initialisierung der Variablen
    private Auswahl_Informationen N_InfoStandort = new Auswahl_Informationen();
    private TextView Textfeld_2;
    private TextView Textfeld_Zähler_Folien;
    private Button Weiter_Button;
    private Button Zurück_Button;
    int InfoArrayStandort = 0;
    int FolienNummer = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_informationen);

            //Variablen zuweisen aus Designer
            Textfeld_2 = (TextView) findViewById(R.id.textView4);
            Textfeld_Zähler_Folien = (TextView) findViewById(R.id.textView3);
            Weiter_Button = (Button) findViewById(R.id.button9);
            Zurück_Button = (Button) findViewById(R.id.button10);

            Weiter_Button.setVisibility(View.VISIBLE);
            Zurück_Button.setVisibility(View.INVISIBLE);

            //Funktion aufrufen, um Textfeld aus Array zu füllen
            standortInfos();
            Folien_Zähler();
        }

    //Button Weiter
    public void Button_Click(View v)
    {
        InfoArrayStandort = InfoArrayStandort + 1;
        if (InfoArrayStandort == (N_InfoStandort.Standort.length-1))
        {
            Weiter_Button.setVisibility(View.INVISIBLE);
            Zurück_Button.setVisibility(View.VISIBLE);
        }
        else
        {
            Weiter_Button.setVisibility(View.VISIBLE);
            Zurück_Button.setVisibility(View.VISIBLE);
        }

        standortInfos();
        Folien_Zähler();
    }

    //Button Zurück
    public void Button_Click_Zurück(View v)
    {
        InfoArrayStandort = InfoArrayStandort - 1;
        if (InfoArrayStandort == 0)
        {
            Weiter_Button.setVisibility(View.VISIBLE);
            Zurück_Button.setVisibility(View.INVISIBLE);
        }
        else
        {
            Weiter_Button.setVisibility(View.VISIBLE);
            Zurück_Button.setVisibility(View.VISIBLE);
        }

        standortInfos();
        Folien_Zähler();
    }

    //Button Informationen abbrechen
    public void starttoInformation(View v)
    {
        Intent intent = new Intent(this, Informationen_Menue.class);
        startActivity(intent);
    }

     //Text aus Standort Array setzten
     private void standortInfos()
     {
         Textfeld_2.setText(N_InfoStandort.getInfoStandort(InfoArrayStandort));
     }

    //Folien Zähler
    private void Folien_Zähler()
    {
        FolienNummer = InfoArrayStandort +1;
        Textfeld_Zähler_Folien.setText("Folie " + FolienNummer + " von " + N_InfoStandort.Standort.length);
    }
}