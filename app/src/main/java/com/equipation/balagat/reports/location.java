package com.equipation.balagat.reports;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class location extends AppCompatActivity {

    AutoCompleteTextView at_evidence , at_complant_type,type_report,limit_complant_type  ;

    ArrayList<String> ar_complant_type , ar_evidence,ar_type_report,ar_limit_complant_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location2);

        ar_complant_type = new ArrayList<>();
        ar_evidence = new ArrayList<>();
        ar_type_report = new ArrayList<>();
        ar_limit_complant_type = new ArrayList<>();



        ar_type_report.add("   بلاغ اداري   ");
        ar_type_report.add("   بلاغ تشغيلي   ");


        ar_complant_type.add("   عاديه   ");
        ar_complant_type.add("   عاجلة   ");
        ar_complant_type.add(" عاجلة جدا  ");


        ar_limit_complant_type.add("   عاديه   ");
        ar_limit_complant_type.add("   عاجلة   ");
        ar_limit_complant_type.add(" عاجلة جدا  ");

        ar_evidence.add(" مستندات ");
        ar_evidence.add(" صور ");
        ar_evidence.add(" شهود ");

        Casing();


        ArrayAdapter<String> adapter_type_report = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_type_report);
        type_report.setAdapter(adapter_type_report);

        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_complant_type);
        at_complant_type.setAdapter(adapter_spinner_borrow_type);

        ArrayAdapter<String> adapter_evidence = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_evidence);
        at_evidence.setAdapter(adapter_evidence);

        ArrayAdapter<String> adapter_limit_complant_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_limit_complant_type);
        limit_complant_type.setAdapter(adapter_limit_complant_type);
    }

    private void Casing() {
        at_evidence = findViewById(R.id.at_evidence);
        at_complant_type = findViewById(R.id.at_complant_type);
        type_report = findViewById(R.id.type_report);
        limit_complant_type = findViewById(R.id.limit_complant_type);




    }

    public void fun_back(View view) {
        super.onBackPressed();

    }
}