package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class complaint_request extends AppCompatActivity {


    AutoCompleteTextView at_evidence , at_complant_type  ;

    ArrayList<String> ar_complant_type , ar_evidence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint_request);

        ar_complant_type = new ArrayList<>();
        ar_evidence = new ArrayList<>();

        ar_complant_type.add("   عاديه   ");
        ar_complant_type.add("   عاجلة   ");
        ar_complant_type.add(" عاجلة جدا  ");

        ar_evidence.add(" مستندات ");
        ar_evidence.add(" رسائل ");
        ar_evidence.add(" شهود ");

        Casing();
        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_complant_type);
        at_complant_type.setAdapter(adapter_spinner_borrow_type);

        ArrayAdapter<String> adapter_evidence = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_evidence);
        at_evidence.setAdapter(adapter_evidence);

    }

    private void Casing() {
        at_evidence = findViewById(R.id.at_evidence);
        at_complant_type = findViewById(R.id.at_complant_type);
    }

    public void fun_back(View view) {
        super.onBackPressed();

    }
}