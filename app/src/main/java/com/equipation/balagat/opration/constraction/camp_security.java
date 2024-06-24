package com.equipation.balagat.opration.constraction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class camp_security extends AppCompatActivity {


    AutoCompleteTextView sp_equipment;

    ArrayList<String> ar_sp_equipment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camp_security);

        ar_sp_equipment = new ArrayList<>();


        ar_sp_equipment.add("خوذ");
        ar_sp_equipment.add("أحذية واقية");
        ar_sp_equipment.add("قفازات");
        ar_sp_equipment.add("أبرولات");
        ar_sp_equipment.add("نظارات واقية");
        ar_sp_equipment.add("عواكس");

        Casting();

        ArrayAdapter<String> adapter_sp_equipment = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_sp_equipment);
        sp_equipment.setAdapter(adapter_sp_equipment);



    }

    private void Casting() {
        sp_equipment = findViewById(R.id.sp_equipment);

    }

    public void fun_back(View view) {
    }
}