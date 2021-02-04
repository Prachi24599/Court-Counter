package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /* Team A
    * This Method will display the score for Team A */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /* This Method will add 3 to the score for Team A */
    public void addThreeForTeamA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    /* This Method will add 2 to the score for Team A */
    public void addTwoForTeamA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    /* This Method will add 1 to the score for Team A */
    public void addFreeForTeamA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    /*Team B
    * This Method will display the score for Team B */
    public void displayForTeamB(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /* This Method will add 3 to the score for Team B */
    public void addThreeForTeamB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    /* This Method will add 2 to the score for Team B */
    public void addTwoForTeamB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    /* This Method will add 1 to the score for Team B */
    public void addFreeForTeamB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    /* This Method will reset the score of both Team A and Team B to ) */
    public void resetScoreForBothTeams(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}