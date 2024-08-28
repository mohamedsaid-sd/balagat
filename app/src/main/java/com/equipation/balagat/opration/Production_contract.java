package com.equipation.balagat.opration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;
import com.equipation.balagat.opration.production.production_contract_location;
import com.equipation.balagat.opration.production.production_contract_terms;
import com.equipation.balagat.opration.production.production_contract_time;
import com.equipation.balagat.opration.production.production_sub_liquidation;
import com.equipation.balagat.opration.contracts.tons_quantity;

public class Production_contract extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production_contract);
    }
    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }



    public void fun_contract_contract(View view) {
        startActivity(new Intent( this , production_contract_terms.class ));
    }

    public void fun_contract_time(View view) {
        startActivity(new Intent( this , production_contract_time.class ));
    }

    public void fun_contract_location(View view) {
        startActivity(new Intent( this , production_contract_location.class ));
    }

    public void fun_production_sub_liquidation(View view) {
        startActivity(new Intent( this , production_sub_liquidation.class ));
    }

    public void fun_time_sheet(View view) {
        // Go to activity Time Sheet
        startActivity(new Intent( this , tons_quantity.class ));
    }
}