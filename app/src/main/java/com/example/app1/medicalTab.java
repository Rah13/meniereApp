package com.example.app1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class medicalTab extends Fragment {

    public medicalTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_medical_tab, container, false);

        String [] values = {"Early Stage", "Middle Stage", "Late Stage"};

        ArrayAdapter<String> diagnosisAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        diagnosisAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner diagnosisSpinner = (Spinner) v.findViewById(R.id.diagnosisSpinner);
        diagnosisSpinner.setAdapter(diagnosisAdapter);


        return v;
    }
}
