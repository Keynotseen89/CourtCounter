package com.example.kench.courtcounter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Score for Team A
    int scoreTeam = 0;

    //Score for Team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Sets Team A Score
        displayScoreTA(scoreTeam);
        //Sets Team B Score
        displayScoreTB(scoreTeamB);
    }

    //Set the Score for Team A to 3
    public void threePoints(View v){
        scoreTeam = scoreTeam + 3;
        displayScoreTA(scoreTeam);
    }

    //adds two points to team A
    public void twoPoints(View v){
        scoreTeam = scoreTeam + 2;
        displayScoreTA (scoreTeam);
    }

    //Adds a one point to Team A
    public void freeThrow(View v){
        scoreTeam = scoreTeam + 1;
        displayScoreTA(scoreTeam);
    }
    //Adds three points to TeamB
    public void threeForTeamB(View v){
        scoreTeamB = scoreTeamB + 3;
        displayScoreTB(scoreTeamB);
    }
    //Adds two points to Team B
    public void twoForTeamB(View v){
        scoreTeamB = scoreTeamB + 2;
        displayScoreTB(scoreTeamB);
    }
    //Adds one point to TeamB
    public void oneForTeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayScoreTB(scoreTeamB);
    }

    //Resets score for Team A/B back
    //Zero
    public void resetScore(View v){
        scoreTeam = 0;
        scoreTeamB = 0;
        displayScoreTA(scoreTeam);
        displayScoreTB(scoreTeamB);
    }

    //displays the score for Team A
    public void displayScoreTA(int score){
        TextView viewScore = (TextView) findViewById(R.id.team_score);
        viewScore.setText(String.valueOf(score));
    }
    //displays the score for Team B
    public void displayScoreTB(int scoreB){
        TextView viewScore = (TextView) findViewById(R.id.team_b_score);
        viewScore.setText(String.valueOf(scoreB));
    }


}
