package com.equipation.balagat.opration.production;

import androidx.appcompat.app.AppCompatActivity;
import com.equipation.balagat.R;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;

public class product_system extends AppCompatActivity {

    Spinner sp_shift , sp_shift_num ;
    ArrayList<String> ar_shift , ar_shift_num ;

    LinearLayout layout_s , layout_s_and_w , layout_w ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_system);

        ar_shift = new ArrayList<>();
        ar_shift_num = new ArrayList<>();

        ar_shift.add("نقلات");
        ar_shift.add("نقلات و اوزان");
        ar_shift.add("اوزان");

        ar_shift_num.add("الاولي");
        ar_shift_num.add("التانية");
        ar_shift_num.add("التالتة");
        ar_shift_num.add("الرابعة");

        casting();

        ArrayAdapter<String> adapter_shift = new ArrayAdapter<>(
                this , androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,
                ar_shift);
        sp_shift.setAdapter(adapter_shift);

        sp_shift.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                layout_s.setVisibility(View.GONE);
                layout_s_and_w.setVisibility(View.GONE);
                layout_w.setVisibility(View.GONE);

                if(ar_shift.get(i).equals("نقلات")){
                    layout_s.setVisibility(View.VISIBLE);
                }

                if(ar_shift.get(i).equals("نقلات و اوزان")){
                    layout_s_and_w.setVisibility(View.VISIBLE);
                }

                if(ar_shift.get(i).equals("اوزان")){
                    layout_w.setVisibility(View.VISIBLE);
                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<String> adapter_shift_num = new ArrayAdapter<>(
                this , androidx.appcompat.R.layout.support_simple_spinner_dropdown_item ,
                ar_shift_num);
        sp_shift_num.setAdapter(adapter_shift_num);

    }

    public void casting(){
        sp_shift = findViewById(R.id.sp_shift);
        sp_shift_num = findViewById(R.id.sp_shift_num);

        layout_s = findViewById(R.id.layout_s);
        layout_s_and_w = findViewById(R.id.layout_s_and_w);
        layout_w = findViewById(R.id.layout_w);

    }

    public void fun_back(View view) {
        super.onBackPressed();
    }
}