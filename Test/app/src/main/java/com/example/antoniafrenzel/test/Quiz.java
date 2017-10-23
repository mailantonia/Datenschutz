package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    private AuswahlFragen mAuswahlFragen = new AuswahlFragen();

    private TextView mScoreView;
    private TextView mAnzFrage;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonBack;
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;
    private int AnzFragen = 0;
    private String u="unwichtig";
    private int Zufallszahl = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView =(TextView)findViewById(R.id.score);
        mAnzFrage = (TextView)findViewById(R.id.AnzFrage);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.buttonA);
        mButtonChoice2 = (Button)findViewById(R.id.buttonB);
        mButtonChoice3 = (Button)findViewById(R.id.buttonC);
        mButtonBack = (Button)findViewById(R.id.buttonD);
        updateQuestions();

        //Start des Lesens von Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                if (mButtonChoice1.getText()== mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestions();
                    //Optional Falsch/Richtig anzeigen
                    Toast.makeText(Quiz.this, "Richtig", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Quiz.this, "Falsch! Richtige Antwort: " + mAnswer, Toast.LENGTH_LONG).show();
                    updateQuestions();
                }
            }
        });
        // Ende des lesens von Button1
        //Start Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                if (mButtonChoice2.getText()== mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestions();
                    //Optional Falsch/Richtig anzeigen
                    Toast.makeText(Quiz.this, "Richtig", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Quiz.this, "Falsch! Richtige Antwort: " + mAnswer, Toast.LENGTH_LONG).show();
                    updateQuestions();
                }
            }
        });
        //Ende Button2
        //Start Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                if (mButtonChoice3.getText()== mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestions();
                    //Falsch/Richtig wird angezeigt
                    Toast.makeText(Quiz.this, "Richtig", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Quiz.this, "Falsch! Richtige Antwort: " + mAnswer, Toast.LENGTH_LONG).show();
                    updateQuestions();
                }
            }
        });
        //Ende Button3
    }
    private int createZufall(){
        Zufallszahl= (int) (Math.random()*(mAuswahlFragen.mQuestions.length - 0));//Maximale Zahl minus minimale Zahl
        return Zufallszahl;
    }
    private void updateQuestions(){

        if (AnzFragen==10)
        {
            mAnzFrage.setVisibility(View.INVISIBLE);
            mButtonChoice1.setVisibility(View.INVISIBLE);
            mButtonChoice2.setVisibility(View.INVISIBLE);
            mButtonChoice3.setVisibility(View.INVISIBLE);
            mButtonBack.setText("Zurück");
            if (mScore == 10) {
                mQuestionView.setText("Quiz beendet! \n\n" +
                        "Du hast " + mScore + " von 10 Punkten.\n" +
                        "Du bist ein echter Datenschutzheld. Halte die Augen weiter so offen!");
            }
            if (mScore <10 && (mScore >5)) {
                mQuestionView.setText("Quiz beendet! \n\n" +
                        "Du hast " + mScore + " von 10 Punkten.\n" +
                        "Du bist ein Datenschutzzwerg! Du bist schon auf einem guten Weg, doch halte stehts deine Augen offen, damit deine Daten sicher bleiben!");
            }
            else
            {
                mQuestionView.setText("Quiz beendet! \n\n" +
                        "Du hast " + mScore + " von 10 Punkten.\n" +
                        "Du bist ein Datenschutzmuffel. Halte deine Daten gut im Blick, bevor sie weg sind!");
            }
        }
        else {
            mAnzFrage.setText(AnzFragen+1 + ". Frage in insgesamt " + 10);
            mQuestionNumber= createZufall();
            mQuestionView.setText(mAuswahlFragen.getFrage(mQuestionNumber));
            mButtonChoice1.setText(mAuswahlFragen.getAuswahl1(mQuestionNumber));
            mButtonChoice2.setText(mAuswahlFragen.getAuswahl2(mQuestionNumber));
            if (mAuswahlFragen.getAuswahl3(mQuestionNumber)==u)
            {
                mButtonChoice3.setVisibility(View.INVISIBLE);
            }
            else
            {
                mButtonChoice3.setVisibility(View.VISIBLE);
                mButtonChoice3.setText(mAuswahlFragen.getAuswahl3(mQuestionNumber));
            }
            mAnswer = mAuswahlFragen.getCorrectAnswer(mQuestionNumber);
            AnzFragen++;
            //mQuestionNumber++;
        }
    }
    private void updateScore (int point){
        mScoreView.setText(""+mScore);
    }
    public void startNewActivity(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}