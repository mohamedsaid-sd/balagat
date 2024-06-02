package com.equipation.balagat.humans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class PPE_request extends AppCompatActivity {

    AutoCompleteTextView filed_exposed , at_machinework_type ;
    ArrayList ar_machine_type,ar_machinework_type ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppe_request);

        String[] array = new String[] {"Firest item" , "second item" , "thired item "};


        ar_machine_type = new ArrayList<>();

        ar_machine_type.add("خوذة");
        ar_machine_type.add("حذاء سلامة");
        ar_machine_type.add("ابرول");
        ar_machine_type.add("نظارات واقية");
        ar_machine_type.add("قفازات");
        ar_machine_type.add("عاكس");
        ar_machine_type.add("كمامة");
        ar_machine_type.add("سدادات أذن");



        ar_machinework_type = new ArrayList<>();

        ar_machinework_type.add("مصنع");
        ar_machinework_type.add("منجم");
        ar_machinework_type.add("طريق");
        ar_machinework_type.add("اخري");


        Casting();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this ,
                R.layout.nice_select_item ,
                ar_machine_type
        );
        filed_exposed.setAdapter(adapter);
        filed_exposed.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(
                this ,
                R.layout.nice_select_item ,
                ar_machinework_type
        );
        at_machinework_type.setAdapter(adapter2);
        at_machinework_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }

    private void Casting() {
        filed_exposed = findViewById(R.id.filed_exposed);
        at_machinework_type = findViewById(R.id.at_machinework_type);
    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}