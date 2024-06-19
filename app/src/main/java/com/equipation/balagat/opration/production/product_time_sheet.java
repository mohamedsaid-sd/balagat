package com.equipation.balagat.opration.production;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class product_time_sheet extends AppCompatActivity {

    AutoCompleteTextView at_shift , at_fule_type , at_work_system ;

    ArrayList<String> ar_shift , ar_fule_type , ar_work_system ;

    LinearLayout lay_op1 , lay_op2 , lay_op3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_time_sheet);

        // inisilize
        ar_shift = new ArrayList<>();
        ar_fule_type = new ArrayList<>();
        ar_work_system = new ArrayList<>();

        // fill the array
        ar_shift.add("الاولى");
        ar_shift.add("الثانية");
        ar_shift.add("الثالثة");
        ar_shift.add("الرابعة");

        // fill the  fule array
        ar_fule_type.add("بنزين");
        ar_fule_type.add("جازولين");
        ar_fule_type.add("غاز");
        ar_fule_type.add("اخرى");

        //fill work system array
        ar_work_system.add("نقلات");
        ar_work_system.add("نقلات واوزان");
        ar_work_system.add("اوزان");

        cast_the_view();

        ArrayAdapter<String> adapter_shift = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_shift
        );
        at_shift.setAdapter(adapter_shift);

        ArrayAdapter<String> adapter_fule_type = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_fule_type
        );
        at_fule_type.setAdapter(adapter_fule_type);

        ArrayAdapter<String> adapter_work_system = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_work_system
        );
        at_work_system.setAdapter(adapter_work_system);
        at_work_system.setOnItemClickListener((adapterView, view, i, l) -> {

            // Un visible all layouts
            lay_op1.setVisibility(View.GONE);
            lay_op2.setVisibility(View.GONE);
            lay_op3.setVisibility(View.GONE);

            if(ar_work_system.get(i).equals("نقلات")){
                lay_op1.setVisibility(View.VISIBLE);
            }

            if(ar_work_system.get(i).equals("نقلات واوزان")){
                lay_op2.setVisibility(View.VISIBLE);
            }

            if(ar_work_system.get(i).equals("اوزان")){
                lay_op3.setVisibility(View.VISIBLE);
            }
        });

    }

    private void cast_the_view() {
        at_shift = findViewById(R.id.at_shift);
        at_fule_type = findViewById(R.id.at_fule_type);
        at_work_system = findViewById(R.id.at_work_system);

        //Layouts
        lay_op1 = findViewById(R.id.ly_op1);
        lay_op2 = findViewById(R.id.ly_op2);
        lay_op3 = findViewById(R.id.ly_op3);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }
}