package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        if(getIntent().hasExtra("com.example.app1.SCORE")){
            TextView resultTextView = (TextView)findViewById(R.id.resultTextView);
            int score = getIntent().getIntExtra("com.example.app1.SCORE",0);
            resultTextView.setText(String.valueOf(score));
        }
    }
}
