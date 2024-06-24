package com.equipation.balagat.opration.constraction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;

public class main_tippers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tippers);
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

    public void fun_back(View view) {
    }
}