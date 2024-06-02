package com.equipation.balagat.contracts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;

public class contract_terms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contract_terms);
    }

    public void fun_renew_contract(View view) {

        startActivity(new Intent( this , request_renew_contract.class ));
    }

    public void fun_terminate(View view) {

        startActivity(new Intent( this , terminat_contract.class ));
    }

    public void fun_rechange(View view) {

        startActivity(new Intent( this , rechange_machin.class ));

    }

    public void fun_back(View view) {
    }
}