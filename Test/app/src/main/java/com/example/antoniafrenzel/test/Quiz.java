package com.example.antoniafrenzel.test;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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

    @Override       //Seite wird gestartet
    protected void onCreate(Bundle savedInstanceState) {
        Arrays.fill(Hilfsfeld_Zufallszahlen, false);           //Hilfsfeld für Zufallszahlen werden auf false gesetzt
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
          //Zuweisung der Felder an Variablen
        mPunkteAnsicht =(TextView)findViewById(R.id.score);
        mAnzFrage = (TextView)findViewById(R.id.AnzFrage);
        mFragenAnsicht = (TextView)findViewById(R.id.question);
        mButtonAuswahl1 = (Button)findViewById(R.id.buttonA);
        mButtonAuswahl2 = (Button)findViewById(R.id.buttonB);
        mButtonAuswahl3 = (Button)findViewById(R.id.buttonC);
        mButtonBack = (Button)findViewById(R.id.buttonD);
        updateQuestions();                 //Eine neue Frage wird geladen

        //Start des Lesens von Button1
        mButtonAuswahl1.setOnClickListener(new View.OnClickListener(){       //setOnClickListener gibt Befehl, was geschieht, wenn Button gedrückt wird
            public void onClick(View view){                        //OnClick-Funktion
                if (mButtonAuswahl1.getText()== mAntwort){         //Wenn Text von Button die Antwort entspricht
                    mPunkte = mPunkte +1;                          //Punktzahl erhöhen
                    updateScore(mPunkte);                          //Punktanzeige wird aktualisiert
                    updateQuestions();                             //neue Frage wird geladen
                    //Optional Falsch/Richtig anzeigen
                    Toast.makeText(Quiz.this, "Richtig", Toast.LENGTH_SHORT).show();   //Tost "Richtig" wird gezeigt
                }
                else {
                    Toast.makeText(Quiz.this, "Falsch! Richtige Antwort: " + mAntwort, Toast.LENGTH_LONG).show(); //Toast mit "Falsch" und richtige Antwort zeigen
                    updateQuestions();                               //neue Frage laden
                }
            }
        });
        // Ende des lesens von Button1

        //Start Button2 -> wie Button 1
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

        //Start Button3    -> wie Button 1
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
    //Funktion zum Erstellen einer Zufallszahl
    private int createZufall(){
        while (true){             //Schleife solange true ist
            Zufallszahl= (int) (Math.random()*(mAuswahlFragen.mQuestions.length - 0));//Maximale Zahl minus minimale Zahl
            if (Hilfsfeld_Zufallszahlen[Zufallszahl]==false){ //Wenn es Zufallszahl noch nicht gab, wird abgebrochen. Sonst wird solange eine Zahl generiert, bis eine neue Zahl dabei ist
                break;
           }
        }
        Hilfsfeld_Zufallszahlen[Zufallszahl]=true;    //Hilfsfeld wird an Stelle Zufallszahl auf true gesetzt
        return Zufallszahl;                           //Zufallszahl wird zurück gegeben
    }
    //Funktion laden einer neuen Frage
    private void updateQuestions(){
         //Wenn 10 Fragen angezeigt wurden sind
        if (AnzFragen==10)
        {
            mAnzFrage.setVisibility(View.INVISIBLE);        //Feld mit Anzahl der Fragen unsichtbar setzen
            mButtonAuswahl1.setVisibility(View.INVISIBLE);    //Button 1 unsichtbar setzten
            mButtonAuswahl2.setVisibility(View.INVISIBLE);    //Button 1 unsichtbar setzten
            mButtonAuswahl3.setVisibility(View.INVISIBLE);    //Button 1 unsichtbar setzten
            mButtonBack.setText("Zurück");                    //ButtonBack wird umbenannt
            AnzFragen++;//AnzFragen wird hochgezählt, damit sich der OnClick-Befehl bei Button 1 und 2 ändert
            //Wenn volle Punktzahl
            if (mPunkte ==10) {
                mFragenAnsicht.setText(Html.fromHtml("Das Quiz ist beendet." + "<br>"+
                        "Du hast " + "<font color=#FF0080>"+mPunkte+"</font>" + " von "+"<font color=#FF0080>"+"10 "+"</font>"+ "Punkten." +"<br>"+
                        "Du bist ein echter Datenschutzheld. Ein großes Lob an dich! Halte die Augen weiter so offen!"));
            }
            //Es wurde hier html verwendet, damit die Punkte hervorgehoben werden können
            else if (mPunkte <10 && (mPunkte >5)) {
                mFragenAnsicht.setText(Html.fromHtml("Das Quiz ist beendet." + "<br>"+
                        "Du hast " + "<font color=#FF0080>"+mPunkte+"</font>" + " von "+"<font color=#FF0080>"+"10 "+"</font>"+ "Punkten." +"<br>"+
                        "Du bist ein durchschnittlicher Datenschutzkenner! Du bist schon auf einem guten Weg, doch halte stets deine Augen offen, damit deine Daten sicher bleiben!"+"<br>"+
                "Unter Check findest du Tipps, wie du dich schützen kannst."));
                mButtonAuswahl3.setVisibility(View.VISIBLE); //Button 3 wird wieder sichtbar gemacht.
                mButtonAuswahl3.setText("zum Check");         //Button 3 Änderung des Textes
                mButtonAuswahl3.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light)); //Button 3 Änderung der Farbe
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
        else {       //Wenn AnzFragen noch nicht 10 beträgt

            mAnzFrage.setText(AnzFragen+1 + ". Frage in insgesamt 10");       //Anzeige der Nummer der Frage
            mFragennummer= createZufall();                                    //Zufallszahl wird für mFragennummer erstellt

            mFragenAnsicht.setText(mAuswahlFragen.getFrage(mFragennummer));    //Frage von Stelle mFragennummer aus dem Feld der Klasse "AuswahlFragen" laden
            mButtonAuswahl1.setText(mAuswahlFragen.getAuswahl1(mFragennummer));
            mButtonAuswahl2.setText(mAuswahlFragen.getAuswahl2(mFragennummer));
            if (mAuswahlFragen.getAuswahl3(mFragennummer)==u)   //Bei Wahr/Flasch-Fragen wird Button nicht gebraucht. Wenn u Leer ist, wird Button 3 unsichtbar gemacht
            {
                mButtonAuswahl3.setVisibility(View.INVISIBLE);       //Button 3 wird unsichtbar
            }
            else
            {
                mButtonAuswahl3.setVisibility(View.VISIBLE);   //Button wird wieder sichtbar gemacht
                mButtonAuswahl3.setText(mAuswahlFragen.getAuswahl3(mFragennummer));
            }
            mAntwort = mAuswahlFragen.getCorrectAnswer(mFragennummer);
            AnzFragen++;                                      //Anzahl Fragen erhöhen
        }
    }
    private void updateScore (int point){                    //Punkteanzahl erhöhen
        mPunkteAnsicht.setText(""+ mPunkte);
    }

    //Dialog "Quiz wirklich beenden?"
    public void startNewActivity(View v) {
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();     //Dialogfenster erstellen
        alertDialog.setTitle("Quiz abbrechen");                                //Titel des Dialogfensters
        alertDialog.setMessage("Möchtest du das Quiz wirklich abbrechen?");     //Messages des Dialogfensters
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL,"Ja",
                new DialogInterface.OnClickListener(){            //Wenn JA gedrückt wird
                    public  void onClick(DialogInterface dialog, int witch){
                        dialog.dismiss();                    //Dialog schließen
                        goBackToMainActivity();               //Funktion zum Zurück ins Menü
                    }
                });
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE,"Nein",
                new DialogInterface.OnClickListener(){                 //Wenn auf NEIN gedrückt wird
                    public  void onClick(DialogInterface dialog, int witch){
                        dialog.cancel();                              //Dialog wird geschlossen
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
    //Funktion für Link zu Informationen
    private  void goToInformation(){
        Intent intent = new Intent(this, Informationen_Menue.class);
        startActivity(intent);
    }
}

