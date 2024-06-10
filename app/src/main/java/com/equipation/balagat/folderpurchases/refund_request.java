package com.equipation.balagat.folderpurchases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.equipation.balagat.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class refund_request extends AppCompatActivity {

    AutoCompleteTextView sp_refund,sp_monyrefund;
    ArrayList<String> ar_refund,ar_monyrefund;

    TextInputEditText other;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refund_request);

        ar_refund = new ArrayList<>();
        ar_monyrefund = new ArrayList<>();


        ar_refund.add("   غير مطابق للموصفات   ");
        ar_refund.add("   غير مطابق للمقاس   ");
        ar_refund.add("اخري");


        ar_monyrefund.add(" نقدا  ");
        ar_monyrefund.add("  حساب بنكي  ");
        ar_monyrefund.add(" رصيد للمشتروات المستقبلية   ");



        Casting();

        ArrayAdapter<String> adapter_machine_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_refund);
        sp_refund.setAdapter(adapter_machine_type);

        ArrayAdapter<String> adapter_machine_type2 = new ArrayAdapter<>(this,
                R.layout.nice_select_item , ar_monyrefund);
        sp_monyrefund.setAdapter(adapter_machine_type2);

        sp_refund.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_refund.get(i).equals("اخري")){

                    other.setVisibility(View.VISIBLE);

                }else{

                    other.setVisibility(View.GONE);
                }
            }
        });

    }

    private void Casting() {
        sp_refund = findViewById(R.id.sp_refund);
        sp_monyrefund = findViewById(R.id.sp_monyrefund);
        other = findViewById(R.id.other);


    }
    public void fun_back(View view) {
    }
}