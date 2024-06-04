package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.equipation.balagat.maintenances.asper_request;
import com.equipation.balagat.maintenances.periodic_maintenance_request;
import com.equipation.balagat.maintenances.therapeutic_maintenance_request;
import com.equipation.balagat.maintenances.part_maintenance;
import com.equipation.balagat.maintenances.pay_parts;
import com.equipation.balagat.maintenances.malfunction_maintenace;
import com.equipation.balagat.maintenances.monthly;

public class maintenance extends AppCompatActivity {

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


}