package com.example.antoniafrenzel.test;

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
    int InfoArrayNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informationen);

        //Variablen zuweisen aus Designer
        Textfeld = (TextView) findViewById(R.id.textView4);
        But_Weiter = (Button) findViewById(R.id.button10);
        But_Zurück = (Button) findViewById(R.id.button9);

        //Funktion aufrufen, um Textfeld aus Array zu füllen
        updatedInfos();
    }

    //Button Weiter
     public void Button_Click(View v)
     {
         InfoArrayNumber = InfoArrayNumber + 1;
         if (InfoArrayNumber > 4)
         {/*Verweis aus Activity Seite 3*/}
         else updatedInfos();
     }

    //Button Zurück
    public void Button_Click_Zurück(View v)
    {
        InfoArrayNumber = InfoArrayNumber - 1;
        if (InfoArrayNumber < 0)
        {}
        else updatedInfos();
    }

    //Text aus Array setzten
    private void updatedInfos()
    {
        Textfeld.setText(N_Infos.getInfo(InfoArrayNumber));
    }
}