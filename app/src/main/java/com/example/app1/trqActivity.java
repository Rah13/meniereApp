package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class trqActivity extends AppCompatActivity {

    int counter = 0;
    final int surveyNum = 2;

    //String[] some_array = getResources().getStringArray(R.array.your_string_array)
    String[] questions = {"My tinnitus has made me unhappy",
            "My tinnitus has made me feel tense",
            "My tinnitus has made me feel irritable",
            "My tinnitus has made me feel angry",
            "My tinnitus has led me to cry",
            "My tinnitus has led me to avoid quiet situations",
            "My tinnitus has made me feel less interested in going out",
            "My tinnitus has made me feel depressed",
            "My tinnitus has made me feel annoyed",
            "My tinnitus has made me feel confused",
            "My tinnitus has \"driven me crazy\"",
            "My tinnitus has interfered with my enjoyment of life",
            "My tinnitus has made it hard for me to concentrate",
            "My tinnitus has made it hard for me to relax",
            "My tinnitus has made me feel distressed",
            "My tinnitus has made me feel helpless",
            "My tinnitus has made me feel frustrated with things",
            "My tinnitus has interfered with my ability to work",
            "My tinnitus has led me to despair",
            "My tinnitus has led me to avoid noisy situations",
            "My tinnitus has led me to avoid social situations",
            "My tinnitus has made me feel hopeless about the future",
            "My tinnitus has interfered with my sleep",
            "My tinnitus has led me to think about suicide",
            "My tinnitus has made me feel panicky",
            "My tinnitus has made me feel tormented"};

    int len = questions.length;
    String display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trq);

        Intent intent = getIntent();
        final int[] scores = intent.getIntArrayExtra("com.example.app1.SCORES");

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
                    Intent startIntent = new Intent(trqActivity.this,resultActivity.class);
                    startIntent.putExtra("com.example.app1.SCORES",scores);
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
                scores[surveyNum]++;
                counter++;
                if(counter>=len){
                    counter = 0;
                    //action
                    Intent startIntent = new Intent(trqActivity.this,resultActivity.class);
                    startIntent.putExtra("com.example.app1.SCORES",scores);
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
                scores[surveyNum] = scores[surveyNum] + 2;
                counter++;
                if(counter>=len){
                    counter = 0;
                    //action
                    Intent startIntent = new Intent(trqActivity.this,resultActivity.class);
                    startIntent.putExtra("com.example.app1.SCORES",scores);
                    startActivity(startIntent);
                }
                TextView questionTextView = (TextView)findViewById(R.id.questionTextView);
                questionTextView.setText(questions[counter]);
                display = questions[counter];
            }

        });

        Button add3Btn = (Button)findViewById(R.id.add3Btn);
        add3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scores[surveyNum] = scores[surveyNum] + 3;
                counter++;
                if(counter>=len){
                    counter = 0;
                    //action
                    Intent startIntent = new Intent(trqActivity.this,resultActivity.class);
                    startIntent.putExtra("com.example.app1.SCORES",scores);
                    startActivity(startIntent);
                }
                TextView questionTextView = (TextView)findViewById(R.id.questionTextView);
                questionTextView.setText(questions[counter]);
                display = questions[counter];
            }

        });

        Button add4Btn = (Button)findViewById(R.id.add4Btn);
        add4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scores[surveyNum] = scores[surveyNum] + 4;
                counter++;
                if(counter>=len){
                    counter = 0;
                    //action
                    Intent startIntent = new Intent(trqActivity.this,resultActivity.class);
                    startIntent.putExtra("com.example.app1.SCORES",scores);
                    startActivity(startIntent);
                }
                TextView questionTextView = (TextView)findViewById(R.id.questionTextView);
                questionTextView.setText(questions[counter]);
                display = questions[counter];
            }

        });

    }
}
