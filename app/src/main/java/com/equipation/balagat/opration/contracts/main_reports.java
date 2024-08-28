package com.equipation.balagat.opration.contracts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

import com.equipation.balagat.R;

public class main_reports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_reports);
    }

    public void fun_weekly_liquidation(View view) {
        startActivity( new Intent( this , contract_weekly_liquidation.class ));
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }
}