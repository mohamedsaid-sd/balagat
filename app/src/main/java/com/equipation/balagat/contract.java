package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.contracts.request_renew_contract;
import com.equipation.balagat.contracts.request_settlement_contract;
import com.equipation.balagat.contracts.request_deportation;
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

    public void fun_renew_contract(View view) {
        startActivity(new Intent( this , request_renew_contract.class ));
    }

    public void fun_settlement_contract(View view) {
        startActivity(new Intent( this , request_settlement_contract.class ));
    }

    public void fun_deportation(View view){
        startActivity(new Intent( this , request_deportation.class ));
    }


    public void fun_request_new_contract(View view) {
        startActivity(new Intent( this , request_new_contract.class ));
    }
}