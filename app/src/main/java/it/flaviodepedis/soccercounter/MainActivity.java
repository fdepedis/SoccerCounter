package it.flaviodepedis.soccercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForTeamA (View view){

    }

    public void addTwoForTeamA (View view){

    }

    public void addOneForTeamA (View view){

    }

    public void addThreeForTeamB (View view){

    }

    public void addTwoForTeamB (View view){

    }

    public void addOneForTeamB (View view){

    }

    public void resetScore (View view){

    }


}
