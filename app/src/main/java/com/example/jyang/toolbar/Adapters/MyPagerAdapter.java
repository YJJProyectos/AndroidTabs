package com.example.jyang.toolbar.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.jyang.toolbar.Fragments.PrimerFragment;
import com.example.jyang.toolbar.Fragments.SegundoFragment;
import com.example.jyang.toolbar.Fragments.TerceroFragment;

public class MyPagerAdapter extends FragmentStatePagerAdapter {


    private int numberOfTabs;

    public MyPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PrimerFragment();
            case 1:
                return new SegundoFragment();
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
