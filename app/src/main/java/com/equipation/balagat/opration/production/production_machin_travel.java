package com.equipation.balagat.opration.production;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;

import com.equipation.balagat.R;

import java.util.ArrayList;

public class production_machin_travel extends AppCompatActivity {


    LinearLayout sp_whytravel_layout  ;
    AutoCompleteTextView sp_travel_type, sp_whytravel_type ;
    ArrayList<String> ar_travel_type, ar_whytravel_type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machin_travel);

        ar_travel_type = new ArrayList<>();
        ar_whytravel_type = new ArrayList<>();

        ar_travel_type.add("   نهاية عقد  ");
        ar_travel_type.add("انتقال الي موقع جديد");


        ar_whytravel_type.add("انتهاء عمل الموقع الحالي");
        ar_whytravel_type.add("مشاكل في الموقع");
        ar_whytravel_type.add("اخري");

        Casing();

        ArrayAdapter<String> adapter_spinner_borrow_type = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_travel_type);
        sp_travel_type.setAdapter(adapter_spinner_borrow_type);

        ArrayAdapter<String> adapter_spinner_borrow_type2 = new ArrayAdapter<>(this,
                R.layout.nice_select_item, ar_whytravel_type);
        sp_whytravel_type.setAdapter(adapter_spinner_borrow_type2);



        sp_travel_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(ar_travel_type.get(i).equals("انتقال الي موقع جديد")){
                    sp_whytravel_layout.setVisibility(View.VISIBLE);
                }else{
                    sp_whytravel_layout.setVisibility(View.GONE);

                }
            }


        });
    }

    private void Casing() {
        sp_travel_type = findViewById(R.id.sp_travel_type);
        sp_whytravel_type = findViewById(R.id.sp_whytravel_type);
        sp_whytravel_layout = findViewById(R.id.sp_whytravel_layout);
    }

    public void fun_back(View view) {
        super.onBackPressed();

    }
}