package com.equipation.balagat.opration.rental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;


public class rental_contract_location extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental_contract_location);
    }

    public void fun_need(View view) {
        startActivity(new Intent(this , rental_machin_need.class));
    }

    public void fun_travel(View view) {
        startActivity(new Intent(this , rental_machin_travel.class));
    }

    public void fiun_add(View view) {
        startActivity(new Intent(this , rental_add_operator.class));

    }

    public void fiun_complaint(View view) {
        startActivity(new Intent(this , rental_complaint.class));
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}