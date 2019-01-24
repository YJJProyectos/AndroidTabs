package com.example.jyang.toolbar.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.jyang.toolbar.R;

import java.util.ArrayList;
import java.util.List;

public class PersonFormFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person_form, container, false);
        Spinner spinner = view.findViewById(R.id.pais_spinner);
        List<String> paises = new ArrayList<String>();
        paises.add("Argentina");
        paises.add("EEUUU");
        paises.add("China");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item, paises);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        return view;
    }
}
