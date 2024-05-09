package com.equipation.balagat.contracts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.equipation.balagat.contract;

import com.equipation.balagat.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class request_renew_contract extends AppCompatActivity {


    LinearLayout sp_partial_layout  ;

    TextInputLayout days,hours;

    Spinner sp_renew_type,sp_partial_type,sp_location_type;
    ArrayList<String> ar_renew_type,ar_partial_type,ar_location_type ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_renew_contract);
        Casting();
        ar_renew_type = new ArrayList<>();
        ar_partial_type = new ArrayList<>();
        ar_location_type = new ArrayList<>();




        ar_renew_type.add("عقد كامل");
        ar_renew_type.add("عقد جزئي");


        ar_partial_type.add("بالساعات");
        ar_partial_type.add("بالايام");

        ar_location_type.add("الموقع الحالي");
        ar_location_type.add("موقع جديد");



        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, ar_renew_type);
        sp_renew_type.setAdapter(adapter_spinner_borrow_type);



        ArrayAdapter<String> adapter_spinner_borrow_type2 = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, ar_partial_type);
        sp_partial_type.setAdapter(adapter_spinner_borrow_type2);

        ArrayAdapter<String> adapter_spinner_borrow_type3 = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, ar_location_type);
        sp_location_type.setAdapter(adapter_spinner_borrow_type3);




        sp_renew_type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_renew_type.get(i).equals("عقد جزئي")){
                    sp_partial_layout.setVisibility(View.VISIBLE);

                }else{
                    sp_partial_layout.setVisibility(View.GONE);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        sp_partial_type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_partial_type.get(i).equals("بالايام")){
                    days.setVisibility(View.VISIBLE);
                    hours.setVisibility(View.GONE);


                }else{
                    days.setVisibility(View.GONE);
                    hours.setVisibility(View.VISIBLE);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void Casting() {
        sp_renew_type = findViewById(R.id.sp_renew_type);
        sp_partial_type = findViewById(R.id.sp_partial_type);
        sp_location_type = findViewById(R.id.sp_location_type);

        sp_partial_layout = findViewById(R.id.sp_partial_layout);
        days = findViewById(R.id.days);
        hours = findViewById(R.id.hours);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}