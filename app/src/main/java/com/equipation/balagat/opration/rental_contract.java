package com.equipation.balagat.opration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;
import com.equipation.balagat.opration.rental.rental_contract_location;
import com.equipation.balagat.opration.rental.rental_contract_time;
import com.equipation.balagat.opration.rental.rental_sub_contract;
import com.equipation.balagat.opration.rental.rental_time_sheet;
import com.equipation.balagat.opration.rental.sub_liquidation;

public class rental_contract extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental_contract);
    }
    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }



    public void fun_contract_contract(View view) {
        startActivity(new Intent( this , rental_sub_contract.class ));
    }

    public void fun_contract_time(View view) {
        startActivity(new Intent( this , rental_contract_time.class ));
    }

    public void fun_contract_location(View view) {
        startActivity(new Intent( this , rental_contract_location.class ));
    }

//    public void fun_time_sheet(View view) {
//        startActivity(new Intent( this , sub_liquidation.class ));
//    }

    public void fun_rental_time_sheet(View view) {
        startActivity(new Intent( this , rental_time_sheet.class ));
    }
}