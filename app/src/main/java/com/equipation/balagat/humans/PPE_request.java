package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class PPE_request extends AppCompatActivity {

    Spinner sp_machine_type ;
    ArrayList ar_machine_type ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppe_request);

        ar_machine_type = new ArrayList<>();

        ar_machine_type.add("خوذة");
        ar_machine_type.add("حذاء سلامة");
        ar_machine_type.add("ابرول");
        ar_machine_type.add("نظارات واقية");
        ar_machine_type.add("قفازات");

         Casting();

        ArrayAdapter adapter_machine_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_machine_type);
        sp_machine_type.setAdapter(adapter_machine_type);

    }

    private void Casting() {
        sp_machine_type = findViewById(R.id.sp_machine_type);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}