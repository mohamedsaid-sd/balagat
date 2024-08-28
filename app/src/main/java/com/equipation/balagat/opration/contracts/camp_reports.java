package com.equipation.balagat.opration.contracts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class camp_reports extends AppCompatActivity {



    AutoCompleteTextView sp_report;
    ArrayList<String> ar_report;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camp_reports);

        ar_report = new ArrayList<>();


        ar_report.add(" صيانة");
        ar_report.add("عطل");
        ar_report.add("نقص مواد");
        ar_report.add("نقص وقود");
        ar_report.add(" مشكلة في السلامة");
        ar_report.add("حادث");

        Casting();

        ArrayAdapter<String> adapter_sp_report= new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_report);
        sp_report.setAdapter(adapter_sp_report);
    }
    private void Casting() {
        sp_report = findViewById(R.id.sp_report);

    }

    public void fun_back(View view) {
    }
}