package com.equipation.balagat.contracts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;
import com.equipation.balagat.time;

public class contract_location extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contract_location);

    }

    public void fun_need(View view) {
        startActivity(new Intent(this , machin_need.class));
    }

    public void fun_travel(View view) {
        startActivity(new Intent(this , machin_travel.class));
    }

    public void fiun_add(View view) {
        startActivity(new Intent(this , add_operator.class));

    }

    public void fiun_complaint(View view) {
        startActivity(new Intent(this , complaint.class));
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}