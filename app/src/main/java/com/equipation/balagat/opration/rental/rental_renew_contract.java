package com.equipation.balagat.opration.rental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;

import com.equipation.balagat.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class rental_renew_contract extends AppCompatActivity {

    LinearLayout sp_partial_layout  ;

    TextInputLayout days,hours , new_location;

    AutoCompleteTextView sp_renew_type,sp_partial_type,sp_location_type;
    ArrayList<String> ar_renew_type,ar_partial_type,ar_location_type ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental_renew_contract);
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
                R.layout.nice_select_item, ar_renew_type);
        sp_renew_type.setAdapter(adapter_spinner_borrow_type);



        ArrayAdapter<String> adapter_spinner_borrow_type2 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_partial_type);
        sp_partial_type.setAdapter(adapter_spinner_borrow_type2);

        ArrayAdapter<String> adapter_spinner_borrow_type3 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_location_type);
        sp_location_type.setAdapter(adapter_spinner_borrow_type3);

        sp_location_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                new_location.setVisibility(View.GONE);
                if(ar_location_type.get(i).equals("موقع جديد"))
                    new_location.setVisibility(View.VISIBLE);
            }

        });




        sp_renew_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_renew_type.get(i).equals("عقد جزئي")){
                    sp_partial_layout.setVisibility(View.VISIBLE);

                }else{
                    sp_partial_layout.setVisibility(View.GONE);

                }
            }

        });



        sp_partial_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(ar_partial_type.get(i).equals("بالايام")){
                    days.setVisibility(View.VISIBLE);
                    hours.setVisibility(View.GONE);


                }else{
                    days.setVisibility(View.GONE);
                    hours.setVisibility(View.VISIBLE);

                }
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
        new_location = findViewById(R.id.new_location);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}