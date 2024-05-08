package com.equipation.balagat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.contracts.increase_time;
import com.equipation.balagat.contracts.decrease_time;


public class time extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

    }

    public void fun_back(View view) {
        super.onBackPressed();
    }

    public void fun_increase_time(View view) {
        startActivity(new Intent(this , increase_time.class));
    }

    public void fun_decrease_time(View view) {
        startActivity(new Intent(this , decrease_time.class));
    }
}