package it.flaviodepedis.soccercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    // Tracks the yellow card for Team A
    int yellowCardTeamA = 0;

    // Tracks the yellow card for Team B
    int yellowCardTeamB = 0;

    // Tracks the red card for Team A
    int redCardTeamA = 0;

    // Tracks the red card for Team B
    int redCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A.
     */
    public void addScoreTeamA (View view){
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B.
     */
    public void addScoreTeamB (View view){
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Increase the yellow card for Team A.
     */
    public void yellowCardA (View view){
        yellowCardTeamA = yellowCardTeamA + 1;
        displayYellowCardTeamA(yellowCardTeamA);
    }

    /**
     * Increase the yellow card for Team B.
     */
    public void yellowCardB (View view){
        yellowCardTeamB = yellowCardTeamB + 1;
        displayYellowCardTeamB(yellowCardTeamB);
    }

    /**
     * Increase the red card for Team A.
     */
    public void redCardA (View view){
        redCardTeamA = redCardTeamA + 1;
        displayRedCardTeamA(redCardTeamA);
    }

    /**
     * Increase the red card for Team B.
     */
    public void redCardB (View view){
        redCardTeamB = redCardTeamB + 1;
        displayRedCardTeamB(redCardTeamB);
    }

    public void resetScore (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;

        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayYellowCardTeamA(yellowCardTeamA);
        displayYellowCardTeamB(yellowCardTeamB);
        displayRedCardTeamA(redCardTeamA);
        displayRedCardTeamB(redCardTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the yellow card for Team A.
     */
    public void displayYellowCardTeamA(int yellowCardTeamA) {
        TextView cardYellowViewA = (TextView) findViewById(R.id.numberYellowCardA);
        cardYellowViewA.setText(String.valueOf(yellowCardTeamA));
    }

    /**
     * Displays the yellow card for Team B.
     */
    public void displayYellowCardTeamB(int yellowCardTeamB) {
        TextView cardYellowViewB = (TextView) findViewById(R.id.numberYellowCardB);
        cardYellowViewB.setText(String.valueOf(yellowCardTeamB));
    }

    /**
     * Displays the red card for Team A.
     */
    public void displayRedCardTeamA(int redCardTeamA) {
        TextView cardRedViewA = (TextView) findViewById(R.id.numberRedCardA);
        cardRedViewA.setText(String.valueOf(redCardTeamA));
    }

    /**
     * Displays the red card for Team B.
     */
    public void displayRedCardTeamB(int redCardTeamB) {
        TextView cardRedVieB = (TextView) findViewById(R.id.numberRedCardB);
        cardRedVieB.setText(String.valueOf(redCardTeamB));
    }


}
