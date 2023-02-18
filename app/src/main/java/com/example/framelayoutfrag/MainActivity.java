package com.example.framelayoutfrag;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.framelayoutfrag.fragment.AFragment;
import com.example.framelayoutfrag.fragment.BFragment;
import com.example.framelayoutfrag.fragment.CFragment;

public class MainActivity extends AppCompatActivity {

    Button a,b,c;

//    String ROOT_FRAGMENT_TAG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        a = findViewById(R.id.btn1);
        b = findViewById(R.id.btn2);
        c = findViewById(R.id.btn3);
        loadFrgmnet(new AFragment(),0);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFrgmnet(AFragment.getInstance("virat",18),1);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFrgmnet(new BFragment(),1);

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFrgmnet(CFragment.getInstance("khush patel",19),1);
            }
        });

    }

    private void loadFrgmnet(Fragment fragment , int flag) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

//        Bundle bundle = new Bundle();
//        bundle.putString("Name","khush");
//        bundle.putInt("no",18);
//        fragment.setArguments(bundle);

        if (flag == 0) {
            fragmentTransaction.add(R.id.container, fragment);
//            fragmentManager.popBackStack(,FragmentManager.POP_BACK_STACK_INCLUSIVE);
//            fragmentTransaction.addToBackStack(ROOT_FRAGMENT_TAG);
          }else {
            fragmentTransaction.replace(R.id.container, fragment);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }

    public void mymeth(){
        Log.d("khush", "virat 18");
    }
}