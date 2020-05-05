package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dhiActivity<surveyNum> extends AppCompatActivity {

    //Surveys - DHI, HHIA, TRQ

    int counter = 0;
    int[] scores = {0,0,0};
    final int surveyNum = 0;

    //String[] some_array = getResources().getStringArray(R.array.your_string_array)
    String[] questions = {"Does looking up increase your problem?",
            "Because of your problem, do you feel frustrated?",
            "Because of your problem, do you restrict your travel for business or recreation?",
            "Does walking down the aisle of a supermarket increase your problems?",
            "Because of your problem, do you have difficulty getting into or out of bed?",
            "Does your problem significantly restrict your participation in social activities, such as going out to dinner, going to the movies, dancing, or going to parties?",
            "Because of your problem, do you have difficulty reading?",
            "Does performing more ambitious activities such as sports, dancing, household chores (sweeping or putting dishes away) increase your problems? ",
            "Because of your problem, are you afraid to leave your home without having without having someone accompany you?",
            "Because of your problem have you been embarrassed in front of others?",
            "Do quick movements of your head increase your problem?",
            "Because of your problem, do you avoid heights?",
            "Does turning over in bed increase your problem?",
            "Because of your problem, is it difficult for you to do strenuous homework or yard work?",
            "Because of your problem, are you afraid people may think you are intoxicated?",
            "Because of your problem, is it difficult for you to go for a walk by yourself?",
            "Does walking down a sidewalk increase your problem?",
            "Because of your problem, is it difficult for you to concentrate",
            "Because of your problem, is it difficult for you to walk around your house in the dark?",
            "Because of your problem, are you afraid to stay home alone?",
            "Because of your problem, do you feel handicapped?",
            "Has the problem placed stress on your relationships with members of your family or friends?",
            "Because of your problem, are you depressed?",
            "Does your problem interfere with your job or household responsibilities?",
            "Does bending over increase your problem?"};



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

                    Intent startIntent = new Intent(dhiActivity.this,hhiaStartActivity.class);
                    startIntent.putExtra("com.example.app1.SCORES",scores);
                    startActivity(startIntent);

                }
                TextView questionTextView = (TextView)findViewById(R.id.questionTextView);
                questionTextView.setText(questions[counter]);
                display = questions[counter];
            }
        });

        Button add2Btn = (Button)findViewById(R.id.add1Btn);
        add2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scores[surveyNum] = scores[surveyNum] + 2;
                counter++;
                if(counter>=len){
                    counter = 0;
                    //action
                    Intent startIntent = new Intent(dhiActivity.this,hhiaStartActivity.class);
                    startIntent.putExtra("com.example.app1.SCORES",scores);
                    startActivity(startIntent);
                }
                TextView questionTextView = (TextView)findViewById(R.id.questionTextView);
                questionTextView.setText(questions[counter]);
                display = questions[counter];
            }

        });

        Button add4Btn = (Button)findViewById(R.id.add2Btn);
        add4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scores[surveyNum] = scores[surveyNum] + 4;
                counter++;
                if(counter>=len){
                    counter = 0;
                    //action
                    Intent startIntent = new Intent(dhiActivity.this,hhiaStartActivity.class);
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
