package com.example.jyang.toolbar.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jyang.toolbar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TerceroFragment extends Fragment {


    public TerceroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tercero, container, false);
        return view;
    }

}
