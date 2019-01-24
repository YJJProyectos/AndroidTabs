package com.example.jyang.toolbar.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jyang.toolbar.Model.Person;
import com.example.jyang.toolbar.R;

public class PersonListFragment extends Fragment {
    public void add(Person person){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person_list, container, false);
        return view;
    }
}
