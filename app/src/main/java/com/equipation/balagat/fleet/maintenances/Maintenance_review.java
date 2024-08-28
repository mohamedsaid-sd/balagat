package com.equipation.balagat.fleet.maintenances;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;

import java.util.ArrayList;

public class Maintenance_review extends AppCompatActivity {


    AutoCompleteTextView sp_machine_type ,sp_damage,sp_damage_type,sp_last_damage,sp_damage_reason;
    ArrayList<String> ar_machine_type,ar_damage,ar_damage_type,ar_sp_last_damage,ar_sp_damage_reason ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance_review);
        ar_machine_type = new ArrayList<>();
        ar_damage = new ArrayList<>();
        ar_damage_type = new ArrayList<>();
        ar_sp_last_damage = new ArrayList<>();
        ar_sp_damage_reason = new ArrayList<>();

        ar_sp_damage_reason.add("عدم الصيانة بشكل جيد");
        ar_sp_damage_reason.add("عدم توفر الأسبير");
        ar_sp_damage_reason.add("تعطل جديد");



        ar_sp_last_damage.add("وقائية ");
        ar_sp_last_damage.add("علاجية");



        ar_machine_type.add("جردل");
        ar_machine_type.add("جردل+جاك همر");
        ar_machine_type.add("جاك همر");
        ar_machine_type.add("نقل");
        ar_machine_type.add("تشوين");


        ar_damage.add("   عادي   ");
        ar_damage.add("   عاجل   ");
        ar_damage.add(" عاجلة جدا  ");


        ar_damage_type.add("ماكينة");
        ar_damage_type.add("هيدروليك");
        ar_damage_type.add("حركة");
        ar_damage_type.add("كهرباء");
        ar_damage_type.add("فرامل");
        ar_damage_type.add("الإطارات");
        ar_damage_type.add("الهيكل العام");



        Casting();


        ArrayAdapter<String> adapter_sp_last_damage = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_sp_last_damage);
        sp_last_damage.setAdapter(adapter_sp_last_damage);

        ArrayAdapter<String> adapter_machine_type = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_machine_type);
        sp_machine_type.setAdapter(adapter_machine_type);

        ArrayAdapter<String> adapter_machine_type1 = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_damage);
        sp_damage.setAdapter(adapter_machine_type1);

        ArrayAdapter<String> adapter_machine_type2 = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_damage_type);
        sp_damage_type.setAdapter(adapter_machine_type2);


        ArrayAdapter<String> adapter_sp_damage_reason= new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , ar_sp_damage_reason);
        sp_damage_reason.setAdapter(adapter_sp_damage_reason);





    }
    private void Casting() {
        sp_machine_type = findViewById(R.id.sp_machine_type);
        sp_damage = findViewById(R.id.sp_damage);
        sp_damage_type = findViewById(R.id.sp_damage_type);
        sp_last_damage = findViewById(R.id.sp_last_damage);
        sp_damage_reason = findViewById(R.id.sp_damage_reason);


    }


    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }


}