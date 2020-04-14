package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class surveyActivity extends AppCompatActivity {

    int counter = 0;
    int score = 0;
    String[] questions = {"q1", "q2", "q3","q4","q5"};
    int len = questions.length;
    String display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        TextView questionTextView = (TextView)findViewById(R.id.questionTextView);
        questionTextView.setText(questions[counter]);

        Button add0Btn = (Button)findViewById(R.id.add0Btn);
        add0Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                if(counter>=len){
                    counter = 0;
                    //action
                    Intent startIntent = new Intent(surveyActivity.this,resultActivity.class);
                    startIntent.putExtra("com.example.app1.SCORE",score);
                    startActivity(startIntent);
                }
                TextView questionTextView = (TextView)findViewById(R.id.questionTextView);
                questionTextView.setText(questions[counter]);
                display = questions[counter];
            }
        });

        Button add1Btn = (Button)findViewById(R.id.add1Btn);
        add1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                counter++;
                if(counter>=len){
                    counter = 0;
                    //action
                    Intent startIntent = new Intent(surveyActivity.this,resultActivity.class);
                    startIntent.putExtra("com.example.app1.SCORE",score);
                    startActivity(startIntent);
                }
                TextView questionTextView = (TextView)findViewById(R.id.questionTextView);
                questionTextView.setText(questions[counter]);
                display = questions[counter];
            }

        });

        Button add2Btn = (Button)findViewById(R.id.add2Btn);
        add2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = score + 2;
                counter++;
                if(counter>=len){
                    counter = 0;
                    //action
                    Intent startIntent = new Intent(surveyActivity.this,resultActivity.class);
                    startIntent.putExtra("com.example.app1.SCORE",score);
                    startActivity(startIntent);
                }
                TextView questionTextView = (TextView)findViewById(R.id.questionTextView);
                questionTextView.setText(questions[counter]);
                display = questions[counter];
            }

        });



    }
}
