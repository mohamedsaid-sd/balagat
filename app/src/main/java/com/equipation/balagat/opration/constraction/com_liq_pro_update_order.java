package com.equipation.balagat.opration.constraction;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;

import java.util.ArrayList;

public class com_liq_pro_update_order extends AppCompatActivity {


    LinearLayout lay_option1 , lay_option2 ;
    AutoCompleteTextView sp_updatetype;
    ArrayList<String> ar_updatetype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com_liq_pro_update_order);
        ar_updatetype = new ArrayList<>();
        ar_updatetype.add("تعديل في عدد النقلات");
        ar_updatetype.add("تعديل في عدد الاوزان");
        Casting();
        ArrayAdapter<String> adapter_machine_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_updatetype);
        sp_updatetype.setAdapter(adapter_machine_type);
        sp_updatetype.setOnItemClickListener((adapterView, view, i, l) -> {

            // hide all layouts
            lay_option1.setVisibility(View.GONE);
            lay_option2.setVisibility(View.GONE);

            // display option 1 if select
            if(ar_updatetype.get(i).equals("تعديل في عدد النقلات")){
                lay_option1.setVisibility(View.VISIBLE);
            }

            // display option 2 if select
            if(ar_updatetype.get(i).equals("تعديل في عدد الاوزان")){
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