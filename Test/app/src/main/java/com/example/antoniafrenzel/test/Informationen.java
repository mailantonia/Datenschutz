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

public class Informationen extends AppCompatActivity {

    private Auswahl_Informationen N_Infos = new Auswahl_Informationen();
    private TextView Textfeld;
    private Button But_Weiter;
    private Button But_Zurück;
    int InfoArrayNumber = 1;
    int InfoArrayStandort = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informationen);

        //Variablen zuweisen aus Designer
        Textfeld = (TextView) findViewById(R.id.textView4);
        But_Weiter = (Button) findViewById(R.id.button9);
        But_Zurück = (Button) findViewById(R.id.button10);

        //Funktion aufrufen, um Textfeld aus Array zu füllen
        updatedInfos();
    }

    //Button Weiter
     public void Button_Click(View v)
     {
         InfoArrayNumber = InfoArrayNumber + 1;
         if (InfoArrayNumber == 7)
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
    }

    //Button Informationen abbrechen
    public void starttoInformation(View v)
    {
        Intent intent = new Intent(this, Seite3.class);
        startActivity(intent);
    }

    //Text aus Array setzten
    private void updatedInfos()
    {
        Textfeld.setText(N_Infos.getInfo(InfoArrayNumber));
    }

}