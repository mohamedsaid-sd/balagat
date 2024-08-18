package com.equipation.balagat.deportation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.equipation.balagat.R;

public class deportation_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportation_main);
    }

    public void fun_back(View view) {
    }

    public void fun_form(View view) {
        startActivity(new Intent( this , order_deportation.class ) );

    }
}