package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hhiaStartActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hhia_start);

        Intent intent = getIntent();
        final int[] scores = intent.getIntArrayExtra("com.example.app1.SCORES");


        Button startBtn = (Button)findViewById(R.id.startBtn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),hhiaActivity.class);
                // pass info
                startIntent.putExtra("com.example.app1.SCORES",scores);
                startActivity(startIntent);
            }
        });
    }


}
