package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class complaint_request extends AppCompatActivity {


    Spinner sp_complant_type ;
    ArrayList<String> ar_complant_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint_request);

        ar_complant_type = new ArrayList<>();

        ar_complant_type.add("   عاديه   ");
        ar_complant_type.add("   عاجلة   ");
        ar_complant_type.add(" عاجلة جدا  ");
        Casing();
        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_complant_type);
        sp_complant_type.setAdapter(adapter_spinner_borrow_type);
    }

    private void Casing() {
        sp_complant_type = findViewById(R.id.sp_complant_type);

    }

    public void fun_back(View view) {
        super.onBackPressed();

    }
}