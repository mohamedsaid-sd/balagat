package com.equipation.balagat.fleet.spare;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;

public class update_spare_fleet extends AppCompatActivity {

    AutoCompleteTextView at_update_type ;
    ArrayList<String> ar_update_type ;
    TextInputEditText tiet_old , tiet_new ;

    LinearLayout lay ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_spare_fleet);
        initialize();
        casting();
        fill_update_type();
        link_update_type();
        lay.setVisibility(View.GONE);
        at_update_type.setOnItemClickListener((adapterView, view, i, l) -> {
            lay.setVisibility(View.VISIBLE);
            if(ar_update_type.get(i).equals("الوصف"))
                update_value("الوصف السابق" , "الوصف الجديد");

            if(ar_update_type.get(i).equals("الكمية"))
                update_value(" الكمية السابقة" , "الكمية الجديدة");

            if(ar_update_type.get(i).equals("حالة القطعة"))
                update_value(" الحالة السابقة " , "الحالة الجديدة ( جديدة + مستخدمة + تالفة ) - يدوي ");

            if(ar_update_type.get(i).equals("السعر"))
                update_value("السعر السابق" , "السعر الجديد");

            if(ar_update_type.get(i).equals("المورد"))
                update_value(" المورد السابق" , "المورد الجديد");

            if(ar_update_type.get(i).equals("تاريخ الاستلام"))
                update_value(" تاريخ االستالم السابق" , "تاريخ االستالم الجديد");

            if(ar_update_type.get(i).equals("موقع التخزين"))
                update_value("موقع التخزين السابق" , "موقع التخزين الجديد");


        });
    }

    private void update_value(String old_value, String new_value) {
        tiet_old.setHint(old_value);
        tiet_new.setHint(new_value);
    }

    private void initialize() {
        ar_update_type = new ArrayList<>();
    }

    private void casting() {
        at_update_type = findViewById(R.id.at_update_type);
        tiet_new = findViewById(R.id.tiet_new);
        tiet_old = findViewById(R.id.tiet_old);
        lay      = findViewById(R.id.lay);
    }

    private void fill_update_type() {
        ar_update_type.add("الوصف");
        ar_update_type.add("الكمية");
        ar_update_type.add("حالة القطعة");
        ar_update_type.add("السعر");
        ar_update_type.add("المورد");
        ar_update_type.add("تاريخ الاستلام");
        ar_update_type.add("موقع التخزين");
    }

    private void link_update_type() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this , R.layout.nice_select_item , ar_update_type);
        at_update_type.setAdapter(adapter);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }
}