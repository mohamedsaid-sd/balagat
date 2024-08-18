package com.equipation.balagat.fleet.spare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;


import com.equipation.balagat.R;

import java.util.ArrayList;

public class part_maintenance extends AppCompatActivity {

    AutoCompleteTextView sp_machine_type ,sp_location_type;


    ArrayList ar_machine_type,ar_location_type ;
    LinearLayout sp_partial_layout   ;

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


        ar_location_type.add("يحتاج ترحيل");
        ar_location_type.add("   لا يحتاج   ");
        Casting();

        ArrayAdapter adapter_machine_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_machine_type);
        sp_machine_type.setAdapter(adapter_machine_type);

        ArrayAdapter adapter_machine_type1 = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_location_type);
        sp_location_type.setAdapter(adapter_machine_type1);
        sp_location_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_location_type.get(i).equals("يحتاج ترحيل")){
                    sp_partial_layout.setVisibility(View.VISIBLE);
                }else{
                    sp_partial_layout.setVisibility(View.GONE);
                }
            }

        });

    }
    private void Casting() {
        sp_machine_type = findViewById(R.id.sp_machine_type);
        sp_location_type = findViewById(R.id.sp_location_type);
        sp_partial_layout = findViewById(R.id.sp_partial_layout);



    }
    public void fun_back(View view) {
        super.onBackPressed();
    }
}