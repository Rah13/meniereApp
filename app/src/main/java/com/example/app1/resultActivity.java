package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        final int[] scores = intent.getIntArrayExtra("com.example.app1.SCORES");

        int dhiScore = scores[0];
        int hhiaScore = scores[1];
        int trqScore = scores[2];

        TextView dhiScoreTextView = (TextView)findViewById(R.id.dhiScoreTextView);
        dhiScoreTextView.setText(String.valueOf(dhiScore));

        TextView hhiaScoreTextView = (TextView)findViewById(R.id.hhiaScoreTextView);
        hhiaScoreTextView.setText(String.valueOf(hhiaScore));

        TextView trqScoreTextView = (TextView)findViewById(R.id.trqScoreTextView);
        trqScoreTextView.setText(String.valueOf(trqScore));

//
//        if(getIntent().hasExtra("com.example.app1.TRQSCORE")){
//            TextView trqScoreTextView = (TextView)findViewById(R.id.trqScoreTextView);
//            int trqScore = getIntent().getIntExtra("com.example.app1.TRQSCORE",0);
//            trqScoreTextView.setText(String.valueOf(trqScore));
//        }


        Button homeBtn = (Button)findViewById(R.id.homeBtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),MainActivity.class);
                // pass info
                startActivity(startIntent);
            }
        });
    }
}
