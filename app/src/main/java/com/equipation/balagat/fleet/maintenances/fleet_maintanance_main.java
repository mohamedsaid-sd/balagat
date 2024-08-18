package com.equipation.balagat.fleet.maintenances;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;
import com.equipation.balagat.fleet.Monthly_inspection.monthly;

public class fleet_maintanance_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }


    public void fun_periodic_maintenance(View view) {
        startActivity(new Intent(this , periodic_maintenance_request.class ));
    }

    public void fun_therapeutic_request(View view) {
        startActivity(new Intent(this , therapeutic_maintenance_request.class ));
    }


    public void fun_periodic_maintenance_table(View view) {
        //startActivity(new Intent(this , periodic_maintenance_table.class ));
    }
}