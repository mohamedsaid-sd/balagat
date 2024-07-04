package com.equipation.balagat.fleet.maintenances;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


import com.equipation.balagat.R;

import java.util.ArrayList;

public class part_maintenance extends AppCompatActivity {

    AutoCompleteTextView sp_machine_type ,sp_location_type;


    ArrayList ar_machine_type,ar_location_type ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_maintenance);

        ar_machine_type = new ArrayList<>();
        ar_location_type = new ArrayList<>();

        ar_machine_type.add("جردل");
        ar_machine_type.add("جردل+جاك همر");
        ar_machine_type.add("جاك همر");
        ar_machine_type.add("نقل");
        ar_machine_type.add("تشوين");


        ar_location_type.add("   يحتاج ترحيل   ");
        ar_location_type.add("   لا يحتاج   ");
        Casting();

        ArrayAdapter adapter_machine_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_machine_type);
        sp_machine_type.setAdapter(adapter_machine_type);

        ArrayAdapter adapter_machine_type1 = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_location_type);
        sp_location_type.setAdapter(adapter_machine_type1);
    }
    private void Casting() {
        sp_machine_type = findViewById(R.id.sp_machine_type);
        sp_location_type = findViewById(R.id.sp_location_type);



    }
    public void fun_back(View view) {
        super.onBackPressed();
    }
}