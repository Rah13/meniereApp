package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class profileActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

//        //intent to get data
//        Intent intent = getIntent();
//        String name = intent.getStringExtra("com.example.app1.NAME");
//        String dob = intent.getStringExtra("com.example.app1.DOB");
//        String email = intent.getStringExtra("com.example.app1.EMAIL");
//
//        //TextView
//        TextView nameTextView = findViewById(R.id.nameTextView);
//        TextView dobTextView = findViewById(R.id.dobTextView);
//        TextView emailTextView = findViewById(R.id.emailTextView);
//
//        //setText
//        nameTextView.setText("Name: "+name+"\nEmail: "+email+ "\nDOB: "+dob);

//        if(bundle!=null){
//
//
//            name = bundle.getString("com.example.app1.NAME");
//            nameTextView.setText(name);
//
////            dob = bundle.getString("com.example.app1.DOB");
////            dobTextView.setText(dob);
//        }



//        if(getIntent().hasExtra("com.example.app1.NAME")){
//            name = getIntent().getExtras().getString("com.example.app1.NAME");
//            nameTextView.setText(name);
//        }
//
////        if(getIntent().hasExtra("com.example.app1.DOB")){
//            dob = getIntent().getExtras().getString("com.example.app1.DOB");
//            dobTextView.setText(dob);
//        }
//
//        if(getIntent().hasExtra("com.example.app1.EMAIL")){
//            email = getIntent().getExtras().getString("com.example.app1.EMAIL");
//            emailTextView.setText(email);
//        }

//        name = getIntent().getStringExtra("com.example.app1.NAME");
//        dob = getIntent().getExtras().getString("com.example.app1.DOB");
//        email = getIntent().getExtras().getString("com.example.app1.EMAIL");
//






//
//
//
//
//
//        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(this, R.array.genderOptions,android.R.layout.simple_spinner_item);
//        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        Spinner genderSpinner = findViewById(R.id.genderSpinner);
//        genderSpinner.setAdapter(genderAdapter);
//        genderSpinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
//
//
//
//        ArrayAdapter<CharSequence> treatmentsAdapter = ArrayAdapter.createFromResource(this, R.array.treatmentOptions,android.R.layout.simple_spinner_item);
//        treatmentsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        Spinner treatmentsSpinner1 = findViewById(R.id.treatmentSpinner1);
//        treatmentsSpinner1.setAdapter(treatmentsAdapter);
//        treatmentsSpinner1.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
//
//        Spinner treatmentsSpinner2 = findViewById(R.id.treatmentSpinner2);
//        treatmentsSpinner2.setAdapter(treatmentsAdapter);
//        treatmentsSpinner2.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
//
//
//        Button homeBtn = (Button)findViewById(R.id.homeBtn);
//        homeBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent homeIntent = new Intent(getApplicationContext(),MainActivity.class);
//                // pass info
//                startActivity(homeIntent);
//            }
//        });




        Button editBtn = (Button)findViewById(R.id.editBtn);
        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editIntent = new Intent(getApplicationContext(),editProfileActivity.class);
                // pass info
                startActivity(editIntent);
            }
        });

//
//        if(getIntent().hasExtra("com.example.app1.NAME")){
//            TextView nameTextView = (TextView)findViewById(R.id.nameTextView);
//            String name = getIntent().getStringExtra("com.example.app1.NAME");
//            nameTextView.setText(name);
//        }
////
//        if(getIntent().hasExtra("com.example.app1.DOB")){
        //TextView dobTextView = (TextView)findViewById(R.id.dobTextView);
//            String dob = getIntent().getExtras().getString("com.example.app1.DOB");
//            dobTextView.setText(dob);
//        }
//
//        if(getIntent().hasExtra("com.example.app1.EMAIL")){
        //TextView emailTextView = (TextView)findViewById(R.id.emailTextView);
//            String email = getIntent().getExtras().getString("com.example.app1.EMAIL");
//            emailTextView.setText(email);
//        }


    }

//
//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        String treatment = parent.getItemAtPosition(position).toString();
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> parent) {
//
//    }


//    private void showDatePickerDialog() {
//        DatePickerDialog datePickerDialog = new DatePickerDialog(this,this,
//                Calendar.getInstance().get(Calendar.YEAR),
//                Calendar.getInstance().get(Calendar.MONTH),
//                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
//        );
//    }
//    @Override
//    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//        String date = dayOfMonth + "/" + month + "/" + year;
//        dateTextView.setText(date);
//    }



}
