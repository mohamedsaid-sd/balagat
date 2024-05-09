package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;

import com.equipation.balagat.contracts.contract_location;
import com.equipation.balagat.contracts.contract_terms;
import com.equipation.balagat.contracts.contract_time;
import com.equipation.balagat.contracts.request_renew_contract;

import com.equipation.balagat.contracts.request_new_contract;

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
        super.onBackPressed();
    }



    public void fun_contract_contract(View view) {
        startActivity(new Intent( this , contract_terms.class ));
    }

    public void fun_contract_time(View view) {
        startActivity(new Intent( this , contract_time.class ));
    }

    public void fun_contract_location(View view) {
       startActivity(new Intent( this , contract_location.class ));
    }

    public void fun_time_sheet(View view) {
        startActivity(new Intent( this , contract_time_sheet.class ));
    }
}