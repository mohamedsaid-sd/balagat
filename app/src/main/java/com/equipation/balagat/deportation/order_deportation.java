package com.equipation.balagat.deportation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class order_deportation extends AppCompatActivity {

    AutoCompleteTextView sp_unit ,sp_condiation,sp_means;

    ArrayList<String> ar_unit,ar_condiation,ar_means ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_deportation);

        ar_unit = new ArrayList<>();
        ar_condiation = new ArrayList<>();
        ar_means = new ArrayList<>();


        ar_unit.add("قطعة");
        ar_unit.add("لتر");
        ar_unit.add("متر");
        ar_unit.add("كيلوجرام");
        ar_unit.add("صندوق");
        ar_unit.add("علبة");



        ar_condiation.add("جديد");
        ar_condiation.add("مستعمل");
        ar_condiation.add("متهالك");
        ar_condiation.add("تالف");
        ar_condiation.add("منتهي الصلاحية");
        ar_condiation.add("قيد الاصلاح");

        ar_means.add("معدات");
        ar_means.add("افراد");

        Casting();

        ArrayAdapter<String> adapter_sp_unit = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_unit);
        sp_unit.setAdapter(adapter_sp_unit);

        ArrayAdapter<String> adapter_sp_condiation = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_condiation);
        sp_condiation.setAdapter(adapter_sp_condiation);

        ArrayAdapter<String> adapter_sp_means = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_means);
        sp_means.setAdapter(adapter_sp_means);

    }

    private void Casting() {
        sp_unit = findViewById(R.id.sp_unit);
        sp_condiation = findViewById(R.id.sp_condiation);
        sp_means = findViewById(R.id.sp_means);
    }

    public void fun_back(View view) {
    }
}