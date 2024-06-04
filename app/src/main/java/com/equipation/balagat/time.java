package com.equipation.balagat;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class time extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }

}