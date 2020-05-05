package com.example.app1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.TimeZone;


/**
 * A simple {@link Fragment} subclass.
 */
public class treatmentsTab extends Fragment implements DatePickerDialog.OnDateSetListener {

    public treatmentsTab() {
        // Required empty public constructor
    }
    

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View v = inflater.inflate(R.layout.fragment_treatments_tab, container, false);

        String [] values = {"No Treatment","Low Salt Diet","Low caffeine diet",
                "Moduretic", "Serc (Betahistine)" , "Stemetil (Prochlorperazine)", "Valium (Diazepam)",
                "Cinnarizine", "Dimenhydrinate", "Domperidone", "Zofran",
                "Oral Prednisone", "Intratympanic Prednisone","Other"};

        ArrayAdapter<String> treatmentAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        treatmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner treatmentSpinner1 = (Spinner) v.findViewById(R.id.treatmentSpinner1);
        Spinner treatmentSpinner2 = (Spinner) v.findViewById(R.id.treatmentSpinner2);
        Spinner treatmentSpinner3 = (Spinner) v.findViewById(R.id.treatmentSpinner3);

        treatmentSpinner1.setAdapter(treatmentAdapter);
        treatmentSpinner2.setAdapter(treatmentAdapter);
        treatmentSpinner3.setAdapter(treatmentAdapter);

        TextView treatmentTextView1 = (TextView)v.findViewById(R.id.treatmentTextView1);
        treatmentTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment picker = new DatePickerFragment();
                picker.show(getFragmentManager(), "datePicker");
            }

        });


        return v;
    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String date = DateFormat.getDateInstance().format(c.getTime());
        TextView treatmentTextView2 = (TextView) view.findViewById(R.id.treatmentTextView2);
        treatmentTextView2.setText(date);
    }
}
