package com.varma.sunil.scorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    //  Score for Team A
    int scoreOfTeamA = 0;

    //  Score for Team B
    int scoreOfTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
    }
    
    public void addOneForTeamA(View v) {
        scoreOfTeamA = scoreOfTeamA + 1;
        displayForTeamA(scoreOfTeamA);
    }

    public void addTwoForTeamA(View v) {
        scoreOfTeamA = scoreOfTeamA + 2;
        displayForTeamA(scoreOfTeamA);
    }

    public void addThreeForTeamA(View v) {
        scoreOfTeamA = scoreOfTeamA + 3;
        displayForTeamA(scoreOfTeamA);
    }

    public void addOneForTeamB(View v) {
        scoreOfTeamB = scoreOfTeamB + 1;
        displayForTeamB(scoreOfTeamB);
    }

    public void addTwoForTeamB(View v) {
        scoreOfTeamB = scoreOfTeamB + 2;
        displayForTeamB(scoreOfTeamB);
    }

    public void addThreeForTeamB(View v) {
        scoreOfTeamB = scoreOfTeamB + 3;
        displayForTeamB(scoreOfTeamB);
    }

    public void resetScore(View v) {
        scoreOfTeamA = 0;
        scoreOfTeamB = 0;
        displayForTeamA(scoreOfTeamA);
        displayForTeamB(scoreOfTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView =  findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView =  findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}