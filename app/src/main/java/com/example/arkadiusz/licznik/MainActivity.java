package com.example.arkadiusz.licznik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int wynikA = 0, wynikB =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(wynikA);
    }

    public void displayForTeamA(int scoreA) {
        TextView scoreView = findViewById(R.id.scoreTeamA);
        scoreView.setText(String.valueOf(scoreA));
    }
    public void addA1 (View v){
        wynikA = wynikA+1;
        displayForTeamA(wynikA);
    }
    public void addA2 (View v){
        wynikA = wynikA+2;
        displayForTeamA(wynikA);
    }
    public void addA3 (View v){
        wynikA = wynikA+3;
        displayForTeamA(wynikA);
    }
    public void displayForTeamB(int scoreB) {
        TextView scoreView = findViewById(R.id.scoreTeamB);
        scoreView.setText(String.valueOf(scoreB));
    }
    public void addB1 (View v){
        wynikB = wynikB+1;
        displayForTeamB(wynikB);
    }
    public void addB2 (View v){
        wynikB = wynikB+2;
        displayForTeamB(wynikB);
    }
    public void addB3 (View v){
        wynikB = wynikB+3;
        displayForTeamB(wynikB);
    }
    public void reset (View v){
        wynikA = 0;
        wynikB = 0;
        displayForTeamA(wynikA);
        displayForTeamB(wynikB);
        Toast.makeText(this, "Wyzerowano wyniki", Toast.LENGTH_SHORT).show();
    }
}
