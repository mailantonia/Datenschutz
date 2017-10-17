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

    private TextView N_textView3;
    private Button But_Weiter;
    int InfoArrayNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informationen);

        //Variablen zuweisen aus Designer
        N_textView3 = (TextView) findViewById(R.id.textView3);
        But_Weiter = (Button) findViewById(R.id.button7);

        //Funktion aufrufen, um Textfeld aus Array zu füllen
        updatedInfos();
    }

    //Button_Weiter
     public void Button_Click(View v)
     {

         InfoArrayNumber = InfoArrayNumber + 1;
         updatedInfos();

         //But_Weiter.setText("Hallo" + InfoArrayNumber);
     }

    //Text aus Array setzten
    private void updatedInfos()
    {
        N_textView3.setText(N_Infos.getInfo(InfoArrayNumber));
    }
}
