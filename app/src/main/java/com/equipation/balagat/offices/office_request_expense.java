package com.equipation.balagat.offices;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class office_request_expense extends AppCompatActivity {

    LinearLayout lay_bank ;
    AutoCompleteTextView at_pay_method ;
    ArrayList<String> ar_pay_method;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_request_expense);

        ar_pay_method = new ArrayList<>();
        ar_pay_method.add("نقدا");
        ar_pay_method.add("حساب بنكى");

        casting();

        ArrayAdapter<String> adapter_pay_method = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_pay_method
        );
        at_pay_method.setAdapter(adapter_pay_method);
        at_pay_method.setOnItemClickListener((adapterView, view, i, l) -> {
            if(ar_pay_method.get(i).equals("حساب بنكى")){
                lay_bank.setVisibility(View.VISIBLE);
            }else{
                lay_bank.setVisibility(View.GONE);
            }
        });


    }

    private void casting() {
        at_pay_method = findViewById(R.id.at_pay_method);
        lay_bank = findViewById(R.id.lay_bank);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }
}