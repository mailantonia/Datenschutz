package com.example.antoniafrenzel.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        final android.view.MenuItem aboutTheAppItem = menu.getItem(0);
        //Wenn das Main-Menü geklickt wird
        aboutTheAppItem.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {
                MainActivity.this.startNewImpressum(null);
                return true;
            }
        });
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    //Funktion zum Starten des Quiz
    public void StarttoQuiz(View v) {

        Intent intent = new Intent(this, Quiz_Start.class);
        startActivity(intent);
    }
    //Funktion zum Starten der Informationen
    public void starttoInformation(View v) {

        Intent intent = new Intent(this, Informationen_Menue.class);
        startActivity(intent);
    }
    //Funktion zum des Check
    public void starttoCheck(View v) {

        Intent intent = new Intent(this, Check.class);
        startActivity(intent);
    }
    //Funktion zum Start des Impressums
    public void startNewImpressum(View v) {

        Intent intent = new Intent(this, Impressum.class);
        startActivity(intent);
    }
}