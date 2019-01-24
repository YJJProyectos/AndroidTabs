package com.example.jyang.toolbar.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.jyang.toolbar.Fragments.PersonFormFragment;
import com.example.jyang.toolbar.Fragments.PersonListFragment;
import com.example.jyang.toolbar.Fragments.PrimerFragment;
import com.example.jyang.toolbar.Fragments.SegundoFragment;
import com.example.jyang.toolbar.Fragments.TerceroFragment;

import static com.example.jyang.toolbar.Activities.MainActivity.PERSON_FORM_FRAGMENT;
import static com.example.jyang.toolbar.Activities.MainActivity.PERSON_LIST_FRAGMENT;

public class MyPagerAdapter extends FragmentStatePagerAdapter {


    private int numberOfTabs;

    public MyPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case PERSON_FORM_FRAGMENT:
                return new PersonFormFragment();
            case PERSON_LIST_FRAGMENT:
                return new PersonListFragment();
            case 2:
                return new TerceroFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
