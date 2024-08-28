package com.equipation.balagat.opration.contracts;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import java.util.ArrayList;

public class main_time_sheet extends AppCompatActivity {


    AutoCompleteTextView at_work_type ;

    ArrayList<String> ar_work_type;

    LinearLayout lay_time , lay_pro ;

    AutoCompleteTextView at_shift , at_fule_type  ;
    AutoCompleteTextView at_shift_pro , at_fule_type_pro , at_work_system_pro ;

    ArrayList<String> ar_shift , ar_fule_type  ;
    ArrayList<String> ar_shift_pro , ar_fule_type_pro , ar_work_system_pro ;

    LinearLayout lay_op1_pro , lay_op2_pro , lay_op3_pro ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_time_sheet);

        // initilize
        ar_work_type = new ArrayList<>();

        // fill the array to decide
        ar_work_type.add("عمل بنظام الساعات");
        ar_work_type.add("عمل بنظام الانتاج");

        // inisilize
        ar_shift = new ArrayList<>();
        ar_fule_type = new ArrayList<>();

        // inisilize
        ar_shift_pro = new ArrayList<>();
        ar_fule_type_pro = new ArrayList<>();
        ar_work_system_pro = new ArrayList<>();

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

        // fill the array
        ar_shift_pro.add("الاولى");
        ar_shift_pro.add("الثانية");
        ar_shift_pro.add("الثالثة");
        ar_shift_pro.add("الرابعة");

        // fill the  fule array
        ar_fule_type_pro.add("بنزين");
        ar_fule_type_pro.add("جازولين");
        ar_fule_type_pro.add("غاز");
        ar_fule_type_pro.add("اخرى");

        //fill work system array
        ar_work_system_pro.add("نقلات");
        ar_work_system_pro.add("نقلات واوزان");
        ar_work_system_pro.add("اوزان");

        cast_the_view();

        ArrayAdapter<String> adapter_shift = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_shift
        );
        at_shift.setAdapter(adapter_shift);

        ArrayAdapter<String> adapter_fule_type = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_fule_type
        );
        at_fule_type.setAdapter(adapter_fule_type);


        /// Prooooooo

        ArrayAdapter<String> adapter_shift_pro = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_shift_pro
        );
        at_shift_pro.setAdapter(adapter_shift_pro);

        ArrayAdapter<String> adapter_fule_type_pro = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_fule_type_pro
        );
        at_fule_type_pro.setAdapter(adapter_fule_type_pro);

        ArrayAdapter<String> adapter_work_system_pro = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_work_system_pro
        );
        at_work_system_pro.setAdapter(adapter_work_system_pro);
        at_work_system_pro.setOnItemClickListener((adapterView, view, i, l) -> {

            // Un visible all layouts
            lay_op1_pro.setVisibility(View.GONE);
            lay_op2_pro.setVisibility(View.GONE);
            lay_op3_pro.setVisibility(View.GONE);

            if(ar_work_system_pro.get(i).equals("نقلات")){
                lay_op1_pro.setVisibility(View.VISIBLE);
            }

            if(ar_work_system_pro.get(i).equals("نقلات واوزان")){
                lay_op2_pro.setVisibility(View.VISIBLE);
            }

            if(ar_work_system_pro.get(i).equals("اوزان")){
                lay_op3_pro.setVisibility(View.VISIBLE);
            }
        });

        ArrayAdapter<String> adapter_work_type = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_work_type
        );
        at_work_type.setAdapter(adapter_work_type);
        at_work_type.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_work_type.get(i).equals("عمل بنظام الساعات")){
                lay_time.setVisibility(View.VISIBLE);
                lay_pro.setVisibility(View.GONE);
            }else {
                lay_time.setVisibility(View.GONE);
                lay_pro.setVisibility(View.VISIBLE);
            }
        });

    }

    private void cast_the_view() {
        at_shift = findViewById(R.id.at_shift);
        at_fule_type = findViewById(R.id.at_fule_type);

        at_shift_pro = findViewById(R.id.at_shift_pro);
        at_fule_type_pro = findViewById(R.id.at_fule_type_pro);
        at_work_system_pro = findViewById(R.id.at_work_system_pro);

        //Layouts
        lay_op1_pro = findViewById(R.id.ly_op1_pro);
        lay_op2_pro = findViewById(R.id.ly_op2_pro);
        lay_op3_pro = findViewById(R.id.ly_op3_pro);

        lay_pro      = findViewById(R.id.lay_pro);
        lay_time     = findViewById(R.id.lay_time);
        at_work_type = findViewById(R.id.at_work_type);

    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }
}