package com.equipation.balagat.fleet.maintenances;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.equipation.balagat.R;

public class monthly extends AppCompatActivity {

    Integer Counter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly);



    }


    public void fun_back(View view) {
        super.onBackPressed();
    }
}