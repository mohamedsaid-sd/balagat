package com.equipation.balagat.opration.contracts;

import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

import com.equipation.balagat.R;

public class com_liq_pro_weekly_liquidation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com_liq_pro_weekly_liquidation);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }
}