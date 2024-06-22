package com.equipation.balagat.offices;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;

import java.util.ArrayList;

public class office_request_hospitality extends AppCompatActivity {

    LinearLayout lay_bank ;
    AutoCompleteTextView at_pay_method , at_hospitality_type ;
    ArrayList<String> ar_pay_method , ar_hospitality_type ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_request_hospitality);

        ar_pay_method = new ArrayList<>();
        ar_pay_method.add("نقدا");
        ar_pay_method.add("حساب بنكى");

        ar_hospitality_type = new ArrayList<>();
        ar_hospitality_type.add("مشروبات");
        ar_hospitality_type.add("وجبات خفيفة");
        ar_hospitality_type.add("وجبات");

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

        ArrayAdapter<String> adapter_hospitality_type = new ArrayAdapter<>(
                this , R.layout.nice_select_item , ar_hospitality_type
        );
        at_hospitality_type.setAdapter(adapter_hospitality_type);

    }

    private void casting() {
        at_pay_method = findViewById(R.id.at_pay_method);
        at_hospitality_type = findViewById(R.id.at_hospitality_type);
        lay_bank = findViewById(R.id.lay_bank);
    }

    public void fun_back(View view) {
        super.getOnBackPressedDispatcher().onBackPressed();
    }
}