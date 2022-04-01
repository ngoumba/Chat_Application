package com.example.chatapplication.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chatapplication.fragments.AmisFragment;
import com.example.chatapplication.fragments.PotentielAmisFragment;

import java.util.Base64;

public class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0 : return new AmisFragment();
            case 1 : return  new PotentielAmisFragment();
            default : return new AmisFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String titre = null;

        if(position == 0){
            titre = "Mes Amis";
        }
        if(position == 1){
            titre = "Amis Potentiels";
        }
        return titre;
    }
}
