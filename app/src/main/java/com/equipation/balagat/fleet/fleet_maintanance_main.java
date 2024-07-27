package com.equipation.balagat.fleet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;
import com.equipation.balagat.fleet.maintenances.asper_request;
import com.equipation.balagat.fleet.maintenances.periodic_maintenance_request;
import com.equipation.balagat.fleet.maintenances.periodic_maintenance_table;
import com.equipation.balagat.fleet.maintenances.therapeutic_maintenance_request;
import com.equipation.balagat.fleet.maintenances.part_maintenance;
import com.equipation.balagat.fleet.maintenances.pay_parts;
import com.equipation.balagat.fleet.maintenances.malfunction_maintenace;
import com.equipation.balagat.fleet.maintenances.monthly;

public class fleet_maintanance_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }

    public void fun_asper_request(View view) {
        startActivity(new Intent(this , asper_request.class ));
    }

    public void fun_periodic_maintenance(View view) {
        startActivity(new Intent(this , periodic_maintenance_request.class ));
    }

    public void fun_therapeutic_request(View view) {
        startActivity(new Intent(this , therapeutic_maintenance_request.class ));
    }

    public void fun_outlay_request(View view) {
        startActivity(new Intent(this , part_maintenance.class ));
    }

    public void fun_employee_deportation(View view) {
        startActivity(new Intent(this , pay_parts.class ));
    }

    public void fun_automated_deportation(View view) {
        startActivity(new Intent(this , malfunction_maintenace.class ));
    }

    public void fun_asper_deportation(View view) {
        startActivity(new Intent(this , monthly.class ));
    }


    public void fun_periodic_maintenance_table(View view) {
        startActivity(new Intent(this , periodic_maintenance_table.class ));
    }
}