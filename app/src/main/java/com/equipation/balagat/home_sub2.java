package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.fleet.maintenances.fleet_maintanance_main;
import com.equipation.balagat.stocks.stock;

public class home_sub2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sub2);
    }

    public void fun_maintenance(View view) {
        startActivity(new Intent(this , fleet_maintanance_main.class));
    }

    public void fun_fleet(View view) {
       // startActivity(new Intent(this , fleet.class));
    }

    public void fiun_stock(View view) {
        startActivity(new Intent(this , stock.class));
    }

    public void fun_back(View view) {
    }
}