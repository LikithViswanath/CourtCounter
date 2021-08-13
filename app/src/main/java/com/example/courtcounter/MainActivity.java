package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA=0,scoreB=0;
    public void reset_game(View view){
        scoreA=0;
        scoreB=0;
        displayTeamAScore(0);
        displayTeamBScore(0);
    }
    public void displayTeamAScore(int n){
        TextView TeamAScore = (TextView) findViewById(R.id.teamA_score_text_view);
        TeamAScore.setText(String.valueOf(n));
    }
    public void displayTeamBScore(int n){
        TextView TeamBScore = (TextView) findViewById(R.id.teamB_score_text_view);
        TeamBScore.setText(String.valueOf(n));
    }
    public void ThreePointsA(View view){
       scoreA+=3;
       displayTeamAScore(scoreA);
    }
    public void TwoPointsA(View view){
      scoreA+=2;
      displayTeamAScore(scoreA);
    }
    public void ThreePointsB(View view){
       scoreB+=3;
       displayTeamBScore(scoreB);
    }
    public void TwoPointsB(View view){
        scoreB+=2;
        displayTeamBScore(scoreB);
    }
    public void FreeThrow(View view){
          scoreB+=0;
          scoreA+=0;
    }
}