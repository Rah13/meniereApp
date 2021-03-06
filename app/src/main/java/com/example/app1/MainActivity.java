package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startBtn = (Button)findViewById(R.id.startBtn);
        startBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),dhiStartActivity.class);
                // pass info
                startActivity(startIntent);
            }
        });

        Button profileBtn = (Button)findViewById(R.id.profileBtn);
        profileBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileIntent = new Intent(getApplicationContext(),tabsActivity.class);
                // pass info
                startActivity(profileIntent);
            }
        });


    }
}
