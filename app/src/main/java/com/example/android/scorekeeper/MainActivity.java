package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String TEAM_A_SCORE = "scoreA";
    static final String TEAM_B_SCORE = "scoreB";
    static final String TEAM_A_YELLOWS = "yellowsA";
    static final String TEAM_B_YELLOWS = "yellowsB";
    static final String TEAM_A_REDS = "redsA";
    static final String TEAM_B_REDS = "redsB";
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

        if (savedInstanceState != null) {
            //it is the first time the fragment is being called
            scoreTeamA = savedInstanceState.getInt(TEAM_A_SCORE);
            scoreTeamB = savedInstanceState.getInt(TEAM_B_SCORE);
            teamAYellows = savedInstanceState.getInt(TEAM_A_YELLOWS);
            teamBYellows = savedInstanceState.getInt(TEAM_B_YELLOWS);
            teamAReds = savedInstanceState.getInt(TEAM_A_REDS);
            teamBReds = savedInstanceState.getInt(TEAM_B_REDS);
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
            displayYellowsTeamA(teamAYellows);
            displayYellowsTeamB(teamBYellows);
            displayRedsTeamA(teamAReds);
            displayRedsTeamB(teamBReds);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putInt(TEAM_A_SCORE, scoreTeamA);
        savedInstanceState.putInt(TEAM_B_SCORE, scoreTeamB);
        savedInstanceState.putInt(TEAM_A_YELLOWS, teamAYellows);
        savedInstanceState.putInt(TEAM_B_YELLOWS, teamBYellows);
        savedInstanceState.putInt(TEAM_A_REDS, teamAReds);
        savedInstanceState.putInt(TEAM_B_REDS, teamBReds);
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
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
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red cards for Team A.
     */
    public void displayRedsTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_reds);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayYellowsTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_yellows);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red cards for Team B.
     */
    public void displayRedsTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_reds);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given yellow cards for Team B.
     */
    public void displayYellowsTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_yellows);
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