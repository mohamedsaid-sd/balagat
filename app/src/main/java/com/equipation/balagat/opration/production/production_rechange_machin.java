package com.equipation.balagat.opration.production;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;

import com.equipation.balagat.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class production_rechange_machin extends AppCompatActivity {


    //,day
    LinearLayout sp_switch_layout  ;
    TextInputLayout day;

    AutoCompleteTextView sp_change_type,sp_reason_type,sp_timechange_type,sp_switch_type;
    ArrayList<String> ar_renew_type,ar_reason_type,ar_timechange_type,ar_switch_type ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rechange_machin);
        Casting();
        ar_renew_type = new ArrayList<>();
        ar_reason_type= new ArrayList<>();
        ar_timechange_type= new ArrayList<>();
        ar_switch_type= new ArrayList<>();


        ar_renew_type.add("مطابق لنوع الالية السابقة");
        ar_renew_type.add("تبديل النوع");


        ar_switch_type.add("تبديل الماركة");
        ar_switch_type.add("تبديل المقاس");
        ar_switch_type.add("تبديل نوع الالية(حفار-لودر)");



        ar_reason_type.add("مشاكل كفاءة ");
        ar_reason_type.add("مشاكل ميكانيكية ");





        ar_timechange_type.add("عادي   ");
        ar_timechange_type.add("عاجل   ");
        ar_timechange_type.add("عاجل جدا   ");

        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_renew_type);
        sp_change_type.setAdapter(adapter_spinner_borrow_type);


        ArrayAdapter<String> adapter_spinner_borrow_type2 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_switch_type);
        sp_switch_type.setAdapter(adapter_spinner_borrow_type2);

        ArrayAdapter<String> adapter_spinner_borrow_type3 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_reason_type);
        sp_reason_type.setAdapter(adapter_spinner_borrow_type3);


        ArrayAdapter<String> adapter_spinner_borrow_type4 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_timechange_type);
        sp_timechange_type.setAdapter(adapter_spinner_borrow_type4);


        sp_change_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_renew_type.get(i).equals("تبديل النوع")){
                    sp_switch_layout.setVisibility(View.VISIBLE);

                }else{
                    sp_switch_layout.setVisibility(View.GONE);
                }
            }
        });


    }

    private void Casting() {
        sp_change_type = findViewById(R.id.sp_change_type);
        sp_switch_type = findViewById(R.id.sp_switch_type);
        sp_reason_type = findViewById(R.id.sp_reason_type);
        sp_timechange_type = findViewById(R.id.sp_timechange_type);
        day = findViewById(R.id.day);
        sp_switch_layout = findViewById(R.id.sp_switch_layout);



    }

    public void fun_back(View view) {
        super.onBackPressed();
    }

}