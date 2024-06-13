package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home_sub1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sub1);
    }

    public void fun_contract(View view) {
        startActivity(new Intent(this , contract.class));
    }

    public void fun_time(View view) {

        startActivity(new Intent(this , time.class));
    }

    public void fiun_location(View view) {
        startActivity(new Intent(this , location.class));
    }

    public void fun_back(View view) {
        super.onBackPressed();

    }
}