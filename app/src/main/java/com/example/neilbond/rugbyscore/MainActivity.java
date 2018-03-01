package com.example.neilbond.rugbyscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void plus2A(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);

    }

    public void plus3A(View view) {
        scoreA = scoreA + 3;
        displayA(scoreA);

    }


    public void plus5A(View view) {
        scoreA = scoreA + 5;
        displayA(scoreA);
    }


    public void plus2B(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }


    public void plus3B(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }


    public void plus5B(View view) {
        scoreB = scoreB + 5;
        displayB(scoreB);
    }


    public void displayA(int number){
        TextView displayATextView= findViewById(R.id.teamASore);
        displayATextView.setText(""+number);
    }


    public void displayB(int number){
        TextView displayBTextView= findViewById(R.id.teamBScore);
        displayBTextView.setText(""+number);
    }



    public void resetss (View view){
        scoreA=0;
        scoreB=0;

        displayA(scoreA);
        displayB(scoreB);
    }

}
