package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class surveyActivity extends AppCompatActivity {

    //Surveys - DHI, HHIA, TRQ

    int counter = 0;
    int score = 0;
    //String[] some_array = getResources().getStringArray(R.array.your_string_array)
    String[] questions = {"Does a hearing problem cause you to use the phone less often than you would like?",
            "Does a hearing problem cause you to feel embarrassed when meeting new people?",
            "Does a hearing problem cause you to avoid groups of people?",
            "Does a hearing problem make you irritable?",
            "Does a hearing problem cause you to feel frustrated when talking to members of your family?",
            "Does a hearing problem cause you difficulty when attending a party?",
            "Does a hearing problem cause you difficulty hearing/understanding coworkers, clients, or customers?",
            "Do you feel handicapped by a hearing problem?",
            "Does a hearing problem cause you difficulty when visiting friends, relatives, or neighbours?",
            "Does a hearing problem cause you to feel frustrated when talking to coworkers, clients or customers?",
            "Does a hearing problem cause you difficulty in the movies or theatre?",
            "Does a hearing problem cause you to be nervous?",
            "Does a hearing problem cause you to visit friends, relatives, or neighbours less often than you would like?",
            "Does a hearing problem cause you to have arguments with family members?",
            "Does a hearing problem cause you difficulty when listening to TV or radio?",
            "Does a hearing problem cause you to go shopping less often than you would like?",
            "Does any problem or difficulty with your hearing upset you at all?",
            "Does a hearing problem cause you to want to be by yourself?",
            "Does a hearing problem cause you to talk to family members less often than you would like?",
            "Do you feel that any difficulty with your hearing limits or hampers your personal or social life?",
            "Does a hearing problem cause you difficulty when in a restaurant with relatives or friends?",
            "Does a hearing problem cause you to feel depressed?",
            "Does a hearing problem cause you to listen to TV or the radio less often than you would like?",
            "Does a hearing problem cause you to feel uncomfortable when talking to friends?",
            "Does a hearing problem cause you to feel left out when you are with a group of people?"};
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
                    Intent storeIntent = new Intent(surveyActivity.this,resultActivity.class);
                    storeIntent.putExtra("com.example.app1.HHIASCORE",score);

                    Intent startIntent = new Intent(surveyActivity.this,trqActivity.class);
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
                    Intent storeIntent = new Intent(surveyActivity.this,resultActivity.class);
                    storeIntent.putExtra("com.example.app1.HHIASCORE",score);

                    Intent startIntent = new Intent(surveyActivity.this,trqActivity.class);
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
                    Intent storeIntent = new Intent(surveyActivity.this,resultActivity.class);
                    storeIntent.putExtra("com.example.app1.HHIASCORE",score);

                    Intent startIntent = new Intent(surveyActivity.this,trqActivity.class);
                    startActivity(startIntent);
                }
                TextView questionTextView = (TextView)findViewById(R.id.questionTextView);
                questionTextView.setText(questions[counter]);
                display = questions[counter];
            }

        });



    }
}
