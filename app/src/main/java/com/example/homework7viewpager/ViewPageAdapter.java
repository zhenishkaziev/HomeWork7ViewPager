package com.example.homework7viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPageAdapter extends FragmentStatePagerAdapter {

    List<ModelOn> list = new ArrayList<>();
    FragmentManager manager;


    public ViewPageAdapter(@NonNull FragmentManager fm, List<ModelOn> list) {
        super(fm);
        this.list = list;
        this.manager = fm;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new OnJustFragment();
        switch (position){
            case  1:
                fragment = OnJustFragment.newInstance(list.get(position).getTitle(), list.get(position).getDescription(), list.get(position).getImagions());
                break;
            case 2:
                fragment = OnJustFragment.newInstance(list.get(position).getTitle(), list.get(position).getDescription(), list.get(position).getImagions());
                break;
            case 3:
                fragment = OnJustFragment.newInstance(list.get(position).getTitle(), list.get(position).getDescription(), list.get(position).getImagions());

        }
        return fragment;
    }


    @Override
    public int getCount() {
        return list.size();
    }
}
