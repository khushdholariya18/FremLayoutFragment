package com.example.framelayoutfrag.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.framelayoutfrag.MainActivity;
import com.example.framelayoutfrag.R;

public class BFragment extends Fragment {



    public BFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ((MainActivity)getActivity()).mymeth();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }
}