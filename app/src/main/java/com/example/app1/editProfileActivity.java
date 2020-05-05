package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class editProfileActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        final EditText nameEditText= findViewById(R.id.doctorEditText);
        final EditText dobEditText=findViewById(R.id.dobEditText);
        final EditText emailEditText=findViewById(R.id.emailEditText);

        //get data from edit text


        Button updateBtn = (Button)findViewById(R.id.updateBtn);
        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nameEditText.getText().toString();
//                String dob = dobEditText.getText().toString();
//                String email = emailEditText.getText().toString();

                //activity intent
                Intent intent = new Intent(editProfileActivity.this, profileActivity.class);
                intent.putExtra("com.example.app1.NAME", name);
//                intent.putExtra("com.example.app1.DOB", dob);
//                intent.putExtra("com.example.app1.EMAIL",email);
                startActivity(intent);

            }
        });


    }
}
