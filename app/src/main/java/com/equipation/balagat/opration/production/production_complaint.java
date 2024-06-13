package com.equipation.balagat.opration.production;

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

public class production_complaint extends AppCompatActivity {

    AutoCompleteTextView sp_complainant_type , sp_complaint_type , sp_management_complaint
            , sp_opration_complaint , sp_evidence , sp_complaint_status ;

    ArrayList<String> ar_complainant_type , ar_complaint_type , ar_management_complaint
            , ar_opration_complaint , ar_evidence , ar_complaint_status ;

    LinearLayout layout_management , layout_opration ;

    TextInputLayout ti_evidence ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);

        ar_complainant_type = new ArrayList<>();
        ar_complaint_type = new ArrayList<>();
        ar_management_complaint = new ArrayList<>();
        ar_opration_complaint = new ArrayList<>();
        ar_evidence = new ArrayList<>();
        ar_complaint_status = new ArrayList<>();

        ar_complainant_type.add("المؤجر");
        ar_complainant_type.add("مشرف الموقع");

        ar_complaint_type.add("شكوى إدارية");
        ar_complaint_type.add("شكوى تشغيلية");

        ar_management_complaint.add("إدارة التشغيل");
        ar_management_complaint.add("الصيانة");

        ar_opration_complaint.add("العقودات");
        ar_opration_complaint.add("الموارد البشرية");
        ar_opration_complaint.add("الحسابات");

        ar_evidence.add("مستندات");
        ar_evidence.add("رسائل");
        ar_evidence.add("شهود");

        ar_complaint_status.add("عادية");
        ar_complaint_status.add("عاجلة");
        ar_complaint_status.add("عاجلة جدا");

        Casting();

        ArrayAdapter<String> adapter_complainant_type = new ArrayAdapter<>(
                this ,   R.layout.nice_select_item
                , ar_complainant_type);sp_complainant_type.setAdapter(adapter_complainant_type);

        ArrayAdapter<String> adapter_complaint_type = new ArrayAdapter<>(
                this ,  R.layout.nice_select_item
                , ar_complaint_type);
        sp_complaint_type.setAdapter(adapter_complaint_type);
        sp_complaint_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                layout_management.setVisibility(View.GONE);
                layout_opration.setVisibility(View.GONE);

                if(ar_complaint_type.get(i).equals("شكوى إدارية")){
                    layout_management.setVisibility(View.VISIBLE);
                }

                if(ar_complaint_type.get(i).equals("شكوى تشغيلية")){
                    layout_opration.setVisibility(View.VISIBLE);
                }

            }

        });

        ArrayAdapter<String> adapter_management_complaint = new ArrayAdapter<>(
                this ,   R.layout.nice_select_item
                , ar_management_complaint);sp_management_complaint.setAdapter(adapter_management_complaint);

        ArrayAdapter<String> adapter_opration_complaint = new ArrayAdapter<>(
                this ,  R.layout.nice_select_item
                , ar_opration_complaint);sp_opration_complaint.setAdapter(adapter_opration_complaint);

        ArrayAdapter<String> adapter_evidence = new ArrayAdapter<>(
                this ,  R.layout.nice_select_item
                , ar_evidence);sp_evidence.setAdapter(adapter_evidence);
        sp_evidence.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ti_evidence.setVisibility(View.GONE);
                if(ar_evidence.get(i).equals("شهود")){
                    ti_evidence.setVisibility(View.VISIBLE);
                }
            }

        });

        ArrayAdapter<String> adapter_complaint_status = new ArrayAdapter<>(
                this ,  R.layout.nice_select_item
                , ar_complaint_status);sp_complaint_status.setAdapter(adapter_complaint_status);

    }

    private void Casting() {
        sp_complainant_type = findViewById(R.id.sp_complainant_type);
        sp_complaint_type = findViewById(R.id.sp_complaint_type);
        sp_management_complaint = findViewById(R.id.sp_management_complaint);
        sp_opration_complaint = findViewById(R.id.sp_opration_complaint);
        sp_evidence  = findViewById(R.id.sp_evidence);
        sp_complaint_status = findViewById(R.id.sp_complaint_status);
        layout_management = findViewById(R.id.management);
        layout_opration = findViewById(R.id.opration);
        ti_evidence = findViewById(R.id.ti_evidence);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}