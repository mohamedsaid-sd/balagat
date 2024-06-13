package com.equipation.balagat.opration.rental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;

public class rental_sub_contract extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental_sub_contract);
    }

    public void fun_renew_contract(View view) {

        startActivity(new Intent( this , rental_renew_contract.class ));
    }

    public void fun_terminate(View view) {

        startActivity(new Intent( this , rental_terminat_contract.class ));
    }

    public void fun_rechange(View view) {

        startActivity(new Intent( this ,rental_rechange_machin.class ));

    }

    public void fun_back(View view) {
    }
}