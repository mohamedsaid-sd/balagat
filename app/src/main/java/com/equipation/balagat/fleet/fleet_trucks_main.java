package com.equipation.balagat.fleet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

import com.equipation.balagat.R;
import com.equipation.balagat.fleet.trucks.trucks_fleet;
import com.equipation.balagat.fleet.trucks.update_trucks_fleet;

import java.util.ArrayList;

public class fleet_trucks_main extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fleet_trucks_main);

    }

    public void fun_tracks_fleet(View view) {
        startActivity(new Intent(this , trucks_fleet.class));
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }

    public void fun_update_trucks_fleet(View view) {
        startActivity(new Intent(this , update_trucks_fleet.class));
    }
}