package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.equipation.balagat.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class request_vacation extends AppCompatActivity {

    LinearLayout layout_hag , layout_relative  ;

    AutoCompleteTextView sp_vacation_type  , sp_relative;

    ArrayList<String> ar_vication_type , ar_relative ;

    TextInputLayout ti_relative ,reasonlayout,filedotor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_vacation);


        ar_vication_type = new ArrayList<>();
        ar_relative = new ArrayList<>();

        ar_relative.add("نعم");
        ar_relative.add("لا");

        ar_vication_type.add(" إجازة سنوية ");
        ar_vication_type.add(" إجازة مرضية ");
        ar_vication_type.add(" إجازة إستثنائية ");
        ar_vication_type.add(" إجازة عارضة ");
        ar_vication_type.add("حج");
        ar_vication_type.add("وفاة");



        Casing();


        layout_relative.setVisibility(View.GONE);
        ti_relative.setVisibility(View.GONE);

        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_vication_type);
        sp_vacation_type.setAdapter(adapter_spinner_borrow_type);

        ArrayAdapter<String> adapter_relative = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_relative);
        sp_relative.setAdapter(adapter_relative);


        sp_vacation_type.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_vication_type.get(i).equals("حج")){
                ti_relative.setVisibility(View.GONE);
                layout_hag.setVisibility(View.VISIBLE);
                layout_relative.setVisibility(View.GONE);
                reasonlayout.setVisibility(View.GONE);
                filedotor.setVisibility(View.GONE);
            }else if(ar_vication_type.get(i).equals("وفاة")){
                ti_relative.setVisibility(View.GONE);
                layout_hag.setVisibility(View.GONE);
                reasonlayout.setVisibility(View.GONE);
                filedotor.setVisibility(View.GONE);
                layout_relative.setVisibility(View.VISIBLE);
            }else  if(ar_vication_type.get(i).equals(" إجازة عارضة ")||ar_vication_type.get(i).equals(" إجازة إستثنائية ")){
                ti_relative.setVisibility(View.GONE);
                layout_hag.setVisibility(View.GONE);
                layout_relative.setVisibility(View.GONE);
                filedotor.setVisibility(View.GONE);
                reasonlayout.setVisibility(View.VISIBLE);

            }else if(ar_vication_type.get(i).equals(" إجازة مرضية ")){
                ti_relative.setVisibility(View.GONE);
                layout_hag.setVisibility(View.GONE);
                reasonlayout.setVisibility(View.GONE);
                layout_relative.setVisibility(View.GONE);
                filedotor.setVisibility(View.VISIBLE);
            }else {
                layout_hag.setVisibility(View.GONE);
                layout_relative.setVisibility(View.GONE);
                ti_relative.setVisibility(View.GONE);
                reasonlayout.setVisibility(View.GONE);
                filedotor.setVisibility(View.GONE);
            }
        });

        sp_relative.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_relative.get(i).equals("نعم")){
                    ti_relative.setVisibility(View.VISIBLE);
                }else{
                    ti_relative.setVisibility(View.GONE);
                }
            }
        });

    }

    private void Casing() {
        sp_vacation_type = findViewById(R.id.sp_vacation_type);
        sp_relative = findViewById(R.id.sp_relative);
        layout_hag= findViewById(R.id.layout_hag);
        layout_relative = findViewById(R.id.layout_relative);
        ti_relative = findViewById(R.id.ti_relative);
        reasonlayout = findViewById(R.id.reasonlayout);
        filedotor = findViewById(R.id.filedotor);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }

}