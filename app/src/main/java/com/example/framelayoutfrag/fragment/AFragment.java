package com.example.framelayoutfrag.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.framelayoutfrag.R;

public class AFragment extends Fragment {

    public AFragment() {
        // Required empty public constructor
    }

    public static  String Arg1 = "argument1";
    public static  String Arg2 = "argument2";
    String name1;
    int number;

    public static AFragment getInstance(String val1,int val2){
        AFragment aFragment = new AFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Arg1,val1);
        bundle.putInt(Arg2,val2);
        aFragment.setArguments(bundle);
        return aFragment;
    }
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_a, container, false);

        TextView name = view.findViewById(R.id.name);
        TextView no =  view.findViewById(R.id.no);

        if (getArguments()!= null){
           name1 = getArguments().getString(Arg1);
            number = getArguments().getInt(Arg2);
        }

        name.setText(""+name1);
        no.setText(""+number);
        return view;
    }
}