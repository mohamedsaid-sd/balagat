package com.equipation.balagat.opration.constraction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;

public class main_camp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_camp);
    }

    public void fun_camp_equipment_register(View view) {
        startActivity( new Intent( this , camp_equipment_register.class ));

        //
    }

    public void fun_camp_condiation_equipment(View view) {
        startActivity( new Intent( this , camp_condiation_equipment.class ));

        //
    }

    public void fun_camp_change_location(View view) {
        startActivity( new Intent( this , camp_change_location.class ));

        //
    }

    public void fun_camp_add_equipment(View view) {
        startActivity( new Intent( this , camp_add_equipment.class ));

        //
    }

    public void fun_camp_exclusion(View view) {
        startActivity( new Intent( this , camp_exclusion.class ));

        //
    }

    public void fun_camp_daily_operations(View view) {
        startActivity( new Intent( this , camp_daily_operations.class ));

        //
    }

    public void fun_camp_material_store(View view) {
        startActivity( new Intent( this , camp_material_store.class ));

        //
    }

    public void fun_camp_challenges(View view) {
        startActivity( new Intent( this , camp_challenges.class ));

        //
    }

    public void fun_camp_reports(View view) {
        //
        startActivity( new Intent( this , camp_reports.class ));

    }

    public void fun_camp_complaint(View view) {
        startActivity( new Intent( this , camp_complaint.class ));


    }

    public void fun_back(View view) {
    }

    public void fun_camp_fuel_store(View view) {
        startActivity( new Intent( this , camp_fuel_store.class ));


    }
}