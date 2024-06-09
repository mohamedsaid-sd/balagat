package com.equipation.balagat.folderpurchases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class purchase_order extends AppCompatActivity {

    AutoCompleteTextView sp_time;
    ArrayList<String> ar_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_order);

        ar_time = new ArrayList<>();


        ar_time.add("   عاديه   ");
        ar_time.add("   عاجلة   ");
        ar_time.add(" عاجلة جدا  ");

        Casting();

        ArrayAdapter<String> adapter_machine_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_time);
        sp_time.setAdapter(adapter_machine_type);
    }
    private void Casting() {
        sp_time = findViewById(R.id.sp_time);

    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();

    }
}