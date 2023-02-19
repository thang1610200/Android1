package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_manager_main);
        FirstFagment firstFagment = new FirstFagment();
        SecondFragment secondFragment = new SecondFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragment,firstFagment)
                .commit();

        Button btnfragment1 = (Button) findViewById(R.id.btnFragment1);
        btnfragment1.setOnClickListener((View v) -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment,firstFagment)
                    .addToBackStack(null)
                    .commit();
        });

        Button btnfragment2 = (Button) findViewById(R.id.btnFragment2);
        btnfragment2.setOnClickListener((View v) -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment,secondFragment)
                    .addToBackStack(null)
                    .commit();
        });




//        Button buttonkq = (Button) findViewById(R.id.btn);
//        buttonkq.setOnClickListener((View v) -> {
//                EditText edit_a = (EditText)findViewById(R.id.edit_a);
//                EditText edit_b = (EditText)findViewById(R.id.edit_b);
//                TextView kq = (TextView) findViewById(R.id.calculate_kq);
//                float a = Float.parseFloat(edit_a.getText().toString());
//                float b = Float.parseFloat(edit_b.getText().toString());
//
//                kq.setText(Round(a,b));
//        });
    }

//    private float Cong(float a,float b){
//        return a + b;
//    }
//
//    private String Round(float a,float b){
//        float kq = Cong(a,b);
//        String temp = String.valueOf(kq);
//        String save = temp;
//        if(kq - (int)kq == 0){
//            save = temp.substring(0,temp.length() - 2);
//        }
//        return save;
//    }
}