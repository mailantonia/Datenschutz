package com.example.antoniafrenzel.test;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;  //evtl falsch...
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class Quiz extends AppCompatActivity {

    private Auswahl_Fragen mAuswahlFragen = new Auswahl_Fragen();

    private TextView mPunkteAnsicht;
    private TextView mAnzFrage;
    private TextView mFragenAnsicht;
    private Button mButtonAuswahl1;
    private Button mButtonAuswahl2;
    private Button mButtonAuswahl3;
    private Button mButtonBack;
    private String mAntwort;
    private int mPunkte = 0;
    private int mFragennummer = 0;
    private int AnzFragen = 0;
    private String u=" ";
    private int Zufallszahl = 0;
    private  boolean[] Hilfsfeld_Zufallszahlen = new boolean[mAuswahlFragen.mQuestions.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Arrays.fill(Hilfsfeld_Zufallszahlen, false);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mPunkteAnsicht =(TextView)findViewById(R.id.score);
        mAnzFrage = (TextView)findViewById(R.id.AnzFrage);
        mFragenAnsicht = (TextView)findViewById(R.id.question);
        mButtonAuswahl1 = (Button)findViewById(R.id.buttonA);
        mButtonAuswahl2 = (Button)findViewById(R.id.buttonB);
        mButtonAuswahl3 = (Button)findViewById(R.id.buttonC);
        mButtonBack = (Button)findViewById(R.id.buttonD);
        updateQuestions();

        //Start des Lesens von Button1
        mButtonAuswahl1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                if (mButtonAuswahl1.getText()== mAntwort){
                    mPunkte = mPunkte +1;
                    updateScore(mPunkte);
                    updateQuestions();
                    //Optional Falsch/Richtig anzeigen
                    Toast.makeText(Quiz.this, "Richtig", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Quiz.this, "Falsch! Richtige Antwort: " + mAntwort, Toast.LENGTH_LONG).show();
                    updateQuestions();
                }
            }
        });
        // Ende des lesens von Button1
        //Start Button2
        mButtonAuswahl2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                if (AnzFragen==11)
                {
                    goToInformation();
                }
                else {
                    if (mButtonAuswahl2.getText() == mAntwort) {
                        mPunkte = mPunkte + 1;
                        updateScore(mPunkte);
                        updateQuestions();
                        //Optional Falsch/Richtig anzeigen
                        Toast.makeText(Quiz.this, "Richtig", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Quiz.this, "Falsch! Richtige Antwort: " + mAntwort, Toast.LENGTH_LONG).show();
                        updateQuestions();
                    }
                }
            }
        });
        //Ende Button2
        //Start Button3
        mButtonAuswahl3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                if (AnzFragen==11){
                       goToCheck();
                }
                else {
                    if (mButtonAuswahl3.getText() == mAntwort) {
                        mPunkte = mPunkte + 1;
                        updateScore(mPunkte);
                        updateQuestions();
                        //Falsch/Richtig wird angezeigt
                        Toast.makeText(Quiz.this, "Richtig", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Quiz.this, "Falsch! Richtige Antwort: " + mAntwort, Toast.LENGTH_LONG).show();
                        updateQuestions();
                    }
                }
            }
        });
        //Ende Button3
    }
    private int createZufall(){
        while (true){
            Zufallszahl= (int) (Math.random()*(mAuswahlFragen.mQuestions.length - 0));//Maximale Zahl minus minimale Zahl
            if (Hilfsfeld_Zufallszahlen[Zufallszahl]==false){
                break;
           }
        }
        Hilfsfeld_Zufallszahlen[Zufallszahl]=true;
        return Zufallszahl;
    }
    private void updateQuestions(){

        if (AnzFragen==10)
        {
            mAnzFrage.setVisibility(View.INVISIBLE);
            mButtonAuswahl1.setVisibility(View.INVISIBLE);
            mButtonAuswahl2.setVisibility(View.INVISIBLE);
            mButtonAuswahl3.setVisibility(View.INVISIBLE);
            mButtonBack.setText("Zurück");
            AnzFragen++;
            if (mPunkte ==10) {
                mFragenAnsicht.setText(Html.fromHtml("Das Quiz ist beendet." + "<br>"+
                        "Du hast " + "<font color=#FF0080>"+mPunkte+"</font>" + " von "+"<font color=#FF0080>"+"10 "+"</font>"+ "Punkten." +"<br>"+
                        "Du bist ein echter Datenschutzheld. Ein großes Lob an dich! Halte die Augen weiter so offen!"));
            }
            else if (mPunkte <10 && (mPunkte >5)) {
                mFragenAnsicht.setText(Html.fromHtml("Das Quiz ist beendet." + "<br>"+
                        "Du hast " + "<font color=#FF0080>"+mPunkte+"</font>" + " von "+"<font color=#FF0080>"+"10 "+"</font>"+ "Punkten." +"<br>"+
                        "Du bist ein durchschnittlicher Datenschutzkenner! Du bist schon auf einem guten Weg, doch halte stets deine Augen offen, damit deine Daten sicher bleiben!"+"<br>"+
                "Unter Check findest du Tipps, wie du dich schützen kannst."));
                mButtonAuswahl3.setVisibility(View.VISIBLE);
                mButtonAuswahl3.setText("zum Check");
                mButtonAuswahl3.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
            }
            else
            {
                mFragenAnsicht.setText(Html.fromHtml("Das Quiz ist beenden." +"<br>"+
                        "Du hast " + "<font color=#FF0080>"+mPunkte+"</font>" + " von "+"<font color=#FF0080>"+"10 "+"</font>"+ "Punkten." +"<br>"+
                        "Du bist ein Datenschutzmuffel. Halte deine Daten gut im Blick, bevor sie weg sind!" +"<br>"+
                        "Lese dir unsere Informationen durch. Unter Check findest du Tipps, wie du dich schützen kannst."));
                mButtonAuswahl2.setVisibility(View.VISIBLE);
                mButtonAuswahl2.setText("zu den Informationen");
                mButtonAuswahl3.setVisibility(View.VISIBLE);
                mButtonAuswahl2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                mButtonAuswahl3.setText("zum Check");
                mButtonAuswahl3.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
            }
        }
        else {

            mAnzFrage.setText(AnzFragen+1 + ". Frage in insgesamt 10");
            mFragennummer= createZufall();

            mFragenAnsicht.setText(mAuswahlFragen.getFrage(mFragennummer));
            mButtonAuswahl1.setText(mAuswahlFragen.getAuswahl1(mFragennummer));
            mButtonAuswahl2.setText(mAuswahlFragen.getAuswahl2(mFragennummer));
            if (mAuswahlFragen.getAuswahl3(mFragennummer)==u)   //Bei Wahr/Flasch-Fragen wird Button nicht gebraucht. Wenn u Leer ist, wird Button 3 unsichtbar gemacht
            {
                mButtonAuswahl3.setVisibility(View.INVISIBLE);
            }
            else
            {
                mButtonAuswahl3.setVisibility(View.VISIBLE);   //Button wird wieder sichtbar gemacht
                mButtonAuswahl3.setText(mAuswahlFragen.getAuswahl3(mFragennummer));
            }
            mAntwort = mAuswahlFragen.getCorrectAnswer(mFragennummer);
            AnzFragen++;
        }
    }
    private void updateScore (int point){
        mPunkteAnsicht.setText(""+ mPunkte);
    }

    //Dialog "Quiz wirklich beenden?"
    public void startNewActivity(View v) {
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Quiz abbrechen");
        alertDialog.setMessage("Möchtest du das Quiz wirklich abbrechen?");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL,"Ja",
                new DialogInterface.OnClickListener(){
                    public  void onClick(DialogInterface dialog, int witch){
                        dialog.dismiss();
                        goBackToMainActivity();
                    }
                });
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE,"Nein",
                new DialogInterface.OnClickListener(){
                    public  void onClick(DialogInterface dialog, int witch){
                        dialog.cancel();
                    }
                });
        alertDialog.show();
    }
    //Funktion zum Zurück ins Main-Menü
    private  void goBackToMainActivity(){
        Intent intent = new Intent(this, Quiz_Start.class);
        startActivity(intent);
    }
    //Funktion für Link zum Check
    private  void goToCheck(){
        Intent intent = new Intent(this, Check.class);
        startActivity(intent);
    }

    private  void goToInformation(){
        Intent intent = new Intent(this, Informationen_Menue.class);
        startActivity(intent);
    }
}

