package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int teamAYellows = 0;
    int teamAReds = 0;
    int teamBYellows = 0;
    int teamBReds = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase yellow cards for Team A by 1 card.
     */
    public void addYellowForTeamA(View v) {
        teamAYellows = teamAYellows + 1;
        displayYellowsTeamA(teamAYellows);
    }

    /**
     * Increase red cards for Team A by 1 card.
     */
    public void addRedForTeamA(View v) {
        teamAReds = teamAReds + 1;
        displayRedsTeamA(teamAReds);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red cards for Team A.
     */
    public void displayRedsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_reds);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayYellowsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellows);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red cards for Team B.
     */
    public void displayRedsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_reds);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given yellow cards for Team B.
     */
    public void displayYellowsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellows);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase yellow cards for Team B by 1 card.
     */
    public void addYellowForTeamB(View v) {
        teamBYellows = teamBYellows + 1;
        displayYellowsTeamB(teamBYellows);
    }

    /**
     * Increase red cards for Team B by 1 card.
     */
    public void addRedForTeamB(View v) {
        teamBReds = teamBReds + 1;
        displayRedsTeamB(teamBReds);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets scores and cards for Team A and Team B
     */
    public void reset(View v) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        teamAYellows = 0;
        teamBYellows = 0;
        displayYellowsTeamA(teamAYellows);
        displayYellowsTeamB(teamBYellows);
        teamAReds = 0;
        teamBReds = 0;
        displayRedsTeamA(teamAReds);
        displayRedsTeamB(teamBReds);
    }

}