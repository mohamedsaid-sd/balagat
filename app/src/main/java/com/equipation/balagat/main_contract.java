package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.opration.production.production_contract_time;

public class main_contract extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_contract);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }

    public void fun_time(View view) {
        startActivity(new Intent(this , production_contract_time.class));
    }

    public void fun_location(View view) {
        startActivity(new Intent(  this, emty.class ));
    }

    public void fiun_contract(View view) {
        startActivity(new Intent(this , contract.class));
    }
}