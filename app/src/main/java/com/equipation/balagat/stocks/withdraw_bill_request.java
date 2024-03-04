package com.equipation.balagat.stocks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;

public class withdraw_bill_request extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw_bill);
    }
    public void fun_back(View view) {
        super.onBackPressed();
    }
}