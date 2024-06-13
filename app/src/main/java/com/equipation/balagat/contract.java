package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;

import com.equipation.balagat.opration.production.production_contract_location;
import com.equipation.balagat.opration.production.production_contract_terms;
import com.equipation.balagat.opration.production.production_contract_time;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class contract extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contract);
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

    public void fun_time_sheet(View view) {
        startActivity(new Intent( this , contract_time_sheet.class ));
    }
}