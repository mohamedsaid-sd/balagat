package com.equipation.balagat.opration.rental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;

public class rental_contract_time extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental_contract_time);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }

    public void fun_increase_time(View view) {
        startActivity(new Intent(this , rental_increase_time.class));
    }

    public void fun_decrease_time(View view) {
        startActivity(new Intent(this , rental_decrease_time.class));
    }

    public void fun_change_shift(View view) {
        startActivity(new Intent(this , rental_change_shift.class));
    }
}