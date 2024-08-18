package com.equipation.balagat.fleet.Monthly_inspection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.equipation.balagat.R;
import com.equipation.balagat.humans.evaluation_request;

public class Monthly_inspection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monthly_inspection);
    }


    public void fun_back(View view) {
    }

    public void fun_Monthly_inspection(View view) {
        startActivity(new Intent( this , monthly.class ) );
    }
}