package com.equipation.balagat.opration.constraction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.equipation.balagat.R;

public class main_time_sheet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_time_sheet);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }

    public void fun_con_tim_hours_work(View view) {
        startActivity(new Intent( this , con_tim_hours_work.class ));
    }

    public void fun_con_tim_production(View view) {
        startActivity(new Intent( this , con_tim_production.class ));
    }
}