package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Informationen extends AppCompatActivity {

    //Initialisierung der Variablen
    private Auswahl_Informationen N_Infos = new Auswahl_Informationen();
    private TextView Textfeld;
    private TextView Textfeld_Zähler_Folien;
    private Button But_Weiter;
    private Button But_Zurück;
    int InfoArrayNumber = 0;
    int FolienNummer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informationen);

        //Variablen zuweisen aus Designer
        Textfeld = (TextView) findViewById(R.id.textView4);
        Textfeld_Zähler_Folien = (TextView) findViewById(R.id.textView3);
        But_Weiter = (Button) findViewById(R.id.button9);
        But_Zurück = (Button) findViewById(R.id.button10);

        But_Weiter.setVisibility(View.VISIBLE);
        But_Zurück.setVisibility(View.INVISIBLE);

        //Funktion aufrufen, um Textfeld aus Array zu füllen
        updatedInfos();
        Folien_Zähler();
    }

    //Button Weiter
     public void Button_Click(View v)
     {
         InfoArrayNumber = InfoArrayNumber + 1;
         if (InfoArrayNumber == (N_Infos.Infos.length-1))
         {
             But_Weiter.setVisibility(View.INVISIBLE);
             But_Zurück.setVisibility(View.VISIBLE);
         }
         else
         {
             But_Weiter.setVisibility(View.VISIBLE);
             But_Zurück.setVisibility(View.VISIBLE);
         }

         updatedInfos();
         Folien_Zähler();
     }

    //Button Zurück
    public void Button_Click_Zurück(View v)
    {
        InfoArrayNumber = InfoArrayNumber - 1;
        if (InfoArrayNumber == 0)
        {
            But_Weiter.setVisibility(View.VISIBLE);
            But_Zurück.setVisibility(View.INVISIBLE);
        }
        else
        {
            But_Weiter.setVisibility(View.VISIBLE);
            But_Zurück.setVisibility(View.VISIBLE);
        }

        updatedInfos();
        Folien_Zähler();
    }

    //Button Informationen abbrechen
    public void starttoInformation(View v)
    {
        Intent intent = new Intent(this, Informationen_Menue.class);
        startActivity(intent);
    }

    //Text aus Array setzten
    private void updatedInfos()
    {
        Textfeld.setText(N_Infos.getInfo(InfoArrayNumber));
    }

    //Folien Zähler
    private void Folien_Zähler()
    {
        FolienNummer = InfoArrayNumber +1;
        Textfeld_Zähler_Folien.setText("Folie " + FolienNummer + " von " + N_Infos.Infos.length);
    }
}