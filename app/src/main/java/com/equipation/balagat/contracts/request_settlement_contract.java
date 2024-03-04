package com.equipation.balagat.contracts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;

public class request_settlement_contract extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_settlement_contract);

    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}