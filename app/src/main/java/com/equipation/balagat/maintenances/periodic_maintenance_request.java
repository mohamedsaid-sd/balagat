package com.equipation.balagat.maintenances;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;

public class periodic_maintenance_request extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_maintenance_request);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}