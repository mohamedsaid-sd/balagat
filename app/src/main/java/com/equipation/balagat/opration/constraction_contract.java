package com.equipation.balagat.opration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;
import com.equipation.balagat.contract_time_sheet;
import com.equipation.balagat.opration.constraction.main_camp;
import com.equipation.balagat.opration.constraction.main_liquidation;
import com.equipation.balagat.opration.constraction.main_reports;
import com.equipation.balagat.opration.constraction.main_time_sheet;
import com.equipation.balagat.opration.production.production_contract_location;
import com.equipation.balagat.opration.production.production_contract_terms;
import com.equipation.balagat.opration.production.production_contract_time;

public class constraction_contract extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraction_contract);

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

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }

    public void fun_main_report(View view) {
        startActivity(new Intent( this , main_reports.class ));
    }

    public void fun_weekly_liquidation(View view) {
        startActivity(new Intent( this , main_liquidation.class ));
    }

    public void fun_main_time_sheet(View view) {
        startActivity(new Intent( this , main_time_sheet.class ));
    }


}