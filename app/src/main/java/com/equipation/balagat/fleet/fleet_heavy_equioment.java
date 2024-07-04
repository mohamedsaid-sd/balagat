package com.equipation.balagat.fleet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.equipation.balagat.R;
import com.equipation.balagat.fleet.heavy_equipment.heavy_fleet;
import com.equipation.balagat.fleet.heavy_equipment.update_heavy_fleet;

public class fleet_heavy_equioment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fleet_heavy_equipment);
    }

    public void fun_back(View view) {
        getOnBackPressedDispatcher().onBackPressed();
    }

    public void fun_heavy_fleet(View view) {
        startActivity(new Intent( this , heavy_fleet.class ));
    }

    public void fun_update_heavy_fleet(View view) {
        startActivity(new Intent( this , update_heavy_fleet.class ));
    }
}