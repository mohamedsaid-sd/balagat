package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.contracts.hour_system;
import com.equipation.balagat.contracts.product_system;

public class contract_time_sheet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contract_time_sheet);

    }

    public void fun_back(View view) {
        super.onBackPressed();
    }

    public void fun_hour_system(View view) {
        startActivity(new Intent(this , hour_system.class));
    }

    public void fun_product_system(View view) {
        startActivity(new Intent(this , product_system.class));
    }
}