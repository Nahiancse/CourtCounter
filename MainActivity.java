package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView setScore;
    TextView setScoreB;
    int a=0;
    int b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setScore=findViewById(R.id.textView2);
        setScoreB=findViewById(R.id.textViewB);
    }

    public void threeScore(View view) {
        a=a+3;
        setScore.setText(String.valueOf(a));
    }

    public void twoScore(View view) {

        a=a+2;
        setScore.setText(String.valueOf(a));
    }

    public void freeScore(View view) {
        a=a+1;
        setScore.setText(String.valueOf(a));
    }

    public void threeScoreB(View view) {
        b=b+3;
        setScoreB.setText(String.valueOf(b));
    }

    public void twoScoreB(View view) {

        b=b+2;
        setScoreB.setText(String.valueOf(b));
    }

    public void freeScoreB(View view) {
       b =b+1;
        setScoreB.setText(String.valueOf(b));
    }

    public void resetNumber(View view) {
        a=0;
        b=0;
        setScore.setText(String.valueOf(a));
        setScoreB.setText(String.valueOf(b));
    }
}