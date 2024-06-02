package com.equipation.balagat.maintenances;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class therapeutic_maintenance_request extends AppCompatActivity {

    Spinner sp_machine_type ,sp_damage,sp_damage_type;
    ArrayList ar_machine_type,ar_damage,ar_damage_type ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therapeutic_maintenance_request);


        ar_machine_type = new ArrayList<>();
        ar_damage = new ArrayList<>();
        ar_damage_type = new ArrayList<>();

        ar_machine_type.add("جردل");
        ar_machine_type.add("جردل+جاك همر");
        ar_machine_type.add("جاك همر");
        ar_machine_type.add("نقل");
        ar_machine_type.add("تشوين");


        ar_damage.add("   عاديه   ");
        ar_damage.add("   عاجلة   ");
        ar_damage.add(" عاجلة جدا  ");


        ar_damage_type.add("ماكينة");
        ar_damage_type.add("هيدروليك");
        ar_damage_type.add("حركة");
        ar_damage_type.add("كهرباء");
        ar_damage_type.add("فرامل");
        ar_damage_type.add("اإلطارات");
        ar_damage_type.add("الهيكل العام");



        Casting();

        ArrayAdapter adapter_machine_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_machine_type);
        sp_machine_type.setAdapter(adapter_machine_type);

        ArrayAdapter adapter_machine_type1 = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_damage);
        sp_damage.setAdapter(adapter_machine_type1);

        ArrayAdapter adapter_machine_type2 = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_damage_type);
        sp_damage_type.setAdapter(adapter_machine_type2);
    }


    private void Casting() {
        sp_machine_type = findViewById(R.id.sp_machine_type);
        sp_damage = findViewById(R.id.sp_damage);
        sp_damage_type = findViewById(R.id.sp_damage_type);


    }


    public void fun_back(View view) {
        super.onBackPressed();
    }
}