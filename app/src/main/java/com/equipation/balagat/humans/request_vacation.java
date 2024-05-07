package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class request_vacation extends AppCompatActivity {

    LinearLayout layout_hag  ;
    Spinner sp_vacation_type ;
    ArrayList<String> ar_vication_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_vacation);

        ar_vication_type = new ArrayList<>();

        ar_vication_type.add(" إجازة سنوية ");
        ar_vication_type.add(" إجازة مرضية ");
        ar_vication_type.add(" إجازة إستثنائية ");
        ar_vication_type.add(" إجازة عارضة ");
        ar_vication_type.add("حج");
        ar_vication_type.add("وفاة");



        Casing();

        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_vication_type);
        sp_vacation_type.setAdapter(adapter_spinner_borrow_type);

        sp_vacation_type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_vication_type.get(i).equals("حج")){
                    layout_hag.setVisibility(View.VISIBLE);
                }else{
                    layout_hag.setVisibility(View.GONE);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void Casing() {
        sp_vacation_type = findViewById(R.id.sp_vacation_type);
        layout_hag= findViewById(R.id.layout_hag);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }

}