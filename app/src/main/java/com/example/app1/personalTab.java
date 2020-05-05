package com.example.app1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class personalTab extends Fragment {

    public personalTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_personal_tab, container, false);

        String [] values = {"Pick Gender","Male","Female","Other"};

        ArrayAdapter<String> genderAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        genderAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        Spinner genderSpinner = (Spinner) v.findViewById(R.id.genderSpinner);
        genderSpinner.setAdapter(genderAdapter);

        return v;

    }
}
