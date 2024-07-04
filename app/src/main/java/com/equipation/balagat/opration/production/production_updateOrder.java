package com.equipation.balagat.opration.production;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class production_updateOrder extends AppCompatActivity {

    LinearLayout lay_option1 , lay_option2 ;
    AutoCompleteTextView sp_updatetype;
    ArrayList<String> ar_updatetype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production_update_order);
        ar_updatetype = new ArrayList<>();


        ar_updatetype.add("تعديل في ساعات العمل");
        ar_updatetype.add("تعديل في ساعات الاستعداد");


        Casting();

        ArrayAdapter<String> adapter_machine_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_updatetype);
        sp_updatetype.setAdapter(adapter_machine_type);
        sp_updatetype.setOnItemClickListener((adapterView, view, i, l) -> {

            // hide all layouts
            lay_option1.setVisibility(View.GONE);
            lay_option2.setVisibility(View.GONE);

            // display option 1 if select
            if(ar_updatetype.get(i).equals("تعديل في ساعات العمل")){
                lay_option1.setVisibility(View.VISIBLE);
            }

            // display option 2 if select
            if(ar_updatetype.get(i).equals("تعديل في ساعات الاستعداد")){
                lay_option2.setVisibility(View.VISIBLE);
            }

        });
    }

    private void Casting() {
        sp_updatetype = findViewById(R.id.sp_updatetype);
        lay_option1 = findViewById(R.id.lay_option1);
        lay_option2 = findViewById(R.id.lay_option2);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }
}