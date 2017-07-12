package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamA = 0;
    private int teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeTeamA(View view) {
        this.teamA += 3;
        displayForTeamA();
    }

    public void addThreeTeamB(View view) {
        this.teamB += 3;
        displayForTeamB();
    }

    public void addTwoTeamA(View view) {
        this.teamA += 2;
        displayForTeamA();
    }

    public void addTwoTeamB(View view) {
        this.teamB += 2;
        displayForTeamB();
    }

    public void addOneTeamA(View view) {
        this.teamA += 1;
        displayForTeamA();
    }

    public void addOneTeamB(View view) {
        this.teamB += 1;
        displayForTeamB();
    }

    private void displayForTeamA() {
        TextView textView = (TextView) findViewById(R.id.textViewTeamA);
        textView.setText(this.teamA + "");
    }

    private void displayForTeamB() {
        TextView textView = (TextView) findViewById(R.id.textViewTeamB);
        textView.setText(this.teamB + "");
    }

    public void reset(View view) {
        this.teamA = 0;
        this.teamB = 0;
        displayForTeamA();
        displayForTeamB();
    }
}
