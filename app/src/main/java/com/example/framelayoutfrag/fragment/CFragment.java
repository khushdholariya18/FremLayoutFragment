package com.example.framelayoutfrag.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.framelayoutfrag.R;

public class CFragment extends Fragment {


    public CFragment() {
        // Required empty public constructor
    }
    String name1;
    int number;

    public static String ARG1 = "argument 1";
    public static String ARG2 = "argument 2";

    public static CFragment getInstance(String value1 , int value2){

        CFragment cFragment = new CFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG1,value1);
        bundle.putInt(ARG2,value2);
        cFragment.setArguments(bundle);

        return cFragment;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (getArguments() != null){
            name1 = getArguments().getString(ARG1);
            number =  getArguments().getInt(ARG2);
        }
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_c, container, false);


       TextView name = view.findViewById(R.id.name);
        TextView no  = view.findViewById(R.id.no);

        name.setText(""+name1);
        no.setText(""+number);
        return view;

    }

}